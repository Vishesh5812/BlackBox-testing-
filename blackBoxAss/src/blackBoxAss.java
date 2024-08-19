import java.util.*;

public class blackBoxAss
{
    public static void main(String[] args)
    {
        int tempInput;

        Scanner sn = new Scanner(System.in);
        Vehicle vh[] = new Vehicle[28];
        initialise(vh);

        System.out.println("Temporary Input");
        System.out.print("Please enter a distric num:");
        tempInput = sn.nextInt();

        displayList(tempInput,vh);
        selectVehicle(tempInput, vh);
    
    }


    public static void  initialise(Vehicle [] vh)
    {
        vh[1] = new Vehicle("car", "Toyota", "red", 4, 2000.00, "Compact and Efficient");
        vh[2] = new Vehicle("motorcycle", "Honda", "black", 2, 1500.00, "Great for City Rides");
        vh[3] = new Vehicle("truck", "Ford", "blue", 5, 2800.00, "Rugged and Durable");
        vh[4] = new Vehicle("car", "BMW", "white", 4, 3000.00, "Affordable Luxury");
        vh[5] = new Vehicle("motorcycle", "Kawasaki", "green", 2, 1700.00, "Sporty and Fun");
        vh[6] = new Vehicle("truck", "Nissan", "silver", 6, 2600.00, "Built for Tough Jobs");
        vh[7] = new Vehicle("car", "Kia", "yellow", 4, 1800.00, "Reliable Daily Driver");
        vh[8] = new Vehicle("motorcycle", "Honda", "red", 2, 1600.00, "Lightweight and Agile");
        vh[9] = new Vehicle("truck", "Mitsubishi", "black", 5, 2700.00, "High Towing Capacity");
        vh[10] = new Vehicle("car", "Ford", "blue", 5, 2200.00, "Great for Long Drives");
        vh[11] = new Vehicle("motorcycle", "Yamaha", "blue", 2, 1750.00, "Perfect for Beginners");
        vh[12] = new Vehicle("truck", "Toyota", "white", 6, 2900.00, "Off-Road Ready");
        vh[13] = new Vehicle("car", "Nissan", "grey", 4, 2100.00, "Spacious Interior");
        vh[14] = new Vehicle("motorcycle", "BMW", "silver", 2, 1900.00, "Adventure Ready");
        vh[15] = new Vehicle("truck", "Kia", "red", 5, 2400.00, "Versatile Workhorse");
        vh[16] = new Vehicle("car", "Mitsubishi", "green", 4, 2000.00, "Stylish and Practical");
        vh[17] = new Vehicle("motorcycle", "Suzuki", "yellow", 2, 1650.00, "Easy to Maneuver");
        vh[18] = new Vehicle("truck", "Ford", "black", 6, 2500.00, "Heavy Duty Performance");
        vh[19] = new Vehicle("car", "Honda", "silver", 5, 2300.00, "Family Friendly");
        vh[20] = new Vehicle("motorcycle", "Kawasaki", "white", 2, 1700.00, "Great for Weekend Rides");
        vh[21] = new Vehicle("truck", "Nissan", "blue", 6, 2700.00, "Powerful Engine");
        vh[22] = new Vehicle("car", "Toyota", "red", 5, 2150.00, "Smooth and Quiet Ride");
        vh[23] = new Vehicle("motorcycle", "Honda", "black", 2, 1550.00, "Stylish and Compact");
        vh[24] = new Vehicle("truck", "BMW", "grey", 6, 2950.00, "Reliable and Tough");
        vh[25] = new Vehicle("car", "Kia", "blue", 4, 1950.00, "Perfect for City Commutes");
        vh[26] = new Vehicle("motorcycle", "Yamaha", "green", 2, 1700.00, "Nimble and Fast");
        vh[27] = new Vehicle("truck", "Mitsubishi", "silver", 5, 2750.00, "Great for Outdoor Adventures");

    }

    public static void displayList(int disNum,Vehicle [] vh)
    {
        int startingPoint,counter,endingPoint,i;
        startingPoint = ((disNum*3)-2);
        endingPoint = disNum * 3;
        
        i=1;
        for(counter=startingPoint;counter<=endingPoint;counter++)
        {
            System.out.print(i+".");
            vh[counter].displayCars();
            i++;
        }
    }

    public static void selectVehicle(int distNo,Vehicle [] vh)
    {
        int choice;

        Scanner sn = new Scanner(System.in);

        
            try 
            {
            System.out.print("Please choose a vehicle number:");
            choice = sn.nextInt();

            while (choice < 1 || choice > 3) 
            { 
                System.out.print("Please choose a vehicle number:");
                choice = sn.nextInt();
            }

            switch (choice) {
                case 1:
                    choice = ((distNo * 3)-2);
                    System.out.print("You have chosen");
                    vh[choice].displayCars();
                    break;
                case 2:
                    choice = ((distNo * 3)-1);
                    System.out.println("You have chosen");
                    vh[choice].displayCars();
                    break;
                    
                default:
                    choice = ((distNo * 3)-0);
                    System.out.println("You have chosen");
                    vh[choice].displayCars();
            }

            } 
            catch (Exception e)
            {
                System.out.println("An invalid character has been entered. Please restart session !");
            }
        

        
        


        
    }

    
}
