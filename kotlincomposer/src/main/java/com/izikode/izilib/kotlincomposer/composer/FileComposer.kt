package com.izikode.izilib.kotlincomposer.composer

import com.squareup.kotlinpoet.FileSpec

data class FileComposer(

        var name: String? = null,

        var packageComposer: PackageComposer? = null

) : Composer() {

    internal fun createSpec() = FileSpec.builder(

        packageComposer?.name ?: "",
        name ?: ""

    ).apply {

        packageComposer?.let {
            with (it) {

                createClassSpecs().forEach {
                    addType(it)
                }

                createFunctionSpecs().forEach {
                    addFunction(it)
                }

            }
        }

    }.build()

}