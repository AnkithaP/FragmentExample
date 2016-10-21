package com.aryaan.ankitha.fragmentexample;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(String data) {

        FragmentB fragmentB = new FragmentB();
        FragmentManager manager = getFragmentManager();
        fragmentB = (FragmentB) manager.findFragmentById(R.id.fragment2);
        fragmentB.changeData(data);

    }
}
