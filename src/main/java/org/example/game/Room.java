package org.example.game;

import org.example.game.entitites.Player;
import org.example.game.weapon.WeaponsName;

import java.util.Random;

public class Room {
    Random random = new Random();
    private int roomId;
    private boolean activityIsFinish;

    public Room(int roomId) {
        this.roomId = roomId;
        activityIsFinish = false;
    }

    private void OpenChest(Player player){
        if (random.nextInt(100)>20 && roomId != 1){
            player.heal(10);
        }else {
            WeaponsName[] weaponsNames = WeaponsName.values();
            player.setWeapon(weaponsNames[random.nextInt(weaponsNames.length)]);
        }
    }

    public void getActivity(Player player){
        if (roomId == 1 || random.nextInt(100)<20){
            OpenChest(player);
            activityIsFinish = true;
        }
        else {

        }
    }

    public boolean isActivityIsFinish() {
        return activityIsFinish;
    }

    public int getRoomId() {
        return roomId;
    }

    public Room goToNextRoom(){
        return new Room(roomId+1);
    }
}
