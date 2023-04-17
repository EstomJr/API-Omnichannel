package com.omnichannel.Omnichannel.service;

import com.example.omnichannel.dto.TelegramMessage;

public interface TelegramService {
    void sendMessage(TelegramMessage message);

    // other methods for Telegram integration
}