package com.omnichannel.Omnichannel.controller;

import com.omnichannel.dto.MessageDTO;
import com.omnichannel.service.WhatsappService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhatsappController {

    @Autowired
    private WhatsappService whatsappService;

    @PostMapping("/whatsapp/send-message")
    public void sendMessage(@RequestBody MessageDTO message) {
        whatsappService.sendMessage(message.getChatId(), message.getText());
    }
}
