package com.wg.daggersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject    //由MainActivityComponent类注入生成实例。
    Poetry mPoetry;

    @Inject
    Gson mGson;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent.builder()
                .build()
                .inject(this);

        initView();
    }

    private void initView() {
        mTextView = (TextView) findViewById(R.id.tv_poetry);

        String json=mGson.toJson(mPoetry);

        mTextView.setText(json);
    }
}
