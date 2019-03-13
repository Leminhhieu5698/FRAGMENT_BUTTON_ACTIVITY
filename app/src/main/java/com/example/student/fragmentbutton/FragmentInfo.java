package com.example.student.fragmentbutton;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentInfo extends Fragment {
    TextView tv_fragInfo;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);
        //Anh Xa :
        tv_fragInfo = view.findViewById(R.id.txtInfo);
        return view;
    }
    public void setText(String item) {
        TextView view = (TextView) getView().findViewById(R.id.txtInfo);
        view.setText(item);
    }
}
