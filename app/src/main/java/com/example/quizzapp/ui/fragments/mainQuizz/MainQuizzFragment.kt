package com.example.quizzapp.ui.fragments.mainQuizz

import com.example.quizzapp.core.BaseFragment
import com.example.quizzapp.databinding.FragmentMainQuizzBinding

class MainQuizzFragment :
    BaseFragment<FragmentMainQuizzBinding>(FragmentMainQuizzBinding::inflate) {

    override fun setupLiveData() {}
    override fun setupUI() {}

    companion object {
        fun newInstance() = MainQuizzFragment()
    }
}