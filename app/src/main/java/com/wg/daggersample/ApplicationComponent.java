package com.wg.daggersample;

import com.wg.daggersample.bean.Student;
import com.wg.daggersample.component.SecondComponent;
import com.wg.daggersample.module.ApplicationModule;
import com.wg.daggersample.module.SecondModule;
import com.wg.daggersample.scope.StudentScope;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author: Wangg
 * @Name：ApplicationComponent
 * @Description:
 * @Created on:2016/12/14  14:32.
 */
//包含方式（从属方式）@SubComponen
@StudentScope
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    Student getStudent();  //暴露Gson对象接口

    SecondComponent plus(SecondModule module);
}
