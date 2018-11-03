package lambda.method.animal;

public class Bird  extends Animal{
	public Bird(String name, Integer age) {
		super(name, age);
	}
	@Override
	public void behavior(){
		System.out.println("fly bird name:"+ super.name +";;age:"+super.age);
	}
}
