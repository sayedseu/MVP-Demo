package com.example.mvpexample.UI.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvpexample.Data.DataManager;
import com.example.mvpexample.MyApp;
import com.example.mvpexample.R;
import com.example.mvpexample.UI.splash.SplashActivity;

public class MainActivity extends Activity implements MainMvpView {

    private Button logOutBT;
    private TextView emailTV;
    private MainPresenter mainPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logOutBT = findViewById(R.id.button2);
        emailTV = findViewById(R.id.textView2);

        DataManager dataManager = ((MyApp) getApplicationContext()).getDataManager();
        mainPresenter = new MainPresenter(dataManager);
        mainPresenter.onAttach(this);
        setUI();
        logOutBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.setUserLogOut();
            }
        });
    }

    @Override
    public void openSplashActivity() {
        startActivity(SplashActivity.getStartIntent(this));
        finish();
    }

    @Override
    public void setUI() {
        emailTV.setText(mainPresenter.getEmail());
    }
}
