package com.izikode.izilib.kotlincomposer.composer

import com.squareup.kotlinpoet.FunSpec

data class FunctionComposer (

        var name: String? = null

) : Composer() {

    internal fun createSpec() = FunSpec.builder(name ?: "").apply {

        /* TODO update spec */

    }.build()

}