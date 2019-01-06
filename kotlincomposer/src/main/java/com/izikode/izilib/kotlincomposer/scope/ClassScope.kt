package com.izikode.izilib.kotlincomposer.scope

import com.izikode.izilib.kotlincomposer.composer.ClassComposer
import com.izikode.izilib.kotlincomposer.composer.FunctionComposer
import com.izikode.izilib.kotlincomposer.composition.FunctionComposition

data class ClassScope(

        private val classComposer: ClassComposer

) : Scope() {

    val className get() = classComposer.name ?: throw UninitializedPropertyAccessException("Class name has not been set.")

    val compose = FunctionComposition()

    fun addFunctionComposer(functionComposer: FunctionComposer) {
        classComposer.functionComposers.add(functionComposer)
    }

}