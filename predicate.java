
import java.util.function.Predicate;
public class predicate {
    //boolean indicate krta h
public static void main(String[] args) {
    Predicate<Integer>  isEven = x -> x % 2 == 0;
    System.out.println(isEven.test(8));
}
}
