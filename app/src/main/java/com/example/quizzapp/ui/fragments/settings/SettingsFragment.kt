package com.example.quizzapp.ui.fragments.settings

import com.example.quizzapp.core.BaseFragment
import com.example.quizzapp.databinding.FragmentSettingsBinding

class SettingsFragment : BaseFragment<FragmentSettingsBinding>(FragmentSettingsBinding::inflate) {

    override fun setupLiveData() {}
    override fun setupUI() {}

    companion object {
        fun newInstance() = SettingsFragment()
    }
}
