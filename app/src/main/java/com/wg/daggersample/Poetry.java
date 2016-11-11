package com.wg.daggersample;

import javax.inject.Inject;

/**
 * @author: Wangg
 * @Name：Poetry
 * @Description:
 * @Created on:2016/11/11  17:10.
 */

public class Poetry {
    private String mPemo;

    // 用Inject标记构造函数,表示用它来注入到目标对象中去
    @Inject
    public Poetry() {
        mPemo = "生活就像海洋";
    }

    public String getPemo() {
        return mPemo;
    }
}
