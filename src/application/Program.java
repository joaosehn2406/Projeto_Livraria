package application;

import application.verification.Verify;
import model.entities.order.Order;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public Program() {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.println("==== WELCOME to the System ====");
        System.out.println("Choose and option: \n" +
                                    "1. Manager \n" +
                                    "2. Client");

        Verify verify = new Verify();

        System.out.print("Type what you want: ");
        int answer = in.nextInt();
        verify.verification(answer, in);


    }

    public static void main(String[] args) {
        new Program();
    }
}
