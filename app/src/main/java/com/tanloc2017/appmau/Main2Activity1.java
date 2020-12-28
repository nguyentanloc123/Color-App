package com.tanloc2017.appmau;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.shashank.sony.fancygifdialoglib.FancyGifDialog;
import com.shashank.sony.fancygifdialoglib.FancyGifDialogListener;

import mehdi.sakout.fancybuttons.FancyButton;

public class Main2Activity1 extends AppCompatActivity {

    int diem1 = 0;
    FancyButton b1;
    FancyButton b2;
    FancyButton next;
    FancyButton back;
    FancyButton b3;
    FancyButton b4;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);
        intent = new Intent(Main2Activity1.this, Main2Activity2.class);
        b1 = (FancyButton) findViewById(R.id.bt1);
        b2 = (FancyButton) findViewById(R.id.bt2);
        b3 = (FancyButton) findViewById(R.id.bt3);
        b4 = (FancyButton) findViewById(R.id.bt4);
        final Bundle bundle = new Bundle();

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.stone);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.correct);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.wrong);
        final FancyButton next;
        final FancyButton back;
        next = (FancyButton) findViewById(R.id.next);
        back = (FancyButton) findViewById(R.id.back);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new FancyGifDialog.Builder(Main2Activity1.this)
                        .setTitle("Do you want to skip")
                        .setMessage("If you skip this question, you will lose the point ?")
                        .setPositiveBtnBackground("#FF4081")
                        .setPositiveBtnText("Ok")
                        .setNegativeBtnText("Cancel")
                        .setNegativeBtnBackground("#FFA9A7A8")
                        .isCancellable(true)
                        .setGifResource(R.drawable.rocket)   //Pass your Gif here
                        .OnPositiveClicked(new FancyGifDialogListener() {
                            @Override
                            public void OnClick() {
                                finish();
                                bundle.putInt("diem", diem1);
                                intent.putExtra("dulieu", bundle);
                                startActivity(intent);
                            }
                        })
                        .OnNegativeClicked(new FancyGifDialogListener() {
                            @Override
                            public void OnClick() {


                            }
                        })
                        .build();


            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new FancyGifDialog.Builder(Main2Activity1.this)
                        .setTitle("Do you want to exit")
                        .setMessage("If you exit all answer will reset to star?")
                        .setPositiveBtnBackground("#FF4081")
                        .setPositiveBtnText("Ok")
                        .setNegativeBtnText("Cancel")
                        .setNegativeBtnBackground("#FFA9A7A8")
                        .isCancellable(true)
                        .setGifResource(R.drawable.quessyion)   //Pass your Gif here
                        .OnPositiveClicked(new FancyGifDialogListener() {
                            @Override
                            public void OnClick() {
                                finish();
                                Intent intent1 = new Intent(Main2Activity1.this, MainActivity.class);
                                startActivity(intent1);

                            }
                        })
                        .OnNegativeClicked(new FancyGifDialogListener() {
                            @Override
                            public void OnClick() {


                            }
                        })
                        .build();


            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diem1++;
                mp.start();
                bundle.putInt("diem", diem1);
                intent.putExtra("dulieu", bundle);
                kiemtradung();
                mp1.start();


            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putInt("diem", diem1);
                intent.putExtra("dulieu", bundle);
                mp.start();
                //  al.show();
                kiemtrasai();
                mp2.start();


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putInt("diem", diem1);
                intent.putExtra("dulieu", bundle);
                mp.start();
                kiemtrasai();
                //    al.show();
                mp2.start();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putInt("diem", diem1);
                intent.putExtra("dulieu", bundle);
                mp.start();
                kiemtrasai();
                //    al.show();
                mp2.start();

            }
        });


    }

    public void kiemtradung() {
        new FancyGifDialog.Builder(this)
                .setTitle("Correct")
                .setMessage("All people should see a number 12, including those with total color blindness")
                .setPositiveBtnBackground("#FF4081")
                .setPositiveBtnText("Ok")
                .setNegativeBtnText("Cancel")
                .setNegativeBtnBackground("#FFA9A7A8")
                .isCancellable(false)

                .setGifResource(R.drawable.youright)   //Pass your Gif here
                .OnPositiveClicked(new FancyGifDialogListener() {
                    @Override
                    public void OnClick() {
                        finish();
                        startActivity(intent);
                    }
                })
                .OnNegativeClicked(new FancyGifDialogListener() {
                    @Override
                    public void OnClick() {
                        finish();
                        startActivity(intent);

                    }
                })
                .build();


    }

    public void kiemtrasai() {
        new FancyGifDialog.Builder(this)
                .setTitle("Wrong!!!")
                .setMessage("All people should see a number 12, including those with total color blindness")
                .setPositiveBtnBackground("#FF4081")
                .setPositiveBtnText("Ok")
                .setNegativeBtnText("Cancel")
                .setNegativeBtnBackground("#FFA9A7A8")
                .isCancellable(false)
                .setGifResource(R.drawable.youfalse) //Pass your Gif here
                .OnPositiveClicked(new FancyGifDialogListener() {
                    @Override
                    public void OnClick() {
                        finish();
                        startActivity(intent);
                    }
                })
                .OnNegativeClicked(new FancyGifDialogListener() {
                    @Override
                    public void OnClick() {
                        finish();
                        startActivity(intent);

                    }
                })
                .build();


    }


}
