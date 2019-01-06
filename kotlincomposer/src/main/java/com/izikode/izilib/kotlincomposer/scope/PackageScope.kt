package com.izikode.izilib.kotlincomposer.scope

import com.izikode.izilib.kotlincomposer.composer.ClassComposer
import com.izikode.izilib.kotlincomposer.composer.FunctionComposer
import com.izikode.izilib.kotlincomposer.composer.PackageComposer
import com.izikode.izilib.kotlincomposer.composition.ClassComposition
import com.izikode.izilib.kotlincomposer.composition.FunctionComposition
import com.izikode.izilib.kotlincomposer.composition.TopLevelComposition

data class PackageScope(

        private val packageComposer: PackageComposer

) : Scope() {

    val packageName get() = packageComposer.name ?: throw UninitializedPropertyAccessException("Package name has not been set.")

    val compose get() = TopLevelComposition(ClassComposition(), FunctionComposition())

    fun addClassComposer(classComposer: ClassComposer) {
        packageComposer.classComposers.add(classComposer)
    }

    fun addFunctionComposer(functionComposer: FunctionComposer) {
        packageComposer.functionComposers.add(functionComposer)
    }

}