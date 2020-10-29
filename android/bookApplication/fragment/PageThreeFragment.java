package com.example.mybookapplication.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.mybookapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PageThreeFragment extends Fragment {


    public PageThreeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.vp_threepage, container, false);
        TextView tv_four = view.findViewById(R.id.tv_four);
        tv_four.setText("PageThreeFragment");

        return view;
    }



}
