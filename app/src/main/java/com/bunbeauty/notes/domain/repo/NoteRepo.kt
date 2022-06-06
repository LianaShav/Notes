package com.bunbeauty.notes.domain.repo

import com.bunbeauty.notes.domain.model.Note

interface NoteRepo {
    fun getNotes():List<Note>
}