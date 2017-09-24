package com.jinjunhuang.loadingview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.jinjunhuang.loadingcirclebtn.LoadingCircleBtn;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LoadingCircleBtn loadingCircleBtn;

    private Button loadingSuccessBtn;

    private Button loadingFailedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadingCircleBtn = (LoadingCircleBtn) findViewById(R.id.loading_circle_btn);
        loadingSuccessBtn = (Button) findViewById(R.id.loading_success_btn);
        loadingFailedBtn = (Button) findViewById(R.id.loading_failed_btn);

        loadingCircleBtn.setOnClickListener(this);
        loadingSuccessBtn.setOnClickListener(this);
        loadingFailedBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.loading_circle_btn: {
                if (loadingCircleBtn.getStatus() == LoadingCircleBtn.STATUS_DEFAULT) {
                    loadingCircleBtn.setStatus(LoadingCircleBtn.STATUS_LOADING);
                } else {
                    loadingCircleBtn.setStatus(LoadingCircleBtn.STATUS_DEFAULT);
                }
                break;
            }
            case R.id.loading_success_btn: {
                if (loadingCircleBtn.getStatus() == LoadingCircleBtn.STATUS_LOADING) {
                    loadingCircleBtn.setStatus(LoadingCircleBtn.STATUS_LOAD_SUCCESS);
                }
                break;
            }
            case R.id.loading_failed_btn: {
                if (loadingCircleBtn.getStatus() == LoadingCircleBtn.STATUS_LOADING) {
                    loadingCircleBtn.setStatus(LoadingCircleBtn.STATUS_LOAD_FAILED);
                }
                break;
            }
        }
    }
}
