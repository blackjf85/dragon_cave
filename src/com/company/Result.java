package com.company;

public class Result {
    public static void ending(int choice){

        if (choice == 1 || choice == 2) {
            if (choice == 1) {
                System.out.println("You approach the cave...");
                System.out.println("It is dark and spooky...");
                System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
                System.out.println("Gobbles you down in one bite!");
            } else {
                System.out.println("You approach the cave...");
                System.out.println("The atmosphere is warm and welcoming...");
                System.out.println("A friendly dragon appears in front of you! He smiles, and then...");
                System.out.println("Offers a share of his vast treasure!");

            }
        }
    }
}
