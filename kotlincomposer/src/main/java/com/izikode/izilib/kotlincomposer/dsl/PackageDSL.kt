package com.izikode.izilib.kotlincomposer.dsl

import com.izikode.izilib.kotlincomposer.composer.PackageComposer
import com.izikode.izilib.kotlincomposer.scope.FileScope
import com.izikode.izilib.kotlincomposer.scope.PackageScope

fun `package`(name: String, block: PackageScope.() -> Unit) = getComposer(name, block)

fun FileScope.`package`(name: String, block: PackageScope.() -> Unit) = getComposer(name, block).apply {
    this@`package`.packageComposer = this
}

private inline fun getComposer(name: String, block: PackageScope.() -> Unit) = PackageComposer(name).apply {
    PackageScope(this).apply {
        block()
    }
}