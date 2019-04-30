package dev.ws.kunciku;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.LayoutInflaterCompat;

import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.mikepenz.iconics.context.IconicsContextWrapper;
import com.mikepenz.iconics.context.IconicsLayoutInflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    private void prepareTopNavBar(){
        Toolbar top = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(top);
        top.setTitle(getResources().getString(R.string.top_nav_title));
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(IconicsContextWrapper.wrap(newBase));
    }
}
