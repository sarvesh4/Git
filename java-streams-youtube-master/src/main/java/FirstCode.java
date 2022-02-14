import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//call by value
//call by Method

public class FirstCode {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Sarvesh","Navin","Priya","Anto");

        names.forEach(e-> System.out.println(e));

        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        names.forEach(con);
        System.out.println("Method Ref");
        names.forEach(System.out::println);




    }
}
