package lambda.parallel;

import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Test {


	public static void main(String[] args) {
		int num = 1000000; //1百万6个0
		// 串行测试
		chuan(num);
		// 并行测试
		//parallel(num);
	}
	public static void parallel(int num) {
		ArrayList<String> bigLists = new ArrayList<String>();
		for(int i = 0; i <num ; i++){
			UUID uuid = UUID.randomUUID();
			bigLists.add(uuid.toString());
		}
		// 并行测试
		long nanoTime3 = System.nanoTime();
		long count2 = bigLists.parallelStream().sorted().count();
		long nanoTime4 = System.nanoTime();
		long millis2 = TimeUnit.NANOSECONDS.toMillis(nanoTime4 - nanoTime3);
		System.out.println(System.out.printf("并行排序：%d ms; conut %d ", millis2, count2));
	}
	
	public static void chuan(int num) {
		ArrayList<String> bigLists = new ArrayList<String>();
		for(int i = 0; i < num ; i++){
			UUID uuid = UUID.randomUUID();
			bigLists.add(uuid.toString());
		}
		// 串行测试
		long nanoTime = System.nanoTime();
		long count = bigLists.stream().sorted().count();
		long nanoTime2 = System.nanoTime();
		long millis = TimeUnit.NANOSECONDS.toMillis(nanoTime2 - nanoTime);
		System.out.println(System.out.printf("串行排序：%d ms ; conut %d", millis ,count));
	}

}
