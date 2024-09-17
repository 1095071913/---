package com.maozi.base;

import com.baomidou.mybatisplus.annotation.IEnum;

public interface BaseEnum extends IEnum<Integer> {

	Integer getValue();
	
	String getDesc();

}