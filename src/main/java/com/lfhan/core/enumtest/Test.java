package com.lfhan.core.enumtest;

import enumerated.menu.Food.Appetizer;
import enumerated.menu.Food.Coffee;
import enumerated.menu.Food.Dessert;

public class Test {
	public static void main(String[] args) {
		  Appetizer[] values = Appetizer.values();
		  for(Appetizer v : values) {
			  System.out.print(v + ",");
		  }
		  System.out.println();
		  Dessert[] vs = Dessert.values();
		  for(Dessert v : vs) {
			  System.out.print(v + ",");
		  }
		  System.out.println();
		  Coffee[] cs = Coffee.values();
		  for(Coffee c : cs) {
			  System.out.print(c + ",");
		  }
		  
	}
}
