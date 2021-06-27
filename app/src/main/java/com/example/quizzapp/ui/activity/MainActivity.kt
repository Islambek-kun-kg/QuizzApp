package com.example.quizzapp.ui.activity

import androidx.navigation.findNavController
import com.example.quizzapp.R
import com.example.quizzapp.core.BaseActivity
import com.example.quizzapp.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(
    ActivityMainBinding::inflate, MainViewModel::class.java
) {
    override fun setUpView() {
        val navController = findNavController(R.id.nav_host_fragment)
    }
}