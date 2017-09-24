package com.jinjunhuang.loadingview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.demo.jianjunhuang.mvptools.integration.BaseActivity;
import com.jinjunhuang.loadingcirclebtn.LoadingCircleBtn;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private Button loadingCircleBtn;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        loadingCircleBtn = findView(R.id.loading_circle_btn_view_btn);
    }

    @Override
    protected void initListener() {
        loadingCircleBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.loading_circle_btn_view_btn: {
                intent.setClass(MainActivity.this, LoadingCircleBtnActivity.class);
                break;
            }
        }
        startActivity(intent);
    }
}
