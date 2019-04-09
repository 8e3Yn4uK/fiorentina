package com.e3yn4uk.fiorentina.dao;

import com.e3yn4uk.fiorentina.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 8e3Yn4uK on 10.04.2019
 */

public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
