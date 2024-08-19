import java.util.Scanner;
public class blackBoxAss  {
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