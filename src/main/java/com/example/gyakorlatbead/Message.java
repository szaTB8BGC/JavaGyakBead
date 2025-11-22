package com.example.gyakorlatbead;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Message {
    @NotNull
    @Size(min=2, max=250)
    private String content;
    @NotNull
    @Size(min=2, max=30)
    private String name;
    @NotNull
    @Size(min=2, max=20)
    private String topic;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
