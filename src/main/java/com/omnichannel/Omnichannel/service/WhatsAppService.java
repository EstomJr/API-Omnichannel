package com.omnichannel.Omnichannel.service;

import com.example.omnichannel.dto.WhatsAppMessage;

public interface WhatsAppService {
    void sendMessage(WhatsAppMessage message);

    // other methods for WhatsApp integration
}