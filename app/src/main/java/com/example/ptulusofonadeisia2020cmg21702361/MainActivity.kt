package com.example.ptulusofonadeisia2020cmg21702361

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.ptulusofonadeisia2020cmg21702361.fragments.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val regionsFragment = RegionsFragment()
        val coronaFragment = CoronaFragment()
        val settingsFragment = SettingsFragment()
        val testFragment = TestFragment()

        setCurrentFragment(homeFragment)

        findViewById<BottomNavigationView>(R.id.bottom_navigation)
            .setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.nav_home-> {
                        setCurrentFragment(homeFragment)
                        Log.i(TAG, "home selected")
                    }
                    R.id.nav_corona-> {
                        setCurrentFragment(coronaFragment)
                        Log.i(TAG, "corona selected")
                    }
                    R.id.nav_region-> {
                        setCurrentFragment(regionsFragment)
                        Log.i(TAG, "region selected")
                    }
                    R.id.nav_settings-> {
                        setCurrentFragment(settingsFragment)
                        Log.i(TAG, "settings selected")
                    }
                    R.id.nav_test-> {
                        setCurrentFragment(testFragment)
                        Log.i(TAG, "test selected")
                    }

                }
                true
            }
    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
}