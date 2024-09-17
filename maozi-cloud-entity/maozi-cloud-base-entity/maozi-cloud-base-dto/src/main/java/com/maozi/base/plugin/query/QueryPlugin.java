package com.maozi.base.plugin.query;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface QueryPlugin {
	
	String field() default "";
	
	QueryBaseType value();
	
	boolean nest() default false;

	String tableName() default "";

}
