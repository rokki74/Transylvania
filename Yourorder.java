package Transylvania;
import java.util.Scanner;
public class Yourorder extends Orderdelivery{
    public void fYourorder(){
    System.out.println("Select your order item Below");
    System.out.println("1. Cake ");
    System.out.println("2. Milkshakes ");
    System.out.println("3. Pizza");
    System.out.println("4. Grocery");
    System.out.println("5. Sushi");
    int order;
    Scanner input = new Scanner(System.in);
    order = input.nextInt();
    switch (order){
        case 1:
        Itemordered = "Cake";
        ItemCost = 2343;
        break;
        case 2:
        Itemordered = "Milkshakes";
        ItemCost = 5674;
        break;
        case 3:
        Itemordered = "Pizza";
        ItemCost = 8975;
        break;
        case 4:
        Itemordered = "Grocery";
        ItemCost = 5788;
        break;
        case 5:
        Itemordered = "Sushi";
        ItemCost = 38899;
        default:
        Itemordered = "Invalid Itemordered";
        break;
    }
    System.out.println("Your order Item: " + Itemordered);
    System.out.println("Itemcost: " + ItemCost);
Ordquantity();
OrdLocation();
LocDistance();
TotOrderingCost();
System.out.println("The Ordering Details you submitted are:\n");
System.out.println("Your order Item: " + Itemordered);
System.out.println("Itemcost: " + ItemCost);
System.out.println("Your Order quantity: " + Orderquantity + "\nThe cost for all your Items will be:" + OrderCost);
System.out.println("Your order location: " + Location);
System.out.println("Your location Distance is:" + LocationDistance + "Kilometers\n"+"and the cost of transport will be:" + DistanceCost);
System.out.println("Dear customer, Your total cost for the order is:" + TotalOrderingcCost);

    }
    public void Ordquantity(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the quantity of your order:");
        Orderquantity = input.nextInt();
        OrderCost = ItemCost * Orderquantity;
        System.out.println("Your Order quantity: " + Orderquantity + "\nThe cost for all your Items will be:" + OrderCost);

    }
    public void OrdLocation(){
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter the location you want your order delivered:");
        Location = input.nextLine();
        System.out.println("Your order location: " + Location);
    }
    public void LocDistance(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your order location distance in Kilometers:");
        LocationDistance = input.nextInt();
        DistanceCost = LocationDistance*50;
        System.out.println("Your location Distance is:" + LocationDistance + "Kilometers\n"+"and the cost of transport will be:" + DistanceCost);
    }
    public void TotOrderingCost(){
        TotalOrderingcCost = DistanceCost + OrderCost;
        System.out.println("Dear customer, Your total cost for the order is:" + TotalOrderingcCost);
    }
}

