package com.wg.daggersample.ui;

import com.wg.daggersample.ApplicationComponent;
import com.wg.daggersample.MainApplication;
import com.wg.daggersample.module.MainModule;
import com.wg.daggersample.module.PersonModule;
import com.wg.daggersample.scope.PersonScope;

import dagger.Component;

/**
 * @author: Wangg
 * @Name：MainComponent
 * @Description:连接器 @Component表示这个接口是一个连接器
 * 能用@Component注解的只能是interface或者抽象类
 * @Created on:2016/11/11  17:16.
 */

//这里表示Component会从MainModule类中拿那些用@Provides注解的方法来生成需要注入的实例

// 这里表示Component会从MainModule类中拿那些用@Provides注解的方法来生成需要注入的实例
@PersonScope
@Component(dependencies = ApplicationComponent.class, modules = {MainModule.class, PersonModule.class})
public abstract class MainComponent {

    //需要用到这个连接器的对象，就是这个对象里面有需要注入的属性
    abstract void inject(MainActivity activity);

    abstract void inject(OtherActivity activity);

    private static MainComponent mComponent;

    public static MainComponent getInstance() {
        if (mComponent == null) {
            mComponent = DaggerMainComponent.builder()
                    .applicationComponent(MainApplication.getInstance().getApplicationComponent())
                    .build();
        }
        return mComponent;
    }
}
