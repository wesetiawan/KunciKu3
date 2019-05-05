package dev.ws.kunciku.Main;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.hbb20.CountryCodePicker;

import org.jetbrains.annotations.NotNull;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;
import dev.ws.kunciku.R;


public class LoginFragment extends Fragment {
    private static final String TAG = "LoginFragment";
    private String numberStr="";

    @BindView(R.id.login_ccp)
    CountryCodePicker countryCodePicker;
    @BindView(R.id.login_Phone)
    EditText loginPhone;




    static private LoginFragment loginFragment;
    public static LoginFragment newInstance() {
        loginFragment = new LoginFragment();
        return loginFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG,"THIS FRAGMENT LOGIN");
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        ButterKnife.bind(this,view);

        countryCodePicker.registerCarrierNumberEditText(loginPhone);
        countryCodePicker.setNumberAutoFormattingEnabled(true);

        return view;
    }


    /*private boolean isNumberValid() {

        if (loginPhone.getText().toString().equals("")) {
            loginPhone.setError("Masukan Nomor HP Anda");
            return false;
        } else if (!countryCodePicker.isValidFullNumber()) {
            loginPhone.setError("Mohon Masukan Nomor Anda Dengan Benar");
            return false;
        } else {
            loginPhone.setError(null);
            return true;
        }
    }*/


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @OnTextChanged(value = R.id.login_Phone, callback = OnTextChanged.Callback.TEXT_CHANGED)
    public void numberChanged(CharSequence text){

    }

    /*@OnClick({R.id.action})
    public void btnOnClick(View view){
        switch (view.getId()){
            case R.id.action:
                numberStr = countryCodePicker.getFullNumberWithPlus();

        }
    }*/
}
