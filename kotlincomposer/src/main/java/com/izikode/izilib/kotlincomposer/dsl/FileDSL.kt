package com.izikode.izilib.kotlincomposer.dsl

import com.izikode.izilib.kotlincomposer.composer.FileComposer
import com.izikode.izilib.kotlincomposer.composition.FileComposition
import com.izikode.izilib.kotlincomposer.scope.FileScope

val compose get() = FileComposition()

inline fun file(name: String, block: FileScope.() -> Unit) = FileComposer(name).apply {
    FileScope(this).apply {
        block()
    }
}