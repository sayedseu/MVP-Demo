package com.example.mvpexample.UI.splash;

import com.example.mvpexample.UI.base.MvpPresenter;

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

    void decideNextActivity();
}
