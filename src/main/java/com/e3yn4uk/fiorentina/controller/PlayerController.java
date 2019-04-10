package com.e3yn4uk.fiorentina.controller;

import com.e3yn4uk.fiorentina.entity.Player;
import com.e3yn4uk.fiorentina.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 8e3Yn4uK on 10.04.2019
 */

@Controller
@RequestMapping("/players")
public class PlayerController {

    private IPlayerService playerService;

    @Autowired
    public PlayerController(IPlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/list")
    public String listPlayers(Model theModel) {

        List<Player> players = playerService.findAll();

        theModel.addAttribute("players", players);

        return "players/list-players";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        Player thePlayer = new Player();
        theModel.addAttribute("player", thePlayer);

        return "players/player-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("playerId") int theId, Model theModel) {

        Player thePlayer = playerService.findById(theId);

        theModel.addAttribute("player", thePlayer);

        return "players/player-form";
    }

    @PostMapping("/save")
    public String savePlayer(@ModelAttribute("player") Player thePlayer) {

        playerService.save(thePlayer);

        return "redirect:/players/list";
    }


}
