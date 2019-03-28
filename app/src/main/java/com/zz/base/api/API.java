package com.zz.base.api;

import com.zz.base.mvp.bean.ArticleListBean;
import com.zz.base.mvp.bean.HotMovieBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Zz on 2019/3/27.
 */

public interface API {
    public static final String HOST = "https://www.wanandroid.com/";
    public static final String HOST_DOUBAN = "https://api.douban.com/";

    @GET("article/list/0/json")
    Observable<ArticleListBean> getArticleList();

    @GET("v2/movie/in_theaters")
    Observable<HotMovieBean> getHotMovie();
}
