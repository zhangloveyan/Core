package com.zz.base.api;

import com.zz.base.mvp.bean.ArticleListBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Zz on 2019/3/27.
 */

public interface API {
    public static final String HOST = "https://www.wanandroid.com/";

    @GET("article/list/0/json")
    Observable<ArticleListBean> getArticleList();
}
