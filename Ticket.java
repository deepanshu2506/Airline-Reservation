import java.util.*;;
public class Ticket{

    private int id;
    private List<Passenger> passengers;
    private Flight flight;
    private Date dateBooked;
    public Ticket(int id,Flight flight,Passenger passenger,Date dateBooked){
        this.id = id;
        this.flight = flight;
        this.dateBooked = dateBooked;
        passengers = new ArrayList<Passenger>();
        passengers.add(passenger);
    }

    public Ticket(int id,Flight flight,List<Passenger> passengers,Date dateBooked){
        this.id = id;
        this.flight = flight;
        this.passengers = passengers; 
        this.dateBooked = dateBooked;
    }

    public Flight getFlight(){
        return this.flight;
    }

    public String getDateBooked(){
        return dateBooked.getDate()+"/"+dateBooked.getMonth()+"/"+dateBooked.getYear();
    }
    public List<Passenger> getPassengers(){
        return this.passengers;
    }

    public double getTicketCost(){
        return flight.getTicketCost() * passengers.size();
    }
}