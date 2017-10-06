package com.wstro.zerostartcollect.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.wstro.zerostartcollect.utils.DensityUtils;
import com.wstro.zerostartcollect.utils.LogUtils;

/**
 * ClassName: CustomView <br/>
 * Function: TODO ADD FUNCTION. <br/>
 *
 * @author pengl
 * @date 2017/10/6
 */
public class CustomView2 extends View {

    private Paint paint;

    public CustomView2(Context context) {
        super(context);
        initPaint();
    }

    public CustomView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public CustomView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }


    private void initPaint(){
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#f16666"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(DensityUtils.dp2px(getContext(),5));
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(measureWidth(widthMeasureSpec),measureWidth(heightMeasureSpec));
    }


    private int measureWidth(int widthMeasureSpec){
        int mode = MeasureSpec.getMode(widthMeasureSpec);
        int result = MeasureSpec.getSize(widthMeasureSpec);

        LogUtils.d("width size(px):" + result);

        if(mode == MeasureSpec.AT_MOST){
            result = Math.min(200,result);
        }

        return result;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //draw rect
        canvas.drawRect(0,0,100,100,paint);

        //draw round rect
        RectF rectF = new RectF(0,0,140,140);
        canvas.drawRoundRect(rectF,10,10,paint);

        //draw point
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPoint(120,120,paint);

        //draw line
        canvas.drawLine(200,200,300,320 ,paint);

        //draw circle
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(400,400,120,paint);

        //draw arc
        rectF = new RectF(0,200,200,400);
        // paint.setStyle(Paint.Style.FILL);
        //canvas.drawArc(rectF,0,90,true,paint);
        canvas.drawArc(rectF,0,90,false,paint);

        //draw oval
        rectF = new RectF(0,400,200,500);
        canvas.drawOval(rectF,paint);



        //draw path
        Path path = new Path();
        path.moveTo(500,500);
        path.lineTo(600,600);
        path.lineTo(600,800);
        path.lineTo(800,600);
        canvas.drawPath(path,paint);


        //draw text
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(DensityUtils.sp2px(getContext(),15));

        canvas.drawText("Android",500,100,paint);
    }
}
