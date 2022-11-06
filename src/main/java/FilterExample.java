import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterExample {
//    https://www.youtube.com/watch?v=vHwToYEYvsU&list=PLTyWtrsGknYdqY_7lwcbJ1z4bvc5yEEZl
    public static void main(String[] args) {
        List<String> names= Arrays.asList("John","Marry","Philip");
        System.out.println("Imperative Style");
        for (String name : names) {
            if(!name.equals("John")){
                System.out.println(name);
            }
        }
        System.out.println("Functional Style");
        names.stream()
                .filter(name->!name.equals("John"))
                .forEach(System.out::println);
    }
}
