package io.pivotal.cf.workshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final MessageRepository messageRepository;

    public HelloWorldController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @GetMapping
    public Message helloWorld()  {
        return messageRepository.findAll().iterator().next();
    }
}
