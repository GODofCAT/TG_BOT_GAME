package org.example.game.entitites;

import org.example.game.Hit;
import org.example.game.weapon.Weapons;
import org.example.game.weapon.WeaponsName;

public class Player {
    private int health;
    private int weaponDamage;
    private WeaponsName weapon;
    private int score = 0;

    public Player(int health, WeaponsName weaponsName) {
        this.health = health;
        this.weaponDamage = Weapons.weapons.get(weaponsName);
        this.weapon = weaponsName;
    }

    public int getHealth() {
        return health;
    }

    public void heal(int heal){
        health+=heal;
    }

    public Hit giveDamage(int bodyPartToAttack) {
        return new Hit(weaponDamage,bodyPartToAttack);
    }

    public void getDamage(Hit hit, int bodyPartToSave) {
        if (hit.getBodyPartToAttack() == bodyPartToSave){
            health-= hit.getDamage();
        }
    }

    public void setWeapon(WeaponsName weaponsName) {
        this.weaponDamage = Weapons.weapons.get(weaponsName) ;
    }

    public int getScore() {
        return score;
    }

    public void updateScore(int score) {
        this.score += score;
    }
}
