package com.piyush.deepseekdemo.spring_ai_deepseek.controller;

import com.piyush.deepseekdemo.spring_ai_deepseek.services.AIChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @author Piyush Rai
 * @date 12/02/25
 * @time 7:34 am
 */

@RestController
@RequestMapping("/api/ai")
public class AiChatController {

    @Autowired
    private AIChatService AIChatService;

    @GetMapping("/prompt")
    public String askToAI(@RequestParam(value = "question") String question) {
        return AIChatService.getDeepSeekAIResponse(question);
    }

    @GetMapping("/prompt/stream")
    public Flux<String> askToAIWithStream(@RequestParam(value = "question") String question) {
        return AIChatService.streamDeepSeekAIResponses(question);
    }
}