package com.maozi.base.plugin;

import com.github.yulichang.wrapper.MPJLambdaWrapper;
import com.maozi.base.plugin.join.JoinPlugin;

public abstract class JoinBasePlugin<T> {

	public abstract void apply(String abbreviationModelName,MPJLambdaWrapper<T> wrapper, JoinPlugin joinPlugin);
	
}
