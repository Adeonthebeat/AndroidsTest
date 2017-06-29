package com.example.test.myapp2;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int txtIndex = 0;
    private TextView txtView01;
    private TextView txtView02;
    private TextView txtView03;

    private Button prevBtn;
    private Button nextBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView01 = (TextView)findViewById(R.id.txt1);
        txtView02 = (TextView)findViewById(R.id.txt2);
        txtView03 = (TextView)findViewById(R.id.txt3);

        prevBtn = (Button)findViewById(R.id.btnPrev);
        nextBtn = (Button)findViewById(R.id.btnNext);

        prevBtn.setOnClickListener(this);
        nextBtn.setOnClickListener(this);

    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnPrev:
                if(txtIndex > 0){
                    txtIndex --;
                }
                changeView();
                break;
            case R.id.btnNext:
                if(txtIndex < 2){
                    txtIndex ++;
                }
                changeView();
                break;
            default:break;
        }
    }

    private void changeView(){
        if(txtIndex == 0){
            txtView01.setVisibility(View.VISIBLE);
            txtView02.setVisibility(View.INVISIBLE);
            txtView03.setVisibility(View.INVISIBLE);
        }else if(txtIndex == 1){
            txtView01.setVisibility(View.INVISIBLE);
            txtView02.setVisibility(View.VISIBLE);
            txtView03.setVisibility(View.INVISIBLE);
        }else if(txtIndex == 2){
            txtView01.setVisibility(View.INVISIBLE);
            txtView02.setVisibility(View.INVISIBLE);
            txtView03.setVisibility(View.VISIBLE);
        }
    }

}
