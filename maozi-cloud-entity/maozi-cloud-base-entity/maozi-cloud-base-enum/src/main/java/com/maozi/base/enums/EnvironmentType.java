package com.maozi.base.enums;

import com.maozi.base.BaseEnum;
import lombok.Getter;
import lombok.Setter;



public enum EnvironmentType implements BaseEnum {
	
	localhost(0,"localhost"),test(1,"test"),production(2,"production");
	
	EnvironmentType(Integer value,String desc) {
		
		this.value = value;
		
		this.desc = desc;
		
	}
	
	@Getter
	@Setter
	private Integer value;
	
	@Getter
	@Setter 
	private String desc;

	@Override
	public String toString() {
		return value+"."+desc;
	}

}
