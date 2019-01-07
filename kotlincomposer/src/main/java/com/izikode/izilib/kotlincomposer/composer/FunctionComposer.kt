package com.izikode.izilib.kotlincomposer.composer

import com.izikode.izilib.kotlincomposer.note.VisibilityNote
import com.squareup.kotlinpoet.FunSpec

data class FunctionComposer (

        var name: String? = null,

        var code: String? = null,

        var noteComposer: NoteComposer? = null

) : Composer() {

    infix fun `as`(visibilityNote: VisibilityNote) = this.apply {
        (noteComposer ?: NoteComposer().also { this.noteComposer = it }).addVisibilityNote(visibilityNote)
    }

    infix fun and(visibilityNote: VisibilityNote) = this.apply {
        noteComposer?.addVisibilityNote(visibilityNote)
    }

    internal fun createSpec() = FunSpec.builder(name ?: "").apply {

        code?.let {
            addCode(it)
        }

        noteComposer?.let {
            it.visibilityNotes.forEach {
                addModifiers(it.modifier)
            }
        }

    }.build()

    override fun toString(): String = createSpec().toString()

}