package org.example.game;

import org.example.game.entitites.Player;
import org.example.game.weapon.WeaponsName;

public class Game {
    public void initialize(){
        Player player = new Player(100, WeaponsName.empty);
        Room firstRoom = new Room(1);
    }
}
