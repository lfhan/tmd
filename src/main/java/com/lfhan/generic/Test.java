package com.lfhan.generic;

public class Test {

	public static void main(String[] args) {
		Pare<String,Integer> p = new Pare<>();
		p.setFirst("1");
		p.setSecond(2);
		System.out.println(p.getFirst());
		System.out.println(p.getSecond());
	}
}
