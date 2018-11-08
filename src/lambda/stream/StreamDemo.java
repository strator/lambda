package lambda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> lists = Arrays.asList("abc","acb","bc","cba");
		//lists.stream().filter(s -> s.startsWith("a")).map(s -> s.toLowerCase()).collect(Collectors.toList());
		Optional<String> reduce = lists.stream().sorted().reduce((s1,s2) -> {
			System.out.println(s1+"|"+s2);
			return s2;
		});
		System.out.println(reduce.get());
		
		//Predicate<String> predicate = (s) -> s.length() >0;
		
	}
	public static <T>  T toList(T t) {
        /*return new CollectorImpl<>((Supplier<List<T>>) ArrayList::new, List::add,
                                   (left, right) -> { left.addAll(right); return left; },
                                   CH_ID);*/
		return t;
    }
	interface Collector<T, A, R> {
		
	}
}
