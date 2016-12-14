package com.wg.daggersample.bean;

/**
 * @author: Wangg
 * @Name：Poetry
 * @Description:
 * @Created on:2016/11/11  17:10.
 */

public class Person {
    private String mName;

    public Person(String mName) {
        this.mName = mName;
    }

    // 用Inject标记构造函数,表示用它来注入到目标对象中去

    public Person() {
        mName = "Person类";
    }


    public String getName() {
        return mName;
    }
}
