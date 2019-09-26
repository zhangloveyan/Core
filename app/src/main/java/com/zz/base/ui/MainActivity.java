package com.zz.base.ui;


import android.widget.TextView;

import com.zz.base.R;
import com.zz.base.mvp.bean.ArticleListBean;
import com.zz.base.mvp.bean.HotMovieBean;
import com.zz.base.mvp.contract.MainContract;
import com.zz.base.mvp.presenter.MainPresenter;
import com.zz.mvp.base.BaseMvpActivity;

import butterknife.BindView;

public class MainActivity extends BaseMvpActivity<MainPresenter> implements MainContract.IMainView {

    @BindView(R.id.tv_main)
    TextView mTvMain;
    @BindView(R.id.tv_movie)
    TextView mTvMovie;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        mPresenter.getArticleList();
        mPresenter.getHotMovie();
    }

    @Override
    protected MainPresenter getPresenter() {
        return new MainPresenter();
    }

    @Override
    public void showToast(String msg) {
    }

    @Override
    public void showData(ArticleListBean bean) {
        mTvMain.setText(bean.toString());
    }

    @Override
    public void showMovieData(HotMovieBean bean) {
        mTvMovie.setText(bean.toString());
    }
}
