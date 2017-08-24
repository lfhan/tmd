package com.lfhan.core.enumtest;

public class EnumTest {

	enum WeekEnum{
		Monday,
		Tuesday,
		Wednesday,
		Thursday,
		Friday,
		Saturday,
		Sunday
	} 
	
	public static void main(String[] args) {
		
//		WeekEnum[] values = WeekEnum.values();
//		for(WeekEnum w : values) {
//			System.out.println(w.ordinal()+"----"+w.name());
//			int compareTo = w.compareTo(WeekEnum.Friday);
//			System.out.println("compareTo="+compareTo);
//			System.out.println("equals"+w.equals(WeekEnum.Friday));
//			System.out.println("==="+(w==WeekEnum.Friday));
//			System.out.println(w.getDeclaringClass());
//			System.out.println(w.getClass());
//			System.out.println();
//		}
		
		
//		int ordinal = WeekEnum.Friday.ordinal();
//		String name = WeekEnum.Friday.name();
//		System.out.println(ordinal + "---" +name);
		
		WeekEnum valueOf = WeekEnum.valueOf("Thursday");
		System.out.println(valueOf);
		System.out.println(valueOf.ordinal());
		System.out.println(valueOf.name());
	}
}
