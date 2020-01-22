  public class User
{
  private String userName;
  private int uID;
  private String password;

  public User(int uID, String userName, String password)
  {
    this.uID=uID;
    this.userName = userName;
    this.password= password;
  }

  public void setUserName(String userName)
  {
    this.userName = userName;
  }
  public String getUserName()
  {
    return this.userName;
  }
  public int getuID()
  {
    return this.uID;
  }
  public String getPassword()
  {
    return this.password;
  }
}