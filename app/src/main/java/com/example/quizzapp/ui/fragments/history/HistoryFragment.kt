package com.example.quizzapp.ui.fragments.history

import com.example.quizzapp.core.BaseFragment
import com.example.quizzapp.databinding.FragmentHistoryBinding
import com.example.quizzapp.databinding.FragmentHomeBinding


class HistoryFragment : BaseFragment<FragmentHistoryBinding>(FragmentHistoryBinding::inflate) {

    override fun setupLiveData() {}
    override fun setupUI() {}

    companion object {
        fun newInstance() = HistoryFragment()
    }
}