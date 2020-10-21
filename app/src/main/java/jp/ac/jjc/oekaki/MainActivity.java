package jp.ac.jjc.oekaki;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;

public class MainActivity extends AppCompatActivity {

    DrawView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //画面サイズを取得する！
        Display display = this.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        int width = point.x;
        int height = point.y;

        System.out.println("横幅：" + width);
        System.out.println("縦幅：" + height);

        view = new DrawView(this, width, height);
        setContentView(view);
    }
}