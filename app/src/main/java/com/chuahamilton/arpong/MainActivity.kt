package com.chuahamilton.arpong

import androidx.appcompat.app.AppCompatActivity
<<<<<<< Updated upstream
import android.os.Bundle
import com.chuahamilton.arpong.fragments.MainFragment
=======
import androidx.appcompat.app.AppCompatDelegate
import com.chuahamilton.arpong.fragments.LoginFragment
>>>>>>> Stashed changes
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
        sleep(1000)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
<<<<<<< Updated upstream
                .replace(R.id.container, MainFragment.newInstance())
=======
                .replace(R.id.container, LoginFragment())
>>>>>>> Stashed changes
                .commitNow()
        }
    }

}
