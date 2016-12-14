package com.wg.daggersample.qualifer;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @author: Wangg
 * @Name：PertsonQualifier
 * @Description:
 * @Created on:2016/12/14  16:01.
 */

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface PersonQualifier {
    String value() default "";
}
