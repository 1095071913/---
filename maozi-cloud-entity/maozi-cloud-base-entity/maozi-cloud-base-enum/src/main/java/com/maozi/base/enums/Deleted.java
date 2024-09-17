package com.maozi.base.enums;

import com.maozi.base.BaseEnum;
import lombok.Getter;
import lombok.Setter;

public enum Deleted implements BaseEnum {
	
	none(0,"未删除"),del(1,"已删除");
	
	Deleted(Integer value,String desc) {
		
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