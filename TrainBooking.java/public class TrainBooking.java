import java.util.Scanner;

public class TrainBooking {
    public static void main(String[] args) {
        // This is where our code will go
        int totalseats = 10;
        int bookedseats = 0;
        System.out.println("Train ticket booking system");
        System.out.println("Total seats available: " + totalseats);
        System.out.println("Type 'book' to reserve a seat");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your command:");
        String userInput = scanner.nextLine();
  
        if (userInput.equals("book")) {
    // User wants to book a seat
    if (bookedseats < totalseats) {
        // There are seats available
        bookedseats = bookedseats + 1;
        System.out.println("Booking confirmed! Seat " + bookedseats + " booked.");
        System.out.println("Remaining seats: " + (totalseats - bookedseats));
    } else {
        // Train is full
        System.out.println("Sorry, train is full!");
    }
} else {
    // User typed something else
    System.out.println("Invalid command. Please type 'book' to reserve a seat.");
}





        scanner.close();
  

            
        


      
    }
}