package org.example;

public enum Weapon {
    SWORD(50, 1.5),  // SWORD, 50 damage, 1.5 attack speed
    BOW(30, 2.0),    // BOW, 30 damage, 2.0 attack speed
    AXE(70, 1.2);    // AXE, 70 damage, 1.2 attack speed

    private final int damage;
    private final double attackSpeed;

    // Constructor
    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    // Getter methods
    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
