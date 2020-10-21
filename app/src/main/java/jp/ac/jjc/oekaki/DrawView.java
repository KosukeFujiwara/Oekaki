package jp.ac.jjc.oekaki;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class DrawView extends View {
    static final int WIDTH_NUM = 12;
    static final int HEIGHT_NUM = 16;

    static final String WHITE = "#ffffff";
    static final String RED = "#da2400";
    static final String BROWN = "#916d00";
    static final String SKINC = "#ffb624";

    int dotDize = 10;

    String[][] colorCode = {
            {WHITE, WHITE, WHITE, RED, RED, RED, RED, RED, WHITE, WHITE, WHITE, WHITE},
            {WHITE, WHITE,  RED, RED, RED, RED, RED, RED, RED, RED, RED, WHITE,},
            {WHITE, WHITE, BROWN, BROWN, BROWN, SKINC, SKINC, BROWN, SKINC, WHITE, WHITE, WHITE},
            {WHITE, BROWN, SKINC, BROWN, SKINC, SKINC, SKINC, BROWN, SKINC, SKINC, SKINC, WHITE},
            {WHITE, BROWN, SKINC, BROWN, BROWN, SKINC, SKINC, SKINC, BROWN, SKINC, SKINC, SKINC},
            {WHITE, BROWN, BROWN, SKINC, SKINC, SKINC, SKINC, BROWN, BROWN, BROWN, BROWN, WHITE},
            {WHITE, WHITE, WHITE, SKINC, SKINC, SKINC, SKINC, SKINC, SKINC, SKINC, WHITE, WHITE},
            {WHITE, WHITE, BROWN, BROWN, RED, BROWN, BROWN, BROWN, WHITE, WHITE, WHITE, WHITE},
            {WHITE, BROWN, BROWN, BROWN, RED, BROWN, BROWN, RED, BROWN, BROWN, BROWN, WHITE},
            {BROWN, BROWN, BROWN, BROWN, RED, RED, RED, RED, BROWN, BROWN, BROWN, BROWN},
            {SKINC, SKINC, BROWN, RED, SKINC, RED, RED, SKINC, RED, BROWN, SKINC, SKINC},
            {SKINC, SKINC, SKINC, RED, RED, RED, RED, RED, RED, SKINC, SKINC, SKINC},
            {SKINC, SKINC, RED, RED, RED, RED, RED, RED, RED, RED, SKINC, SKINC},
            {WHITE, WHITE, RED, RED, RED, WHITE, WHITE, RED, RED, RED, WHITE, WHITE},
            {WHITE, BROWN, BROWN, BROWN, WHITE, WHITE, WHITE, WHITE, BROWN, BROWN, BROWN, WHITE},
            {BROWN, BROWN, BROWN, BROWN, WHITE, WHITE, WHITE, WHITE, BROWN, BROWN, BROWN, BROWN}
    };

    public DrawView(Context context, int width, int height){ //こっちは今回使わない
        super(context);
        dotDize = width/WIDTH_NUM;
    }

    protected void onDraw(Canvas c){
        for(int i=0; i<HEIGHT_NUM; i++){
            for(int j=0; j<WIDTH_NUM; j++){
                //paintクラスの設定
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(Color.parseColor(colorCode[i][j]));
                paint.setStyle(Paint.Style.FILL);

                int left = j*dotDize;
                int top = i*dotDize;
                int right = j*dotDize + dotDize;
                int buttom = i*dotDize + dotDize;
                Rect rect = new Rect(left, top, right, buttom);
                c.drawRect(rect, paint);
            }
        }
    }
}
