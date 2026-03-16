public class ResProperty extends Property
{
    String resType;
    int NumBed ;
    int NumBath;
    int NumGarage;


    public ResProperty(){}
    public ResProperty(String TypeOfProperty , String resType , String name , String ContactNumber , int Duration , int NumBed ,int NumBath ,int NumGarage)
    {
        this.resType = resType;
        this.NumBed = NumBed;
        this.NumBath = NumBath;
        this.NumGarage = NumGarage;
        
        super(TypeOfProperty , name , ContactNumber , Duration);
    }
    public String getResType(){return resType;}
    public int getNumBed(){return NumBed;}
    public int getNumBath(){return NumBath;}
    public int getNumGarage(){return NumGarage;}
    //public double getRent(){return Rent;}

    public double calcMonthRent()
    {
        if(super.getType().equals("flat"))
        {
            return 8000 + (500 * NumBed);
        }
        else if(super.getType().equals("townhouse"))
        {
            return 15000 +(1000 * NumBed);
        }
        else
        {
            return 12000 + (800 * NumBed);
        }
    }
    public String toString()
    {
        return String.format("%-10s %-10s %-10s" , super.toString() , this.resType , this.calcMonthRent());
    }
}