package com.wstro.zerostartcollect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;

import com.wstro.zerostartcollect.utils.LogUtils;

public class ViewDemo2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_demo2);

        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,10,
                getResources().getDisplayMetrics());

        LogUtils.d("px:"+px);

    }
}
