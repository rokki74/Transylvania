package Transylvania;

import java.util.Scanner;

public  class FoodandService extends CustomerFoodService {
public void fCustomerorder(){
    fCustomerFS();
    fTableNo();
    System.out.println("Please choose your order below");
    System.out.println("1. Cake ");
    System.out.println("2. Milkshakes ");
    System.out.println("3. Pizza");
    System.out.println("4. Grocery");
    System.out.println("5. Sushi");
    int customerorder;
    Scanner input = new Scanner(System.in);
    customerorder = input.nextInt();
    switch (customerorder){
        case 1:
        CustomerOrder = "Cake";
        CustomerOrderCost = 2343;
        break;
        case 2:
        CustomerOrder = "Milkshakes";
        CustomerOrderCost = 5674;
        break;
        case 3:
        CustomerOrder = "Pizza";
        CustomerOrderCost = 8975;
        break;
        case 4:
        CustomerOrder = "Grocery";
        CustomerOrderCost = 5788;
        break;
        case 5:
        CustomerOrder = "Sushi";
        CustomerOrderCost = 38899;
        default:
        CustomerOrder = "Sorry We do not have that in our Food Menu, please make another order";
        break;
    }
    System.out.println("You order : " + CustomerOrder);
    System.out.println("The cost of your order : " + CustomerOrderCost);
Corderquantity();
TotCorderCost();
System.out.println("The Ordering Details you submited are:\n");
System.out.println("Your CustomerFSid  :" + CustomerFS_Id);
System.out.println("Your TableNo  :" + TableNo);
System.out.println("Your orderered for : " + CustomerOrder);
System.out.println("The cost of your order will be : " + CustomerOrderCost);
System.out.println("Your order's quantity is :" + CustomerOrderQuantity);
System.out.println("Dear customer, your total ordering cost will be :" + CustomerOrderTotalCost);
} 
public void Corderquantity(){
System.out.println("Please enter the quantity of your order");
Scanner input = new Scanner(System.in);
CustomerOrderQuantity = input.nextInt();
System.out.println("Your order's quantity is :" + CustomerOrderQuantity);
}
public void TotCorderCost(){
CustomerOrderTotalCost = CustomerOrderCost * CustomerOrderQuantity;
System.out.println("Dear customer, your total ordering cost will be :" + CustomerOrderTotalCost);
}
public void fCustomerFS(){
System.out.println("Kindly input your CustomerFSid :");
Scanner input =  new Scanner(System.in);
CustomerFS_Id = input.nextInt();
System.out.println("Your CustomerFSid is :" + CustomerFS_Id);
}
public void fTableNo(){
    System.out.println("Kindly input your TableNo for us to bring your special order! :");
    Scanner input =  new Scanner(System.in);
    TableNo = input.nextInt();
    System.out.println("Your TableNo is :" + TableNo);
}
}