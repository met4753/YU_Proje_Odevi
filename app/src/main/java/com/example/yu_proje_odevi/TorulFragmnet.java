package com.example.yu_proje_odevi;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class TorulFragmnet extends Fragment {

    ImageButton Gdon10;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public TorulFragmnet() {
        // Required empty public constructor
    }

    public static TorulFragmnet newInstance(String param1, String param2) {
        TorulFragmnet fragment = new TorulFragmnet();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

      View v=  inflater.inflate(R.layout.fragment_torul_fragmnet, container, false);

        Gdon10=v.findViewById(R.id.Gdon10);

        Gdon10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),karadenizbolgesi.class));
            }
        });

      return v;
    }
}