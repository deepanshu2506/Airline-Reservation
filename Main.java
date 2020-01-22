import java.util.*;
public class Main {
    public static void main(String[] args) {
    int choice, cntnu=1;
    Customer customer=null,custNew;
    Scanner sc = new Scanner(System.in);
    Admin admin1 = new Admin(1,"abc","abc");

    List<Customer> customers = new LinkedList<Customer>();
        customers.add(new Customer(1,"cust1","cust1"));
        customers.add(new Customer(2,"cust2","cust2"));
        customers.add(new Customer(3,"cust3","cust3"));
        customers.add(new Customer(4,"cust4","cust4"));
        customers.add(new Customer(5,"cust5","cust5"));
        customers.add(new Customer(6,"cust6","cust6"));
        customers.add(new Customer(7,"cust7","cust7"));
        customers.add(new Customer(8,"cust8","cust8"));
    Initializer.initialize();
    System.out.println("Welcome to StarBoard Airlines!!!");
    System.out.println("Are you admin or customer(1/0): ");
    int type= sc.nextInt();
    if(type == 1){
        System.out.println("Login");
        System.out.println("Enter username: ");
        String username = sc.next();
        System.out.println("Enter password: ");
        String password = sc.next();
        System.out.println(admin1.getUserName());
        if(admin1.getUserName().equals(username) && admin1.getPassword().equals(password))
        {
          System.out.println("Authentication Successful");
          System.out.println("Welcome " + admin1.getUserName());
          do
          {
            System.out.println("1. View All Flights, 2. Add Flight, 3. Remove Flight");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
              case 1:
              {
                admin1.viewAllFlights();
                break;
              }
              case 2:
              {
                admin1.addFlight();
                break;
              }
              case 3:
              {
                System.out.println("Enter flight number of flight that you want to delete: ");
                int fNo = sc.nextInt();
                admin1.removeFlight(fNo);
                break;
              }
              default:
              {
                System.out.println("Invalid Input");
              }
            }
            System.out.println("Do you want to continue: (Y=1/N=0)");
            cntnu = sc.nextInt();
          }while(cntnu!=0);
        }
    }
    else if(type == 0){
        System.out.println("new customer or existing(1/0)");
        int newCust =sc.nextInt();
        if(newCust == 1){
            while(true){
                System.out.println("Register");
                System.out.println("Enter username: ");
                String username = sc.next();
                System.out.println("Enter password: ");
                String password = sc.next();
                System.out.println("Re-Enter password: ");
                String repassword = sc.next();
                if(repassword.equals(password)){
                    custNew = new Customer(customers.size()+1,username,password);
                    customers.add(custNew);
                    break;
                }
                else{
                    System.out.println("passwords do not match");
                }
            }
        }
        System.out.println("Login");
        System.out.println("Enter username: ");
        String username = sc.next();
        System.out.println("Enter password: ");
        String password = sc.next();
        
        for(Customer cust : customers){
          if(cust.getUserName().equals(username) && cust.getPassword().equals(password)){
              System.out.println("Customer Authentication Successful");
              System.out.println("Welcome " + cust.getUserName());
              customer = cust;
              break;
          }
        }
        do
        {
          System.out.println("1. View All Flights,  2. Book Ticket, 3. View All Tickets");
          System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
              case 1:
              {
                customer.viewAllFlights();
                break;
              }
              case 2:
              {
                System.out.println("Enter flight number: ");
                int fNo = sc.nextInt();
                System.out.println("Enter number of passengers: ");
                int pNo = sc.nextInt();
                customer.bookTicket(fNo,pNo);
                break;
              }
              case 3:
              {
                customer.viewAllTickets();
                break;
              }
              default:
              {
                System.out.println("Invalid Input");
              }
            }
            System.out.println("Do you want to continue: (Y=1/N=0)");
            cntnu = sc.nextInt();
        }while(cntnu!=0);
    }
    else{
        System.out.println("Invalid option");
    }
  }
}