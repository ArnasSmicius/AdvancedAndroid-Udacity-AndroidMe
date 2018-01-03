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

/**
 * Created by arnas on 18.1.3.
 */

    // COMPLETED (2) Create a new class called BodyPartFragment to display an image of an Android-Me body part
public class BodyPartFragment extends Fragment {

    // In this class, you'll need to implement an empty constructor and the onCreateView method

    public BodyPartFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        ImageView headImageView = (ImageView) rootView.findViewById(R.id.iv_body_part);
    // COMPLETED (3) Show the first image in the list of head images
    // Soon, you'll update this image display code to show any image you want
        headImageView.setImageResource(AndroidImageAssets.getHeads().get(0));

        return rootView;
    }

}
