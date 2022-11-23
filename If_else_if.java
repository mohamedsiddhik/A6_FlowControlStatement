
/* 3. if else if statement
The if-else-if statement contains the if-statement followed by multiple else-if statements.
 */

import java.util.Scanner;

public  class If_else_if
{
    public static void main(String[] args) {
        float avg;
        System.out.println("Enter your mark :");
        Scanner in = new Scanner(System.in);
        avg=in.nextFloat();
        if (avg >=90 && avg<=100)
        {
            System.out.println("Grade A");
        }
        else if (avg >=80 && avg<=89)
        {
            System.out.println("Grade B");
        }
        else if (avg >=70 && avg<=79)
        {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Grade D");
        }
    }
}