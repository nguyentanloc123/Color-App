package com.tanloc2017.appmau;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Maininfo extends AppCompatActivity {
    TextView txtthogntin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maininfo);
        txtthogntin= (TextView) findViewById(R.id.textView8);
        txtthogntin.setText("Developer by Nguyen Tan Loc " + "\n Design launcher by Nguyen Tan Loc"+ "\n Music by Nguyen Tan Loc"+ "\n Email: locn049@gmail.com" );

    }
}
