package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,3,2,1,3,2,2);
//		printAllNumbersInListFunctional(numbers);
		printEvenNumbersInListFunctional(numbers);

	}
	
//	private static void print(int number) {
//		System.out.println(number);
//	}

//	private static boolean isEven(int number) {
//		return number%2 == 0;
//	}
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
//			.forEach(FP01Functional::print);
			.forEach(System.out::println);
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
//			.filter(FP01Functional::isEven)
			.filter(number -> number%2 == 0)
			.map(number -> number * number)
			.forEach(System.out::println);
	}

}
