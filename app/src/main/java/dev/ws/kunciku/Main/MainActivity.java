package dev.ws.kunciku.Main;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import org.jetbrains.annotations.NotNull;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dev.ws.kunciku.R;

public class MainActivity extends AppCompatActivity{
    private static final String TAG = "MainActivity";


    private String content;
    private Fragment selectedFragment;

    private FragmentManager fragmentManager = getSupportFragmentManager();
    private FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

    @BindView(R.id.action)
    Button action;
    @BindView(R.id.nav_title)
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Log.d(TAG,"THIS MAIN ACTIVITY");
        final String var = getIntent().getStringExtra("selectedFragment");
        prepareSelectedFragment(var);
    }

    @OnClick({R.id.help,R.id.back})
    void onButtonClick(View img){
        switch (img.getId()) {
            case R.id.back:
                onBackPressed();
                break;
            case R.id.help:
                onBackPressed();
                break;
            default:
                break;
        }
    }
    public void prepareSelectedFragment(@NotNull String var) {

        if (var.equals("login")) {
            selectedFragment = LoginFragment.newInstance();
            content = "Masuk";
        }else if (var.equals("daftar")){
            selectedFragment = RegisterFragment.newInstance();
            content = "Daftar";
        }else {
            selectedFragment = OtpFragment.newInstance();
        }
        fragmentTransaction.replace(R.id.container, selectedFragment).commit();
        title.setText(content);
        action.setText(content);
    }

    /*private void helpAction(){
        ShowCaseDialog showCaseDialog = new ShowCaseBuilder()

                .textColorRes(R.color.white)
                .titleTextSizeRes(R.dimen.text_title)
                .textSizeRes(R.dimen.text_normal)
                .spacingRes(R.dimen.spacing_normal)
                .backgroundContentColorRes(R.color.blue)
                .clickable(true)
                .build();
        ArrayList<ShowCaseObject> showCaseList = new ArrayList<>();
        showCaseList.add(
                new ShowCaseObject(
                        help,
                        "Show case using custom target",
                        "This is highlighted using custom target"));


        showCaseDialog.show(this,TAG,showCaseList);

    }*/

    /*private boolean actionSwitcher (int position){
        switch (position){
            case :

        }
    }*/


    /*private void userData(){
        String name = userTable.getuName().toString();
        String phone = userTable.getuNumber().toString();
        String mail = userTable.getuMail().toString();
    }*/

}
