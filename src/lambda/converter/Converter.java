package lambda.converter;

@FunctionalInterface
public interface Converter <F, T>{
	T convert(F from);
	
	public static void main(String[] args) {
		Converter<String, Integer> convert = new Converter<String, Integer>() {
			@Override
			public Integer convert(String from) {
				return Integer.parseInt(from);
			}
		};
		System.out.println(convert.convert("123"));
		
		Converter<String, Integer> convert2 = (param) -> Integer.parseInt(param);
		System.out.println(convert2.convert("1234"));
	}
}
