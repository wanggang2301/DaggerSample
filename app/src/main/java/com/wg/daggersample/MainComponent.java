package com.wg.daggersample;

import dagger.Component;

/**
 * @author: Wangg
 * @Name：MainComponent
 * @Description:
 * @Created on:2016/11/11  17:16.
 */

@Component(modules = {MainModule.class,PoetryModule.class})
public interface MainComponent {

    //需要用到这个连接器的对象，就是这个对象里面有需要注入的属性
    void inject(MainActivity activity);
}
