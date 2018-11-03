package lambda.method;

import lambda.method.animal.Animal;
import lambda.method.animal.Dog;

public class StructureTest {

	public static void main(String[] args) {
		Factory<Dog> dogfactory = new Factory<Dog>(){
			@Override
			public Dog create(String name, Integer age) {
				return new Dog(name,age);
			}
		};
		dogfactory.create("��ʿ��", 12).behavior();
		
		Factory<Dog> dogfactory2 = Dog::new;
		dogfactory2.create("��   ë", 14).behavior();
		
		
		
		/*Animal animal = new Animal("С   ��",7){
			@Override
			public void behavior(){
				System.out.println("xiao yu name:"+ name +";;age:"+ age);
			}
		};
		animal.behavior();*/
	}
	
	interface Factory<T extends Animal>{
		T create(String name,Integer age);
	}
	
}
