package com.lfhan.core.enumtest;

public class SwitchEnumTest {
	enum Md{T ,M ,D}
	public static void main(String[] args) {
		Md m = Md.D;
		switch (m) {
		case T:
			System.out.println("this is T!");
			break;
		case M:
			System.out.println("this is M!");
			break;
		case D:
			System.out.println("this is D!");
			break;
		default:
			break;
		}
	}
}
