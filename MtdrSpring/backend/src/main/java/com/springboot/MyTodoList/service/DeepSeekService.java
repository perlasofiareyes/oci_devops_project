package com.springboot.MyTodoList.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class DeepSeekService {

    private final ChatClient chatClient;

    public DeepSeekService(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    public String generateText(String prompt) {
        return chatClient.prompt()
                .user(prompt)
                .call()
                .content();
    }
}
