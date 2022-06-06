package com.bunbeauty.notes.domain.note

import com.bunbeauty.notes.domain.model.Note

interface IGetNotesUseCase {
    fun invoke():List<Note>
}