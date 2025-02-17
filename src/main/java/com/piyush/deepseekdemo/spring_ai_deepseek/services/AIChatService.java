package com.piyush.deepseekdemo.spring_ai_deepseek.services;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

/**
 * @author Piyush Rai
 * @date 12/02/25
 * @time 7:21 am
 */


@Service
public class AIChatService {

    private final ChatClient chatClient;

    public AIChatService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    public String getDeepSeekAIResponse(String question){
        return chatClient.prompt(question)
                .call().content();
    }

    public Flux<String> streamDeepSeekAIResponses(String question){
        return chatClient.prompt(question)
                .stream().content();
    }
}