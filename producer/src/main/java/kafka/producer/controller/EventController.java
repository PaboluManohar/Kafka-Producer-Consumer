package kafka.producer.controller;

import kafka.producer.service.KafkaMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class EventController {

    @Autowired
    private KafkaMessagePublisher publisher;
    @PostMapping("/publish/{msg}")
    public void sendEvents(@PathVariable("msg") String s) {

        publisher.sendEventsToTopic(s);
    }

}
