package com.tanloc2017.appmau;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Splascreen extends AppCompatActivity {

    Button btn;
    Animation anim1;
    Animation anim2;
    ImageView img;
    ConstraintLayout ct;
    AnimationDrawable anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splascreen);

        ct=(ConstraintLayout) findViewById(R.id.mylayout);
        btn= (Button) findViewById(R.id.button5);

        img=(ImageView) findViewById(R.id.imgvv);
        anim1= AnimationUtils.loadAnimation(this,R.anim.frombot);
        anim2=AnimationUtils.loadAnimation(this,R.anim.fromtop);
        btn.setAnimation(anim1);
        img.setAnimation(anim2);
        anim =(AnimationDrawable) ct.getBackground();
        anim.setEnterFadeDuration(4500);
        anim.setExitFadeDuration(4500);
        anim.start();


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread time1= new Thread(){
                    @Override
                    public void run() {
                        try{
                            sleep(1000);
                            Intent intent= new Intent(getApplicationContext(),MainActivity.class);
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
        });




    }
}
