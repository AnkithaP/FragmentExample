package com.aryaan.ankitha.fragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ankitha on 10/21/2016.
 */
public class FragmentB extends Fragment {

    TextView text;
    String data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_b,container,false);
        if (savedInstanceState == null){

        }else{
            data = (String) savedInstanceState.get("mytext");
            TextView textView = (TextView) view.findViewById(R.id.textView);
            textView.setText(data);
        }
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        text = (TextView) getActivity().findViewById(R.id.textView);
    }

    public void changeData(String data){
        this.data = data;
        text.setText(data);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("mytext",data);
    }
}
