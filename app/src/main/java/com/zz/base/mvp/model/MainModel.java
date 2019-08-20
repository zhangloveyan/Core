package com.zz.base.mvp.model;

import com.zz.base.api.API;
import com.zz.base.mvp.bean.ArticleListBean;
import com.zz.base.mvp.bean.HotMovieBean;
import com.zz.base.mvp.contract.MainContract;
import com.zz.http.RetrofitHelper;
import com.zz.mvp.rx.RxHelper;

import io.reactivex.Observable;

/**
 * Created by Zz on 2019/3/27.
 */

public class MainModel implements MainContract.IMainModel {

    @Override
    public Observable<ArticleListBean> getArticleList() {
        return RetrofitHelper.getApi(API.class).getArticleList().compose(RxHelper.<ArticleListBean>rxSchedulerHelper());
    }

    @Override
    public Observable<HotMovieBean> getHotMovie() {
        return RetrofitHelper.getApi(API.class).getHotMovie().compose(RxHelper.<HotMovieBean>rxSchedulerHelper());
    }
}
