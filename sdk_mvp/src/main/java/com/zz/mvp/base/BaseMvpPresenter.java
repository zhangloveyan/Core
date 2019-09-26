package com.zz.mvp.base;

import com.zz.mvp.rx.RxManager;

import io.reactivex.annotations.NonNull;

/**
 * @author Zz 张立男
 * @Description BasePresenter presenter基类
 * @date 2019/3/14 21:59
 * o(＞﹏＜)o
 */

public abstract class BaseMvpPresenter<M, V> {
    protected M mIModel;
    protected V mIView;
    protected RxManager mRxManager = new RxManager();

    /**
     * 获取 model
     *
     * @return
     */
    protected abstract M getModel();

    /**
     * 绑定 view
     *
     * @param view
     */
    public void attachMV(@NonNull V view) {
        mIModel = getModel();
        mIView = view;
        onStart();
    }

    /**
     * 解绑 view
     */
    public void detachMV() {
        mRxManager.unRegister();
        mIView = null;
        mIModel = null;
    }

    public abstract void onStart();
}
