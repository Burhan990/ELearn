package com.example.e_learn.BanglaShorbornoFragment;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.e_learn.R;
import com.example.e_learn.ShorbornoActivity;


public class Shorborno_Home_Fragment extends Fragment {

    public CardView cardBanglaShorborno1;
    public CardView cardBanglaShorborno2;
    public CardView cardBanglaShorborno3;
    public CardView cardBanglaShorborno4;
    public CardView cardBanglaShorborno5;
    public CardView cardBanglaShorborno6;
    public CardView cardBanglaShorborno7;
    public CardView cardBanglaShorborno8;
    public CardView cardBanglaShorborno9;
    public CardView cardBanglaShorborno10;
    public CardView cardBanglaShorborno11;
    public CardView cardBanglaShorborno12;
    public CardView cardBanglaShorborno13;
    public CardView cardBanglaShorborno14;



    public Shorborno_Home_Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_shorborno__home_, container, false);

        cardBanglaShorborno1=(CardView)view.findViewById(R.id.cardBanglaShorborno1);
        cardBanglaShorborno2=(CardView)view.findViewById(R.id.cardBanglaShorborno2);
        cardBanglaShorborno3=(CardView)view.findViewById(R.id.cardBanglaShorborno3);
        cardBanglaShorborno4=(CardView)view.findViewById(R.id.cardBanglaShorborno4);
        cardBanglaShorborno5=(CardView)view.findViewById(R.id.cardBanglaShorborno5);
        cardBanglaShorborno6=(CardView)view.findViewById(R.id.cardBanglaShorborno6);
        cardBanglaShorborno7=(CardView)view.findViewById(R.id.cardBanglaShorborno7);
        cardBanglaShorborno8=(CardView)view.findViewById(R.id.cardBanglaShorborno8);
        cardBanglaShorborno9=(CardView)view.findViewById(R.id.cardBanglaShorborno9);
        cardBanglaShorborno10=(CardView)view.findViewById(R.id.cardBanglaShorborno10);
        cardBanglaShorborno11=(CardView)view.findViewById(R.id.cardBanglaShorborno11);
        cardBanglaShorborno12=(CardView)view.findViewById(R.id.cardBanglaShorborno12);
        cardBanglaShorborno13=(CardView)view.findViewById(R.id.cardBanglaShorborno13);
        cardBanglaShorborno14=(CardView)view.findViewById(R.id.cardBanglaShorborno14);



        cardBanglaShorborno1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ShorbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new ShorbornoFragment1(),null).addToBackStack(null).commit();


            }
        });

        cardBanglaShorborno2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ShorbornoActivity.fragmentManager.beginTransaction().replace(R.id.container,new ShorbornoFragment2(),null).addToBackStack(null).commit();



            }
        });

        cardBanglaShorborno3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        cardBanglaShorborno4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        cardBanglaShorborno5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        cardBanglaShorborno6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        cardBanglaShorborno7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        cardBanglaShorborno8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        cardBanglaShorborno9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        cardBanglaShorborno10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        cardBanglaShorborno11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        cardBanglaShorborno12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        cardBanglaShorborno13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        cardBanglaShorborno14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });








    return view;
    }


}
