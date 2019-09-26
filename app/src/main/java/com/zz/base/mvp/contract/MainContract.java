package com.zz.base.mvp.contract;

import com.zz.base.mvp.bean.ArticleListBean;
import com.zz.base.mvp.bean.HotMovieBean;
import com.zz.mvp.base.BaseMvpPresenter;
import com.zz.mvp.base.IBaseModel;
import com.zz.mvp.base.IBaseView;

import io.reactivex.Observable;

/**
 * Created by Zz on 2019/3/27.
 */

public interface MainContract {
    interface IMainModel extends IBaseModel {
        Observable<ArticleListBean> getArticleList();

        Observable<HotMovieBean> getHotMovie();
    }

    interface IMainView extends IBaseView {
        void showData(ArticleListBean bean);
        void showMovieData(HotMovieBean bean);
    }

    abstract class IMainPresenter extends BaseMvpPresenter<IMainModel, IMainView> {
        public abstract void getArticleList();
        public abstract void getHotMovie();
    }
}
