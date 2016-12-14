package com.wg.daggersample.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author: Wangg
 * @Name：PersonScope
 * @Description:
 * @Created on:2016/12/14  12:09.
 *
 * 可以看到，调用同一个MainComponent实例多次注入的时候每次都重新生成Poetry实例，
 * 有时候我们需要只希望生成一个共用实例的时候应该怎么办呢，这里我们就需要用到Dagger2的@Scope属性了，
 * Scope是作用域的意思，我们先自定义一个@Scope注解:
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PersonScope {
}


/*
通过实现自定义@Scope注解，标记当前生成对象的使用范围，标识一个类型的注射器只实例化一次，
在同一个作用域内，只会生成一个实例，然后在此作用域内共用一个实例。
 */