package io.pivotal.cf.workshop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final MessageRepository messageRepository;

    @Value("${workshopMessage.text}")
    private String messageString;

    public HelloWorldController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @GetMapping
    public Message helloWorld()  {
        return messageRepository.findAll().iterator().next();
    }

    @GetMapping("/message")
    public String getMessage()  {
        return "Hello " + messageString;
    }
}
