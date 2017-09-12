package com.lfhan.corejava.object_oriented;

public final class Person {

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		Person p = new Person();
		p.setId(1);
		p.setName("name1");
		System.out.println(p);
		p = new Person();
		System.out.println(p);
	}
}
