package android;

import java.util.Random;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Welcome!");
//        System.out.print("Enter your name: ");
//        String name = sc.next();
//        System.out.print("Hello " + name + "\nEnter any key to Start Game: ");
//        sc.next();

        int moves = 5;
        Random random = new Random();
        int randomValue = random.nextInt(0, 10);
        do{
            System.out.println("Attempts left: " + moves);
            System.out.print("Guess number: ");
            int choice = sc.nextInt();
            if (choice == randomValue){
                System.out.println("Congrats you won the game!");
                break;
            } else if(choice < randomValue) {
                System.out.println("Try higher value");
            } else {
                System.out.println("Try lower value");
            }
            moves--;
        } while (moves>0);


    }
}
