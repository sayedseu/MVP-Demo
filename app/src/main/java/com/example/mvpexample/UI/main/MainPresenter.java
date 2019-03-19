package com.example.mvpexample.UI.main;

import com.example.mvpexample.Data.DataManager;
import com.example.mvpexample.UI.base.BasePresenter;

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {


    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public String getEmail() {
        return getDataManager().getEmailId();
    }

    @Override
    public void setUserLogOut() {
        getDataManager().clear();
        getMvpView().openSplashActivity();

    }

}
