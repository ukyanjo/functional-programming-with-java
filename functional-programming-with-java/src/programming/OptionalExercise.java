package programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalExercise {

	public static void main(String[] args) {
		List<String> fruits = List.of("apple", "banana", "mango", "bbb");
		Predicate<? super String> preredicate = fruit -> fruit.startsWith("c");
		Optional<String> first = fruits.stream()
		 	.filter(preredicate)
		 	.findFirst();
		
		System.out.println(first);
		System.out.println(first.isEmpty());
		System.out.println(first.isPresent());
		System.out.println(first.get());
	}

	

}
