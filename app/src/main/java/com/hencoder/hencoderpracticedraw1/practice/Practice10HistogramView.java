package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2);
        float[] pts = {160,50,160,450,160,450,960,450};
        canvas.drawLines(pts,paint);//160-920

        paint.setStrokeWidth(3);//30 80
        canvas.drawLine(190,450,270,450,paint);

        //第一柱子
        paint.setTextSize(30);
        canvas.drawText("foryo",0,5,210,480,paint);

        //第二柱子
        paint.setColor(Color.GREEN);//110
        canvas.drawRect(300,430,380,450,paint);
        paint.setColor(Color.WHITE);//20-30
        canvas.drawText("GB",0,2,320,480,paint);

        //第三柱子
        paint.setColor(Color.GREEN);
        canvas.drawRect(410,330,490,450,paint);
        paint.setColor(Color.WHITE);
        canvas.drawText("ICS",0,3,430,480,paint);

        //第四柱子
        paint.setColor(Color.GREEN);
        canvas.drawRect(520,230,600,450,paint);
        paint.setColor(Color.WHITE);
        canvas.drawText("JB",0,2,540,480,paint);

        //第五柱子
        paint.setColor(Color.GREEN);
        canvas.drawRect(630,200,710,450,paint);
        paint.setColor(Color.WHITE);
        canvas.drawText("KitKat",0,6,630,480,paint);

        //第六柱子
        paint.setColor(Color.GREEN);
        canvas.drawRect(740,130,820,450,paint);
        paint.setColor(Color.WHITE);
        canvas.drawText("L",0,1,780,480,paint);

        //第七柱子
        paint.setColor(Color.GREEN);
        canvas.drawRect(850,220,930,450,paint);
        paint.setColor(Color.WHITE);
        canvas.drawText("M",0,1,880,480,paint);

        //直方图
        paint.setTextSize(40);
        canvas.drawText("直方图",0,3,485,580,paint);
    }
}
