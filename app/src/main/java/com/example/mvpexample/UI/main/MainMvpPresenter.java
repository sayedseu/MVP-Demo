package com.example.mvpexample.UI.main;

import com.example.mvpexample.UI.base.MvpPresenter;

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    String getEmail();

    void setUserLogOut();
}
