package dev.ws.kunciku;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;
import dev.ws.kunciku.Main.MainActivity;

public class WelcomeActivity extends AppCompatActivity {

    @OnClick({R.id.main_regBtn,R.id.main_loginBtn,R.id.fb_button})
    void onButtonClick(Button btn){
        switch (btn.getId()) {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
    }


    private void moveToMain(String f){
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("selectedFragment",f);
        startActivity(i);
    }
}
