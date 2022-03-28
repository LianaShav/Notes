package com.bunbeauty.notes.ui.notes

import android.os.Bundle
import android.view.View
import com.bunbeauty.notes.databinding.FragmentNotesBinding
import com.bunbeauty.notes.ui.base.BaseFragment

class NotesFragment:BaseFragment<FragmentNotesBinding>() {


    val notesAdapter = NotesAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fragmentNotesRvNotes.adapter = notesAdapter
        val notes = listOf(
            NoteItem(
                id = "7",
                title = "pisi",
                time = "13:00",
                date = "28.7.22"
            ),
            NoteItem(
                id = "7",
                title = "pisi",
                time = "13:00",
                date = "28.7.22"
            ),NoteItem(
                id = "7",
                title = "pisi",
                time = "13:00",
                date = "28.7.22"
            ),NoteItem(
                id = "7",
                title = "pisi",
                time = "13:00",
                date = "28.7.22"
            ),NoteItem(
                id = "7",
                title = "pisi",
                time = "13:00",
                date = "28.7.22"
            ),NoteItem(
                id = "7",
                title = "pisi",
                time = "13:00",
                date = "28.7.22"
            ),NoteItem(
                id = "7",
                title = "pisi",
                time = "13:00",
                date = "28.7.22"
            ),NoteItem(
                id = "7",
                title = "pisi",
                time = "13:00",
                date = "28.7.22"
            ),NoteItem(
                id = "7",
                title = "pisi",
                time = "13:00",
                date = "28.7.22"
            ),NoteItem(
                id = "7",
                title = "pisi",
                time = "13:00",
                date = "28.7.22"
            ),NoteItem(
                id = "7",
                title = "pisi",
                time = "13:00",
                date = "28.7.22"
            ),NoteItem(
                id = "7",
                title = "pisi",
                time = "13:00",
                date = "28.7.22"
            ),NoteItem(
                id = "7",
                title = "pisi",
                time = "13:00",
                date = "28.7.22"
            ),NoteItem(
                id = "7",
                title = "pisi",
                time = "13:00",
                date = "28.7.22"
            ),NoteItem(
                id = "7",
                title = "pisi",
                time = "13:00",
                date = "28.7.22"
            ),NoteItem(
                id = "7",
                title = "pisi",
                time = "13:00",
                date = "28.7.22"
            ),
        )
        notesAdapter.setItems(notes)
    }

}