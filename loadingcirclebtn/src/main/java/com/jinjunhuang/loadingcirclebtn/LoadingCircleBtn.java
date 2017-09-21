package com.jinjunhuang.loadingcirclebtn;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author jianjunhuang.me@foxmail.com
 *         create on 2017/9/21.
 */

public class LoadingCircleBtn extends View {

    private Paint defaultPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public static final int DEFAULT_COLOR = Color.parseColor("#58abe3");
    public static final int DEFAULT_SUCCESS_COLOR = Color.parseColor("#72c3a8");
    public static final int DEFAULT_FAILED_COLOR = Color.parseColor("#F12C3C");
    public static final int DEFAULT_TEXT_COLOR = Color.parseColor("#FFFFFF");
    public static final String DEFAULT_TEXT = "Save";
    //默认字体
    private String mText;
    //按钮半径
    private float mRadius;
    //图片
    private Bitmap mBitmap;
    //加载成功显示的字
    private String mLoadingSucccessText;
    //加载失败显示的字
    private String mLoadingFailedText;
    //加载成功显示的字的颜色
    private int mLoadingSuccessTextColor;
    //加载失败显示的字的颜色
    private int mLoadingFailedTextColor;
    //按钮颜色
    private int mColor;
    //加载时的颜色
    private int mLoadingColor;
    //加载成功后按钮颜色
    private int mLoadingSuccessColor;
    //加载失败后按钮颜色
    private int mLoadingFailedColor;
    //加载条的颜色
    private int mLoadingProgressColor;

    public LoadingCircleBtn(Context context) {
        super(context, null);
    }

    public LoadingCircleBtn(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public LoadingCircleBtn(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }


}
