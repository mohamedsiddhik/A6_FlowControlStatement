//4. Nested if
//Nested means within , nested if condition means if within if

import java.util.Scanner;

public  class Nested_if
{
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your Age : ");
        Scanner in = new Scanner(System.in);
        age=in.nextInt();

        if (age <= 18) {
            System.out.println("You are minor , You are not eligible for work");
        }
        else
        {
            if (age>=18 && age<=60)
            {
                System.out.println("You are eligible for work");
            }
            else
            {
                System.out.println("Happy retirement");
            }
        }
}

}

