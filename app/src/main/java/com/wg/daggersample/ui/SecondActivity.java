package com.wg.daggersample.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.wg.daggersample.MainApplication;
import com.wg.daggersample.R;
import com.wg.daggersample.bean.Person;
import com.wg.daggersample.bean.Student;
import com.wg.daggersample.qualifer.PersonQualifier;

import javax.inject.Inject;

public class SecondActivity extends Activity {


    TextView mTextView;


    @Inject
    Student student;

    @PersonQualifier("B")
    @Inject
    Person mPoetry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        MainApplication.getInstance()
                .getAComponent()
                .inject(this);

        mTextView = (TextView) findViewById(R.id.text);
        String text = mPoetry.getName() + "===" + student.getNum();
        mTextView.setText(text);
    }
}
