//import java.lang.*;
import java.util.*;
/// First class for vehicle and Discrict
public class blackBoxAss
{
    public static void main(String[] args)
    {
       int districtNo,vehicleNo,age,phonenum;
       String firstName,lastName;

       age = 0;
       phonenum = 0;
     
        Scanner sn = new Scanner(System.in);
     
        Vehicle vh[] = new Vehicle[28];
        initialise(vh);
        
        while (true) 
        {
        try {
            System.out.print("Enter Age: ");   // Initialising and user input age 

            String input = sn.nextLine().trim();

            if (input.isBlank()) // checks if age is null
             {
                System.out.println("Age cannot be blank !");  
                System.err.println("");
                continue;
             }

             age = Integer.parseInt(input);

             if (age < 18 || age > 100) // checks if age is within given range 
             {
                 System.out.println("Please enter an age between 18 and 100");
                 System.out.println("");
                 continue;
             }

              
             {
                break;    
             }

        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid input.");
            System.out.println("");  
        }
    }


        System.out.println("");

        System.out.print("Enter First name: ");  // User input first name
        firstName = sn.nextLine();
        System.out.println("");

        while(validateName(firstName)== false)
        {
            System.out.print("Enter First name: "); 
            firstName = sn.nextLine(); 
            System.out.println("");
        }

        System.out.print("Enter Last name: "); // user input last name
        lastName = sn.nextLine();
        System.out.println("");
        
        while(validateName(lastName)== false)//Uses same type of validation as FirstName
        {
            System.out.print("Enter Last name: ");
            lastName = sn.nextLine();
            System.out.println("");
        }

        
        while (true) 
        {
        try {
            System.out.print("Enter Phone number: "); // User input their phone number

            String input = sn.nextLine().trim();
           

            if (input.isBlank())
             {
                System.out.println("phone number cannot be blank !"); // checks if phonenumber is null
                System.err.println("");
                continue;
             }

            
           if(input.charAt(0)!='5')
           {
              System.out.println("Phone number must start with 5 !");
              System.out.println("");
              continue;
           }

            

            

             phonenum = Integer.parseInt(input);

             if (phonenum < 50000000 || phonenum > 59999999)  // checks if phonenumber is outside of range
             {
                 System.out.println("Please enter a valid 8 digit phone number  ");
                 System.out.println("");
                 continue;
             }
             
             
             if (phonenum>=50000000 && phonenum <=59999999) 
             {
                break;    
             }

        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid input.");
            System.out.println("");  
        }
    }

  


        Scanner scanner = new Scanner(System.in);
        String email = "";
    
        while (true) 
        {
          System.out.print("Please enter your email address: "); // User inputs and email address 
          email = scanner.nextLine();
          System.out.println("");
    
          if (isValidEmail(email)) 
          {
            break;
          } 
          else 
          {
            System.out.println("Invalid email address. Please try again.");
            System.out.println("");
          }
        }

        displayDistricts();
        districtNo = chooseDistrict();

        System.out.println("");
        System.out.println("Displaying List of Vehicle available");
        displayList(districtNo,vh);


       
       vehicleNo= selectVehicle(districtNo, vh);

       int rentalDays = 0;
        while(true) 
        {
          System.out.print("Enter the number of days for rental (Min:1 day ---- Max:15 days): ");
          String input = sn.nextLine().trim();
          System.out.println("");

         try 
         {
             if (input.isEmpty())
            {
                 System.out.println("Rental Duration cannot be null.Please enter a valid rental duration.");
                 System.out.println("");
                 continue;
             }
             rentalDays = Integer.parseInt(input);
             if (rentalDays<1 || rentalDays > 15) 
             {
                 System.out.println("Invalid rental duration.Please enter a number between 1 and 15");
                 System.out.println("");
                 continue;
             }

             if(rentalDays >= 1 && rentalDays <= 15) 
            {
              break;
            }
         } 
         catch (NumberFormatException e) 
         {
            System.out.println("Invalid input. Please enter a number.");
            System.out.println("");
         }

        }
      
       
       System.out.println("");
       System.out.println("Summary"); //  added line here
       System.out.println(""); 
       System.out.println(firstName + " "+ lastName + " rental confirmed");
       System.out.println("You will be charged Rs: "+vh[vehicleNo].getPrice());
       System.out.println("You have rented a "+vh[vehicleNo].getBrand()+"  "+vh[vehicleNo].getType() + " for a period of "+rentalDays + " days");
       System.out.println("");
       System.out.println("Contact us on 210 2720 for further queries"); // added line here 
       System.out.println("");
       System.out.println("");

            
      }

     

        

    private static boolean isValidEmail(String email)
    {
      char test;
      
        try 
        {
            if(email == null || email.isBlank())
            {
              System.out.println("Email cannot be blank");  // Checks if email address is blank
              return false;
            }

            test = email.charAt(0);

            if (Character.isDigit(test) == true) 
            {
                System.out.println("Email cannot be started with a number"); // email address must not start with a number
                return false;
            }
        }
         catch (IllegalArgumentException e) 
         {
            System.out.println("Validation error");
          } 
    
        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');
    
        return atIndex > 0 && dotIndex > atIndex && dotIndex <email.length()-1;    

    }

    public static boolean validateName(String Name) {
        try {
            if (Name.isEmpty()) {
                System.out.println("Name cannot be null or empty.");
                return false;
            }

            if (!Name.matches("^[a-zA-Z]+$")) {
                System.out.println("Name can only contain alphabetic characters.");
                return false;
            }

            if (Name.length() < 2 || Name.length() > 20) {
                System.out.println("Name must be between 2 and 20 characters long.");
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
                String input = sn.nextLine().trim();

                if (input.isEmpty()) {
                System.out.println("District cannot be null or empty. Please enter a valid district number.");
                System.out.println("");
                continue;
                }

                chosenDistrict = Integer.parseInt(input);
                
                if (chosenDistrict >= 1 && chosenDistrict <= 9) {
                    break; 
                } else {
                    System.out.println("Invalid choice. Please choose a district number between 1 and 9.");
                    System.out.println("");
                }
             
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Invalid input. Please enter a number.");
                System.out.println("");
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
            System.out.print("Please choose a vehicle number: ");
            String input = sn.nextLine().trim();

            if (input.isEmpty()) 
            {
                System.out.println("Vehicle Number cannot be null.Please eneter a valid vehicle number");
                System.out.println("");
                continue;
            }

            choice = Integer.parseInt(input);

           if (choice < 1 || choice > 3) 
           {
                System.out.println("Please choose a vehicle number between 1 and 3.");
                continue;
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
            catch (NumberFormatException e)
            {
                System.out.println("An invalid character has been entered.!");
            }
        
        }      
        
    }


}
