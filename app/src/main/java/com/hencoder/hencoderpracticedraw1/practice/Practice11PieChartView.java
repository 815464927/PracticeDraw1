package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);//(530,330)r=250
        //canvas.drawCircle(510,330,250,paint);

        //=============================================================
        //字字(lillipop)和线
        paint.setTextSize(28);
        paint.setColor(Color.WHITE);
        canvas.drawText("Lollipop",0,8,50,80,paint);
        paint.setStrokeWidth(2);
        float[] fts = {170,80,300,80,300,80,470,270};
        canvas.drawLines(fts,paint);

        //红色扇形
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        canvas.drawArc(250,60,750,560,-180,130,true,paint);


        //=============================================================
        //文字(Marshmallow)和线
        paint.setColor(Color.WHITE);
        canvas.drawText("Marshmallow",0,11,850,200,paint);
        float[] fts1 = {510,330,780,200,780,200,840,200};
        canvas.drawLines(fts1,paint);

        //黄色区域 圆心(510,330)
        paint.setColor(Color.YELLOW);
        canvas.drawArc(260,80,760,580,-50,50,true,paint);


        //=============================================================
        //文字(KitKat)和线
        paint.setColor(Color.WHITE);
        canvas.drawText("KitKat",0,6,50,500,paint);
        float[] fts2 = {170,500,280,500,280,500,510,330};
        canvas.drawLines(fts2,paint);

        //蓝色区域 圆心(510,330)
        paint.setColor(Color.BLUE);
        canvas.drawArc(260,80,760,580,80,100,true,paint);


        //=============================================================
        //文字(JellyBean)和线
        paint.setColor(Color.WHITE);
        canvas.drawText("JellyBean",0,9,850,550,paint);
        float[] fts3 = {510,330,720,550,720,550,840,550};
        canvas.drawLines(fts3,paint);

        //绿色区域 圆心(510,330)
        paint.setColor(Color.GREEN);
        canvas.drawArc(260,80,760,580,30,48,true,paint);


        //=============================================================
        //文字(ice Cream Sandwich)和线
        paint.setColor(Color.WHITE);
        canvas.drawText("ice Cream",0,9,850,450,paint);
        float[] fts4 = {510,330,750,410/*第一根直线*/,
                        750,410,780,410/*第二根直线*/,
                        780,410,810,450/*第三根直线*/,
                        810,450,840,450/*第四根直线*/};
        canvas.drawLines(fts4,paint);

        //灰色区域 圆心(510,330)
        paint.setColor(Color.GRAY);
        canvas.drawArc(260,80,760,580,14,13,true,paint);


        //=============================================================
        //文字(Gingerbread)和线
        paint.setColor(Color.WHITE);
        canvas.drawText("Gingerbread",0,11,850,380,paint);
        float[] fts5 = {510,330,760,360/*第一根直线*/,
                760,360,780,360/*第二根直线*/,
                780,360,810,380/*第三根直线*/,
                810,380,840,380/*第四根直线*/};
        canvas.drawLines(fts5,paint);

        //浅蓝色区域 圆心(510,330)
        paint.setColor(Color.CYAN);
        canvas.drawArc(260,80,760,580,2,10,true,paint);


        //=============================================================
        //文字(Froyo)和线
        paint.setColor(Color.WHITE);
        canvas.drawText("Froyo",0,5,850,334,paint);
        canvas.drawLine(760,334,840,334,paint);
    }
}
