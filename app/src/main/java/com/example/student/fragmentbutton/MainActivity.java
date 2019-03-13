package com.example.student.fragmentbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements truyendl {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void thaydoi(String chuoi) {
        FragmentInfo fragmentInfo = (FragmentInfo) getFragmentManager().findFragmentById(R.id.fragment4);
        if(fragmentInfo!=null&&fragmentInfo.isInLayout())
        {
            fragmentInfo.tv_fragInfo.setText(chuoi);
        }else {
            Intent it = new Intent(MainActivity.this,MainFragmentInfoActivity.class);
            it.putExtra("truyenData",chuoi);
            startActivity(it);
        }

    }
}
