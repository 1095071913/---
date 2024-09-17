package com.maozi.base.plugin;

import com.github.yulichang.wrapper.MPJLambdaWrapper;

public abstract class QueryBasePlugin<T> {

	public abstract void apply(MPJLambdaWrapper<T> wrapper,String field,Object data);
	
}
