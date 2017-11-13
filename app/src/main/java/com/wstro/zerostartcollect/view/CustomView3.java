package com.wstro.zerostartcollect.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * ClassName: CustomView3 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 *
 * @author pengl
 * @date 2017/11/13
 */
public class CustomView3 extends View {
    private Paint mPaint;

    private int mWidth,mHeight;

    public CustomView3(Context context) {
        this(context,null);
    }

    public CustomView3(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public CustomView3(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        mPaint = new Paint();
        mPaint.setAntiAlias(true);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        mWidth = w;
        mHeight = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //translate
       /* mPaint.setColor(Color.BLACK);
        canvas.translate(200,200);
        canvas.drawCircle(0,0,100,mPaint);

        mPaint.setColor(Color.BLUE);
        canvas.translate(200,200);
        canvas.drawCircle(0,0,100,mPaint);*/

       //scale
        mPaint.setStrokeWidth(5);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.BLACK);
        canvas.translate(mWidth/2,mHeight/2);

         /*
         canvas.translate(mWidth/2,mHeight/2);
         RectF rectF = new RectF(0,-400,400,0);
        canvas.drawRect(rectF,mPaint);

        //canvas.scale(0.5f,0.5f);
        //canvas.scale(-0.5f,0.5f);
        //canvas.scale(0.5f,-0.5f);
        //canvas.scale(-0.5f,-0.5f);
        //canvas.scale(-0.5f,-0.5f,200,0);
        //mPaint.setColor(Color.BLUE);
        //canvas.drawRect(rectF,mPaint);

        //demo
        RectF rectF = new RectF(-400,-400,400,400);

        for (int i = 0; i < 10; i++) {
            canvas.scale(0.9f,0.9f);
            canvas.drawRect(rectF,mPaint);
        }*/


       //rotate
        /*RectF rectF = new RectF(0,-400,400,0);
        canvas.drawRect(rectF,mPaint);

        //canvas.rotate(180);
        canvas.rotate(180,200,0);
        mPaint.setColor(Color.BLUE);
        canvas.drawRect(rectF,mPaint);*/


        canvas.drawCircle(0,0,380,mPaint);
        canvas.drawCircle(0,0,400,mPaint);

        float[] points = new float[]{0,380,0,400};
        for (int i = 0; i < 36; i++) {
            canvas.drawLines(points,mPaint);
            canvas.rotate(10);
        }


    }
}
