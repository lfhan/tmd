package com.lfhan.core.enumtest;

//: enumerated/NonEnum.java

public class NonEnum {
  public static void main(String[] args) {
    Class<Integer> intClass = Integer.class;
    try {
      for(Object en : intClass.getEnumConstants())
        System.out.println(en);
    } catch(Exception e) {
    	e.printStackTrace();
      System.out.println(e);
    }
  }
} /* Output:
java.lang.NullPointerException
*///:~
