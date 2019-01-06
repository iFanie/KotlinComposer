package com.izikode.izilib.kotlincomposer.composer

import com.squareup.kotlinpoet.TypeSpec

data class ClassComposer (

        var name: String? = null

) : Composer() {

    internal fun createSpec() = TypeSpec.classBuilder(name ?: "").apply {

        /* TODO update spec */

    }.build()

    val functionComposers = mutableListOf<FunctionComposer>()

    internal fun createFunctionSpecs() = Array(functionComposers.size) {
        functionComposers[it].createSpec()
    }

    override fun toString(): String = createSpec().toString()

}