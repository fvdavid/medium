package fv.example.wiremock.controller;

import com.fasterxml.jackson.databind.node.ArrayNode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/api/todos")
public class WebClientController {

    private final WebClient todoWebClient;

    public WebClientController(WebClient todoWebClient) {
        this.todoWebClient = todoWebClient;
    }

    @GetMapping
    public ArrayNode getAllTodos() {
        return this.todoWebClient
                .get()
                .retrieve()
                .bodyToMono(ArrayNode.class)
                .block();
    }
}
