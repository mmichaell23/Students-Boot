package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RegistrationOfStudents {
    public static void main(String[] args) throws InterruptedException {
      try {
      Scanner scan = new Scanner(System.in);
      System.out.print("Would you like to Prompt for Students Registration?" 
      + "\n" + "Type [1] for Yes, Type [0] for No" + "\n" + "Input Here: ");
      int prompt = scan.nextInt();
      if (prompt == 1) {
        System.out.println("Prompting..." + "\n" + "Please wait a second");
        TimeUnit.SECONDS.sleep(2);
      } else if (prompt == 0) {
        System.out.println("Cancelled!");
      } else if (prompt > 1) {
        System.out.println("YOU INPUT WRONG VALIDATION!" + "\n" + "Try Again.");
        return;
      }
      ArrayList <Integer> student = new ArrayList<>();
            for (int x = 0; prompt > student.size(); x++) {
            System.out.println();
            String firstname = scan.nextLine();
            System.out.print("Enter a First Name: ");
            firstname = scan.nextLine();
            System.out.print("Enter a Last Name: ");
            String lastname = scan.nextLine();
            System.out.print("Enter a Year: ");
            int year = scan.nextInt();
            String course = scan.nextLine();
            System.out.print("Enter a Course: ");
            course = scan.nextLine();
            System.out.print("Enter a Section: ");
            String section = scan.nextLine();
            System.out.println();
            System.out.print("If you want to stop from Prompting" + "\n" +
            "Type [1] for Yes, Type [0] for No" + "\n" + "Input Here: ");
            int y = scan.nextInt(); 
            
            if (y == 1) {
            System.out.println("Exiting the prompt...");
            TimeUnit.SECONDS.sleep(2);
            System.out.println();
            System.out.println("Student # " + x);
            System.out.println("Name: " + firstname + "   " + lastname + "\n" 
            + "Year: " + year + "\n" + "Course: " + course + "\n" + "Section: " + section);
            System.out.println();
            System.out.println("Done.");
            break;
            } else if (y > 1) {
              System.out.println("YOU INPUT WRONG VALIDATION!" + "\n" + "Try Again.");
              break;
            } else if (student.size() < prompt) {
              System.out.println();
              System.out.println("Student # " + x);
              System.out.println("Name: " + firstname + " " + lastname + "\n" 
              + "Year: " + year + "\n" + "Course: " + course + "\n" + "Section: " + section);
              System.out.println();
              System.out.println("Next Student...");
              continue;
            }
          }
            } catch (Exception e) {
              System.out.println();
              System.out.println("YOU SHOULD ENTER A NUMBER!!!");
              }
            }
          }