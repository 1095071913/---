package com.maozi.base.plugin.mapping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface QueryMapping {
	
	boolean isService() default false;
	
	String serviceName() default "";
	
	String relationField() default "";
	
	boolean ignore() default false;
	
	String functionName() default "";

	String tableName() default "";

	String field() default "";

}
