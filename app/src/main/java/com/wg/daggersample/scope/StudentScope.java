package com.wg.daggersample.scope;

/**
 * @author: Wangg
 * @Name：StudentScope
 * @Description:
 * @Created on:2016/12/14  15:14.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;


@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface StudentScope {
}
