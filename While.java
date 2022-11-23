import java.util.Scanner;

public  class While
{
    public static void main(String[] args) {
        System.out.println("Enter the limit :");
        Scanner in = new Scanner(System.in);
        int n, i=1;
        n= in.nextInt();
        while (i<=n)
        {
            System.out.println(i);
            i++;
        }

        System.out.println("While loop is executed");
    }
}