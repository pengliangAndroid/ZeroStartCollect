package com.wstro.zerostartcollect.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.wstro.zerostartcollect.utils.LogUtils;

/**
 * ClassName: ClockView <br/>
 * Function: TODO ADD FUNCTION. <br/>
 *
 * @author pengl
 * @date 2017/10/6
 */
public class ClockView extends View {
    private final static int DEFAULT_WIDTH = 400;

    private Paint paint;

    private int width,height;

    public ClockView(Context context) {
        super(context);
        initPaint();
    }

    public ClockView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public ClockView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }


    private void initPaint(){
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#333333"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        paint.setTextSize(30);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        width = measureWidth(widthMeasureSpec);
        height = measureWidth(heightMeasureSpec);
        setMeasuredDimension(width,width);
    }


    private int measureWidth(int widthMeasureSpec){
        int mode = MeasureSpec.getMode(widthMeasureSpec);
        int result = MeasureSpec.getSize(widthMeasureSpec);

        LogUtils.d("width size(px):" + result);

        if(mode == MeasureSpec.AT_MOST){
            result = Math.min(DEFAULT_WIDTH,result);
        }

        return result;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        canvas.drawCircle(width/2,width/2,width/4,paint);
        canvas.save();

        int offsetX = width/2;
        int offsetY = width/4;

        for (int i = 0; i < 24; i++) {
            if(i == 0 || i == 6 || i == 12 || i == 18){
                paint.setStrokeWidth(5);
                canvas.drawLine(offsetX,offsetY,offsetX,offsetY + 60,paint);

                String degree = String.valueOf(i);
                canvas.drawText(degree,offsetX - paint.measureText(degree)/2,offsetY + 90,paint);
            }else{
                paint.setStrokeWidth(3);
                canvas.drawLine(offsetX,offsetY,offsetX,offsetY + 30,paint);
            }

            canvas.rotate(15,width/2,width/2);
        }

        canvas.restore();


        Paint paintHour = new Paint();
        paintHour.setStrokeWidth(20);
        Paint paintMinute = new Paint();
        paintMinute.setStrokeWidth(10);

        canvas.save();

        canvas.translate(width/2,width/2);
        canvas.drawLine(0,0,60,60,paintHour);
        canvas.drawLine(0,0,60,120,paintMinute);
        canvas.restore();

    }

}
