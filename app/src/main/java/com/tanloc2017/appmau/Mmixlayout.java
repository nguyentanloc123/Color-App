package com.tanloc2017.appmau;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.makeramen.roundedimageview.RoundedImageView;
import com.rengwuxian.materialedittext.MaterialEditText;
import com.spark.submitbutton.SubmitButton;

import java.util.ArrayList;
import java.util.Locale;

public class Mmixlayout extends AppCompatActivity {

    private static final int REQ_CODE_SPEECH_INPUT = 100;
    private TextView mVoiceInputTv;
    private Button mSpeakBtn;
    Button btnback;
   // EditText edt;
    MaterialEditText edt;
    SubmitButton btnmau;
    //MaterialTextField mtf;
    RoundedImageView img;
    //Button btnmau;
    TextView txthex;
    TextView txtname;
    Button btn;
    String text;
    String s1;
    ImageButton imgbtn;

    String[] title = new String[]{"MAROON", "BROWN", "SADDLE BROWN", "PERU", "DARK GOLDEN ROD",
            "CHOCOLATE", "GOLDEN ROD", "SANDY BROWN", "TAN", "WHEAT", "BISQUE", "BURLYWOOD",
            "ALICE BLUE", "AQUA", "AQUA MARINE", "BLUE", "CADET BLUE", "CORN FLOWER BLUE"
            , "DARK BLUE", "BLACK", "CORAL", "DARK CYAN", "DARK GRAY", "DARK GREEN", "DARK ORANGE",
            "DARK RED", "PALE VIOLETRED"
            , "DEEP PINK", "DEEP SKYBLUE", "DIM GRAY", "DODGER BLUE", "FIRE BRICK", "WHEAT",
            "FUCHSIA", "GAINSBORO", "GOLD", "GRAY", "GREEN", "HOT PINK", "INDIANRED", "INDIGO",
            "LIGHT PINK", "LAWN GREEN", "LIGHT SKY BLUE"
            , "LIGHT GRAY", "LIGHT SALMON", "LIGHT SEA GREEN", "LIGHT SLATE GRAY", "MEDIUM BLUE",
            "MEDIUM SLATE BLUE",
            "MEDIUM SPRING GREEN", "MID NIGHT BLUE", "NAVY", "OLIVE", "ORANGE", "PINK", "RED"
            , "ROSY BROWN", "ROYAL BLUE"
            , "SALMON", "SILVER", "SLATEGRAY", "STEEL BLUE", "TEAL", "TOMATO", "PURPLE",
            "MEDIUM VIOLETRED", "VIOLET"
            , "WHITE", "WHITE SMOKE", "SNOW", "MINT CREAM", "SEA SHELL", "OLD LACE", "LIME",
            "IVORY", "FLORAL WHITE"
            , "HONEYDEW", "ANTIQUE WHITE", "BEIGE", "NAVAJOWHITE", "CORNSILK", "MISTYROSE",
            "YELLOW"};
    String[] description = new String[]{"#800000", "#A52A2A", "#8B4513", "#CD853F", "#B8860B", "#D2691E",
            "#DAA520", "#F4A460", "#D2B48C"
            , "#F5DEB3", "#FFE4C4", "#DEB887", "#F0F8FF", "#00FFFF", "#7FFFD4", "#0000FF",
            "#5F9EA0", "#6495ED"
            , "#00008B", "#000000", "#FF7F50", "#008B8B", "#A9A9A9", "#006400", "#FF8C00",
            "#8B0000", "#DB7093",
            "#FF1493", "#00BFFF", "#696969", "#1E90FF", "#B22222", "#F5DEB3", "#FF00FF", "#DCDCDC", "#FFD700"
            , "#808080", "#008000", "#FF69B4", "#CD5C5C", "#4B0082", "#FFB6C1", "#7CFC00",
            "#87CEFA", "#D3D3D3",
            "#FFA07A", "#20B2AA", "#778899", "#0000CD", "#7B68EE", "#00FA9A", "#191970",
            "#000080", "#808000",
            "#FFA500", "#FFC0CB", "#FF0000", "#BC8F8F", "#4169E1", "#FA8072", "#C0C0C0",
            "#708090 ", "#4682B4"
            , "#008080", "#FF6347", "#800080", "#C71585", "#EE82EE", "#FFFFFF", "#F5F5F5",
            "#FFFAFA", "#F5FFFA",
            "#FFF5EE", "#FDF5E6", "#00FF00", "#FFFFF0", "#FFFAF0", "#F0FFF0", "#FAEBD7",
            "#F5F5DC", "#FFDEAD"
            , "#FFF8DC", "#FFE4E1", "#FFFF00"};
    int icon[] = new int[]{R.drawable.b_maroon, R.drawable.b1_brown, R.drawable.b3_saddlessbrower, R.drawable.b4_peru,
            R.drawable.b5_darkgoldenrod, R.drawable.b6_chocolate, R.drawable.b7goldenrod, R.drawable.b8_sandybrowse,
            R.drawable.b9_tan, R.drawable.b10_bwheat, R.drawable.b11_bisque, R.drawable.b12_burlywood,
            R.drawable.bl_aliceblue, R.drawable.bl2_aqua, R.drawable.bl3aquamarine,
            R.drawable.bl4_blue, R.drawable.bl5_cadetblue, R.drawable.bl6_cornflowerblue, R.drawable.bl7_darkblue,
            R.drawable.black, R.drawable.coral, R.drawable.darkcyan, R.drawable.darkgray, R.drawable.darkgreen,
            R.drawable.darkorage, R.drawable.darkred, R.drawable.paleviolet, R.drawable.deeppink, R.drawable.deepskyblue,
            R.drawable.dimgray, R.drawable.dogerblue, R.drawable.firebrick, R.drawable.b10_bwheat, R.drawable.fushia,
            R.drawable.gainborp, R.drawable.gold, R.drawable.gray, R.drawable.green, R.drawable.hotpink,
            R.drawable.indianred, R.drawable.indigo, R.drawable.kightpink, R.drawable.lawngreen,
            R.drawable.light, R.drawable.lightgray, R.drawable.lightsalmon, R.drawable.lightseagreen,
            R.drawable.lightslategray, R.drawable.mediumblue, R.drawable.mediumsblue, R.drawable.mediumspring,
            R.drawable.midnightblue, R.drawable.navy, R.drawable.olive, R.drawable.orange, R.drawable.pink,
            R.drawable.red, R.drawable.rosybrown, R.drawable.royalblue, R.drawable.salmon, R.drawable.silver,
            R.drawable.slategray, R.drawable.steelblue, R.drawable.teal, R.drawable.tomato, R.drawable.v1_purple,
            R.drawable.v3_mediumviolet, R.drawable.violet, R.drawable.w_white, R.drawable.w2_whitesmoke,
            R.drawable.w3_snow, R.drawable.w4_mindcream, R.drawable.w5_seashell, R.drawable.w6_oldplace,
            R.drawable.w7_linen, R.drawable.w8_ivory, R.drawable.w9_florawwhite, R.drawable.w10_honeydew,
            R.drawable.w12_antiquewhite, R.drawable.w13_beige, R.drawable.w14_najawwhite, R.drawable.w15_cornsilk,
            R.drawable.w15_myrose, R.drawable.yellow};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mmixlayout);
    //    mtf=(MaterialTextField) findViewById(R.id.txtfield) ;
        //imgbtn=(ImageButton) findViewById(R.id.imgbt) ;
        btnback=(Button) findViewById(R.id.button6);
        txthex=(TextView) findViewById(R.id.txthex);
        txtname=(TextView) findViewById(R.id.txtcolor);
        img=(RoundedImageView) findViewById(R.id.imgv) ;
        edt=(MaterialEditText) findViewById(R.id.edittextmau);
        btnmau=(SubmitButton) findViewById(R.id.btntextmau);
        mVoiceInputTv = (TextView) findViewById(R.id.voiceInput);
        mSpeakBtn = (Button) findViewById(R.id.btnSpeak);
        //btn=(Button)findViewById(R.id.btn_color);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mmixlayout.this, MainActivity.class);
                startActivity(intent);
            }
        });


        mSpeakBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startVoiceInput();


            }
        });
       /* imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Mmixlayout.this, Maintimmau.class);
                startActivity(intent);

            }
        });*/

        String y;
        y=edt.getText().toString();
        if(y.length()==0)
        {
            YoYo.with(Techniques.Shake)
                    .duration(1000)
                    .repeat(9999999)

                    .playOn(edt);
        }
        if(y.length()!=0)
        {
            YoYo.with(Techniques.Shake)
                    .duration(1000)
                    .repeat(0)
                    .playOn(edt);


        }




        btnmau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 =edt.getText().toString();
                if((s1.length()==0) || s1==null)
                {
                    Toast.makeText(Mmixlayout.this,"Cant not file a color",Toast.LENGTH_SHORT).show();


                }
                if(s1.length()>8)
                {
                    YoYo.with(Techniques.Shake)
                            .duration(1000)
                            .repeat(5)
                            .playOn(edt);
                }
                else
                {
                    for (int i=0; i<title.length; i++)
                    {
                        if(s1.toUpperCase().equals(title[i]))
                        {
                            img.setImageResource(icon[i]);
                            txthex.setText(description[i]);
                            txtname.setText(title[i]);
                            YoYo.with(Techniques.Bounce)
                                    .duration(1000)
                                    .repeat(100000)
                                    .playOn(txthex);
                            YoYo.with(Techniques.Bounce)
                                    .duration(1000)
                                    .repeat(100000)
                                    .playOn(txtname);
                        }

                    }

                }
            }
        });



        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    private void startVoiceInput() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.US.toString());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Hello, Speak Color you choice");
        try {
            startActivityForResult(intent, REQ_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException a) {

        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case REQ_CODE_SPEECH_INPUT: {
                if (resultCode == RESULT_OK && null != data) {
                    String b;
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    mVoiceInputTv.setText(result.get(0));
                    //String s1="đỏ";
                   // text=mVoiceInputTv.toString();

                    String s=mVoiceInputTv.getText().toString();
                    boolean check=false;
                    int dem=0;
                    for (int i=0; i<title.length; i++)
                    {
                        if(s.toUpperCase().equals(title[i]))
                        {
                            img.setImageResource(icon[i]);
                            check=true;
                            dem++;
                            img.setImageResource(icon[i]);
                            txthex.setText(description[i]);
                            txtname.setText(title[i]);


                        }
                    }
                    if((dem==title.length-1) && check==false)
                    {
                        Toast.makeText(Mmixlayout.this,"Cant not find color with your voice",Toast.LENGTH_SHORT).show();

                    }




                  /*  if((s.toUpperCase().equals())|| (s.equals("đỏ")) || (s=="Màu đỏ") || (s=="Đỏ"))
                    {
                        Toast.makeText(Mmixlayout.this,s.toString(),Toast.LENGTH_SHORT).show();
                        btn.setBackgroundColor(Color.rgb(255,0,0));
                      //  Toast.makeText(Mmixlayout.this,"abcxyz",Toast.LENGTH_SHORT).show();
                    }*/
                }
                break;
            }

        }
    }

}