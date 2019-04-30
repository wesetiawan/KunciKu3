package dev.ws.kunciku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        setUpButton();
    }

    private void setUpButton(){
        Button login = findViewById(R.id.main_loginBtn);
        login.setOnClickListener(this);
        Button daftar = findViewById(R.id.main_regBtn);
        daftar.setOnClickListener(this);
        Button fb = findViewById(R.id.fb_button);
        fb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_loginBtn:
                String login = "login";
                moveToMain(login);
                break;
            case R.id.main_regBtn:
                String daftar = "daftar";
                moveToMain(daftar);
                break;
            case R.id.fb_button:
                break;
                default:
                    break;
        }
    }

    private void moveToMain(String f){
        Intent i = new Intent(this,MainActivity.class);
        i.putExtra("selectedFragment",f);
        startActivity(i);
    }
}
