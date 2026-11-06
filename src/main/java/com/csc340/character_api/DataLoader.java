package com.csc340.character_api;

import com.csc340.character_api.characters.Character;
import com.csc340.character_api.characters.CharacterService;
import com.csc340.character_api.characters.Role;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(CharacterService service) {
        return args -> {
            if (service.getAllCharacters().isEmpty()) {
                Character leo = new Character("Leonardo", Role.ATTACKER, 85, 
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ7hf1k8WWlORckSfilL0Rb7Oku5BbYPAGRjDyw7FDbxA&s=10");

                Character don = new Character("Donatello", Role.SUPPORT, 80, 
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQJCg3AkcQAVndEtV-YuNGilY356fkKl0hwoTi5OhLFkg&s=10");

                Character mikey = new Character("Michelangelo", Role.ATTACKER, 75, 
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRSjbbK0KMtmJQGFl9RJUsV5cKKsABdBo1sVH-_FcJsBg&s=10");

                Character raph = new Character("Raphael", Role.DEFENDER, 88, 
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRRimEKvMygi_7Qinjc3xCocAt5zvBdgrhaCFwdyoSFgA&s=10");

                service.createCharacter(leo);
                service.createCharacter(don);
                service.createCharacter(mikey);
                service.createCharacter(raph);
            }
        };
    }
}
