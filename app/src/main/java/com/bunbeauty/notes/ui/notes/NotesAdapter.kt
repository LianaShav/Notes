package com.bunbeauty.notes.ui.notes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bunbeauty.notes.databinding.ElementNotsBinding

class NotesAdapter  :
    RecyclerView.Adapter<NotesAdapter.ViewHolder>() {

   private val notes:MutableList<NoteItem> = mutableListOf()

    fun setItems(newNotes:List<NoteItem>){
        notes.clear()
        notes.addAll(newNotes)
        notifyDataSetChanged()
    }

    class ViewHolder(private val binding: ElementNotsBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(noteItem: NoteItem) {
            binding.elementNoteTvTitle.text = noteItem.title
            binding.elementNoteTvTime.text = noteItem.time
            binding.elementNoteTvDate.text = noteItem.date
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding = ElementNotsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(notes[position])
    }

    override fun getItemCount(): Int = notes.size
}