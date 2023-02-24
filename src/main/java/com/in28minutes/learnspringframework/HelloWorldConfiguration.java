package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.config.AnnotationDrivenBeanDefinitionParser;

record Person(String name, int age) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Robert";
    }

    @Bean
    public int age() {
        return 27;
    }

    @Bean
    public Person person() {
        return new Person("Claire", 21);
    }

    @Bean
    public Address address() {
        return new Address("Block 10 Lot 25 Florenceville", "Santa Rosa Laguna");
    }

}
