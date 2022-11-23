/* the continue statement doesn't break the loop,
whereas, it skips the specific part of the loop and jumps to the next iteration of the loop immediately.
 */

public class Continue
{
    public static void main(String[] args) {

        for (int i=1; i<=10;i++)
        {
            if (i==5)
            {
                 continue;
            }
            System.out.println("Roll no : " + i);
        }
    }
}