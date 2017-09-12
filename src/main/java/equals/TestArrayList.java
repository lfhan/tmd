package equals;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		long start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			list.add(new Employee());
//			list.trimToSize();
			list.add(new Employee());
			list.add(new Employee());
			list.add(new Employee());
			list.add(new Employee());
			list.add(new Employee());
			list.add(new Employee());
			list.add(new Employee());
		}
		long end = System.currentTimeMillis();
		System.out.println("耗时"+(end-start)+"ms");
		
		
//		int[] is = new int[10];
//		System.out.println(is.length);
	}
}
