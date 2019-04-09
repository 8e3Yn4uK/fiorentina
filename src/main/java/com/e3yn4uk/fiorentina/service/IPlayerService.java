package com.e3yn4uk.fiorentina.service;

import com.e3yn4uk.fiorentina.entity.Player;

import java.util.List;

/**
 * Created by 8e3Yn4uK on 10.04.2019
 */

public interface IPlayerService {

    List<Player> findAll();

    Player findById(int theId);

    void save(Player thePlayer);

    void deleteById(int theId);

}
