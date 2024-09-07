package FunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class FN01StreamIntermediateAndTerminal {
    public static void main(String[] args){
        List<Integer> numbers = List.of(3,4,6,7,8,9,11);
//        printAllNumberInListFunctionalApproach(List.of(1,2,3,4));
//        int num = addListFuntionalApproach(numbers);
        List<Integer> doubleNumbers = doubleList(numbers);
        System.out.println(doubleNumbers.toString());
    }

    private static List<Integer> doubleList(List<Integer> numbers) {
       return  numbers.stream()
                .map(itr->itr*itr)
                .collect(Collectors.toList());
//        List<Integer> doubleNumbers = new ArrayList<>();
//        for(Integer itr :numbers){
//            doubleNumbers.add(itr*itr);
//        }
//        return doubleNumbers;
    }

    private static int addListFuntionalApproach(List<Integer> integers) {
//        return integers.stream()
//                .reduce(0,FN01Programming::sum);
        return integers.stream()
                .reduce(0,(a,b)->a+b);

                // combine all of them into single result
                //
    }
    private static int sum(Integer number1, Integer number2){
        return number1+number2;
    }
    private static void print(Integer number){
        System.out.println(number);
    }

    private static Boolean isEven(Integer number){
        return number%2 == 0;
    }
    private static void printAllNumberInListFunctionalApproach(List<Integer> integers) {
        integers.stream() // stream of all element
                .filter(FN01StreamIntermediateAndTerminal::isEven)  // method to check in filter that need to be processed
                .forEach(FN01StreamIntermediateAndTerminal::print); // method reference

        integers.stream()
                .filter(number->number%2==1) // Lambda Expression
                .forEach(System.out::println);

        integers.stream()
                .filter(number->number%2==1) // Lambda Expression
                .map(number->number*number) // map is used to modify the number coming from stream
                .forEach(System.out::println);
    }
}
