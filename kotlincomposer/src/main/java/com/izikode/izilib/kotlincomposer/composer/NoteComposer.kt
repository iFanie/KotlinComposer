package com.izikode.izilib.kotlincomposer.composer

import com.izikode.izilib.kotlincomposer.note.VisibilityNote

class NoteComposer : Composer() {

    val visibilityNotes = mutableListOf<VisibilityNote>()

    fun addVisibilityNote(visibilityNote: VisibilityNote) {
        visibilityNotes.add(visibilityNote)
    }

}