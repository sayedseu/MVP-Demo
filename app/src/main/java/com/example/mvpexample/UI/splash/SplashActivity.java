package com.example.mvpexample.UI.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.mvpexample.Data.DataManager;
import com.example.mvpexample.MyApp;
import com.example.mvpexample.R;
import com.example.mvpexample.UI.login.LoginActivity;
import com.example.mvpexample.UI.main.MainActivity;

public class SplashActivity extends AppCompatActivity implements SplashMvpView{

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, SplashActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        DataManager dataManager = ((MyApp) getApplication()).getDataManager();
        SplashPresenter splashPresenter = new SplashPresenter(dataManager);
        splashPresenter.onAttach(this);
        splashPresenter.decideNextActivity();
    }

    @Override
    public void openMainActivity() {
        startActivity(MainActivity.getStartIntent(this));
        finish();
    }

    @Override
    public void openLoginActivity() {
        startActivity(LoginActivity.getStartIntent(this));
        finish();
    }
}
