package com.csc340.character_api.characters;

public class CharacterNotFoundException extends RuntimeException {
    public CharacterNotFoundException(Long id) {
        super("Could not find character with id: " + id);
    }
}
