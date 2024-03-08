package com.gamefolio.expensetracker.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.lifecycle.lifecycleScope
import com.gamefolio.expensetracker.R
import com.gamefolio.expensetracker.dataStore.ObjDataStore
import com.gamefolio.expensetracker.screens.dashboard.DashboardActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


       /* Handler(Looper.getMainLooper()).postDelayed({
            // Navigate to the main activity



          finish() // Close the splash activity
        }, 10000)*/


        lifecycleScope.launch(Dispatchers.IO) {
            delay(10000)
            ObjDataStore.isCurrencySelected(applicationContext).collect { isCurrencySelected ->
               withContext(Dispatchers.Main){
                   if (isCurrencySelected) {
                       startActivity(Intent(this@SplashActivity, DashboardActivity::class.java))
                   } else {
                       startActivity(Intent(this@SplashActivity, CurrencySelectionActivity::class.java))
                   }
               }
            }
        }

    }
}
