package com.example.bikerentalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    DataBikes b=new DataBikes();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView=(ListView) findViewById(R.id.listView);
        ArrayAdapter adapter= new ArrayAdapter<RentBikes>(this, R.layout.adapterlayout, R.id.txt, b.bikes);

        listView.setAdapter(adapter);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Intent intent= new Intent();
               intent=new Intent(MainActivity.this, show_Main2Activity.class);
               intent.putExtra("id", position);
               startActivity(intent);
           }
       });
    }
}
