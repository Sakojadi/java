import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

interface MathOperation{
    double operate(int a, int b);
}




public class LambdaExercises {
    public static void main(String[] args) {
        //Exercise 1:
        System.out.println("Exercise 1:");
        MathOperation add = (a,b) -> a+b;
        System.out.println("Addition: "+ add.operate(10,5));
        MathOperation sub = (a, b) -> a-b;
        System.out.println("Substraction: "+ sub.operate(10,5));
        MathOperation mul = (a,b)-> a*b;
        System.out.println("Multiplication: "+ mul.operate(10,5));
        MathOperation div = (a,b) -> a/b;
        System.out.println("Division: "+ div.operate(10,5));

        //Exercise 2:
        System.out.println("Exercise 2:");
        List<Integer> numbers = Arrays.asList(10,15,22,33,40,55);
        System.out.println(numbers);
        Predicate<Integer> isOdd = n -> n%2!=0;
        System.out.println("Odd numebrs:");
        numbers.forEach(n-> {
            if (isOdd.test(n)) {
                System.out.println(n);
            }
        });

        //Exercise 3:
        System.out.println("Exercise 3:");
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.sort((s1,s2) -> s2.compareTo(s1));
        System.out.println(names);

        //Exercise 4:
        System.out.println("Exercise 4:");
        List<String> words = Arrays.asList("hello", "java", "lambda");
        Function<String, String> func = s -> new StringBuilder(s.toUpperCase()).reverse().toString();
        words.forEach(w-> System.out.println(func.apply(w)));

        //Exercise 5:
        System.out.println("Exercise 5:");
        List<String> cities = Arrays.asList("New York", "London", "Tokyo", "Berlin");
        Consumer<String> cons = s -> System.out.println(s);
        cities.forEach(cons);

        //Exercise 6:
        System.out.println("Exercise 6:");
        cities.forEach(System.out::println);

        //Exercise 7:
        System.out.println("Exercise 7:");
        BiFunction<Integer, Integer, Integer> min = (a, b) -> {if(a<b) return a; else return b; };
        BiFunction<Integer, Integer, Integer> max = (a, b) -> {if(a>b) return a; else return b; };
        System.out.println("Min: " + min.apply(10,5));
        System.out.println("Max: " + max.apply(10,5));
    }
}
