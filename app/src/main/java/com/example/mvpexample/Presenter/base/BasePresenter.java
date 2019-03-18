package com.example.mvpexample.Presenter.base;

import com.example.mvpexample.Model.DataManager;
import com.example.mvpexample.Presenter.MvpPresenter;
import com.example.mvpexample.View.MvpView;

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V mMvpView;

    DataManager mDataManager;


    public BasePresenter(DataManager dataManager){
        mDataManager = dataManager;
    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    public V getMvpView() {
        return mMvpView;
    }

    public DataManager getDataManager() {
        return mDataManager;
    }

}
