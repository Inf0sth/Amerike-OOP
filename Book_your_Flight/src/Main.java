import java.util.Scanner;

import Flights.FlightManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightManager manager = new FlightManager();

        while (true) {
            System.out.println("Welcome.");
            System.out.println("Select an option:");
            System.out.println("1. Create a new user");
            System.out.println("2. Show flights");
            System.out.println("3. Buy a flight");
            System.out.println("4. Show ticket info");
            System.out.println("5. Exit");
            System.out.print("Option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Name: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Country: ");
                    String country = scanner.nextLine();
                    System.out.print("Password: ");
                    String password = scanner.nextLine();

                    manager.createUser(fullName, email, phoneNumber, country, password);
                    break;

                case 2:
                    manager.displayFlightDashboard();
                    break;

                case 3:
                    System.out.print("Write flight ID: ");
                    String flightId = scanner.nextLine();
                    System.out.print("Write email: ");
                    String userEmail = scanner.nextLine();
                    System.out.print("Choose your seat (format A-01): ");
                    String seatNumber = scanner.nextLine();

                    manager.buyTicket(flightId, userEmail, seatNumber);
                    break;

                case 4:
                    System.out.print("Write ID ticket: ");
                    String ticketId = scanner.nextLine();

                    manager.retrieveFlightDetails(ticketId);
                    break;

                case 5:
                    System.out.println("Have a nice flight.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Choose again.");
            }
        }
    }
}
