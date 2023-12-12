package ovh.johanpassion;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Jeux humain : 
        /* 
         * int nbADeviner = random();
         * Scanner clavier = new Scanner(System.in);
         * System.out.print("Devine le nombre que j'ai choisis entre 1 et 100 : ");
         * int nbDonner = clavier.nextInt();
         * System.out.println(nbADeviner);
         * while (nbDonner != nbADeviner) {
         * if (nbDonner > nbADeviner) {
         * System.out.print("C'est plus petit, réessaie : ");
         * nbDonner = clavier.nextInt();
         * } else {
         * System.out.print("C'est plus grand, réessaie : ");
         * nbDonner = clavier.nextInt();
         * }
         * }
         * System.out.println("C'est gagné !");
         * clavier.close();
         * }
         * 
         * public static int random() {
         * Random random = new Random();
         * return random.nextInt(100) + 1;
         * }
         */

        //Jeux avec l'ordinateur : 
        int nbADeviner = random();
        Scanner clavier = new Scanner(System.in);
        System.out.print("Devine le nombre que j'ai choisis entre 1 et 100 : ");
        int nbDonner = random();
        System.out.println(nbADeviner);
        boolean plusGrand = true;
        while (nbDonner != nbADeviner) {
            if (nbDonner > nbADeviner) {
                System.out.println("C'est plus petit, réessaie : ");
                nbDonner = computerplay(plusGrand, nbDonner);
                plusGrand = false;
            } else {
                System.out.println("C'est plus grand, réessaie : ");
                nbDonner = computerplay(plusGrand, nbDonner);
                plusGrand = true;
            }
        }
        System.out.println("C'est gagné !");
        clavier.close();
    }

    public static int random() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public static int computerplay(boolean plusGrand, int nbDonner) {
        Random random = new Random();

        if (plusGrand == true) {
            return random.nextInt((100 - nbDonner) + 1) + nbDonner;
        } else {
            return random.nextInt((nbDonner - 0) + 1) + 0;
        }

    }
}
