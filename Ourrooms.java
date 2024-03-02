package Transylvania;
import java.util.Scanner;
public class Ourrooms extends  Roomreservation {
    public void fRoomreservation(){
RType();
RBeds();
RDays();
System.out.println("Your wishes are:\n");
System.out.println("Selected RoomType:" + RoomType );
System.out.println("Number of Beds:" + BedNos);
System.out.println("You reserved a Room for Days: " + RoomDays + " Days");

    }
    public void RType(){
        System.out.println("We are glad to accomodate You\n " );
        System.out.println("Please select the type of room you wish to have:"); 
        System.out.println("1. Jadeite");
        System.out.println("2.Diamond");
        System.out.println("3. Platinum");
        System.out.println("4. Gold");
        System.out.println("5. Blue Garnet");
        int mineral;
        Scanner input = new Scanner(System.in);
        mineral = input.nextInt();
        switch (mineral){
            case 1: 
                   RoomType = "Jadeite";
                   break;
            case 2: 
                   RoomType = "Diamond";
                   break; 
            case 3: 
                   RoomType = "Platinum";
                   break;
            case 4: 
                   RoomType = "Gold";
                   break; 
            case 5:
                   RoomType = "Blue Garnet";
            default:
                   RoomType = "Invalid Room Type";
                   break;
        }
        System.out.println("Selected RoomType:" + RoomType );
}
    public void RBeds(){
        System.out.println("Please select the number of Beds you need in your Room:"); 
        System.out.println("1. One");
        System.out.println("2. Two");
        System.out.println("3. Three");
        Scanner input = new Scanner(System.in);
        int  Beds;
        Beds = input.nextInt();
        switch (Beds){
            case 1:
                BedNos = "One Bed";
                break;
            case 2:
                BedNos = "Two Beds";
                break;
            case 3:
                BedNos = "Three Beds";
                break;
            default: BedNos = "Invalid number of Beds";
                break;
        }
        System.out.println("Number of Beds:" + BedNos);
    }
    public void RDays(){
        System.out.println("Please Enter the Number of Days You Need to Reserve a Room");
        Scanner input = new Scanner(System.in);
        RoomDays = input.nextInt();
        System.out.println("You reserved a Room for Days: " + RoomDays + " Days");
    }
}
