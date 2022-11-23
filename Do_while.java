import java.util.Scanner;

public  class Do_while
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Enter the Price :");
            double price=in.nextDouble();

            System.out.println("Enter the Quantity :");
            int qty=in.nextInt();

            double total = price * qty;

            System.out.println("Total is " + total);
            System.out.println("Do you want to calculate another total ? Yes or No");
            answer = in.next();
        }
        while (answer.equalsIgnoreCase("yes"));


    }
}