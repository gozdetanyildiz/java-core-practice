package core.basics;
import java.util.Scanner;
public class SwitchStatementDemo_V18 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print ("Enter the day of the week: ");
        String day = scanner.nextLine();


        //String day = "Friday";
        switch(day) {
            case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is the weekend");
            case "Sunday" -> System.out.println("It is the weekend");
            default -> System.out.println(day + "is not a day ");
        }


        /*if(day.equals("Monday")){
            System.out.println("It is a weekday");
        }
        else if(day.equals("Tuesday")){
            System.out.println("It is a weekday");
        }
        else if(day.equals("Wednesday")){
            System.out.println("It is a weekday");
        }
        else if(day.equals("Thursday")){
            System.out.println("It is a weekday");
        }
        else if(day.equals("Friday")){
            System.out.println("It is a weekday");
        }
        else if(day.equals("Saturday")){
            System.out.println("It is the weekend");
        }
        else if(day.equals("Sunday")){
            System.out.println("It is the weekend");
        }
        else{
            System.out.println("Not a valid day");
         */
        }
}
