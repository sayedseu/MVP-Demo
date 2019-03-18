package com.example.mvpexample;

import android.app.Application;


import com.example.mvpexample.Data.DataManager;
import com.example.mvpexample.Data.SharedPrefsHelper;

public class MyApp extends Application {

    private DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();
        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());
        dataManager = new DataManager(sharedPrefsHelper);
    }

    public DataManager getDataManager(){
        return dataManager;
    }
}
