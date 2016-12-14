package com.wg.daggersample.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.wg.daggersample.bean.Person;
import com.wg.daggersample.R;
import com.wg.daggersample.bean.Student;

import javax.inject.Inject;

public class OtherActivity extends Activity {

    //添加@Inject注解，表示这个mPoetry是需要注入的
    @Inject
    Person mName;

    @Inject
    Gson mGson;

    @Inject
    Student student;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        MainComponent.getInstance().inject(this);


        initView();
    }

    private void initView() {
        mTextView = (TextView) findViewById(R.id.tv_poetry);
        String json = mGson.toJson(mName) + student.getNum();

        mTextView.setText(json);

        findViewById(R.id.sub).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OtherActivity.this, SecondActivity.class));
            }
        });
    }
}
