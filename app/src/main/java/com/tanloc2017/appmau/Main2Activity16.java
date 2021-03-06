package com.tanloc2017.appmau;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.shashank.sony.fancygifdialoglib.FancyGifDialog;
import com.shashank.sony.fancygifdialoglib.FancyGifDialogListener;

import mehdi.sakout.fancybuttons.FancyButton;

public class Main2Activity16 extends AppCompatActivity {
    int diem1;
    TextView txtdiem;
    FancyButton b1;
    FancyButton b2;
    FancyButton b3;
    Intent intent;
	  FancyButton b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main216);
          intent= new Intent(Main2Activity16.this,Main2Activity17.class);
        final MediaPlayer mp1= MediaPlayer.create(this,R.raw.correct);
        final MediaPlayer mp2= MediaPlayer.create(this,R.raw.wrong);
        b1=(FancyButton) findViewById(R.id.bt1);
        b2=(FancyButton) findViewById(R.id.bt2);
        b3=(FancyButton) findViewById(R.id.bt3);
		  b4=(FancyButton) findViewById(R.id.bt4);

        txtdiem=(TextView) findViewById(R.id.txtdiem);

        Intent intent1 =getIntent();
        Bundle bundle= intent1.getBundleExtra("dulieu");
        diem1= bundle.getInt("diem");
        String d= Integer.toString(diem1);


        txtdiem.setText("Point: "+d);
        final Bundle bundle1= new Bundle();

        final FancyButton next;
        final FancyButton back;
        next=(FancyButton)findViewById(R.id.next);
        back=(FancyButton)findViewById(R.id.back);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new FancyGifDialog.Builder(Main2Activity16.this)
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
                                bundle1.putInt("diem",diem1);
                                intent.putExtra("dulieu",bundle1);
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
                new FancyGifDialog.Builder(Main2Activity16.this)
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
                                Intent intent1 = new Intent(Main2Activity16.this,MainActivity.class);
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
                bundle1.putInt("diem",diem1);
                intent.putExtra("dulieu",bundle1);
                kiemtrasai1();
                mp2.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diem1++;
                bundle1.putInt("diem",diem1);
                intent.putExtra("dulieu",bundle1);
               kiemtradung();mp1.start();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle1.putInt("diem",diem1);
                intent.putExtra("dulieu",bundle1);
                kiemtrasai();
                mp2.start();
            }
        });
		    b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle1.putInt("diem",diem1);
                intent.putExtra("dulieu",bundle1);
                kiemtrasai();
                mp2.start();
            }
        });
		


    }
    public void kiemtradung()
    {
        new FancyGifDialog.Builder(this)
                .setTitle("Correct")
                .setMessage("Those with normal color vision should see a 26")
                .setPositiveBtnBackground("#FF4081")
                .setPositiveBtnText("Ok")
                .setNegativeBtnBackground("#FFA9A7A8")
                .isCancellable(false)
				.setNegativeBtnText("Cancel")
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
    public void kiemtrasai()
    {
        new FancyGifDialog.Builder(this)
                 .setTitle("Wrong")
				 .setNegativeBtnText("Cancel")
                .setMessage("Red color blind (protanopia) people will see a 6, mild red color blind people (prontanomaly) will also faintly see a number 2.")
                .setPositiveBtnBackground("#FF4081")
                .setPositiveBtnText("Ok")
                .setNegativeBtnBackground("#FFA9A7A8")
                .isCancellable(false)
				.setNegativeBtnText("Cancel")
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
    public void kiemtrasai1()
    {
        new FancyGifDialog.Builder(this)
                 .setTitle("Wrong")
				 .setNegativeBtnText("Cancel")
                .setMessage("Green color blind (deuteranopia) people will see a 2, mild green color blind people (deuteranomaly) may also faintly see a number 6.")
                .setPositiveBtnBackground("#FF4081")
                .setPositiveBtnText("Ok")
                .setNegativeBtnBackground("#FFA9A7A8")
                .isCancellable(false)
				.setNegativeBtnText("Cancel")
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
