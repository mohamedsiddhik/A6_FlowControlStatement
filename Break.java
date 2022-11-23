

//Break statement exits the loop
// it used in Loop and Switch


public  class Break
{
    public static void main(String[] args) {
        for (int i =0 ; i<=10;i++)
        {
            System.out.println("Hello");
            if (i==4)
            {
                System.out.println("I am in danger");
                break;

            }

        }
        System.out.println("I am Escaped");

    }
}