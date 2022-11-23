

//Decidsion making statement
//1. If Statement

// 4 types of if statement

//1.Simple if

import java.util.Scanner;

public  class If
{
    public static void main(String[] args)
    {
     int age;
        System.out.println("Enter your age : ");
        Scanner in = new Scanner(System.in);
        age=in.nextInt();

        if(age>=18)
        {
            System.out.println("You are Eligible for vote");
        }
    }
}