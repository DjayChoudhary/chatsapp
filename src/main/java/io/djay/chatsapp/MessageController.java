package io.djay.chatsapp;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class MessageController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Content greeting(Message message) throws Exception {
        Thread.sleep(1000);
        return new Content("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!!");
    }
}
