package com.example.mvpexample.UI.splash;

import com.example.mvpexample.Data.DataManager;
import com.example.mvpexample.UI.base.BasePresenter;

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V>
        implements SplashMvpPresenter<V> {


    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
       if (getDataManager().getLoggedInMode()){
           getMvpView().openMainActivity();
       }
       else {
           getMvpView().openLoginActivity();
       }
    }
}
