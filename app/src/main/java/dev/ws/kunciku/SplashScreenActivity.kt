package dev.ws.kunciku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        doAnimation()
    }

    private fun doAnimation(){
        YoYo.with(Techniques.Tada)
                .duration(1400)
                .playOn(iv_logo)
        Handler().postDelayed({
            moveToWelcome()
        },2400)
    }
    private fun moveToWelcome(){
        startActivity(Intent(this,WelcomeActivity::class.java))
        finish()
    }
}
