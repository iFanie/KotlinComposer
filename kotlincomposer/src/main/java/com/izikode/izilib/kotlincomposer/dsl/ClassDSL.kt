package com.izikode.izilib.kotlincomposer.dsl

import com.izikode.izilib.kotlincomposer.composer.ClassComposer
import com.izikode.izilib.kotlincomposer.scope.ClassScope
import com.izikode.izilib.kotlincomposer.scope.PackageScope

fun `class`(name: String, block: ClassScope.() -> Unit) = getComposer(name, block)

fun PackageScope.`class`(name: String, block: ClassScope.() -> Unit) = getComposer(name, block).apply {
    this@`class`.addClassComposer(this)
}

private inline fun getComposer(name: String, block: ClassScope.() -> Unit) = ClassComposer(name).apply {
    ClassScope(this).apply {
        block()
    }
}