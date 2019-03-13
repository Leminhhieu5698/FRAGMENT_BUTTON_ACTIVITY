package com.example.student.fragmentbutton;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentButton extends Fragment {
    truyendl tdl;

    private Button btnA,btnB,btnC;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_button, container, false);
        btnA = (Button) view.findViewById(R.id.btna);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        tdl = (truyendl) getActivity();
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tdl.thaydoi("This is A");
            }
        });

        btnB = (Button) view.findViewById(R.id.btnb);
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tdl.thaydoi("This is B");
            }
        });

        btnC = (Button) view.findViewById(R.id.btnc);
btnC.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        tdl.thaydoi("This is C");
    }
});
        return view;

    }

}
