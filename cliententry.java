package Transylvania;
import java.util.Scanner;

 public class cliententry extends Client {

        public void clienteentry() {
            System.out.println("Select the Item you wish for below:");
            System.out.println("1. Order food or Service");
            System.out.println("2. Reserve a Room");
            System.out.println("3. Get your Order Delivered at your Door step");
            System.out.println("Your Item entry:");
    Scanner input = new Scanner(System.in);
    String wished;
    wished = "null";
    int wish;
    wish = input.nextInt();
    switch(wish){
        case 1:wished="Food/service";
        System.out.println("Item chosen" + wished);
        System.out.println("\n Food ordering interface");
        FoodandService FandS = new FoodandService();
        FandS.fCustomerorder();
        break;
        case 2:wished="Room reservation";
        System.out.println("Item chosen: " + wished);
            System.out.println("\nRoom reservation interface");
            Ourrooms RReservation = new Ourrooms();
            RReservation.fRoomreservation();
        break;
        case 3:wished="Order delivery";
        System.out.println("Item chosen:" + wished);
        System.out.println("\n Welcome, please make your order:");
        Yourorder Corder = new Yourorder();
        Corder.fYourorder();
        break;
        default: wished = "Invalid Choice";
        break;
    }
    
    System.out.println(" ");
}
        
        }


