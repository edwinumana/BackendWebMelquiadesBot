package com.example;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ChatController {

    @PostMapping("/chat")
    public Map<String, String> chat(@RequestBody Map<String, String> request) {
        String userMessage = request.get("message");
        String botResponse = callChatGPTAPI(userMessage);

        Map<String, String> response = new HashMap<>();
        response.put("response", botResponse);
        return response;
    }

    private String callChatGPTAPI(String message) {
        // Dummy response for now
        return "This is a dummy response. Replace with API call.";
    }
}
