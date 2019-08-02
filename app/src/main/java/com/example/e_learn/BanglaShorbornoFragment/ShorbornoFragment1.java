package com.example.e_learn.BanglaShorbornoFragment;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.e_learn.CanvasView;
import com.example.e_learn.R;


public class ShorbornoFragment1 extends Fragment {

    private CanvasView canvasView;

    public ShorbornoFragment1() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_shorborno_fragment1, container, false);
        final CanvasView canvasView = (CanvasView)view.findViewById(R.id.canvasViewId);
    //here is audio code

        final MediaPlayer mp3 = MediaPlayer.create(getActivity(),R.raw.sa_mp3_1);

        mp3.start();
        //final MediaPlayer mp33 = MediaPlayer.create(getApplicationContext(),R.raw.sa_dilog1);


        TextView cleracanvas=(TextView)view.findViewById(R.id.clear);

        cleracanvas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                canvasView.clearCanvas();
                mp3.start();

            }
        });



    return view;
    }

}
