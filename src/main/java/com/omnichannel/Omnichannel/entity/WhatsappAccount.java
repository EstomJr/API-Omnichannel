package com.omnichannel.Omnichannel.entity;

public class WhatsAppAccount {
    private String phoneNumber;

    private String sessionId;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "WhatsAppAccount{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", sessionId='" + sessionId + '\'' +
                '}';
    }
// getters and setters omitted for brevity
}
