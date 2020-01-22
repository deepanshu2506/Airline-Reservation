import java.util.Scanner;
import java.util.Date;
public class Initializer
{
  public static void initialize(){
      
      Airport bom = new Airport("Chattrapathi Shivaji International Airport","BOM","Mumbai");
      Airport blr = new Airport("Bengaluru International Airport","BLR","Bangalore");
      Airport hyd = new Airport("Rajiv Gandhi International Airport","HYD","hyderabad");
      Airport maa = new Airport("Meenambarkkam International Airport","MAA","Chennai");
      Airport ccu = new Airport("Netaji Subhash Chandra Bose International Airport","CCU","Kolkata");
      Airport del = new Airport("Indira Gandhi International Airport","DEL","Delhi");
      Airport amd = new Airport("Sardar Vallabhbhai Patel International Airport","AMD","Ahmedabad");
      Airport jfk = new Airport("John F. Kennedy International Airport","JFK","John Kennedy");
      Airport lax = new Airport("Los Angeles International Airport","LAX","Los Angeles");
      Airport dbx = new Airport("Dubai International Airport","DBX","Dubai");
      Airport sin = new Airport("Changi International Airport","SIN","Singapore");
      Airport lhr = new Airport("Heathrow International Airport","LHR","London");
      Admin.airports.add(bom);
      Admin.airports.add(blr);
      Admin.airports.add(hyd);
      Admin.airports.add(maa);
      Admin.airports.add(ccu);
      Admin.airports.add(del);
      Admin.airports.add(amd);
      Admin.airports.add(jfk);
      Admin.airports.add(lax);
      Admin.airports.add(dbx);
      Admin.airports.add(sin);
      Admin.airports.add(lhr);

      Flight f1 = new Flight(1,new Date(2019,11,1,12,30),new Date(2019,11,1,18,30),bom,lax,78000.00f,200);
      Flight f2 = new Flight(2,new Date(2019,11,1,12,30),new Date(2019,11,1,18,30),del,dbx,23000.00f,200);
      Flight f3 = new Flight(3,new Date(2019,11,1,12,30),new Date(2019,11,1,18,30),sin,lhr,120000.00f,200);
      Flight f4 = new Flight(4,new Date(2019,11,1,12,30),new Date(2019,11,1,18,30),jfk,bom,87219.00f,200);
      Flight f5 = new Flight(5,new Date(2019,11,1,12,30),new Date(2019,11,1,18,30),ccu,bom,4000.00f,200);
      Flight f6 = new Flight(6,new Date(2019,11,1,12,30),new Date(2019,11,1,18,30),bom,del,6000.00f,200);
      Flight f7 = new Flight(7,new Date(2019,11,1,12,30),new Date(2019,11,1,18,30),amd,hyd,7800.00f,2);

      Admin.flights.add(f1);
      Admin.flights.add(f2);
      Admin.flights.add(f3);
      Admin.flights.add(f4);
      Admin.flights.add(f5);
      Admin.flights.add(f6);
      Admin.flights.add(f7);
  }
}