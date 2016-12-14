package com.wg.daggersample;

import android.app.Application;

import com.wg.daggersample.component.SecondComponent;
import com.wg.daggersample.module.SecondModule;

/**
 * @author: Wangg
 * @Name：MainApplication
 * @Description:
 * @Created on:2016/12/14  14:36.
 */

public class MainApplication extends Application {

    private ApplicationComponent mApplicationComponent;

    private static MainApplication sApplication;

    public static MainApplication getInstance() {
        return sApplication;
    }
    private SecondComponent subComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        sApplication = this;
        mApplicationComponent = DaggerApplicationComponent.builder().build();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

    public SecondComponent getAComponent() {
        if (subComponent == null){
            subComponent = mApplicationComponent.plus(new SecondModule());
        }
        return subComponent;
    }
}


