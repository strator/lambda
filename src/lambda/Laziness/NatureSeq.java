package lambda.Laziness;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class NatureSeq implements Supplier<Long> {
	long value = 0;
	@Override
	public Long get() {
		value ++ ;
		return value;
	}
	public static void main(String[] args) {
		Stream<Long> stream = Stream.generate(new NatureSeq());
		//System.out.println("daxiao="+stream.count());
		System.out.println("元素个数："+stream.map((param) -> {
			System.out.println(param);
			return param;
		}).limit(10000).count());
		
		/*System.out.println("元素个数："+stream.map((param) -> {
			System.out.println(param);
			return param;
		}).count());*/
	}
}
