package com.wg.daggersample;

import dagger.Component;

/**
 * @author: Wangg
 * @Name：MainComponent
 * @Description:
 * @Created on:2016/11/11  17:16.
 */

@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
