import java.util.Scanner;

public class school_fee {
    public static void main(String[] args) {
        //creating the scannner object
        Scanner input = new Scanner(System.in);

        //Fixed Fees
        int tuitionFee =  1000;
        int sportsFee = 150;
        int LibraryFee = 50;
        int houseDues = 0;

        //asking for stuent name 
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        //ask student forthe house they are in
        System.out.print("Enter house (Red, Blue, or Green): ");
        String house = input.nextLine();

        //determine the house dues
        switch (house) {
            case "Red":
                houseDues = 200;
                break;
            case "Blue":
                houseDues = 150;
                break;
            case "Green":
                houseDues = 100;
                break;
            default:
                System.out.println("Invalid house entered. Setting house dues to $0.");
                houseDues = 0;
                break;
        }
        //calculate total fee
        int totalFee = tuitionFee + sportsFee + LibraryFee + houseDues;

        //display the results
        System.out.println("Student Name: " + name);
        System.out.println("House: " + house);
        System.out.println("Total School Fee: $" + totalFee);

    }
}
