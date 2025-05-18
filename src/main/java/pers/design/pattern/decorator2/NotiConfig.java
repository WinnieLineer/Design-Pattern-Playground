package pers.design.pattern.decorator2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotiConfig {

    @Bean
    public NotiService notiService() {
        NotiService email = new EmailNotiService();
        return new LoggingNotiDecorator(email);
    }
}
