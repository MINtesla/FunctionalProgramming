package FunctionalProgramming;

import java.util.List;

public class FN01Programming {
    public static void main(String[] args){
        printAllNumberInListFunctionalApproach(List.of(1,2,3,4));
        int num = addListFuntionalApproach(List.of(3,4,6,7));
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
                .filter(FN01Programming::isEven)  // method to check in filter that need to be processed
                .forEach(FN01Programming::print); // method reference

        integers.stream()
                .filter(number->number%2==1) // Lambda Expression
                .forEach(System.out::println);

        integers.stream()
                .filter(number->number%2==1) // Lambda Expression
                .map(number->number*number) // map is used to modify the number coming from stream
                .forEach(System.out::println);
    }
}
