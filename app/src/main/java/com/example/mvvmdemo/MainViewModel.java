package com.example.mvvmdemo;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

import com.example.mvvmdemo.databinding.ActivityMainBinding;


/**
 * Created by Superman on 2018/3/30.
 */

public class MainViewModel implements onSearchListener {

    private ActivityMainBinding binding;
    private Handler handler;

    public MainViewModel(ActivityMainBinding binding) {
        this.binding = binding;
        handler = new Handler(Looper.getMainLooper());
    }


    public void search() {
        binding.pbLoad.setVisibility(View.VISIBLE);
        binding.etIp.setText("帅哥，进来坐坐");
    }

    @Override
    public void onSuccess() {
        binding.pbLoad.setVisibility(View.GONE);
    }

    @Override
    public void onError() {
        binding.pbLoad.setVisibility(View.GONE);
    }
}
