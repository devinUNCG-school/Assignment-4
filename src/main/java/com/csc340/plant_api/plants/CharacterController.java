package com.csc340.character_api.characters;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/characters")
public class CharacterController {

    private final CharacterService service;

    public CharacterController(CharacterService service) {
        this.service = service;
    }

    // --- MVC Views ---

    @GetMapping
    public String getAllCharacters(@RequestParam(required = false) String search, Model model) {
        List<Character> characters = (search != null && !search.isBlank()) 
                ? service.searchCharactersByName(search) 
                : service.getAllCharacters();
        model.addAttribute("characters", characters);
        model.addAttribute("search", search);
        return "characters/list";
    }

    @GetMapping("/{id}")
    public String getCharacterById(@PathVariable Long id, Model model) {
        model.addAttribute("character", service.getCharacterById(id));
        return "characters/detail";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("character", new Character());
        model.addAttribute("roles", Role.values());
        return "characters/form";
    }

    @PostMapping("/new")
    public String createCharacter(@ModelAttribute Character character) {
        service.createCharacter(character);
        return "redirect:/characters";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("character", service.getCharacterById(id));
        model.addAttribute("roles", Role.values());
        return "characters/form";
    }

    @PostMapping("/edit/{id}")
    public String updateCharacter(@PathVariable Long id, @ModelAttribute Character character) {
        service.updateCharacter(id, character);
        return "redirect:/characters";
    }

    @GetMapping("/delete/{id}")
    public String deleteCharacter(@PathVariable Long id) {
        service.deleteCharacter(id);
        return "redirect:/characters";
    }
}
