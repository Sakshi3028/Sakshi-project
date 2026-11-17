import java.util.function.Consumer;
import java.util.function.Function;

public class consumer_interface {
    public static void main(String[] args) {
        Function<Integer, Integer> square=x -> x*x; 
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(6);
}}
