package com.maozi.base.plugin.query;

import lombok.Getter;

@Getter
public enum QueryBaseType {

	eq("eq","等于"),like("like","模糊查询"),in("in","范围等值查询"),ne("ne","不等于"),ge("ge","大于等于"),le("le","小于等于");
	
	QueryBaseType(String type,String name) {
		
		this.type = type;
		
		this.name = name;
		
	}
	
	private String type;
	
	private String name;
	
}
