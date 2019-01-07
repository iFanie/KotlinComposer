package com.izikode.izilib.kotlincomposer.dsl

import com.izikode.izilib.kotlincomposer.note.VisibilityNote
import com.izikode.izilib.kotlincomposer.scope.ClassScope
import com.squareup.kotlinpoet.KModifier

val ClassScope.public get() = VisibilityNote(KModifier.PUBLIC)

val ClassScope.private get() = VisibilityNote(KModifier.PRIVATE)

val ClassScope.protected get() = VisibilityNote(KModifier.PROTECTED)

val ClassScope.internal get() = VisibilityNote(KModifier.INTERNAL)