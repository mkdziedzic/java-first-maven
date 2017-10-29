package com.test.hello;

import com.test.character.Man;
import com.test.character.impl.Warrior;

public class HelloWorld {

    public static void main(String[] arg) {
        System.out.println("Cześć tu Madzia");
        Man warrior1 = new Warrior("Marian", 100, "miecz");
        Man warrior2 = new Warrior ("Staszek", 150, "buława");
        System.out.println(warrior1.attack());
        System.out.println(warrior2.attack());

        System.out.println(warrior1.status());
        System.out.println(warrior2.status());

        System.out.println("Tura przeciwnika");
        warrior1.takeDamage(25);
        warrior2.takeDamage(50);

        System.out.println(warrior1.status());
        System.out.println(warrior2.status());

        warrior1.takeDamage(100);
        warrior2.takeDamage(36);

        System.out.println(warrior1.status());
        System.out.println(warrior2.status());

        System.out.println(warrior1);
        System.out.println(warrior2);


    }

//    private void duAction (int tura, String akcja) {
//        System.out.println("Tura: " + tura + " " + akcja);
//    }
}
