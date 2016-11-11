package com.wg.daggersample;

import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;

/**
 * @author: Wangg
 * @Name：MainModule
 * @Description:
 * @Created on:2016/11/11  17:22.
 */
//@Module是用来生产实例来注入对象的，它类似一个工厂，集中创建要注入的类的对象实例。

@Module
public class MainModule {

    /**
     * @Provides 注解表示这个方法是用来创建某个实例对象的，这里我们创建返回Gson对象
     * 方法名随便，一般用provideXXX结构
     * @return 返回注入对象
     */

    @Provides
    public Gson provodeGson() {
        return new Gson();
    }


}
