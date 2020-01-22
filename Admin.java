import java.util.*;

public class Admin extends User
{
  static List<Flight> flights = new ArrayList<Flight>();
  static List<Airport> airports = new ArrayList<Airport>();
  static List<Ticket> tickets = new ArrayList<Ticket>();
  public Admin(int uID, String userName, String password)
  {
    super(uID,userName,password);
  }
  public void addFlight()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the flight source(code): ");
    String source = sc.next();
    Airport sourceAirport = searchAirport(source);
    System.out.println(sourceAirport);
    if(sourceAirport == null){
        System.out.println("Airport does not exist.");
        return;
    }
    
    System.out.println("Enter the flight destination(code): ");
    String destination = sc.next();
     Airport destinationAirport = searchAirport(destination);
    if(destinationAirport == null){
        System.out.println("Airport does not exist.");
        return;
    }
    System.out.println("Enter the flight departure time(year, month, date, hours, minutes): ");
    int dyear = sc.nextInt();
    int dmonth = sc.nextInt();
    int ddate = sc.nextInt();
    int dhours = sc.nextInt();
    int dminutes = sc.nextInt();
    Date departureTime = new Date(dyear,dmonth,ddate,dhours,dminutes);
    
    System.out.println("Enter the flight arrival time(year, month, date, hours, minutes): ");
    int ayear = sc.nextInt();
    int amonth = sc.nextInt();
    int adate = sc.nextInt();
    int ahours = sc.nextInt();
    int aminutes = sc.nextInt();
    Date arrivalTime = new Date(ayear,amonth,adate,ahours,aminutes);

    System.out.println("Enter flight capacity: ");
    int capacity = sc.nextInt();
    
    System.out.println("Enter flight ticket cost: ");
    int cost = sc.nextInt();
    
    flights.add(new Flight(flights.size()+1, departureTime, arrivalTime, sourceAirport, destinationAirport, cost, capacity));
  }
  public void removeFlight(int flightNumber)
  {
        Flight flight = searchFlight(flightNumber);
        if(flight == null){
            System.out.println("Flight does not exist.");
            return;
        }
        else{
            if(flights.remove(flight)){
                System.out.println("Removed successfuly");
            }
            else{
                System.out.println("Remove unsuccessful");
            }
        }
  }
  public void viewAllFlights()
  {
    System.out.println("Flight No\tSource\tDestination\tDeparture\tArrival\tCost\tCapacity\tSeats Filled");
    for(Flight flight : flights)
    {
      System.out.println(flight.getFlightNo() + "\t" + flight.getSource().getName() + "\t" + flight.getDestination().getName() + "\t" + flight.getDepartureTime().toString() + "\t" + flight.getArrivalTime().toString() + "\t" + flight.getTicketCost() + "\t" + flight.getCapacity() + "\t" + flight.getSeatsFilled());
    }
  }
  public Flight searchFlight(int flightNo)
  {
      for(Flight flight : flights){
          if(flight.getFlightNo() == flightNo){
              return flight;
          }
      }
      return null;
  }


  public Airport searchAirport(String code){
      for(Airport airport : airports){
          System.out.println(airport.getCode());
          if(airport.getCode().toLowerCase().equals( code.toLowerCase())){
              return airport;
          }
      }
      return null;
  }
}