package com.example.music_app.Activity
/**
 *
 *Created by Sokheng :12/21/2020
 * **/
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.music_app.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val navigation = findViewById<BottomNavigationView>(R.id.buttom_navigation)
        navigation.setOnNavigationItemSelectedListener {item ->
            when(item.itemId){
                R.id.action_home ->{
                    val fragment_home= FragmentHome()
                    supportFragmentManager.beginTransaction().replace(R.id.container,fragment_home).commit()
                    true
                }
                R.id.action_search ->{
                    val fragment_search= FragmentSearch()
                    supportFragmentManager.beginTransaction().replace(R.id.container,fragment_search).commit()
                    true
                }
                R.id.action_favorite ->{
                    val fragment_favorite= FragmentFavorite()
                    supportFragmentManager.beginTransaction().replace(R.id.container,fragment_favorite).commit()
                    true
                }

                else -> false
            }
        }
        navigation.selectedItemId= R.id.action_home
    }
}
