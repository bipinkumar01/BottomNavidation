package com.bipin.bottomnavigationdemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bipin.bottomnavigationdemo.R;

/**
 * Created by Bipin on 6/7/2017.
 */

@SuppressWarnings("ALL")
public class HomeFragment extends Fragment {
    public static HomeFragment newInstance() {

        return new HomeFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}
