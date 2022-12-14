package org.example.game;

public class Hit {
    private int damage;
    private int bodyPartToAttack;

    public Hit(int damage, int bodyPartToAttack) {
        this.damage = damage;
        this.bodyPartToAttack = bodyPartToAttack;
    }

    public int getDamage() {
        return damage;
    }

    public int getBodyPartToAttack() {
        return bodyPartToAttack;
    }
}
