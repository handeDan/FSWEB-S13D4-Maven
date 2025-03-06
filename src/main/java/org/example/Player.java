package org.example;

public class Player {
    //instance variables:
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    // Constructor: player objesi oluşturulurken healthPercentage değerini 0-100 arasında kısıtlar
    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;

        // Health percentage'ı kısıtlama işlemi
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }

        this.weapon = weapon;
    }

    // Method: healthPercentage'ı döndürür
    public int healthRemaining() {
        return healthPercentage;
    }

    // Method: healthPercentage'dan damage kadar eksiltir
    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage < 0) {
            healthPercentage = 0;
            System.out.println(name + " player has been knocked out of game");
        }
    }

    // Method: healthPercentage'a healthPotion kadar ekler
    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        if (healthPercentage > 100) {
            healthPercentage = 100;
        }
    }
}
