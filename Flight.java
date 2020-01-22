  import java.util.Date;
public class Flight{
    private int flightNo;
    private Date departureTime;
    private Date arrivalTime;
    private Airport source;
    private Airport destination;
    private float ticketCost;
    private int capacity;
    private int seatsFilled;
    public Flight(int flightNo, Date departureTime,Date arrivalTime, Airport source, Airport destination, float ticketCost, int capacity){
        this.flightNo = flightNo;
        this.departureTime = departureTime;
        this.source = source;
        this.arrivalTime = arrivalTime;
        this.destination = destination;
        this.ticketCost = ticketCost;
        this.capacity = capacity;
        this.seatsFilled = 0;
    }

    public int getFlightNo(){
        return this.flightNo;
    }
    
    public Date getDepartureTime(){
        return this.departureTime;
    }
    
    public Date getArrivalTime(){
        return this.arrivalTime;
    }
    
    public Airport getSource(){
        return this.source;
    }
     public float getTicketCost(){
        return this.ticketCost;
    }
    
    
    public Airport getDestination(){
        return this.destination;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getSeatsFilled(){
        return this.seatsFilled;
    }

    public void setDepartureTime(Date departureTime){
        this.departureTime = departureTime;
    }

    public void setArrivalTime(Date arrivalTime){
        this.arrivalTime = arrivalTime;
    }
    

    public void setSource(Airport source){
        this.source = source;
    }

    public void setDestination(Airport destination){
        this.destination = destination;
    }

     public void setTicketCost(Float ticketCost){
        this.ticketCost = ticketCost;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void setSeatsFilled(int seatsFilled){
          this.seatsFilled = seatsFilled;
      }

  public boolean isSeatAvailable(int flightNo)
  {
    if(seatsFilled < capacity)
      return true;
    else
      return false;
  }
}