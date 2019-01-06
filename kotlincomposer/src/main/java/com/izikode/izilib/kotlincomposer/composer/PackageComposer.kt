package com.izikode.izilib.kotlincomposer.composer

data class PackageComposer (

        var name: String? = null

) : Composer() {

    val classComposers = mutableListOf<ClassComposer>()

    internal fun createClassSpecs() = Array(classComposers.size) {
        classComposers[it].createSpec()
    }

    val functionComposers = mutableListOf<FunctionComposer>()

    internal fun createFunctionSpecs() = Array(functionComposers.size) {
        functionComposers[it].createSpec()
    }

}