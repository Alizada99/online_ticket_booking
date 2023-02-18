/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import beans.Card;
import config.Config;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class PaymentUtil {

    public static double oneWayPayment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Re-enter the number above indicating your chosen direction");
        double direction = sc.nextDouble();
        double payment = 0;
        if (direction == 1.1) {
            System.out.println("Nakhchivan");
            payment = 60;
        } else if (direction == 2.1) {
            System.out.println("Izmir");
            payment = 298.16;
        } else if (direction == 2.2) {
            System.out.println("Antalya");
            payment = 423.22;
        } else if (direction == 2.3) {
            System.out.println("Ankara");
            payment = 287.32;
        } else if (direction == 2.4) {
            System.out.println("Istanbul");
            payment = 316.62;
        } else if (direction == 3.1) {
            System.out.println("Astrakhan");
            payment = 234.92;
        } else if (direction == 3.2) {
            System.out.println("Saint Petersburg");
            payment = 504.23;
        } else if (direction == 3.3) {
            System.out.println("Moscow");
            payment = 459.06;
        } else if (direction == 4.1) {
            System.out.println("Berlin, Germany");
            payment = 427.74;
        } else if (direction == 4.2) {
            System.out.println("London, United Kingdom");
            payment = 477.43;
        } else if (direction == 4.3) {
            System.out.println("Milan, Italy");
            payment = 513.50;
        }
        return payment;
    }

    public static double roundTripPayment(double payment) {
        double yourPayment = payment * 2;
        return yourPayment;
    }

    public static void showPayment() {
        int ticket = InputUtil.requireNumber("Which type do you want to choose?"
                + "\n1.one way ticket"
                + "\n2.round-trip ticket");
        if (ticket == 1) {

            System.out.println("your payment is " + PaymentUtil.oneWayPayment());
        } else if (ticket == 2) {
            System.out.println("your payment is " + PaymentUtil.roundTripPayment(PaymentUtil.oneWayPayment()));
        }
    }

    public static Card fillCardDetails() {
        String cardNumber = InputUtil.requireText("enter card number in this format: XXXX XXXX XXXX XXXX");
        String cardExpireDate = InputUtil.requireText("enter card expire date (mm/yy)");
        int cardCVV = InputUtil.requireNumber("enter card CVV");
        return new Card(cardNumber, cardExpireDate, cardCVV);
    }

    public static void resgisterCard() {
        Config.cardDetails = new Card[1];
        for (int i = 0; i < Config.cardDetails.length; i++) {
            Config.cardDetails[i] = PaymentUtil.fillCardDetails();
        }
    }

    public static void printCardDetails() {
        for (int i = 0; i < Config.cardDetails.length; i++) {
            System.out.println(Config.cardDetails[i]);
        }
    }

    public static void yes() {
        int confirmation = InputUtil.requireNumber("Do you want to confirm?"
                + "\n1.Yes"
                + "\n2.No");
        if (confirmation == 1) {
            System.out.println("The payment was made successfully");
        } else if (confirmation == 2) {
            System.exit(0);
        }
    }

    public static void confirmation() {
        PaymentUtil.showPayment();
        System.out.println("enter all card details to continue:");
        PaymentUtil.resgisterCard();
        int cardInformation = InputUtil.requireNumber("Is your card details true?"
                + "\n1.Yes"
                + "\n2.No");
        if (cardInformation == 1) {
            yes();
        } else if (cardInformation == 2) {
            PaymentUtil.printCardDetails();
            System.out.println("Choose the part you want to change");
            Card ch = Config.cardDetails[0];
            String params = InputUtil.requireText("change params cardNumber | cardExpireDate | cardCVV");
            if (params.contains("cardNumber")) {
                ch.setCardNumber(InputUtil.requireText("enter new card number"));
            }
            if (params.contains("cardExpireDate")) {
                ch.setCardExpireDate(InputUtil.requireText("enter new card expire date"));
            }
            if (params.contains("cardCVV")) {
                ch.setCardCVV(InputUtil.requireNumber("enter new card CVV"));
            }
            PaymentUtil.printCardDetails();
            yes();
        }
    }
}
