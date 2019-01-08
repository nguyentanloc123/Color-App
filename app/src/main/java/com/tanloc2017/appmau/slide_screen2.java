package com.tanloc2017.appmau;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class slide_screen2 extends AppCompatActivity {

    Button btnn;
    Button btnb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_screen2);
        btnn=(Button) findViewById(R.id.btnnext);
        btnb=(Button) findViewById(R.id.btnback);
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(slide_screen2.this,Mainphamau.class);
                Thread time1= new Thread(){
                    @Override
                    public void run() {
                        try{
                            sleep(5000);
                            Intent intent= new Intent(getApplicationContext(),Mainphamau.class);
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
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(slide_screen2.this, slide_screen.class);
                startActivity(intent);
            }
        });
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }
}
