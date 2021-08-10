package com.example.quizzapp.ui.fragments.history

import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizzapp.core.BaseFragment
import com.example.quizzapp.databinding.FragmentHistoryBinding
import com.example.quizzapp.databinding.FragmentHomeBinding
import com.example.quizzapp.models.History


class HistoryFragment : BaseFragment<FragmentHistoryBinding>(FragmentHistoryBinding::inflate) {
    private val list = mutableListOf<History>()
    private val hAdapter: HistoryAdapter by lazy {
        HistoryAdapter(list, requireContext(), this::onItemClick)
    }

    override fun setupLiveData() {
        list.add(History("asd", "2", "Adsadgss"))
        list.add(History("asdagdsgsd", "3", "Adfasfs"))
        list.add(History("adsgsdagsd", "4", "Asdgds"))
        list.add(History("asdsgdsgd", "5", "Addsas"))
        list.add(History("asdgsdgsd", "6", "Aasdds"))
    }

    override fun setupUI() {
        binding.rvHistory.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = hAdapter
            hAdapter.notifyDataSetChanged()
        }
    }

    companion object {
        fun newInstance() = HistoryFragment()
    }

    private fun onItemClick(history: History) {
        Toast.makeText(requireContext(), history.category, Toast.LENGTH_SHORT).show()
    }
}
