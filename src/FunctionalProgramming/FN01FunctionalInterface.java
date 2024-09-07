package FunctionalProgramming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FN01FunctionalInterface {
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,2,2,4,6,7,7,1,10);

        numbers.stream()
                .filter(x->x%2==0)
                .map(x->x*x)
                .forEach(System.out::println);

        Predicate<Integer> getIntegerPredicate = x->x%2==0; // above code expanded version
        Predicate<Integer> getIntegerPredicate1 = new Predicate<Integer>() {
            // above code more expended version for functional programming
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }
        };
        Function<Integer, Integer> getIntegerIntegerFunction = x->x*x;
        Function<Integer, Integer> getIntegerIntegerFunction1 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*integer;
            }
        };
        Consumer<Integer> getPrintln = System.out::println;
        Consumer<Integer> getPrintln1 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        numbers.stream()
                .filter(getIntegerPredicate)
                .map(getIntegerIntegerFunction)
                .forEach(getPrintln);

        BinaryOperator<Integer> getSum= Integer::sum;
        BinaryOperator<Integer> getSum1= new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };
        int sum = numbers.stream()
                .reduce(0, getSum1);
    }



}
