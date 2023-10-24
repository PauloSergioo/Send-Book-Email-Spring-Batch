package com.devsuperior.sendbookemailsb.writer;

import com.devsuperior.sendbookemailsb.domain.UserBookLoan;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SendEmailRequestReturnWriterConfig {

    @Bean
    public ItemWriter<UserBookLoan> sendEmailRequestReturnWriter() {
        return items -> items.forEach(System.out::println);
    }
}