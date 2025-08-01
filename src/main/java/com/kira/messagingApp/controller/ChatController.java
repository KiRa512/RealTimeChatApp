package com.kira.messagingApp.controller;

import com.kira.messagingApp.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        return message; // Return the sent message for confirmation
    }

    @GetMapping("/chat")
    public String chat(){
        return "chat";
    }
}

