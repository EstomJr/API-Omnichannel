package com.omnichannel.Omnichannel.dto;

public class WhatsAppMessage {
    private String phoneNumber;

    private String text;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "WhatsAppMessage{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}