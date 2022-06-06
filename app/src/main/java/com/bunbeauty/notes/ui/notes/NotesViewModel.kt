package com.bunbeauty.notes.ui.notes

import androidx.lifecycle.ViewModel
import com.bunbeauty.notes.domain.model.Note
import com.bunbeauty.notes.domain.note.GetNotesUseCase
import com.bunbeauty.notes.domain.note.IGetNotesUseCase

class NotesViewModel: ViewModel() {
   private val useCase:IGetNotesUseCase=GetNotesUseCase()

    fun getNotes(): List<Note>{
        return useCase.invoke()
    }
}