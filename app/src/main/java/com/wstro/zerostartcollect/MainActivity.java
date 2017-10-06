package com.wstro.zerostartcollect;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_demo_1).setOnClickListener(this);
        findViewById(R.id.btn_demo_2).setOnClickListener(this);
        findViewById(R.id.btn_demo_3).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case R.id.btn_demo_1:
                intent = new Intent(this,ViewDemoActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_demo_2:
                intent = new Intent(this,ViewDemo2Activity.class);
                startActivity(intent);
                break;
            case R.id.btn_demo_3:
                intent = new Intent(this,ViewDemo3Activity.class);
                startActivity(intent);
                break;
        }
    }
}
