package com.tanloc2017.appmau;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.SimpleCircleButton;
import com.nightonke.boommenu.BoomButtons.TextInsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.shashank.sony.fancygifdialoglib.FancyGifDialog;
import com.shashank.sony.fancygifdialoglib.FancyGifDialogListener;

import org.w3c.dom.Text;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import mehdi.sakout.fancybuttons.FancyButton;

public class MainActivity extends AppCompatActivity {
    boolean open = false;
    boolean off = false;
    Animation anim1;
    Animation anim2;
    Animation anim3;
    Animation anim4;
    Animation anim8;
    Button im1;
    Animation anim5;
    Animation anim6;
    Animation anim7;
    Animation anim9;
    Animation anim10;
    Button btnsetting;
    Button btnmusic;
    Button btnexit;
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button btnstar10;
    Button btnstar7;
    Button btnstar3;
    Button btnstar8;
    Button btnstar4;
    Button btnstar12;
    Button btnstar1;
    Button btnstar11;
    LoginButton loginButton;
    CallbackManager callbackManager;
    Context context;
 //   Button btnnguoidung;
    //boolean check=false,cmusic=false;
    //BoomMenuButton bmb;
    //ArrayList<Integer> imgm= new ArrayList<>();


    // int[] imgm=new int[]{R.drawable.music_off_512,R.drawable.exit};
    //String[] tieude= new String[] {"Turn off music", "Exit"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  bmb = (BoomMenuButton) findViewById(R.id.bmb);
      //  btnnguoidung = (Button) findViewById(R.id.btn_nguoidung);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt4);
        bt4 = (Button) findViewById(R.id.bt3);
        im1 = (Button) findViewById(R.id.im1);
        btnexit = (Button) findViewById(R.id.btnexit);
        btnmusic = (Button) findViewById(R.id.btn_music);
        btnsetting = (Button) findViewById(R.id.btn_setting);
        // btnexit.setVisibility(View.INVISIBLE);
        //  btnmusic.setVisibility(View.INVISIBLE);
        btnstar10 = (Button) findViewById(R.id.button10);
        btnstar7 = (Button) findViewById(R.id.button7);
        btnstar3 = (Button) findViewById(R.id.button3);

        btnstar8 = (Button) findViewById(R.id.button8);
        btnstar4 = (Button) findViewById(R.id.button4);
        btnstar11 = (Button) findViewById(R.id.button11);
        btnstar12 = (Button) findViewById(R.id.button12);


        printKeyHash(MainActivity.this);




        callbackManager = CallbackManager.Factory.create();


        loginButton = (LoginButton) findViewById(R.id.login_button);
        loginButton.setReadPermissions("email");
        // If using in a fragment


        // Callback registration
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                // App code
                Toast.makeText(context, "Login Facebook success", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancel() {
                // App codet
            }

            @Override
            public void onError(FacebookException exception) {
                // App code
                Toast.makeText(context, "Login Facebook error", Toast.LENGTH_SHORT).show();
            }
        });


        LoginManager.getInstance().registerCallback(callbackManager,
                new FacebookCallback<LoginResult>() {
                    @Override
                    public void onSuccess(LoginResult loginResult) {
                        // App code
                    }

                    @Override
                    public void onCancel() {
                        // App code
                    }

                    @Override
                    public void onError(FacebookException exception) {
                        // App code
                    }
                });




       /* fab=(FloatingActionButton)findViewById(R.id.fab);
        fabmus=(FloatingActionButton)findViewById(R.id.fabmu);
        fabcbg=(FloatingActionButton)findViewById(R.id.fabchangback);
        fabcontact=(FloatingActionButton)findViewById(R.id.fabcontact);*/
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.stone);
        final MediaPlayer songbk = MediaPlayer.create(this, R.raw.ukulele);
        //hidefloat();
        anim1 = AnimationUtils.loadAnimation(this, R.anim.uptodownitem1);
        anim2 = AnimationUtils.loadAnimation(this, R.anim.uptodownitem2);
        anim3 = AnimationUtils.loadAnimation(this, R.anim.uptodownitem3);
        anim4 = AnimationUtils.loadAnimation(this, R.anim.uptodownitem4);


        anim5 = AnimationUtils.loadAnimation(this, R.anim.lefttoright);
        anim6 = AnimationUtils.loadAnimation(this, R.anim.anim_out);
        anim7 = AnimationUtils.loadAnimation(this, R.anim.fromtop);
        anim8 = AnimationUtils.loadAnimation(this, R.anim.fromtop1);
        anim9 = AnimationUtils.loadAnimation(this, R.anim.slidedown);
        anim10 = AnimationUtils.loadAnimation(this, R.anim.slideup);

        btnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //  btnmusic.setAnimation(anim5);


                //  btnmusic.setAnimation(anim7);
            }
        });

        bt1.setAnimation(anim1);
        //  im1.setAnimation(anim7);
        bt2.setAnimation(anim2);
        bt3.setAnimation(anim3);
        bt4.setAnimation(anim4);
        im1.setAnimation(anim7);


        YoYo.with(Techniques.Wobble)
                .repeat(99999)
                .duration(1300)
                .delay(2000)
                .playOn(im1);


        btnexit.setVisibility(View.INVISIBLE);
        btnmusic.setVisibility(View.INVISIBLE);


//        btnstar1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
//                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
//                myAnim.setInterpolator(interpolator);
//                btnstar1.startAnimation(myAnim);
//            }
//        });
//        btnstar2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
//                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
//                myAnim.setInterpolator(interpolator);
//                btnstar1.startAnimation(myAnim);
//            }
//        });

        btnstar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                btnstar3.startAnimation(myAnim);
            }
        });
        btnstar8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                btnstar8.startAnimation(myAnim);
            }
        });
        btnstar7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                btnstar7.startAnimation(myAnim);
            }
        });
        btnstar12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                btnstar12.startAnimation(myAnim);
            }
        });
        btnstar10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                btnstar10.startAnimation(myAnim);
            }
        });
        btnstar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                btnstar4.startAnimation(myAnim);
            }
        });

        btnstar11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                btnstar11.startAnimation(myAnim);
            }
        });


        YoYo.with(Techniques.Pulse)
                .duration(1100)
                .delay(500)
                .repeat(999999999)
                .playOn(btnstar3);
        YoYo.with(Techniques.Pulse)
                .duration(1100)
                .delay(900)
                .repeat(999999999)
                .playOn(btnstar4);
        YoYo.with(Techniques.Pulse)
                .duration(1100)
                .delay(2000)
                .repeat(999999999)
                .playOn(btnstar7);
        YoYo.with(Techniques.Pulse)
                .duration(1100)
                .delay(1500)
                .repeat(999999999)
                .playOn(btnstar8);
        YoYo.with(Techniques.Pulse)
                .duration(1100)
                .delay(1000)
                .repeat(999999999)
                .playOn(btnstar10);
        YoYo.with(Techniques.Pulse)
                .duration(1100)
                .delay(300)
                .repeat(999999999)
                .playOn(btnstar11);
        YoYo.with(Techniques.Pulse)
                .duration(1100)
                .delay(900)
                .repeat(999999999)
                .playOn(btnstar12);


        btnsetting.setAnimation(anim7);

        //setData();

//        YoYo.with(Techniques.Swing)
//                .duration(1000)
//                .repeat(9999999)
//                .playOn(im1);

        // Boom menu

//        for ( i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
//            TextInsideCircleButton.Builder builder = new TextInsideCircleButton.Builder()
//                    .normalImageRes(imgm.get(i))
//                    .listener(new OnBMClickListener() {
//                        @Override
//                        public void onBoomButtonClick(int index) {
//                            if(index==0)
//                            {
//                                if(check==false)
//                                {
//                                    songbk.stop();
//                                    check=true;
//                                }
//                                else
//                                {
//                                    songbk.start();
//                                    check=false;
//                                }
//
//                            }
//                            if(index==1)
//                            {
//                                finish();
//                                System.exit(0);
//                            }
//
//                        }
//                    });
//
//
//
//            bmb.addBuilder(builder);
//        }


        //btn= (Button)findViewById(R.id.button4);
      /*  fabcbg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });*/
       /* fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check==false)
                {
                    showfloatbutton();
                    check=true;
                }
                else
                {
                    hidefloat();
                    check=false;
                }
            }
        });*/
     /*   fabmus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cmusic==false)
                {
                    songbk.stop();
                    cmusic=true;

                }
                else
                {
                    songbk.start(); cmusic=false;
                }

            }
        });*/

        btnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final Animation myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                if (open == false) {
                    btnsetting.startAnimation(myAnim);
                    btnexit.setVisibility(View.VISIBLE);
                    btnmusic.setVisibility(View.VISIBLE);

                    YoYo.with(Techniques.SlideInDown)
                            .duration(1200)
                            .playOn(btnexit);
                    YoYo.with(Techniques.SlideInDown)
                            .duration(1300)
                            .delay(1000)
                            .playOn(btnmusic);


                    open = true;

                } else if (open == true) {
                    btnsetting.startAnimation(myAnim);

                    YoYo.with(Techniques.SlideOutUp)
                            .duration(1200)
                            .playOn(btnexit);
                    YoYo.with(Techniques.SlideOutUp)
                            .duration(1300)
                            .delay(1000)
                            .playOn(btnmusic);


                    btnexit.setVisibility(View.INVISIBLE);
                    btnmusic.setVisibility(View.INVISIBLE);
                    open = false;


                }


            }
        });
        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                new FancyGifDialog.Builder(MainActivity.this)
                        .setTitle("Exit")
                        .setMessage("Do you want exit app")
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
                                System.exit(0);

                            }
                        })
                        .OnNegativeClicked(new FancyGifDialogListener() {
                            @Override
                            public void OnClick() {


                            }
                        }).build();


            }
        });
        btnmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (off == false) {
                    songbk.stop();
                    off = true;
                } else if (off = true) {
                    songbk.start();
                    off = false;
                }
            }
        });

        songbk.start();
        songbk.setLooping(true);
        // img = (ImageView)findViewById(R.id.imge);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity1.class);

                mp.start();
                songbk.stop();
                YoYo.with(Techniques.ZoomOutUp)
                        .duration(1200)
                        .repeat(0)
                        .playOn(bt1);

                YoYo.with(Techniques.ZoomInDown)
                        .repeat(0)
                        .duration(1500)
                        .delay(2500)
                        .playOn(bt2);
                YoYo.with(Techniques.ZoomInDown)
                        .repeat(0)
                        .duration(1500)
                        .delay(2500)
                        .playOn(bt3);
                YoYo.with(Techniques.ZoomInDown)
                        .repeat(0)
                        .duration(1500)
                        .playOn(bt4);

                startActivity(intent);


            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainEXtract.class);
                mp.start();
                songbk.stop();
                startActivity(intent);

            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Mainphamau.class);
                mp.start();
                songbk.stop();
                startActivity(intent);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Mmixlayout.class);
                startActivity(intent);

            }
        });


    }


//    public void setData()
//    {
//        imgm.add(R.drawable.music_off_512);
//        imgm.add(R.drawable.exit);
//
//    }



 /*   private void showfloatbutton()
    {
        fabmus.show();
        fabcbg.show();
        fabcontact.show();
    }*/
   /* private void hidefloat()
    {


        fabmus.hide();
        fabcontact.hide();
        fabcbg.hide();
    }*/



    public static String printKeyHash(Activity context) {
        PackageInfo packageInfo;
        String key = null;
        try {
            //getting application package name, as defined in manifest
            String packageName = context.getApplicationContext().getPackageName();

            //Retriving package info
            packageInfo = context.getPackageManager().getPackageInfo(packageName,
                    PackageManager.GET_SIGNATURES);

            Log.e("Package Name=", context.getApplicationContext().getPackageName());

            for (android.content.pm.Signature signature : packageInfo.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                key = new String(Base64.encode(md.digest(), 0));

                // String key = new String(Base64.encodeBytes(md.digest()));
                Log.e("Key Hash=", key);
            }
        } catch (PackageManager.NameNotFoundException e1) {
            Log.e("Name not found", e1.toString());
        } catch (NoSuchAlgorithmException e) {
            Log.e("No such an algorithm", e.toString());
        } catch (Exception e) {
            Log.e("Exception", e.toString());
        }

        return key;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }
}