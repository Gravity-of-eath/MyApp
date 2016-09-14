package com.yaookun.handmarket.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yaookun.handmarket.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CollectFragment extends Fragment {


    Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public CollectFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_details, container, false);
        return view;
    }

}
