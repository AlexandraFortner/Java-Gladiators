package com.company;
import java.util.concurrent.ThreadLocalRandom;

public class Gladiator {
    public int health;
    public int rage;
    public int lowDamage;
    public int highDamage;
    public Gladiator(int health, int rage, int lowDamage, int highDamage) {
        /* Returns the
           dictionary representing
           the gladiator
           with the provided values.*/
        this.health = health;
        this.rage = rage;
        this.lowDamage = lowDamage;
        this.highDamage = highDamage;
    }
    public void attack(Gladiator defender) {
       /*- Each attack can hit normally or crit
         - Crit chance is the same as the attacker's rage (50 rage == 50% crit chance)
         - Damage dealt is a random integer between the attacker's damageLow and damageHigh
         - Critting doubles damage dealt
         - If a gladiator crits, their rage is reset to 0
         - If the gladiator hits normally, their rage is increased by 15 */
        int randomNum = ThreadLocalRandom.current().nextInt(lowDamage, highDamage);
        int criticalChance = ThreadLocalRandom.current().nextInt(0, 100);
        System.out.println("Critical Chance: " + criticalChance);
        if (rage < criticalChance) {
            System.out.println("Damage dealt: " + randomNum);
            defender.health -= randomNum;
            rage += 15;
            if (defender.health <= 0) {
                defender.health = 0;
            } else {
            }
        } else {
            System.out.println("Damage dealt: " + randomNum + "\nIT'S A CRITICAL HIT!");
            defender.health -= randomNum * 2;
            rage = 0;
            if (defender.health <= 0) {
                defender.health = 0;
            } else {
            }
        }
    }
    public boolean isDead() {
        /* Returns a boolean according to the state of a Gladiator.
           Example: If true is returned, the Gladiator is Dead.*/
        return health == 0;
    }
    public void heal() {
        /* -Spends 10 rage to
             heal 20 health
           -Cannot heal above max
             health of 100 */
        if (health < 100 && rage >= 10){
            rage -= 10;
            health += 20;
            System.out.println("Healed!");
        } else {
            System.out.println("\nCannot heal!\n");
        }
    }
}