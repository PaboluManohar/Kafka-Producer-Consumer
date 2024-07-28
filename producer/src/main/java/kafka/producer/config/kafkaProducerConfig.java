package kafka.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class kafkaProducerConfig {

    @Bean
    public NewTopic createNerTopic(){
        return new NewTopic("TOP", 2, (short) 1);
    }
}
