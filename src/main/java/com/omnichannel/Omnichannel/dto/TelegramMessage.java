package com.omnichannel.Omnichannel.dto;

public class TelegramMessage {
    private String chatId;

    private String text;

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "TelegramMessage{" +
                "chatId='" + chatId + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}