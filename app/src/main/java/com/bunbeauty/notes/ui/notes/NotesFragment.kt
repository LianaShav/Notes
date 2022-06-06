package com.bunbeauty.notes.ui.notes

import android.os.Bundle
import android.view.View
import com.bunbeauty.notes.databinding.FragmentNotesBinding
import com.bunbeauty.notes.ui.base.BaseFragment

class NotesFragment:BaseFragment<FragmentNotesBinding>() {

    val notesAdapter = NotesAdapter()

    val viewModel:NotesViewModel= NotesViewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fragmentNotesRvNotes.adapter = notesAdapter
        val notes = viewModel.getNotes().map { NoteItem(
            id = it.id,
            title = it.title,
            time = it.time,
            date = it.date

        ) }
        notesAdapter.setItems(notes)
    }

}