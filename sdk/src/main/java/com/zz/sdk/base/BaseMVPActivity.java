package com.zz.sdk.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.zz.sdk.AppManager;

import butterknife.ButterKnife;

/**
 * @author Zz 张立男
 * @Description BaseMVPActivity mvp基类
 * @date 2019/3/14 21:55
 * o(＞﹏＜)o
 */

public abstract class BaseMVPActivity<P extends BasePresenter> extends AppCompatActivity implements IBaseView {

    protected final String TAG = this.getClass().getSimpleName();
    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //限制页面竖屏显示
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //去掉标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);


        initData();
    }

    private void initData() {
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        mPresenter = (P) getPresenter();
        if (mPresenter != null) {
            mPresenter.attachMV(this);
        }
        init();
        AppManager.getAppManager().addActivity(this);
    }

    protected abstract int getLayoutId();


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachMV();
        }
    }

    protected abstract void init();

    protected abstract P getPresenter();
}
