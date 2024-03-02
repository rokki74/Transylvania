package Transylvania;

import java.util.Scanner;

public class RecheckingYourWish {
public void RCHkYourWish(){
    System.out.println("\nIf you wish to review your order then select R, otherwise select P:\n hint: R is for review ");
    Scanner input = new Scanner(System.in);
    String repeat = input.nextLine();
    if (repeat == "R"){
        System.out.println("Welcome to Client's Interface");
        cliententry cliente = new cliententry();
        cliente.clienteentry();
    }
    else {
        System.out.println("Thank you for Choosing us\nIncase of any complains or suggestions please feel free to drop them at the suggestion box or at our channels of communication such as emails and phone numbers\n We wish to see you again!");
    }

}

}


