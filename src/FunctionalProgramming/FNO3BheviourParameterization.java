package FunctionalProgramming;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FNO3BheviourParameterization {
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,2,2,4,6,7,7,1,10);

//        Predicate<Integer> evenPredicate= x -> x % 2 == 0;
//        Predicate<Integer> oddPredicate= x -> x % 2 != 0;
        extracted(numbers, x -> x % 2 == 0);
        extracted(numbers, x -> x % 2 != 0);  // passing core of method as parameter - behaviour programming
//        Function<Integer, Integer> getIntegerIntegerFunction = x -> x * x;
        extractedSquare(numbers, x -> x * x);
        // jNhlDTpuDzw0cco
    }

    private static void extractedSquare(List<Integer> numbers, Function<Integer, Integer> getIntegerIntegerFunction) {
        numbers.stream()
                .map(getIntegerIntegerFunction)
                .forEach(System.out::println);
    }


    private static void extracted(List<Integer> numbers, Predicate<Integer> evenPredicate) {
        numbers.stream()
                .filter(evenPredicate)
                .forEach(System.out::println);
    }

}
