package dev.ws.kunciku;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";


    private TextView title;
    private Button action;
    private ImageView back,help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"THIS MAIN ACTIVITY");
        prepareComponent();
        prepareTopNavButton();
        prepareSelectedFragment();
    }

    private void prepareComponent(){
        title = findViewById(R.id.nav_title);
        action = findViewById(R.id.button);
        back = findViewById(R.id.back);
        help = findViewById(R.id.help);
    }

    private void prepareTopNavButton() {
        back.setOnClickListener(this);
        help.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back:
                backButton();
                break;
            case R.id.help:
                backButton();
                break;
            default:
                break;
        }
    }

    private void backButton() {
        onBackPressed();
        finish();
    }
    private void prepareSelectedFragment() {
        final String var = getIntent().getStringExtra("selectedFragment");
        if (var.equals("login")) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, LoginFragment.newInstance()).commit();
            title.setText(getResources().getString(R.string.masuk));
            action.setText(getResources().getString(R.string.masuk));
        }else if (var.equals("daftar")){
            getSupportFragmentManager().beginTransaction().replace(R.id.container, RegisterFragment.newInstance()).commit();
            title.setText(getResources().getString(R.string.daftar));
            action.setText(getResources().getString(R.string.daftar));
        }
    }

}
