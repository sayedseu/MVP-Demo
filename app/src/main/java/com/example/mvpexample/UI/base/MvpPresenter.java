package com.example.mvpexample.UI.base;

public interface MvpPresenter<V extends MvpView>{

    void onAttach(V mvpView);
}
