/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import beans.Card;
import beans.Necessary;
import config.Config;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class PassengerUtil {

    public static void allDestination() {
        System.out.println("Azerbaijan:"
                + "\n1.1.Nakhchivan");
        System.out.println("Turkey"
                + "\n2.1.Izmir"
                + "\n2.2.Antalya"
                + "\n2.3.Ankara"
                + "\n2.4.Istanbul");
        System.out.println("Russia:"
                + "\n3.1.Astrakhan"
                + "\n3.2.Saint Petersburg"
                + "\n3.3.Moscow");
        System.out.println("Europe:"
                + "\n4.1.Berlin, Germany"
                + "\n4.2.London, United Kingdom"
                + "\n4.3.Milan, Italy");

    }

    public static void chooseDirections() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a direction based on the numbers above");
        double direction = sc.nextDouble();
        if (direction == 1.1) {
            System.out.println("Nakhchivan");
        } else if (direction == 2.1) {
            System.out.println("Izmir");
        } else if (direction == 2.2) {
            System.out.println("Antalya");
        } else if (direction == 2.3) {
            System.out.println("Ankara");
        } else if (direction == 2.4) {
            System.out.println("Istanbul");
        } else if (direction == 3.1) {
            System.out.println("Astrakhan");
        } else if (direction == 3.2) {
            System.out.println("Saint Petersburg");
        } else if (direction == 3.3) {
            System.out.println("Moscow");
        } else if (direction == 4.1) {
            System.out.println("Berlin, Germany");
        } else if (direction == 4.2) {
            System.out.println("London, United Kingdom");
        } else if (direction == 4.3) {
            System.out.println("Milan, Italy");
        }
    }

    public static Necessary fillPassengers() {
        String name = InputUtil.requireText("enter name (latin) with UPPERCASE");
        String surname = InputUtil.requireText("enter surname (latin) with UPPERCASE");
        String patronymic = InputUtil.requireText("enter patronymic (latin) with UPPERCASE");
        String gender = InputUtil.requireText("enter gender: FEMALE | MALE");
        String birthDate = InputUtil.requireText("enter birth date (dd/mm/yyyy)");
        String document = InputUtil.requireText("enter document type: IDCARD | PASSPORT");
        String documentNumber = InputUtil.requireText("enter document number");
        String documentIssueCountry = InputUtil.requireText("enter document issue country: AZE, Azerbaijan");
        String documentExpireDate = InputUtil.requireText("enter document expire date(dd/mm/yyyy)");
        System.out.println("enter contact info");
        String phoneNumber = InputUtil.requireText("enter phone number in this format: XXX XXX XX XX");
        String email = InputUtil.requireText("enter email with lowercase");
        return new Necessary(name, surname, patronymic, gender, birthDate, document, documentNumber, documentIssueCountry, documentExpireDate, phoneNumber, email);
    }

    public static void resgisterPassengers() {
        int count = InputUtil.requireNumber("How many passengers do you want to register?");
        Config.passengers = new Necessary[count];
        for (int i = 0; i < Config.passengers.length; i++) {
            System.out.println(i + 1 + ".Passenger");
            Config.passengers[i] = PassengerUtil.fillPassengers();
        }
    }

    public static void printPassengers() {
        for (int i = 0; i < Config.passengers.length; i++) {
            System.out.println(i + 1 + "." + Config.passengers[i]);
        }
    }

    public static void updatePassengers() {
        PassengerUtil.printPassengers();
        int i = InputUtil.requireNumber("Which do you want to change?");
        Necessary p = Config.passengers[i - 1];
        String params = InputUtil.requireText("change params 'name' | 'surname' | patronymic | gender | 'birthDate' | 'documentType' | 'documentNumber' | 'documentIssueCountry' | 'documentExpireDate' | phoneNumber | email");
        if (params.contains("'name'")) {
            p.setName(InputUtil.requireText("enter new name"));
        }
        if (params.contains("'surname'")) {
            p.setSurname(InputUtil.requireText("enter new surname"));
        }
        if (params.contains("patronymic")) {
            p.setPatronymic(InputUtil.requireText("enter new patronymic"));
        }
        if (params.contains("gender")) {
            p.setGender(InputUtil.requireText("enter new gender"));
        }
        if (params.contains("'birthDate'")) {
            p.setGender(InputUtil.requireText("enter new birthDate"));
        }
        if (params.contains("'document'")) {
            p.setDocumentType(InputUtil.requireText("enter new document type"));
        }
        if (params.contains("'documentNumber'")) {
            p.setDocumentNumber(InputUtil.requireText("enter new documentNumber"));
        }
        if (params.contains("'documentIssueCountry'")) {
            p.setDocumentIssueCountry(InputUtil.requireText("enter new documentIssueCountry"));
        }
        if (params.contains("'documentExpireDate'")) {
            p.setGender(InputUtil.requireText("enter new documentExpireDate"));
        }
        if (params.contains("phoneNumber")) {
            p.setPhoneNumber(InputUtil.requireText("enter new phoneNumber"));
        }
        if (params.contains("email")) {
            p.setEmail(InputUtil.requireText("enter new email"));
        }
        PassengerUtil.printPassengers();
    }
}
