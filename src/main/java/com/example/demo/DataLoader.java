package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    MessageRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Message message = new Message("Athlete", "Today I skipped practice to try the" +
                " Szechuan sauce I heard about on Rick and Morty", "07/18/2019", "Kelly F.");
        repository.save(message);

        message = new Message("", "Rick and Morty is the hilarious!",
                "07/18/2019", "Kelly F.");
        repository.save(message);

    }

}
