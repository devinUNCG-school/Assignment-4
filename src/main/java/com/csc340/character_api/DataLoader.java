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
                    "https://upload.wikimedia.org/wikipedia/en/5/5a/Leonardo_%(Teenage_Mutant_Ninja_Turtles%).png");

                Character don = new Character("Donatello", Role.SUPPORT, 80, 
                    "https://upload.wikimedia.org/wikipedia/en/f/f3/Donatello_%(Teenage_Mutant_Ninja_Turtles%).png");

                Character mikey = new Character("Michelangelo", Role.ATTACKER, 75, 
                    "https://upload.wikimedia.org/wikipedia/en/1/1a/Michelangelo_%(Teenage_Mutant_Ninja_Turtles%).png");

                Character raph = new Character("Raphael", Role.TANK, 88, 
                    "https://upload.wikimedia.org/wikipedia/en/7/72/Raphael_%(Teenage_Mutant_Ninja_Turtles%).png");

                service.createCharacter(leo);
                service.createCharacter(don);
                service.createCharacter(mikey);
                service.createCharacter(raph);
            }
        };
    }
}
