package programming;

import java.util.List;

public class FP01Exercises {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring boot", "API", "Kubernetes");
		courses.stream()
//			.filter(course -> course.contains("Spring"))
			.filter(course -> course.length() >= 4)
			.forEach(System.out::println);
		
		courses.stream()
		.filter(course -> course.length() >= 4)
		.map(course -> course.length())
		.forEach(System.out::println);
	}

	

}
