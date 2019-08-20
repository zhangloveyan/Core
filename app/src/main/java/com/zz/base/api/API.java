package com.zz.base.api;

import com.zz.base.mvp.bean.ArticleListBean;
import com.zz.base.mvp.bean.HotMovieBean;
import com.zz.http.RetrofitHelper;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by Zz on 2019/3/27.
 */

public interface API {
    String HOST = "https://www.wanandroid.com/";

    String HOST_DOUBAN = "https://api.douban.com/";

    @GET("article/list/0/json")
    Observable<ArticleListBean> getArticleList();

    @Headers(RetrofitHelper.URL_HOST + HOST_DOUBAN)
    @GET("v2/movie/in_theaters")
    Observable<HotMovieBean> getHotMovie();
}
