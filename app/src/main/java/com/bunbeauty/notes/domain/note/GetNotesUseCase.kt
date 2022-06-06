package com.bunbeauty.notes.domain.note

import com.bunbeauty.notes.data.NoteRepository
import com.bunbeauty.notes.domain.model.Note
import com.bunbeauty.notes.domain.repo.NoteRepo

class GetNotesUseCase :IGetNotesUseCase{
    val noteRepo:NoteRepo=NoteRepository()
    override fun invoke(): List<Note> {
        return noteRepo.getNotes()
    }
}