package lambda.runnable;

public class ThreadTest {
	public static void main(String[] args) {
		new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("thread is run one;");	
			}
		}).start();
		
		new Thread(()->{System.out.println("thread is run two;");}).start();
	}
}