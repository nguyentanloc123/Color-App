package com.tanloc2017.appmau;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class slide_screen extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_screen);
        btn=(Button) findViewById(R.id.button9);
        btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(slide_screen.this,slide_screen2.class);
                Thread time1= new Thread(){
                    @Override
                    public void run() {
                        try{
                           sleep(5000);
                            Intent intent= new Intent(getApplicationContext(),slide_screen2.class);
                            startActivity(intent);
                            finish();
                           super.run();


                        }
                       catch (InterruptedException e)
                        {
                            e.printStackTrace();

                      }
                    }
                };time1.start();

                startActivity(intent);

            }
        });
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }
}
