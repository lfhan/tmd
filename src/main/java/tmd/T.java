package tmd;

public class T {
	public static void main(String[] args) {
//		System.out.println(1111);
		
//		String s = "s";
//		StringBuffer sb = new StringBuffer("t");
//		System.out.println(s.hashCode());
//		System.out.println(sb.hashCode());
		Object[] elementData = {};
		Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
		int minCapacity = 1;
		int DEFAULT_CAPACITY = 10;
		if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }
		System.out.println(minCapacity);
	}
}
