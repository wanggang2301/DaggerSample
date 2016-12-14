package com.wg.daggersample.module;

import com.wg.daggersample.bean.Person;
import com.wg.daggersample.qualifer.PersonQualifier;
import com.wg.daggersample.scope.SecondScope;

import dagger.Module;
import dagger.Provides;

/**
 * @author: Wangg
 * @Name：SubModule
 * @Description:
 * @Created on:2016/12/14  15:30.
 */
@Module
public class SecondModule {
    @PersonQualifier("Second")
    @SecondScope
    @Provides
    public Person getPerson() {
        return new Person("大家好");
    }

    @PersonQualifier("B")
    @SecondScope
    @Provides
    public Person getOtherPerson() {
        return new Person("朋友好");
    }
}
