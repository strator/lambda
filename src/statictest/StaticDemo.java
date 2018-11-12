package statictest;

public class StaticDemo {

	public static int wodesize = 1;
	
	public static void main(String[] args) {
		StaticDemo demo1 = new StaticDemo();
		//System.out.println(demo1.wodesize);
		demo1.wodesize=2;
		System.out.println(demo1.wodesize);
		
		StaticDemo demo2 = new StaticDemo();
		System.out.println(demo2.wodesize);
		
		//lambda a,b,c a+b+c;
	}
}
