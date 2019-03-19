package com.example.mvpexample.UI.login;

import com.example.mvpexample.UI.base.MvpPresenter;

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void startLogIn(String email);
}
