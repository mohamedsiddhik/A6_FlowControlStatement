import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class For_eachUsingStream
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Audi","Nissan","Toyato","BMW","Benz"));
        Consumer<String> action = i -> {
            if (i !="Audi")
                System.out.println(i);
        };
        list.stream().forEach(action);


    }
}