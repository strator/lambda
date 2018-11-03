package lambda.method.animal;

public class Dog  extends Animal{
	public Dog(String name, Integer age) {
		super(name, age);
	}
	@Override
	public void behavior(){
		System.out.println("gou dai name:"+ name +";;age:"+ age);
	}
}
