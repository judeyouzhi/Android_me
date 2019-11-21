package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.Random;

public class BodyPartFragment extends Fragment {

    public BodyPartFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.fragment_body_view);

        imageView.setImageResource(AndroidImageAssets.getBodies().get(getRandom()));

        return rootView;

    }

    private int getRandom(){
        Random rand=new Random();

        return rand.nextInt(12);
    }
}
