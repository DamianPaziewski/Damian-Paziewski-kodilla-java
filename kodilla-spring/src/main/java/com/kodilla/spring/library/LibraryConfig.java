package com.kodilla.spring.library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfig {
    @Bean
    public Library library2() {
        return new Library(libraryDbController2());
    }

    @Bean
    public LibraryDbController libraryDbController2() {
        return new LibraryDbController();
    }
}