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
public class CarFragment extends Fragment {
    Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public CarFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_load, container, false);
        return view;
    }

}
