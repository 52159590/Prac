import java.util.Scanner;

public class testProperties
{
    public static void main(String[] args)
    {
        
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number of employyes: ");
        int size = Integer.parseInt(read.nextLine().trim());
        Property[] arrProperties = new Property[size];
        
        int countResProperties = 0;
        int countBusProperties = 0;

        for (int x = 0; x < size; x++)
        {
            System.out.print("Enter the property type (R for residential, B for business): ");
            String type = read.nextLine().trim();
            System.out.print("Enter the owner name: ");
            String name = read.nextLine();
            System.out.print("Enter the contact number: ");
            String contactNumber = read.nextLine().trim();
            System.out.print("Enter the contract months: ");
            int duration = Integer.parseInt(read.nextLine().trim());

            if (type.equalsIgnoreCase("R"))
            {
                System.out.print("Enter the resType: ");
                String resType = read.nextLine().trim();
                System.out.print("Enter the number of Bedrooms: ");
                int numBed = Integer.parseInt(read.nextLine().trim());
                System.out.print("Enter the number of BathRooms: ");
                int numBath = Integer.parseInt(read.nextLine().trim());
                System.out.print("Enter the number of Garages: ");
                int numGarage = Integer.parseInt(read.nextLine().trim());

                arrProperties[x] = new ResProperty(type, resType, name, contactNumber, duration, numBed, numBath, numGarage);
                countResProperties++;
            }
            else
            {
                System.out.print("Enter the size square meters: ");
                int sizeSquareMeters = Integer.parseInt(read.nextLine().trim());

                arrProperties[x] = new BussinessProperty(type, name, contactNumber, duration, sizeSquareMeters);
                countBusProperties++;
            }
        }


        /*System.out.println("\n--- Properties ---");
        for (int x = 0; x < arrProperties.length; x++)
        {
            System.out.println((x + 1) + ") " + arrProperties[x].toString());
        }
 */
      DisplayResProperty(arrProperties, countResProperties);
      DisplayBusProperty(arrProperties, countBusProperties);

    }
    public static void DisplayResProperty(Property[] arrResProperties , int count)
    {
        System.out.println("\n--- Residential Properties ---");
        for(int x =0;x<count;x++)
        {
            System.out.println(x+1 + " " + arrResProperties[x].toString());
        }
    }
    public static void DisplayBusProperty(Property[] arrBussProperties , int count)
    {
        System.out.println("\n--- Business Properties ---");
        for(int x =0;x<count;x++)
        {
            System.out.print(x+1 + " " + arrBussProperties[x].toString());
        }
    }
}