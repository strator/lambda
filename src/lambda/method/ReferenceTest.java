package lambda.method;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.function.Supplier;

import lambda.converter.Converter;

public class ReferenceTest {
	
	public static int string2Int(String str){
		return Integer.parseInt(str);
	}
	public static void main(String[] args) {
		//¾²Ì¬·½·¨
		Converter<String, Integer> convert = new Converter<String, Integer>() {
			@Override
			public Integer convert(String from) {
				return ReferenceTest.string2Int(from);
			}
		};
		System.out.println(convert.convert("123"));
		
		Converter<String, Integer> converter = ReferenceTest::string2Int;
		System.out.println(converter.convert("120"));
		
		Converter<String, Boolean> convert2 = (s) -> s.length() >0;

		boolean nonNull = Objects.nonNull("123");
		  	
		Supplier<String> supplier = () -> "special type value";
		
		Predicate p = Objects::nonNull;
		
	}
	
}
