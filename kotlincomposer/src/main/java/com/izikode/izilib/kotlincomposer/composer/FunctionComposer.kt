package com.izikode.izilib.kotlincomposer.composer

import com.squareup.kotlinpoet.FunSpec

data class FunctionComposer (

        var name: String? = null,

        var code: String? = null

) : Composer() {

    internal fun createSpec() = FunSpec.builder(name ?: "").apply {

        code?.let {
            addCode(it)
        }

    }.build()

    override fun toString(): String = createSpec().toString()

}