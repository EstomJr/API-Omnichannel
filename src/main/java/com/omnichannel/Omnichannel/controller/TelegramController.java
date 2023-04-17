package com.omnichannel.Omnichannel.controller;


import com.omnichannel.dto.MessageDTO;
import com.omnichannel.service.TelegramService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TelegramController {

    @Autowired
    private TelegramService telegramService;

    @PostMapping("/telegram/send-message")
    public void sendMessage(@RequestBody MessageDTO message) {
        telegramService.sendMessage(message.getChatId(), message.getText());
    }
}
