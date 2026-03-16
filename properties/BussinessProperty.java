public class BussinessProperty extends Property
{
    
    int Size;

    public BussinessProperty(){}
    public BussinessProperty(String TypeOfProperty , String name , String ContactNumber , int Duration , int Size)
    {
        this.Size = Size;
       
        super(TypeOfProperty , name , ContactNumber , Duration);

    }
    public int getSize(){return Size;}
   
    public double calcMonthrent()
    {
        return 250 * Size;
    }
    public double calcMouthInsurance()
    {
        return this.calcMonthrent() / Size;
    }
    public String toString()
    {
        return String.format("%-10s %-10s %-10s %-10s" , super.toString() , this.Size , this.calcMouthInsurance() , this.calcMonthrent());
    }
}