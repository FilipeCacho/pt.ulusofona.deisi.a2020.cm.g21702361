package com.example.ptulusofonadeisia2020cmg21702361

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.ptulusofonadeisia2020cmg21702361.fragments.*

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

        bottom_navigation.setOnNavigationItemSelectedListener{

        }
    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
}