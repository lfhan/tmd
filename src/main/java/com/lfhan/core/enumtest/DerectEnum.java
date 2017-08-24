package com.lfhan.core.enumtest;

public enum DerectEnum {
	//enum需要些到前边，成员变量的声明写在前边编译通不过
	WEST("西"),
	NORTH("北"),
	EAST("东"),
	SOUTH("南");
	
	
	private String desc;
	
	private DerectEnum(String desc) {
		this.desc = desc;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public static void main(String[] args) {
		DerectEnum[] values = DerectEnum.values();
		for(DerectEnum v : values) {
			System.out.println(v+"  =   "+v.getDesc());
		}
	}
//	WEST("东");
}
