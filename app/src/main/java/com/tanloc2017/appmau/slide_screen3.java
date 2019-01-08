package com.tanloc2017.appmau;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class slide_screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_screen3);

        Thread time1= new Thread(){
            @Override
            public void run() {
                try{
                    sleep(1000);
                    Intent intent= new Intent(getApplicationContext(),Mmixlayout.class);
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
    }
}
