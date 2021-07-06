package com.example.bikerentalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class show_Main2Activity extends AppCompatActivity {

    TextView name;
    ImageView img;
    Button btinfo, btback;
    String info;
    int id;

    DataBikes b = new DataBikes();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show__main2);

        name= (TextView) findViewById(R.id.name);
        img= (ImageView) findViewById(R.id.img);
        btinfo= (Button) findViewById(R.id.btinfo);
        btback= (Button) findViewById(R.id.btback);

        Bundle bundle=new Bundle();
        id= getIntent().getExtras().getInt("id");

        name.setText(b.bikes.get(id).getName());
        img.setImageResource(b.bikes.get(id).getImage());
        info=b.bikes.get(id).getInfo();

        btinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent();
                i= new Intent(Intent.ACTION_VIEW, Uri.parse(info));
                startActivity(i);
            }
        });

        btback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent();
                i= new Intent(show_Main2Activity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
