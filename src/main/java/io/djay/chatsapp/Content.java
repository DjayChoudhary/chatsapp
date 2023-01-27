package io.djay.chatsapp;

public class Content {
    private String content;

    public Content(String content) {
        this.content = content;
    }

    public Content() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Content [content=" + content + "]";
    }
}
