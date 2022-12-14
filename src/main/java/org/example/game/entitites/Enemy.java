package org.example.game.entitites;

import org.example.game.Hit;
import org.example.game.weapon.Weapons;
import org.example.game.weapon.WeaponsName;

import java.util.Random;

public class Enemy {
    Random random = new Random();
    private int health;
    private int weaponDamage;

    public Enemy(int health, WeaponsName weaponsName) {
        this.health = health;
        this.weaponDamage = Weapons.weapons.get(weaponsName);
    }

    public void getDamage(int damage) {
        health-=damage;
    }

    public Hit giveDamage() {
        return new Hit(weaponDamage, random.nextInt(2)+1);
    }

    public int getHealth() {
        return health;
    }
}
