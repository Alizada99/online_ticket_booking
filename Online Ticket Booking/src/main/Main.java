package main;

import java.util.Scanner;
import util.InputUtil;
import util.PassengerUtil;
import util.PaymentUtil;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our website. This program is for economy class passengers and adults. "
                + "\nPlease enter your information in the specified format to avoid errors. "
                + "\nHave a nice trip.");
        while (true) {

            int menu = InputUtil.requireNumber("What do you want to do?"
                    + "\n1.Show all destination"
                    + "\n2.Choose direction"
                    + "\n3.Enter personal information"
                    + "\n4.Update information"
                    + "\n5.Payment"
                    + "\n6.Exit");

            if (menu == 1) {
                PassengerUtil.allDestination();
            } else if (menu == 2) {
                PassengerUtil.chooseDirections();
            } else if (menu == 3) {
                PassengerUtil.resgisterPassengers();
            } else if (menu == 4) {
                PassengerUtil.updatePassengers();
            } else if (menu == 5) {
                PaymentUtil.confirmation();
            } else if (menu == 6) {
                System.exit(0);
            }
        }
    }
}
