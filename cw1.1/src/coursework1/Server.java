package coursework1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author M00561037
 */
public class Server {

    public static void main(String[] args) {

        int choiceentry = -1;

        while (choiceentry != 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome, which Shape do you want?");
            System.out.println("Select 1 or 2 for 2DShapes and 3DShapes respectively");
            System.out.println("Select 3 to exit program.");

            choiceentry = scanner.nextInt();

            switch (choiceentry) {

                case 1:
                    System.out.println("Please proceed.");
                    break;
                case 2:
                    System.out.println("Please proceed.");
                case 3:
                    System.out.println("Thank you and godbye.");
                    break;

                default:
                    System.err.println("Unrecognized option");
                    break;
            }

        }
    }
}
