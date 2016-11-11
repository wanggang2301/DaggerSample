package com.wg.daggersample;

import dagger.Module;
import dagger.Provides;

/**
 * @author: Wangg
 * @Name：PoetryModule
 * @Description:
 * @Created on:2016/11/11  18:18.
 */

@Module
public class PoetryModule {

    @Provides
    public Poetry providePoetry(String poems){
        return new Poetry(poems);
    }

    // 这里提供了一个生成String的方法，在这个Module里生成Poetry实例时，会查找到这里
    // 可以为上面提供String类型的参数
    @Provides
    public String providePoems(){
        return "只有意志坚强的人sdss，才能到达彼岸";
    }
}
