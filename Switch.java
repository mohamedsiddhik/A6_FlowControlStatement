
//Switch Statement

import java.util.Scanner;

public  class Switch
{
    public static void main(String[] args) {
        int a, b, c, ch;
        System.out.println("1.Addition : ");
        System.out.println("2. Subtraction : ");
        System.out.println("3. Multiplication : ");
        System.out.println("4. Division : ");
        System.out.println("5. Modulus Division : ");
        Scanner in = new Scanner(System.in);
        ch= in.nextInt();
        System.out.println("Enter two no : ");
        a=in.nextInt();
        b=in.nextInt();

//        c=in.nextInt();
//        System.out.println("Enter the First No : ");
//        System.out.println("Enter the second No : ");
        switch (ch)
        {
            case 1:
                c=a+b;
                System.out.println("Addition : " + c);
                break;
            case 2:
                c=a-b;
                System.out.println("Subtraction : " + c);
                break;
            case 3:
                c=a*b;
                System.out.println("Multiplication : " + c);
                break;
            case 4:
                c=a/b;
                System.out.println("Division : " + c);
                break;
            default:
                System.out.println("No value");
                break;
            case 5:
                c=a%b;
                System.out.println("Modulus Division : " + c);
                break;


        }



    }
}