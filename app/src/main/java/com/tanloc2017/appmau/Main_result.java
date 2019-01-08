package com.tanloc2017.appmau;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.airbnb.lottie.animation.content.Content;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.facebook.login.Login;
import com.facebook.login.widget.LoginButton;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.makeramen.roundedimageview.RoundedImageView;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import io.netopen.hotbitmapgg.library.view.RingProgressBar;
import mehdi.sakout.fancybuttons.FancyButton;

public class Main_result extends AppCompatActivity {
    RoundedImageView img;
    TextView txtnoidung;
    TextView txttieude;
    TextView txtdiem;
    TextView txthoanthanh;
    FancyButton back;
    RingProgressBar ringProgressBar;
    int diem1;
    double propress;
    Button btn_login;
    Context context;

    View rootView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_result);
        txttieude=(TextView) findViewById(R.id.txttieude);
        txtdiem=(TextView) findViewById(R.id.txtdiem);
        txthoanthanh=(TextView) findViewById(R.id.txthoanthanh);
        img=(RoundedImageView)findViewById(R.id.imageView3);
        back= (FancyButton) findViewById(R.id.back);
        btn_login= (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                 //   File mPath = new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), "screenshot.png");
                    //File imageDirectory = new File(mPath, "screenshot.png");


                Bitmap bitmap = takeScreenshot();
                    SharePhoto photo = new SharePhoto.Builder()
                            .setBitmap(bitmap)
                            .build();
                    SharePhotoContent content = new SharePhotoContent.Builder()
                            .addPhoto(photo)
                            .build();



//                    final Intent shareIntent = new Intent(Intent.ACTION_SEND);
//                    Uri pictureUri = Uri.fromFile(mPath);
//                    shareIntent.setType("image/*");
//                    if(incText){
//                        shareIntent.putExtra(Intent.EXTRA_TEXT, text);
//                    }
//                    shareIntent.putExtra(Intent.EXTRA_STREAM, pictureUri);
//                    shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
//                    context.startActivity(Intent.createChooser(shareIntent, "Share image using"));

            }
        });






        YoYo.with(Techniques.Tada)
                .duration(1200)
                .repeat(9999999)
                .playOn(back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Main_result.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Intent intent1 =getIntent();
        Bundle bundle= intent1.getBundleExtra("dulieu");
        diem1= bundle.getInt("diem");
        String d= Integer.toString(diem1);
        double ht = Double.parseDouble(d.toString());
        ht=(ht/23)*100;



        // nhan 2 so sau duoi


        NumberFormat nf = NumberFormat.getInstance(); // get instance
        nf.setMaximumFractionDigits(2); // set decimal places
        String e = nf.format(ht);




      //  String e=Double.toString(ht);
        txthoanthanh.setText(e.toString()+"%");
        txtdiem.setText(d.toString());
        if(diem1<=12)
        {
            txttieude.setText("Bad!!!");
        }
        else if(diem1>=13 && diem1<=21)
        {
            txttieude.setText("Better");
            img.setImageResource(R.drawable.incorrect);
        }
        else if(diem1>=21 && diem1<=23)
        {
            txttieude.setText("Good!!!");

            img.setImageResource(R.drawable.succeicon);


        }
        YoYo.with(Techniques.Tada)
                .repeat(9999999)
                .delay(1000).duration(1500).playOn(img);

//        Intent intent1 =getIntent();
//        Bundle bundle= intent1.getBundleExtra("dulieu");
//        diem1= bundle.getInt("diem");
//        String d= Integer.toString(diem1);
//        double ht = Double.parseDouble(d.toString());
//        ht=(ht/23)*100;
//
//
//
//        // nhan 2 so sau duoi
//
//
//        NumberFormat nf = NumberFormat.getInstance(); // get instance
//        nf.setMaximumFractionDigits(0); // set decimal places
//        String e = nf.format(ht);















    }
    public Bitmap takeScreenshot() {
        View rootView = findViewById(android.R.id.content).getRootView();
        rootView.setDrawingCacheEnabled(true);
        return rootView.getDrawingCache(); }

}
