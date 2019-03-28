package com.zz.base.mvp.presenter;

import com.zz.base.mvp.bean.ArticleListBean;
import com.zz.base.mvp.bean.HotMovieBean;
import com.zz.base.mvp.contract.MainContract;
import com.zz.base.mvp.model.MainModel;

import io.reactivex.functions.Consumer;

/**
 * Created by Zz on 2019/3/27.
 */

public class MainPresenter extends MainContract.IMainPresenter {
    @Override
    protected MainContract.IMainModel getModel() {
        return new MainModel();
    }

    @Override
    public void onStart() {
        mRxManager.register(mIModel.getArticleList().subscribe(new Consumer<ArticleListBean>() {
            @Override
            public void accept(ArticleListBean bean) throws Exception {
                mIView.showData(bean);
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {

            }
        }));

        mRxManager.register(mIModel.getHotMovie().subscribe(new Consumer<HotMovieBean>() {
            @Override
            public void accept(HotMovieBean bean) throws Exception {
                mIView.showMovieData(bean);
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {

            }
        }));
    }
}
