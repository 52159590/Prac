public class Property
{
  private String TypeOfProperty;
  private String name;
  private String ContactNumber;
  private int Duration;
  


  public Property(){}
  public Property(String TypeOfProperty , String name , String ContactNumber , int Duration)
  {
    this.TypeOfProperty = TypeOfProperty;
    this.name = name;
    this.ContactNumber = ContactNumber;
    this.Duration = Duration;
  
  }
  public String getType(){return TypeOfProperty;}
  public String getName(){return name;}
  public String getContactNumber(){return ContactNumber;}
  public int getDuration(){return Duration;};

  public String toString()
 {
    return String.format("%-10s %-10s %-10s %-10d" ,this.TypeOfProperty , this.name ,this.ContactNumber , this.Duration);
 }
}

