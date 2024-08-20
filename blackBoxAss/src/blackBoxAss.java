import java.util.*;
/// First class for vehicle and Discrict
public class blackBoxAss
{
    public static void main(String[] args)
    {
       int districtNo,vehicleNo,Age;
       String firstName,lastName;
       boolean halt= false;
      
      Age = 0;
      

        Scanner sn = new Scanner(System.in);
        Vehicle vh[] = new Vehicle[28];
        initialise(vh);
        
        while (halt != true) {
        try {
            System.out.print("Enter Age: ");
            Age = sn.nextInt(); // user input

            if (validateAge(Age)) {
                break; // Break the loop if the age is valid
            } else {
                System.out.println("Customer under 18 not allowed !");
                halt = true;
                
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Session closed !");
            halt = true;
            sn.next(); // Clear the invalid input
        }
    }


        sn.nextLine();//initialisation of firstname.

        if(validateAge(Age) == true)
        {
             System.out.print("Enter Fistname:");
            firstName = sn.nextLine();
        
        while(validateName(firstName)== false)
        {
            System.out.print("Enter Fistname:");
            firstName = sn.nextLine();
        }

        System.out.print("Enter Lastname:");
        lastName = sn.nextLine();
        
        while(validateName(lastName)== false)
        {
            System.out.print("Enter Lastname:");
            lastName = sn.nextLine();
        }

       

        Scanner scanner = new Scanner(System.in);
        String email = "";
    
        while (true) {
          System.out.print("Please enter your email address: ");
          email = scanner.nextLine();
    
          if (isValidEmail(email)) {
            break;
          } else {
            System.out.println("Invalid email address. Please try again.");
          }
        }

        displayDistricts();
        districtNo = chooseDistrict();

        System.out.println("");
        System.out.println("Displaying List of Vehicle available");
        displayList(districtNo,vh);


       
       vehicleNo= selectVehicle(districtNo, vh);

       int rentalDays = 0;
        while(true) {
          System.out.print("Enter the number of days for rental (Min:1 day ---- Max:15 days): ");
          if(scanner.hasNextInt()){
            rentalDays = scanner.nextInt();
            if(rentalDays >= 1 && rentalDays <= 15) {
              break;
            } else {
              System.out.println("Please enter a number between 1 and 15.");
    
            }
          } else {
            System.out.println("Please re-enter a valid number between 1 and 15 ONLY.");
            scanner.next();
          }
        }

        System.out.println("");
       System.out.println(firstName + " "+ lastName + " rental confirmed");
       System.out.println("You will be charged Rs: "+vh[vehicleNo].getPrice());
       System.out.println("You have rent a "+vh[vehicleNo].getBrand()+"  "+vh[vehicleNo].getType() + " for a period of "+rentalDays + " days");
        }
        else
        {
            System.out.println("Error");
         }
        }

      /**************************************************************/
      public static boolean validateAge(int age)
      {
        try {
            if (age < 18 || age > 100)
          {
          //System.out.println("Invalide Age");
          return false;
          }
          else
          {
            return true;
          }
        }
         catch (IllegalArgumentException e) 
         {
          System.out.println("Invalid Character!");
          return false;
        }  

      }

        

    private static boolean isValidEmail(String email){
        if(email==null || email.isEmpty()){
          return false;
        }
    
        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');
    
        return atIndex > 0 && dotIndex > atIndex && dotIndex <email.length()-1;
      }

    public static boolean validateName(String firstName) {
        try {
            if (firstName == null || firstName.isEmpty()) {
                System.out.println("Name cannot be null or empty.");
                return false;
            }

            if (firstName.length() < 2 || firstName.length() > 20) {
                System.out.println("Name must be between 2 and 20 characters long.");
                return false;
            }

            if (!firstName.matches("^[a-zA-Z]+$")) {
                System.out.println("Name can only contain alphabetic characters.");
                return false;
            }

            
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: ");
            return false;
        }
        return true;
    }

    public static void displayDistricts() {
        System.out.println("");
        System.out.println("");

        System.out.println("1. Black River");
        System.out.println("2. Flacq");
        System.out.println("3. Grand Port");
        System.out.println("4. Moka");
        System.out.println("5. Pamplemousses");
        System.out.println("6. Plaines-Wilhems");
        System.out.println("7. Port-Louis");
        System.out.println("8. Rivière du Rempart");
        System.out.println("9. Savanne");

        System.out.println("");
        System.out.println("");

    }

    public static int chooseDistrict() {
        Scanner sn = new Scanner(System.in);
        int chosenDistrict = 0;

        while (true) {

            System.out.print("Select a district number: ");
            
            try {
                chosenDistrict = sn.nextInt();

                if (chosenDistrict >= 1 && chosenDistrict <= 9) {
                    break; 
                } else {
                    System.out.println("Invalid choice. Please choose a district number between 1 and 9.");
                    System.out.println("");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                System.out.println("");

                sn.next();
            }
        }
        
        return chosenDistrict;
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

    public static int selectVehicle(int distNo,Vehicle [] vh)
    {
        int choice;

        Scanner sn = new Scanner(System.in);
        
            while(true)
            {
            try 
            {
            System.out.print("Please choose a vehicle number:");
            choice = sn.nextInt();


            while (choice < 1 || choice > 3 ) 
            { 
                System.out.print("Please choose a vehicle number between 1 and 3:");
                choice = sn.nextInt();
            }

            if (choice == 1)
            {
                choice = ((distNo * 3)-2);
                    System.out.println("");
                    System.out.println("You have chosen");
                    vh[choice].displayCars();
                    return choice;
                    
            }

            if (choice == 2)
            {
                    choice = ((distNo * 3)-1);
                    System.out.println("");
                    System.out.println("You have chosen");
                    vh[choice].displayCars();
                    return choice;
            }

            if (choice == 3)
            {
                    choice = ((distNo * 3)-0);
                    System.out.println("");
                    System.out.println("You have chosen");
                    vh[choice].displayCars();
                    return choice;
            } 
                
            } 
            
            catch (InputMismatchException e)
            {
                System.out.println("An invalid character has been entered.!");
                sn.next();
            }
        
        }      
        
    }


 
    /// Second class for email and duration
   /* public class blackBoxAss  {
      public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = "";
    
        while (true) {
          System.out.print("Please enter your email address: ");
          email = scanner.nextLine();
    
          if (isValidEmail(email)) {
            break;
          } else {
            System.out.println("Invalid email address. Please try again.");
          }
        }
    
        int rentalDays = 0;
        while(true) {
          System.out.print("Enter the number of days for rental (Min:1 day ---- Max:15 days): ");
          if(scanner.hasNextInt()){
            rentalDays = scanner.nextInt();
            if(rentalDays >= 1 && rentalDays <= 15) {
              break;
            } else {
              System.out.println("Please enter a number between 1 and 15.");
    
            }
          } else {
            System.out.println("Please re-enter a valid number between 1 and 15 ONLY.");
            scanner.next();
          }
        }
    
        System.out.println("Email: " + email);
        System.out.println("Rental Duration: " + rentalDays + " days");
    
        scanner.close();
      }
      private static boolean isValidEmail(String email){
        if(email==null || email.isEmpty()){
          return false;
        }
    
        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');
    
        return atIndex > 0 && dotIndex > atIndex && dotIndex <email.length()-1;
      }
    }



*/

    
    
}
