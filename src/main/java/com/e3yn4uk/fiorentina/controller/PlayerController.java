package com.e3yn4uk.fiorentina.controller;

import com.e3yn4uk.fiorentina.entity.Player;
import com.e3yn4uk.fiorentina.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by 8e3Yn4uK on 10.04.2019
 */

@Controller
@RequestMapping("/first-team")
public class PlayerController {

    private IPlayerService playerService;

    @Autowired
    public PlayerController(IPlayerService playerService) {
        this.playerService = playerService;
    }

    @RequestMapping("/list")
    public String listPlayers(Model theModel){

        List<Player> players = playerService.findAll();

        theModel.addAttribute("players", players);

        return "list-players";
    }


}
