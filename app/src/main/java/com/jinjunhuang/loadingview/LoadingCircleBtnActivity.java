package com.jinjunhuang.loadingview;

import android.view.View;
import android.widget.Button;

import com.demo.jianjunhuang.mvptools.integration.BaseActivity;
import com.jinjunhuang.loadingcirclebtn.LoadingCircleBtn;

/**
 * @author jianjunhuang.me@foxmail.com
 *         create on 2017/9/24.
 */

public class LoadingCircleBtnActivity extends BaseActivity implements View.OnClickListener {

    private LoadingCircleBtn loadingCircleBtn;

    private Button loadingSuccessBtn;

    private Button loadingFailedBtn;

    @Override
    protected int getLayoutId() {
        return R.layout.loacding_circler_btn_activity;
    }

    @Override
    protected void initView() {
        loadingCircleBtn = (LoadingCircleBtn) findViewById(R.id.loading_circle_btn);
        loadingSuccessBtn = (Button) findViewById(R.id.loading_success_btn);
        loadingFailedBtn = (Button) findViewById(R.id.loading_failed_btn);
    }

    @Override
    protected void initListener() {
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
