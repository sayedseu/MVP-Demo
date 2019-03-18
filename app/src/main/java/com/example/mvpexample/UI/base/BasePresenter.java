package com.example.mvpexample.UI.base;

import com.example.mvpexample.Data.DataManager;

public class BasePresenter<V extends MvpView> implements MvpPresenter<V>  {

    private V mvpView;
    private DataManager dataManager;

    public BasePresenter(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    @Override
    public void onAttach(V mvpView) {
        this.mvpView=mvpView;
    }

    public V getMvpView(){
        return mvpView;
    }

    public DataManager getDataManager(){
        return dataManager;
    }
}
