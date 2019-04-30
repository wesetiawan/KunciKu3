package dev.ws.kunciku;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static MainActivity mainActivity;

    private FrameLayout frameLayout;

    public static MainActivity getInstance() {
        return mainActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prepareTopNav();
        mainActivity = this;
        prepareFragment();
    }

    private void prepareTopNav() {
        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(this);
        TextView title = findViewById(R.id.nav_title);
        ImageView help = findViewById(R.id.help);
        help.setOnClickListener(this);
        Button action = findViewById(R.id.button);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back:
                moveBack();
                break;
            case R.id.help:
                moveBack();
                break;
            default:
                break;
        }
    }

    private void moveBack() {
        onBackPressed();
        finish();
    }


    private void prepareFragment() {

        TextView title = findViewById(R.id.nav_title);
        Button action = findViewById(R.id.button);
        final String var = getIntent().getStringExtra("selectedFragment");
        if (var.equals("login")) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, LoginFragment.newInstance()).commit();
            title.setText("Masuk");
            action.setText("Masuk");
        }else if (var.equals("daftar")){
            getSupportFragmentManager().beginTransaction().replace(R.id.container, RegisterFragment.newInstance()).commit();
            title.setText("Daftar");
            action.setText("Daftar");
        }
    }

}
