package _02_06;

public class TicketMachine {
  
public static void main(String[] args) {
  // Create an object called ticket of type Ticket
  Ticket ticker = new Ticket();

  // Set the destination of the ticket to New York
  ticker.setDestination("New York");

  // Set the price of the ticket to 15.30
  ticker.setPrice(15.30);

  // Set the isReturn value to true
  ticker.setIsReturn(true);

  // Print the ticket's destination to the console
  System.out.println(ticker.getDestination());

  // Print the ticket's price to the console
  System.out.println(ticker.getPrice());

  // Print the ticket's isReturn value to the console
  System.out.println(ticker.getIsReturn());

}


}
