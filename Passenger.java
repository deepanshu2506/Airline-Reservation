public class Passenger
{
  private String name;
  private int age;
  private int flightNo;

  public Passenger(String name, int age, int flightNo)
  {
    this.name = name;
    this.age = age;
    this.flightNo = flightNo;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  public void setAge(int age)
  {
    this.age = age;
  }
  public void setFlightNo(int flightNo)
  {
    this.flightNo = flightNo;
  }
  public String getName()
  {
    return this.name;
  }
  public int getAge()
  {
    return this.age;
  }
  public int getFlightNo()
  {
    return this.flightNo;
  }
}