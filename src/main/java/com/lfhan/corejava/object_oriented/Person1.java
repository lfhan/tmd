package com.lfhan.corejava.object_oriented;

public class Person1 {

	public static void main(String[] args) {
		// String s = new String("1");
		// System.out.println(s.getClass());
		// String str = "abc";
		// char data[] = { 'a', 'b', 'c' };
		// String str1 = new String(data);
		//
		// System.out.println(str == str1);

//		System.out.println("abc");
//		String cde = "cde";
//		System.out.println("abc" + cde);
//		String c = "abc".substring(2, 3);
//		System.out.println(c);
//		String d = cde.substring(1, 2);
//		System.out.println(d);
//		System.out.println(c == d);
		
		Emploee e = new Emploee();
		Manager m = (Manager)e;
		System.out.println(m);
		if (e instanceof Manager) {
			System.out.println(e);
		}else {
			System.out.println(false);
		}
	}
}
