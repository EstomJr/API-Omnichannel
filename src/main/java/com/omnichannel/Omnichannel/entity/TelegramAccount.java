package com.omnichannel.Omnichannel.entity;

public class TelegramAccount {
    private String phoneNumber;

    private String apiId;

    private String apiHash;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public String getApiHash() {
        return apiHash;
    }

    public void setApiHash(String apiHash) {
        this.apiHash = apiHash;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "TelegramAccount{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", apiId='" + apiId + '\'' +
                ", apiHash='" + apiHash + '\'' +
                '}';
    }
}