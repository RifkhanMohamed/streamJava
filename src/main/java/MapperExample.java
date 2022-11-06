import java.util.Arrays;
import java.util.List;

public class MapperExample {

    //https://www.youtube.com/watch?v=bTTNVP_ORr8&list=PLTyWtrsGknYdqY_7lwcbJ1z4bvc5yEEZl&index=2
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rahman", "Mohamed", "Abdul");

        names.stream()
                .filter(name->!name.equals("Abdul"))
                .map(User::new)
                .forEach(System.out::println);

    }

    static class User{
        private String name;
        private Integer age = 28;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
