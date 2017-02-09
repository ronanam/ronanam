package com.ktds.ronanam.dao.support.annotation;

/**
 * ANNOTATION: 주석에 어떤 의미를 부여해서 동작하게 하는 것.
 * VO를 위해 사용.
 * @author RONANAM
 *
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Types {

	public String alias() default "";

	public boolean requires() default false;

}