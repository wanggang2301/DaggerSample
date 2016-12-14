package com.wg.daggersample.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author: Wangg
 * @Name：SubScope
 * @Description:
 * @Created on:2016/12/14  15:30.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface SecondScope {
}
