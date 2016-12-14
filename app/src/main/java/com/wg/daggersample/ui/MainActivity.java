package com.wg.daggersample.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.wg.daggersample.bean.Person;
import com.wg.daggersample.R;
import com.wg.daggersample.bean.Student;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject    //表明这个mPoetry是需要注入的,由MainActivityComponent类生成实例去注入。
            Person mName;

    @Inject
    Gson mGson;

    @Inject
    Student student;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*DaggerMainComponent.builder()
                .build()
                .inject(this);
*/
        // 使用Dagger2生成的类 生成组件进行构造，并注入
        MainComponent.getInstance().inject(this);

        initView();
    }

    private void initView() {
        mTextView = (TextView) findViewById(R.id.tv_poetry);
        String json = mGson.toJson(mName)+"======"+student.getNum();
        mTextView.setText(json);
        findViewById(R.id.btn_open).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, OtherActivity.class));
            }
        });
    }
}
