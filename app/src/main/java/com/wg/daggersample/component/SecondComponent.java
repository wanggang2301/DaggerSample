package com.wg.daggersample.component;

import com.wg.daggersample.module.SecondModule;
import com.wg.daggersample.scope.SecondScope;
import com.wg.daggersample.ui.SecondActivity;

import dagger.Subcomponent;

/**
 * @author: Wangg
 * @Name：SubComponent
 * @Description:
 * @Created on:2016/12/14  15:29.
 */

@SecondScope
@Subcomponent(modules = SecondModule.class)
public interface SecondComponent {
    void inject(SecondActivity activity);
}
