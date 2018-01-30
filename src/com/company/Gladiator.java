package com.company;
import java.util.concurrent.ThreadLocalRandom;

public class Gladiator {
    public int health;
    public int rage;
    public int lowDamage;
    public int highDamage;

    public Gladiator(int health,int rage,int lowDamage,int highDamage) {
        /*    Returns the
        //    dictionary representing
        //    the gladiator
        //    with the provided values.*/
        this.health = health;
        this.rage = rage;
        this.lowDamage = lowDamage;
        this.highDamage = highDamage;
    }

    public void attack(Gladiator defender){
        int randomNum = ThreadLocalRandom.current().nextInt(lowDamage, highDamage);
        int criticalChance = ThreadLocalRandom.current().nextInt(0, 100);
        System.out.println("Critical Chance: " + criticalChance);
        if (rage < criticalChance) {
            System.out.println("Damage dealt: " + randomNum);
            defender.health -= randomNum;
            rage += 15;
            if (defender.health <= 0){
                defender.health = 0;
            } else {}
        } else {
            System.out.println("Damage dealt: " + randomNum + "\nIT'S A CRITICAL HIT!");
            defender.health -= randomNum * 2;
            rage = 0;
            if (defender.health <= 0){
                defender.health = 0;
            } else {}
        }
    }

    public boolean isDead(){
        return health == 0;
    }
}

//    def critical_chance(percentage):
//
////    Returns True if
////    the random
////    number is
////    less than
////    percentage(the parameter).
//            if random.random() <percentage:
//            return True
//     else:
//             return False
//}
//
//
//    def heal(gladiator):
//
//
////            -Spends 10
////    rage to
////    heal 20 health
////     -
////    Cannot heal
////    above max
////    health of 100
//
//
//            if gladiator['Health']==100:
//
//    print('\nCannot heal over 100 health!\n')
//     else:
//    gladiator['rage']-=10
//    gladiator['Health']=5
////
//
//    def isDead(gladiator):
//
//
//
////    Returns True if
////    gladiator has
////    no health
//        if (gladiator['Health']== 0){
//            return true
//    } else{
//             return false
//    }