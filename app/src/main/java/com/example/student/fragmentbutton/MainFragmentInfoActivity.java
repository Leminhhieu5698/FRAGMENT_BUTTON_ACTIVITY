package com.example.student.fragmentbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainFragmentInfoActivity extends AppCompatActivity {
    TextView tv_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment_info);
        //Anh Xa
        tv_1 = findViewById(R.id.txtInfo);
        //Lay du lieu de gan cho tv_1
        Intent it = getIntent();
        String s = it.getStringExtra("truyenData");
        tv_1.setText(s);
    }
}
