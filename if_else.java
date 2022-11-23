

//2. If else Statemnt
// The if-else statement is an extension to the if-statement, which uses another block of code,
// i.e., else block. The else block is executed if the condition of the if-block is evaluated as false.


import java.util.Scanner;

public  class if_else
{
    public static void main(String[] args) {
        int year;
        System.out.println("Enter the year : ");
        Scanner in = new Scanner(System.in);
        year =in.nextInt();
        if (year % 4 ==0)
        {
            System.out.println("Year " + year + " is leap year");

        }
        else
        {
            System.out.println("Year " + year + " is Not a Leap year");
        }


    }
}