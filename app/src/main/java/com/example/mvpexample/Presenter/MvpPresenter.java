package com.example.mvpexample.Presenter;

import com.example.mvpexample.View.MvpView;

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);
}
