package com.tanloc2017.appmau;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.azeesoft.lib.colorpicker.ColorPickerDialog;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.nightonke.jellytogglebutton.JellyToggleButton;
import com.nightonke.jellytogglebutton.State;
import com.rtugeek.android.colorseekbar.ColorSeekBar;

import org.xml.sax.Parser;

import java.text.NumberFormat;
import java.text.ParseException;

import in.shadowfax.proswipebutton.ProSwipeButton;
import mehdi.sakout.fancybuttons.FancyButton;
import yuku.ambilwarna.AmbilWarnaDialog;
public class Mainphamau extends AppCompatActivity {
//    Button btnfind;
//    Button btncolor2;
//    Button btncolor1;
//    FancyButton btnmix;
//    FancyButton fancybtn;
//    FancyButton fancybtn1;
//    EditText editText;
//    int mdeflaut;
//    int mdeflaut1;
//    boolean t1 = false;
//    boolean t2 = false;
//    int b = 0;
//    int b1 = 0;
//    String s;
//    FancyButton fc1;
//    FancyButton fc2;
//    FancyButton fc3;
//    FancyButton fc4;
//    FancyButton fc5;
//    FancyButton fc6;
//    FancyButton fc7;
//    FancyButton fc8;
//    FancyButton fc9;


//    JellyToggleButton jtb;
//    Drawable roundDrawable;
//    boolean test=true;
    FancyButton bcolor1;
        FancyButton  bcolor2;
    FancyButton  bcolor3;
            FancyButton  bcolor4;
    FancyButton  bcolor5;
            FancyButton  bcolor6;
    FancyButton rcolor1;
            FancyButton rcolor2;
    FancyButton rcolor3;
    FancyButton rcolor4;
    FancyButton rcolor5;
    FancyButton rcolor6;
    FancyButton color1;
    FancyButton color2;
    FancyButton mixcolorbutton;
    FancyButton colormix;
    TextView txtr;
            TextView txtb;
    TextView txtg;
            TextView txth;
    TextView txts;
            TextView txtv;
    TextView txthex;
    ColorSeekBar colorSeekBar;
    Button back;


    // variable

    int mdeflaut1;
    int mdeflaut2;
    boolean t1=false;
    boolean t2=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainphamau);

        mdeflaut1 = ContextCompat.getColor(Mainphamau.this, R.color.colorPrimary);
        mdeflaut2 = ContextCompat.getColor(Mainphamau.this, R.color.colorPrimary);
        bcolor1 = (FancyButton) findViewById(R.id.bcolor1);
        bcolor2 = (FancyButton) findViewById(R.id.bcolor2);
        bcolor3 = (FancyButton) findViewById(R.id.bcolor3);
        bcolor4 = (FancyButton) findViewById(R.id.bcolor4);
        bcolor5 = (FancyButton) findViewById(R.id.bcolor5);
        bcolor6 = (FancyButton) findViewById(R.id.bcolor6);

        rcolor1 = (FancyButton) findViewById(R.id.rcolor1);
        rcolor2 = (FancyButton) findViewById(R.id.rcolor2);
        rcolor3 = (FancyButton) findViewById(R.id.rcolor3);
        rcolor4 = (FancyButton) findViewById(R.id.rcolor4);
        rcolor5 = (FancyButton) findViewById(R.id.rcolor5);
        rcolor6 = (FancyButton) findViewById(R.id.rcolor6);

        color1 = (FancyButton) findViewById(R.id.color1);
        color2 = (FancyButton) findViewById(R.id.color2);

        mixcolorbutton = (FancyButton) findViewById(R.id.mixcolorbutton);
        colormix = (FancyButton) findViewById(R.id.colormix);
        txtr = (TextView) findViewById(R.id.txtr);
        txtg = (TextView) findViewById(R.id.txtg);
        txtb = (TextView) findViewById(R.id.txtb);

        txth = (TextView) findViewById(R.id.txth);
        txts = (TextView) findViewById(R.id.txts);
        txtv = (TextView) findViewById(R.id.txtv);
        txthex = (TextView) findViewById(R.id.txthex);
        back = (Button) findViewById(R.id.back);
        colorSeekBar = (ColorSeekBar) findViewById(R.id.colorSlider);



        //nhan mau o 2 o button

        // nut pha mau

        /* button.setFocusable(true);
        button.setFocusableInTouchMode(true);///add this line
        button.requestFocus();*/


        mixcolorbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                int r1, g1, b1, r2, g2, b2;
                r1 = Color.red(mdeflaut1);
                g1 = Color.green(mdeflaut1);
                b1 = Color.blue(mdeflaut1);
                r2 = Color.red(mdeflaut2);
                g2 = Color.green(mdeflaut2);
                b2 = Color.blue(mdeflaut2);
                int r3 = (r1 + r2) / 2;
                int g3 = (g1 + g2) / 2;
                int b3 = (b1 + b2) / 2;

                colormix.setBackgroundColor(Color.rgb(r3, g3, b3));
                String a = String.format("#%02x%02x%02x", r3, g3, b3);
                txtr.setText(""+r3);
                txtg.setText(""+g3);
                txtb.setText(""+b3);
                float[] hsv = new float[3];

                float hue = hsv[0];
                float sat = hsv[1];
                float val = hsv[2];





                NumberFormat nf = NumberFormat.getInstance(); // get instance
                nf.setMaximumFractionDigits(1); // set decimal places
                String a1 = nf.format(hue);

                NumberFormat nf1 = NumberFormat.getInstance(); // get instance
                nf1.setMaximumFractionDigits(1); // set decimal places
                String b = nf.format(sat);

                NumberFormat nf2 = NumberFormat.getInstance(); // get instance
                nf2.setMaximumFractionDigits(1); // set decimal places
                String c = nf.format(val);
                Color.RGBToHSV(r3, g3, b3, hsv);

                txth.setText(""+hue);
                txts.setText(""+sat);
                txtv.setText(""+val);
                txthex.setText(""+a.toString());
                t1=false;
                t2=false;


            }
        });

        colorSeekBar.setOnColorChangeListener(new ColorSeekBar.OnColorChangeListener() {
            @Override
            public void onColorChangeListener(int i, int i1, int i2) {
                colormix.setBackgroundColor(i2);
            }
        });


        color1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openColor1();
                color1.setFocusable(true);

                t1=true;

//                t1=false;
//                t2=true;
//                kiemtra();

            }
        });
        color2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openColor2();
                color2.setFocusable(true);

                t1=false;



//                t2=false;
//                t1=true;
//                kiemtra();
            }
        });
        bcolor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1==true)
                {
                    color1.setBackgroundColor(Color.parseColor("#373737"));
                    mdeflaut1=Color.parseColor("#373737");


                }
                else
                    color2.setBackgroundColor(Color.parseColor("#373737"));
                    mdeflaut2=Color.parseColor("#373737");

            }
        });


        bcolor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1==true)
                {
                    color1.setBackgroundColor(Color.parseColor("#646464"));
                    mdeflaut1=Color.parseColor("#646464");


                }
                else
                    color2.setBackgroundColor(Color.parseColor("#646464"));
                    mdeflaut2=Color.parseColor("#646464");

            }
        });


        bcolor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1==true)
                {
                    color1.setBackgroundColor(Color.parseColor("#979797"));
                    mdeflaut1=Color.parseColor("#979797");


                }
                else
                    color2.setBackgroundColor(Color.parseColor("#979797"));
                mdeflaut2=Color.parseColor("#979797");

            }
        });


        bcolor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1==true)
                {
                    color1.setBackgroundColor(Color.parseColor("#CACACA"));
                    mdeflaut1=Color.parseColor("#CACACA");


                }
                else
                    color2.setBackgroundColor(Color.parseColor("#CACACA"));
                mdeflaut2=Color.parseColor("#CACACA");

            }
        });

        bcolor5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1==true)
                {
                    color1.setBackgroundColor(Color.parseColor("#F2F2F2"));
                    mdeflaut1=Color.parseColor("#F2F2F2");


                }
                else
                    color2.setBackgroundColor(Color.parseColor("#F2F2F2"));
                mdeflaut2=Color.parseColor("#F2F2F2");

            }
        });

        bcolor6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1==true)
                {
                    color1.setBackgroundColor(Color.parseColor("#F6F6F6"));
                    mdeflaut1=Color.parseColor("#F6F6F6");


                }
                else
                    color2.setBackgroundColor(Color.parseColor("#F6F6F6"));
                mdeflaut2=Color.parseColor("#F6F6F6");

            }
        });


        rcolor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1==true)
                {
                    color1.setBackgroundColor(Color.parseColor("#fddd0e"));
                    mdeflaut1=Color.parseColor("#fddd0e");


                }
                else
                    color2.setBackgroundColor(Color.parseColor("#fddd0e"));
                mdeflaut2=Color.parseColor("#fddd0e");

            }
        });

        rcolor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1==true)
                {
                    color1.setBackgroundColor(Color.parseColor("#2ecc71"));
                    mdeflaut1=Color.parseColor("#2ecc71");


                }
                else
                    color2.setBackgroundColor(Color.parseColor("#2ecc71"));
                mdeflaut2=Color.parseColor("#2ecc71");

            }
        });

        rcolor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1==true)
                {
                    color1.setBackgroundColor(Color.parseColor("#e74c3c"));
                    mdeflaut1=Color.parseColor("#e74c3c");


                }
                else
                    color2.setBackgroundColor(Color.parseColor("#e74c3c"));
                mdeflaut2=Color.parseColor("#e74c3c");

            }
        });

        rcolor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1==true)
                {
                    color1.setBackgroundColor(Color.parseColor("#4B4BF9"));
                    mdeflaut1=Color.parseColor("#4B4BF9");


                }
                else
                    color2.setBackgroundColor(Color.parseColor("#4B4BF9"));
                mdeflaut2=Color.parseColor("#4B4BF9");

            }
        });

        rcolor5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1==true)
                {
                    color1.setBackgroundColor(Color.parseColor("#9B59B6"));
                    mdeflaut1=Color.parseColor("#9B59B6");


                }
                else
                    color2.setBackgroundColor(Color.parseColor("#9B59B6"));
                mdeflaut2=Color.parseColor("#9B59B6");

            }
        });
        rcolor6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1==true)
                {
                    color1.setBackgroundColor(Color.parseColor("#FF3366"));
                    mdeflaut1=Color.parseColor("#FF3366");


                }
                else
                    color2.setBackgroundColor(Color.parseColor("#FF3366"));
                mdeflaut2=Color.parseColor("#FF3366");

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mainphamau.this, MainActivity.class);
                startActivity(intent);
            }
        });



















    }
    public void kiemtra()
    {
        if((t1==true) && (t2==false))
        {
            color1.setEnabled(true);
            color2.setEnabled(false);
        }
        else if((t2==true) && (t1==false))
        {
            color2.setEnabled(true);
            color1.setEnabled(false);
        }
    }









//        fancybtn = (FancyButton) findViewById(R.id.bt1);
//        fancybtn1 = (FancyButton) findViewById(R.id.bt2);
//        //btnfind= (Button) findViewById(R.id.btnfind);
//        //    btncolor1 =(Button) findViewById(R.id.bt1);
//        //  btncolor2 =(Button) findViewById(R.id.bt2);
//        // editText=(EditText)findViewById(R.id.edt1);
//        jtb = (JellyToggleButton) findViewById(R.id.jbt);
//        final ViewGroup tran = (ViewGroup) findViewById(R.id.tran);
//        fc1 = (FancyButton) findViewById(R.id.btnmau1);
//        fc2 = (FancyButton) findViewById(R.id.btnmau2);
//        fc3 = (FancyButton) findViewById(R.id.btnmau3);
//        fc4 = (FancyButton) findViewById(R.id.btnmau4);
//        fc5 = (FancyButton) findViewById(R.id.btnmau5);
//        fc6 = (FancyButton) findViewById(R.id.btnmau6);
//      //  fc7 = (FancyButton) findViewById(R.id.btnmau7);
//        fc8 = (FancyButton) findViewById(R.id.btnmau8);
//        fc9 = (FancyButton) findViewById(R.id.btnmau9);
//
//        fancybtn.setVisibility(View.VISIBLE);
//        fancybtn1.setVisibility(View.INVISIBLE);
//
//
//
//        fc1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final Animation myAnim = AnimationUtils.loadAnimation(Mainphamau.this, R.anim.bounce);
//                // Use bounce interpolator with amplitude 0.2 and frequency 20
//                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
//                myAnim.setInterpolator(interpolator);
//                fc1.startAnimation(myAnim);
////                fancybtn.setVisibility(View.VISIBLE);
////                fancybtn1.setVisibility(View.INVISIBLE);
//                if(test==true)
//                {   test=false;
//                    fancybtn.setBackgroundColor(Color.parseColor("#ff0400"));
//
//
//                }
//                else if(test==false)
//                {
//                    test=true;
//                    fancybtn1.setBackgroundColor(Color.parseColor("#ff0400"));
//                }
//
//
//            }
//        });
//        fc2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final Animation myAnim = AnimationUtils.loadAnimation(Mainphamau.this, R.anim.bounce);
//                // Use bounce interpolator with amplitude 0.2 and frequency 20
//                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
//                myAnim.setInterpolator(interpolator);
//                fc2.startAnimation(myAnim);
//
//            }
//        });
//        fc3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final Animation myAnim = AnimationUtils.loadAnimation(Mainphamau.this, R.anim.bounce);
//                // Use bounce interpolator with amplitude 0.2 and frequency 20
//                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
//                myAnim.setInterpolator(interpolator);
//                fc3.startAnimation(myAnim);
//
//            }
//        });
//        fc4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final Animation myAnim = AnimationUtils.loadAnimation(Mainphamau.this, R.anim.bounce);
//                // Use bounce interpolator with amplitude 0.2 and frequency 20
//                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
//                myAnim.setInterpolator(interpolator);
//                fc4.startAnimation(myAnim);
//
//            }
//        });
//        fc5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final Animation myAnim = AnimationUtils.loadAnimation(Mainphamau.this, R.anim.bounce);
//                // Use bounce interpolator with amplitude 0.2 and frequency 20
//                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
//                myAnim.setInterpolator(interpolator);
//                fc5.startAnimation(myAnim);
//
//            }
//        });
//        fc6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final Animation myAnim = AnimationUtils.loadAnimation(Mainphamau.this, R.anim.bounce);
//                // Use bounce interpolator with amplitude 0.2 and frequency 20
//                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
//                myAnim.setInterpolator(interpolator);
//                fc6.startAnimation(myAnim);
//
//            }
//        });
//
//
//        btnmix = (FancyButton) findViewById(R.id.btnmix);
//
//        // roundDrawable=getResources().getDrawable(R.drawable.btnnnnn);
//
//        // btncolor1.setBackgroundColor(Color.YELLOW);
//        //btncolor2.setBackgroundColor(Color.RED);
//        final MediaPlayer song = MediaPlayer.create(this, R.raw.littleidea);
//        song.start();
//        mdeflaut = ContextCompat.getColor(Mainphamau.this, R.color.colorPrimary);
//        mdeflaut1 = ContextCompat.getColor(Mainphamau.this, R.color.colorPrimary);
//        roundDrawable = getResources().getDrawable(R.drawable.btnnnnn);
//
//        final Animation myAnim = AnimationUtils.loadAnimation(Mainphamau.this, R.anim.bounce);
//        final Animation myAnim1 = AnimationUtils.loadAnimation(Mainphamau.this, R.anim.bounce);
//
//
//        jtb.setOnStateChangeListener(new JellyToggleButton.OnStateChangeListener() {
//
//            boolean visible = true;
//
//            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
//            @Override
//            public void onStateChange(float process, State state, JellyToggleButton jtb) {
//                if (state.equals(State.LEFT)) {
////                    TransitionManager.beginDelayedTransition(tran);
////                    visible=!visible;
////                    fancybtn1.setVisibility(View.INVISIBLE);
////                    fancybtn.setVisibility(visible? View.VISIBLE:View.INVISIBLE);
//                    fancybtn.setVisibility(View.VISIBLE);
//                    fancybtn1.setVisibility(View.INVISIBLE);
//
//                    // Use bounce interpolator with amplitude 0.2 and frequency 20
//                    MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
//                    myAnim.setInterpolator(interpolator);
//                    fc8.startAnimation(myAnim);
//                    myAnim.setRepeatCount(Animation.INFINITE);
//
//                    myAnim1.cancel();
//                    fc9.clearAnimation();
//
//
//                }
//                if (state.equals(State.RIGHT)) {
//                    fancybtn.setVisibility(View.INVISIBLE);
//                    fancybtn1.setVisibility(View.VISIBLE);
//                    MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
//                    myAnim1.setInterpolator(interpolator);
//                    fc9.startAnimation(myAnim1);
//                    myAnim1.setRepeatCount(Animation.INFINITE);
//
//                    myAnim.cancel();
//
//
//                }
//            }
//        });
//
//
//        fc8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fancybtn.setVisibility(View.VISIBLE);
//                fancybtn1.setVisibility(View.INVISIBLE);
//
//
//
//            }
//        });
//        fc9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                fancybtn.setVisibility(View.INVISIBLE);
//                fancybtn1.setVisibility(View.VISIBLE);
//
//
//            }
//        });
//
//
//        fancybtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openColor();
//            }
//        });
//        fancybtn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openColor1();
//            }
//        });
//        btnmix.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int r1, g1, b1, r2, g2, b2;
//                r1 = Color.red(mdeflaut);
//                g1 = Color.green(mdeflaut);
//                b1 = Color.blue(mdeflaut);
//                r2 = Color.red(mdeflaut1);
//                g2 = Color.green(mdeflaut1);
//                b2 = Color.blue(mdeflaut1);
//                int r3 = (r1 + r2) / 2;
//                int g3 = (g1 + g2) / 2;
//                int b3 = (b1 + b2) / 2;
//
//                btnmix.setBackgroundColor(Color.rgb(r3, g3, b3));
//                String a = String.format("#%02x%02x%02x", r3, g3, b3);
//                btnmix.setText("" + a);
//
//                //Toast.makeText(Mainphamau.this,"Color have code hex: "+ );
//            }
//        });
//
////      btnfind.setOnClickListener(new View.OnClickListener() {
////          @Override
////          public void onClick(View view) {
////              //  s=editText.getText().toString();
////                if(s.length()<6 || s==null )
////                {
////                    Toast.makeText(Mainphamau.this,"Can't not find color you need 6 characters",Toast.LENGTH_SHORT).show();
////                }
////                else
////                {
////                    try{
////                        int color = Color.parseColor(s);
////                        btnfind.setBackgroundColor(color);
////                    }catch (Exception e)
////                    {
////                        Toast.makeText(Mainphamau.this,"Not color with code", Toast.LENGTH_SHORT).show();
////                    }
////                }
////          }
////      });
//    }
//
//    //    public void openColor()
////    {
////        AmbilWarnaDialog colorpicker= new AmbilWarnaDialog(this, mdeflaut, new AmbilWarnaDialog.OnAmbilWarnaListener() {
////            @Override
////            public void onCancel(AmbilWarnaDialog dialog) {
////            }
////            @Override
////            public void onOk(AmbilWarnaDialog dialog, int color) {
////                mdeflaut= color;
////                fancybtn.setBackgroundColor(mdeflaut);
////                fancybtn.setFocusBackgroundColor(mdeflaut);
////                fc8.setBackgroundColor(mdeflaut);
////                //btncolor1.setBackgroundColor(mdeflaut);
////
////            }
////        });
////        colorpicker.show();
////    }
    public void openColor1() {
        ColorPickerDialog colorPickerDialog = ColorPickerDialog.createColorPickerDialog(this, R.style.CustomColorPicker);
        colorPickerDialog.setOnColorPickedListener(new ColorPickerDialog.OnColorPickedListener() {
            @Override
            public void onColorPicked(int color, String hexVal) {
                mdeflaut1 = color;
                color1.setBackgroundColor(mdeflaut1);
                color1.setFocusBackgroundColor(mdeflaut2);
                YoYo.with(Techniques.Bounce)
                        .duration(1000).delay(1000).repeat(3).playOn(color1);

                //Your code here

            }
        });
        colorPickerDialog.show();


    }
//
//
//    public void didTapButton(View view) {
//        Button button = (Button) findViewById(R.id.button);
//        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
//
//        // Use bounce interpolator with amplitude 0.2 and frequency 20
//        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
//        myAnim.setInterpolator(interpolator);
//
//        button.startAnimation(myAnim);
//    }
//
//
    public void openColor2() {
        ColorPickerDialog colorPickerDialog = ColorPickerDialog.createColorPickerDialog(this, R.style.CustomColorPicker);
        colorPickerDialog.setOnColorPickedListener(new ColorPickerDialog.OnColorPickedListener() {
            @Override
            public void onColorPicked(int color, String hexVal) {
                mdeflaut2 = color;

                color2.setBackgroundColor(mdeflaut2);
                color2.setFocusBackgroundColor(mdeflaut2);

                YoYo.with(Techniques.Bounce)
                        .duration(1000).delay(1000).repeat(3).playOn(color2);

            }
        });
        colorPickerDialog.show();
    }
}