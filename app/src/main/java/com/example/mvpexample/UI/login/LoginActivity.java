package com.example.mvpexample.UI.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvpexample.Data.DataManager;
import com.example.mvpexample.MyApp;
import com.example.mvpexample.R;
import com.example.mvpexample.UI.main.MainActivity;
import com.example.mvpexample.Utils.CommonUtils;


public class LoginActivity extends Activity implements LoginMvpView {

    private Button loginButton;
    private EditText emailET;
    private LogInPresenter logInPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = findViewById(R.id.button);
        emailET = findViewById(R.id.editText);

        DataManager dataManager = ((MyApp) getApplicationContext()).getDataManager();
        logInPresenter = new LogInPresenter(dataManager);
        logInPresenter.onAttach(this);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLoginButtton();
            }
        });
    }

    @Override
    public void openMainActivity() {
        startActivity(MainActivity.getStartIntent(this));
        finish();
    }

    @Override
    public void onLoginButtton() {

        String email = emailET.getText().toString();

        if (CommonUtils.isEmailValid(email)) {
            logInPresenter.startLogIn(email);
        } else {
            Toast.makeText(this, "Enter Correct Email", Toast.LENGTH_SHORT).show();
        }

    }
}
