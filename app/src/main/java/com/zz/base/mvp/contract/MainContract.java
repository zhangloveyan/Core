package com.zz.base.mvp.contract;

import com.zz.base.mvp.bean.ArticleListBean;
import com.zz.base.mvp.bean.HotMovieBean;
import com.zz.sdk.base.BasePresenter;
import com.zz.sdk.base.IBaseModel;
import com.zz.sdk.base.IBaseView;

import io.reactivex.Observable;
import okhttp3.ResponseBody;

/**
 * Created by Zz on 2019/3/27.
 */

public interface MainContract {
    abstract class IMainPresenter extends BasePresenter<IMainModel, IMainView> {
    }

    interface IMainModel extends IBaseModel {
        Observable<ArticleListBean> getArticleList();

        Observable<HotMovieBean> getHotMovie();
    }

    interface IMainView extends IBaseView {
        void showData(ArticleListBean bean);
        void showMovieData(HotMovieBean bean);
    }
}
