import java.util.Scanner;

public  class For
{
    public static void main(String[] args) {
        int n ;
        System.out.println("Enter a number :");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (int i=0;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}