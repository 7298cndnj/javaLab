package verify.exam10;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

		public static void m	ain(String[] args) {
			List<String> list = Arrays.asList(
			"This is a java book",
			"Lambda Expressions",
			"Java8 supports lambda expressions"
			);
			list.stream()
			.filter(a->a.toLowerCase().contains("java"))//11Àå ±âº»API
			.forEach(a->System.out.print(a));
			System.out.println();
		}
}
