package com.zz.base.mvp.model;

import com.zz.base.api.API;
import com.zz.base.mvp.bean.ArticleListBean;
import com.zz.base.mvp.contract.MainContract;
import com.zz.sdk.net.RetrofitHelper;
import com.zz.sdk.rx.RxHelper;

import io.reactivex.Observable;

/**
 * Created by Zz on 2019/3/27.
 */

public class MainModel implements MainContract.IMainModel {

    @Override
    public Observable<ArticleListBean> getArticleList() {
        return RetrofitHelper.getApi(API.class, API.HOST).getArticleList().compose(RxHelper.<ArticleListBean>rxSchedulerHelper());
    }
}
