package com.zz.base;

import android.app.Application;

import com.zz.base.api.API;
import com.zz.sdk.net.RetrofitHelper;

/**
 * Created by Zz on 2019/3/27.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RetrofitHelper.getInstance()
                .baseUrl(API.HOST)
                .readOrWriteTimeOut(100)
                .debug(BuildConfig.DEBUG)
                .init(this);
    }
}
