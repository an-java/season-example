import java.util.Scanner;

public class SeasonExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the month: ");
        String month = scanner.nextLine();

        Season season;

        switch (month.toLowerCase()) {
            case "december":
            case "january":
            case "february":
                season = Season.WINTER;
                System.out.println("This is winter!");
                break;
            case "march":
            case "april":
            case "may":
                season = Season.SPRING;
                System.out.println("This is spring!");
                break;
            case "june":
            case "july":
            case "august":
                season = Season.SPRING;
                System.out.println("This is summer!");
                break;
            case "september":
            case "october":
            case "november":
                season = Season.SPRING;
                System.out.println("This is autumn!");
                break;
            default:
                System.out.println("This is not a month!");
                break;


        }

    }
}
