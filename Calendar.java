import java.util.Scanner;

public class Calendar {
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        try{
            System.out.println("This is based on Gregorian Calendar System.");
            System.out.print("Enter a year: ");
            int input=scan.nextInt();

            if(input<1000 || input>9999){
                throw new IllegalArgumentException("Invalid input: Please enter a year between 1000 to 9999.");
            }
    
            Year year=new Year(input);
            Date date=new Date(year);
    
            date.displayCalendar();
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Unexpected error occured.");
        }finally{
            scan.close();
        }

        System.exit(0);
    }
}
