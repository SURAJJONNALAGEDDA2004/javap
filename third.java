import java.util.Scanner;
public class third 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int day = in.nextInt();
        System.out.println(getweekday(day));
    }
    public static String getweekday(int day) {
        String weekday = "";
        switch (day) 
        {
            case 1: weekday = "Monday";
            break;
            case 2: weekday = "Tuesday";
            break;
            case 3: weekday = "Wednesday";
            break;
            case 4: weekday = "Thursday";
            break;
            case 5: weekday = "Friday";
            break;
            case 6: weekday = "Saturday";
            break;
            case 7: weekday = "Sunday";
            break;
            default:weekday = "Invalid day range";
        }
        return weekday;
    }
}
