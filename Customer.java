import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
public class Customer extends User
{
  private List<Ticket> tickets;
  public Customer(int uID, String userName, String password)
  {
    super(uID,userName,password);
    tickets = new ArrayList<Ticket>();
  }
  public void bookTicket(int flightNo, int numPassengers)
  {
    Scanner sc = new Scanner(System.in);
    Flight flight = searchFlight(flightNo);
    if(flight == null){
        System.out.println("Flight does not exist.");
        return;
    }
    if(numPassengers < (flight.getCapacity()-flight.getSeatsFilled()))
    {
        if(numPassengers == 1){
            System.out.println("Enter passenger name: ");
            String name = sc.next();
            System.out.println("Enter passenger age: ");
            int age = sc.nextInt();
            Passenger p = new Passenger(name,age,flightNo);
            Ticket t = new Ticket(Admin.tickets.size()+1,flight,p,new Date());
            flight.setSeatsFilled(flight.getSeatsFilled()+1);
            Admin.tickets.add(t);
            this.tickets.add(t);
        }
        else{
            List<Passenger> passengers = new ArrayList<Passenger>();
            for(int i=0;i<numPassengers;i++)
            {                
                System.out.println("Enter passenger name: ");
                String name = sc.next();
                System.out.println("Enter passenger age: ");
                int age = sc.nextInt();
                Passenger p = new Passenger(name,age,flightNo);
                passengers.add(p);
            }
            Ticket t = new Ticket(Admin.tickets.size()+1,flight,passengers,new Date());
            Admin.tickets.add(t);
            this.tickets.add(t);
            flight.setSeatsFilled(flight.getSeatsFilled()+numPassengers);
        }   
    }
    else{
        System.out.println("Flight does not have required number of seats.");
    }
    //check  numPassengers < seatsAvailable
    //add numPassengers to List Ticket
    //subtract numPassengers from seatsAvailable
  }
  public void viewAllFlights()
  {
    System.out.println("Flight No\tSource\tDestination\tDeparture\tArrival\tCost\tCapacity\tSeats Filled");
    for(Flight flight : Admin.flights)
    {
      System.out.println(flight.getFlightNo() + "\t" + flight.getSource().getName() + "\t" + flight.getDestination().getName() + "\t" + flight.getDepartureTime().toString() + "\t" + flight.getArrivalTime().toString() + "\t" + flight.getTicketCost() + "\t" + flight.getCapacity() + "\t" + flight.getSeatsFilled());
    }
  }
  private Flight searchFlight(int flightNo)
  {

      for(Flight flight : Admin.flights){
          if(flight.getFlightNo() == flightNo){
              return flight;
          }
      }
      return null;
  }

  public void viewAllTickets(){
      System.out.println("All tickets Booked: ");
    for(Ticket ticket : tickets)
    {
        System.out.println(ticket.getDateBooked() + ":\t" + ticket.getFlight().getSource().getName() + " to " + ticket.getFlight().getDestination().getName());
        System.out.println("passengers booked: ");
        System.out.println("Name\t\tAge");
        for(Passenger passenger : ticket.getPassengers()){
            System.out.println(passenger.getName() + "\t\t" + passenger.getAge());
        }
    }
  }
}
