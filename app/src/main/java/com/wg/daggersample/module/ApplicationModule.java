package com.wg.daggersample.module;

import com.wg.daggersample.bean.Student;
import com.wg.daggersample.scope.StudentScope;

import dagger.Module;
import dagger.Provides;

/**
 * @author: Wangg
 * @Name：ApplicationModule
 * @Description:
 * @Created on:2016/12/14  14:30.
 */

@Module
public class ApplicationModule {

    @StudentScope
    @Provides
    public Student provideGson() {
        return new Student(20);
    }
}

