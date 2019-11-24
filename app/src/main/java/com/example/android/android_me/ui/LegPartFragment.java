package com.example.android.android_me.ui;

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

public class LegPartFragment extends Fragment {

    private SharedViewModel model;

    public LegPartFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_leg_part, container, false);

        final ImageView imageView = (ImageView) rootView.findViewById(R.id.fragment_leg_view);

        model = ViewModelProviders.of(getActivity()).get(SharedViewModel.class);

        imageView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                int i = getRandom();
                imageView.setImageResource(AndroidImageAssets.getLegs().get(i));
                model.setLeg(i);
            }
        });
        imageView.setImageResource(AndroidImageAssets.getLegs().get(model.getLeg()));

        return rootView;
    }

    private int getRandom(){
        Random rand=new Random();

        return rand.nextInt(12) ;
    }
}
