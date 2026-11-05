package com.csc340.character_api.characters;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CharacterService {

    private final CharacterRepository repository;

    public CharacterService(CharacterRepository repository) {
        this.repository = repository;
    }

    public List<Character> getAllCharacters() {
        return repository.findAll();
    }

    public List<Character> searchCharactersByName(String name) {
        if (name == null || name.isBlank()) {
            return repository.findAll();
        }
        return repository.findByNameContainingIgnoreCase(name);
    }

    public Character getCharacterById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new CharacterNotFoundException(id));
    }

    public Character createCharacter(Character character) {
        return repository.save(character);
    }

    public Character updateCharacter(Long id, Character updatedCharacter) {
        Character existing = getCharacterById(id);
        existing.setName(updatedCharacter.getName());
        existing.setRole(updatedCharacter.getRole());
        existing.setLevel(updatedCharacter.getLevel());
        existing.setImageUrl(updatedCharacter.getImageUrl());
        return repository.save(existing);
    }

    public void deleteCharacter(Long id) {
        Character existing = getCharacterById(id);
        repository.delete(existing);
    }
}
