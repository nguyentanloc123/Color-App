package com.tanloc2017.appmau;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainDanhgia extends AppCompatActivity {
    int diem1;
    int diem2=0;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_danhgia);
        tv4=(TextView) findViewById(R.id.textView4);
        tv5=(TextView) findViewById(R.id.textView5);
        tv6=(TextView) findViewById(R.id.textView5);
        btn=(Button)findViewById(R.id.button2) ;

        Intent intent1 =getIntent();
        Bundle bundle= intent1.getBundleExtra("dulieu");
        diem1= bundle.getInt("diem");
        String d= Integer.toString(diem1);
        diem2=23-diem1;
        tv4.setText("Correct: "+diem1);
        tv5.setText("Wrong: "+diem2);
        if (diem2==0)
        {
            tv6.setText("You don't get the disease");

        }
        if(diem2>1 && diem2<5)
        {

            tv6.setText("You can be the risk of díease");
        }

        else if(diem2>=5)
        {
            tv6.setText("You got the disease ");


        }
        btn.setBackgroundColor(Color.YELLOW);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainDanhgia.this, MainActivity.class);
                startActivity(intent);
            }
        });




    }
}
