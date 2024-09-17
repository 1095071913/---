package com.maozi.base.plugin.join;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface JoinPlugin {
	
	JoinBaseType value();

	String on() default "";

	String tableName() default "";

	String tableAlias() default "";

}
