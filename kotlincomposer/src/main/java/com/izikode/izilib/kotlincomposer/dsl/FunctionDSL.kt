package com.izikode.izilib.kotlincomposer.dsl

import com.izikode.izilib.kotlincomposer.composer.FunctionComposer
import com.izikode.izilib.kotlincomposer.scope.ClassScope
import com.izikode.izilib.kotlincomposer.scope.FunctionScope
import com.izikode.izilib.kotlincomposer.scope.PackageScope

fun `fun`(name: String, block: FunctionScope.() -> String) = getComposer(name, block)

fun PackageScope.`fun`(name: String, block: FunctionScope.() -> String) = getComposer(name, block).apply {
    this@`fun`.addFunctionComposer(this)
}

fun ClassScope.`fun`(name: String, block: FunctionScope.() -> String) = getComposer(name, block).apply {
    this@`fun`.addFunctionComposer(this)
}

private inline fun getComposer(name: String, block: FunctionScope.() -> String) = FunctionComposer(name).apply {
    FunctionScope(this).apply {
        block()
    }
}