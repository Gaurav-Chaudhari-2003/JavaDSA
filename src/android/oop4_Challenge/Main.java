package android.oop4_Challenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Gaurav", 20,
                new Eye("Left Eye", "short sighted", "Blue", true),
                new Eye("right Eye", "normal", "Blue", true),
                new Heart("Heart", "Normal", 89),
                new Stomach("Stomach", "PUD", false),
                new Skin("Skin", "Burned", "white", 40));

        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        Scanner sc = new Scanner(System.in);

        boolean shouldFinished = false;

        while (!shouldFinished) {
            System.out.println("Chose an Organ:" +
                    "\n\t1. Left Eye" +
                    "\n\t2. Right Eye" +
                    "\n\t3. Heart" +
                    "\n\t4. Stomach" +
                    "\n\t5. Skin" +
                    "\n\t6. Quit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    patient.getLeftEye().getDetails();
                    if (patient.getLeftEye().isOpened()) {
                        System.out.println("\t\t1. Close the Eye");
                        if (sc.nextInt() == 1) {
                            patient.getLeftEye().close();
                        }
                    } else {
                        System.out.println("\t\tOpen the Eye");
                        if (sc.nextInt() == 1) {
                            patient.getLeftEye().open();
                        }
                    }
                    break;

                case 2:
                    patient.getRightEye().getDetails();
                    if (patient.getRightEye().isOpened()) {
                        System.out.println("\t\t1. Close the Eye");
                        if (sc.nextInt() == 1) {
                            patient.getRightEye().close();
                        }
                    } else {
                        System.out.println("\t\tOpen the Eye");
                        if (sc.nextInt() == 1) {
                            patient.getRightEye().open();
                        }
                    }
                    break;

                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change the heart rate");
                    if (sc.nextInt() == 1) {
                        System.out.print("Enter new heart rate: ");
                        int newHeartRate = sc.nextInt();
                        patient.getHeart().setHeartRate(newHeartRate);
                        System.out.println("Heart rate changed to: " + patient.getHeart().getHeartRate());
                    }
                    break;

                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if (sc.nextInt() == 1) {
                        patient.getStomach().digest();
                    }
                    break;

                case 5:
                    patient.getSkin().getDetails();
                    break;

                default:
                    shouldFinished = true;
                    break;
            }
        }
    }
}
