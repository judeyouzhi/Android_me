package com.example.android.android_me.ui;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;
import com.example.android.android_me.data.SharedViewModel;

import java.util.Random;

public class BodyPartFragment extends Fragment {

    private SharedViewModel model;
    public BodyPartFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        final ImageView imageView = (ImageView) rootView.findViewById(R.id.fragment_body_view);

        model = ViewModelProviders.of(getActivity()).get(SharedViewModel.class);

        imageView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                int i = getRandom();
                imageView.setImageResource(AndroidImageAssets.getBodies().get(i));
                model.setBody(i);
            }
        });

//        imageView.setImageResource(AndroidImageAssets.getBodies().get(getRandom()));
        imageView.setImageResource(AndroidImageAssets.getBodies().get(model.getBody()));
        return rootView;

    }

    private int getRandom(){
        Random rand=new Random();

        return rand.nextInt(12);
    }
}
