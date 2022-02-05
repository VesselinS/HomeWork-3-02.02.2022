package qa.automation;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the day from the week:");
        int dayOfTheWeek = scanner.nextInt();

        printDayOfTheWeek(dayOfTheWeek);

        System.out.println("---------------------");

        System.out.println("Enter the length of a rectangle:");
        int lengthRectangle = scanner.nextInt();

        System.out.println("Enter the height of a rectangle:");
        int heightRectangle = scanner.nextInt();

        System.out.println("Rectangle perimeter is: " + 2 * (lengthRectangle + heightRectangle));
        System.out.println("Rectangle face is: " + lengthRectangle * heightRectangle);

        System.out.println("---------------------");

        int number;
        System.out.print("Enter the number you want to check if it's positive or negative:");
        number = scanner.nextInt();
        if(number > 0)
        {
            System.out.println(number+" is positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }

        System.out.println("---------------------");

        int number1;
        int number2;
        int number3;
        System.out.print("Enter number:");
        number1 = scanner.nextInt();
        System.out.print("Enter number:");
        number2 = scanner.nextInt();
        System.out.print("Enter number:");
        number3 = scanner.nextInt();

        if( number1 >= number2 && number1 >= number3)
            System.out.println(number1+" is the largest Number");

        else if (number2 >= number1 && number2 >= number3)
            System.out.println(number2+" is the largest Number");

        else
            System.out.println(number3+" is the largest Number");
    }

    public static void printDayOfTheWeek(int dayOfTheWeek){
        switch (dayOfTheWeek){
            case 1:
                System.out.println("You entered 1. So week day is Monday.");
                break;
            case 2:
                System.out.println("You entered 2. So week day is Tuesday.");
                break;
            case 3:
                System.out.println("You entered 3. So week day is Wednesday.");
                break;
            case 4:
                System.out.println("You entered 4. So week day is Thursday.");
                break;
            case 5:
                System.out.println("You entered 5. So week day is Friday.");
                break;
            case 6:
                System.out.println("You entered 6. So week day is Saturday.");
                break;
            case 7:
                System.out.println("You entered 7. So week day is Sunday.");
                break;
            default:
                System.out.println("Not correct option!");
        }
    }

        }


