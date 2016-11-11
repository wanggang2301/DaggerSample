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

@Module
public class MainModule {

    @Provides
    public Gson provodeGson(){
        return new Gson();
    }


}
