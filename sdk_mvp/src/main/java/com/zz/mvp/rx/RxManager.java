package com.zz.mvp.rx;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * @author Zz 张立男
 * @Description RxManager rxjava 注册和取消
 * @date 2019/3/14 22:29
 * o(＞﹏＜)o
 */
public class RxManager {
    private CompositeDisposable mDisposable = new CompositeDisposable();

    public void register(Disposable disposable) {
        mDisposable.add(disposable);
    }

    public void unRegister() {
        mDisposable.dispose();
    }

    public void clearDisposable() {
        mDisposable.clear();
    }
}
