package com.wstro.zerostartcollect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewTreeObserver;
import android.widget.TextView;

import com.wstro.zerostartcollect.utils.DensityUtils;
import com.wstro.zerostartcollect.utils.LogUtils;

public class ViewDemoActivity extends AppCompatActivity {

    TextView tvMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_demo);

        tvMsg = (TextView) findViewById(R.id.tv_msg);

        LogUtils.d("dp / px: 10 / "  + DensityUtils.dp2px(this,10));

        tvMsg.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                LogUtils.d("x:"+tvMsg.getX() +",y:"+tvMsg.getY());

                tvMsg.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        });


    }
}
