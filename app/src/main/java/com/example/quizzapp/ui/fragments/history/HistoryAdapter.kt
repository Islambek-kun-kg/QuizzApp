package com.example.quizzapp.ui.fragments.history

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quizzapp.R
import com.example.quizzapp.databinding.HistoryItemBinding
import com.example.quizzapp.models.History

class HistoryAdapter(
    private val list: MutableList<History>,
    private val context: Context,
    val onItemClick: (history: History) -> Unit
) : RecyclerView.Adapter<HistoryAdapter.HistoryHolder>() {

    class HistoryHolder(itemView: View, private val context: Context) :
        RecyclerView.ViewHolder(itemView) {
        private var itemBinding = HistoryItemBinding.bind(itemView)

        fun onBind(history: History) {
            itemBinding.tvHistoryCategory.text =
                (context.getString(R.string.category) + ": " + history.category)

            itemBinding.tvHistoryCorrectAnswers.text =
                (context.getString(R.string.text_history_correct_answers) + ": " + history.correctAnswer)

            itemBinding.tvHistoryDifficulty.text =
                (context.getString(R.string.difficulty) + ": " + history.difficulty)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryHolder {
        return HistoryHolder(
            LayoutInflater.from(context).inflate(R.layout.history_item, parent, false), context
        )
    }

    override fun onBindViewHolder(holder: HistoryHolder, position: Int) {
        holder.onBind(list[position])
        holder.itemView.setOnClickListener { onItemClick(list[position]) }
    }

    override fun getItemCount(): Int = list.size
}