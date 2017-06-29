package com.example.test.myapp1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
          LinearLayout.LayoutParams.MATCH_PARENT,
          LinearLayout.LayoutParams.WRAP_CONTENT

        );
        LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT

        );

        Button btn1 = new Button(this);
        btn1.setText("버튼 01");
        btn1.setLayoutParams(params);

        mainLayout.addView(btn1);

        Button btn2 = new Button(this);
        btn1.setText("버튼 01");
        btn1.setLayoutParams(params1);

        mainLayout.addView(btn2);

        TextView txt1 = new TextView(this);
        txt1.setText("텍스트 뷰");
        txt1.setBackgroundColor(Color.YELLOW);
        txt1.setLayoutParams(params);

        mainLayout.addView(txt1);

        setContentView(mainLayout);
    }
}
