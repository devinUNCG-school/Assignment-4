package com.csc340.character_api;

import com.csc340.character_api.characters.Character;
import com.csc340.character_api.characters.Role;
import com.csc340.character_api.characters.CharacterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CharacterApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CharacterApiApplication.class, args);
    }

    @Bean
    public CommandLineRunner seedDatabase(CharacterRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                repository.saveAll(List.of(
                    new Character("Aether", Role.ATTACKER, 80, "https://via.placeholder.com/150"),
                    new Character("Zhongli", Role.DEFENDER, 90, "https://via.placeholder.com/150"),
                    new Character("Barbara", Role.HEALER, 70, "https://via.placeholder.com/150"),
                    new Character("Mona", Role.MAGE, 85, "https://via.placeholder.com/150"),
                    new Character("Bennett", Role.SUPPORT, 88, "https://via.placeholder.com/150")
                ));
            }
        };
    }
}
