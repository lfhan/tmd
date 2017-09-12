package com.lfhan.corejava.object_oriented;

public class Test {
	public static void main(String[] args) {
//		Emploee[] es = {new Emploee(),new Manager()};
		Manager[] ms = new Manager[2];
		Emploee[] es = ms;
		es[0] = new Emploee();
		es[1] = new Emploee();
		
		for(Emploee e : es) {
			ms[0].getM();
			System.out.println(e);
		}
	}
}
