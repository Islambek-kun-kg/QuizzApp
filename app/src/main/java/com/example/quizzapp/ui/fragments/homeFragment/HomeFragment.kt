package com.example.quizzapp.ui.fragments.homeFragment

import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.quizzapp.R
import com.example.quizzapp.core.BaseFragment
import com.example.quizzapp.databinding.FragmentHomeBinding
import com.example.quizzapp.ui.fragments.history.HistoryFragment
import com.example.quizzapp.ui.fragments.homeFragment.adapter.PagerAdapter
import com.example.quizzapp.ui.fragments.mainQuizz.MainQuizzFragment
import com.example.quizzapp.ui.fragments.settings.SettingsFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    private lateinit var previewMenuItem: MenuItem

    override fun setupLiveData() {}

    override fun setupUI() {

        val adapter = PagerAdapter(initFragments(), this)
        binding.viewPager.adapter = adapter
        binding.viewPager.isUserInputEnabled = false

        binding.navView.setOnNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.main_quizz -> binding.viewPager.currentItem = 0
                R.id.history -> binding.viewPager.currentItem = 1
                R.id.settings -> binding.viewPager.currentItem = 2
            }
            true
        }

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                onPageSelectedF(position)
            }
        })
    }

    private fun onPageSelectedF(position: Int) {
        if (::previewMenuItem.isInitialized) {
            previewMenuItem.isChecked = true
        } else {
            binding.navView.menu.getItem(position).isChecked = true
        }
        binding.navView.menu.getItem(position).isChecked = true
        previewMenuItem = binding.navView.menu.getItem(position)
    }

    private fun initFragments(): ArrayList<Fragment> {
        return arrayListOf(
            MainQuizzFragment.newInstance(),
            HistoryFragment.newInstance(),
            SettingsFragment.newInstance()
        )
    }
}