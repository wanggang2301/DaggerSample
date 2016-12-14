package com.wg.daggersample.module;

import com.wg.daggersample.scope.PersonScope;
import com.wg.daggersample.bean.Person;

import dagger.Module;
import dagger.Provides;

/**
 * @author: Wangg
 * @Name：PoetryModule
 * @Description:
 * @Created on:2016/11/11  18:18.
 */

@Module
public class PersonModule {

    @PersonScope
    @Provides
    public Person provideName(String name) {
        return new Person(name);
    }

    // 这里提供了一个生成String的方法，在这个Module里生成Poetry实例时，会查找到这里
    // 可以为上面提供String类型的参数
    @Provides
    public String provideNames() {
        return "PersonModule类";
    }
}

/**
 * 细心的同学就会发现了，我们提供了两个可以生成Poetry实例的方法，
 * 一个是在Poetry类的构造函数时候用@Inject提供的实例创建方法，
 * 一个是在PoetryModule中的@Privodes注解的providePoetry方法，
 * 而在上面的运行结果中我们发现是调用了PoetryModule提供的方法，
 * 这里就要说明一下优先级的问题，在上面这种既在构造函数中用@Inject提供注入来源，
 * 也在@Module中用@Privodes注解提供注入来源的，Dagger2是先从@Privodes查找类实例，
 * 如果找到了就用@Module提供的方法来创建类实例，如果没有就从构造函数里用@Inject注解的生成类实例，
 * 如果二者都没有，则报错，简而言之，就是@Module的优先级高于@Inject。
 */
