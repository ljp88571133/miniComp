package com.debla.minicomp.Activity.GuideActivity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.debla.minicomp.minicomp.R;

/**
 * Created by Dave-PC on 2017/2/8.
 */

public class OtherFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View otherView = inflater.inflate(R.layout.fragment_other, container,
                false);
        return otherView;
    }
}
