package Flights;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import Enums.Destination;
import Users.User;
import Users.UserException;

//FlightManager Class
public class FlightManager {
 private List<Flight> flights = new ArrayList<>();
 private Map<String, User> users = new HashMap<>();
 private Map<String, Flight> tickets = new HashMap<>();

 public FlightManager() {
     // Add initial flights
     for (int i = 0; i < 4; i++) {
         flights.add(new DomesticFlight("NA-" + (1000 + i), Destination.values()[i]));
     }
     for (int i = 0; i < 3; i++) {
         flights.add(new InternationalFlight("CDMX" + Destination.values()[i + 4].name() + "-" + (2000 + i), Destination.values()[i + 4]));
     }
     for (int i = 0; i < 3; i++) {
         flights.add(new PrivateFlight("PR-" + (300 + i), Destination.values()[i]));
     }

 }

 public void displayFlightDashboard() {
     System.out.println("| FLIGHT-ID | ORIGIN | DESTINATION | PRICE |");
     for (Flight flight : flights) {
         System.out.printf("| %-9s | %s | %s | %.2f |\n", flight.getId(), "CDMX", flight.getDestination().name(), flight.getPrice());
     }
     System.out.println("+------------------------------------------+");
 }

 public void createUser(String fullName, String email, String phoneNumber, String country, String password) {
     try {
         User newUser = new User(fullName, email, phoneNumber, country, password);
         users.put(email, newUser);
         System.out.println("User created successfully.");
     } catch (UserException e) {
         System.out.println(e.getMessage());
     }
 }

 public void buyTicket(String flightId, String email, String seatNumber) {
     Flight selectedFlight = null;
     for (Flight flight : flights) {
         if (flight.getId().equals(flightId)) {
             selectedFlight = flight;
             break;
         }
     }
     if (selectedFlight == null) {
         System.out.println("Flight not found.");
         return;
     }
     if (!seatNumber.matches("[A-Z]-\\d{2}")) {
         System.out.println("Invalid seat number format.");
         return;
     }
     User user = users.get(email);
     if (user == null) {
         System.out.println("User not found.");
         return;
     }
     String ticketId = "RE-" + (int) (Math.random() * 10000);
     tickets.put(ticketId, selectedFlight);
     System.out.println("Ticket booked successfully. Ticket ID: " + ticketId);
 }

 public void retrieveFlightDetails(String ticketId) {
     Flight flight = tickets.get(ticketId);
     if (flight == null) {
         System.out.println("Ticket not found.");
         return;
     }
     System.out.println("Flight Details:");
     System.out.printf("ID: %s, Origin: CDMX, Destination: %s, Price: %.2f, Luggage Allowance: %.2f\n",
             flight.getId(), flight.getDestination().name(), flight.getPrice(), flight.getLuggageAllowance());
 }
}
