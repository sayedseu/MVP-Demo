package com.example.mvpexample.UI.login;

import com.example.mvpexample.Data.DataManager;
import com.example.mvpexample.UI.base.BasePresenter;

public class LogInPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V> {


    public LogInPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void startLogIn(String email) {

        getDataManager().saveEmailId(email);
        getDataManager().setLoggedIn();
        getMvpView().openMainActivity();

    }
}
