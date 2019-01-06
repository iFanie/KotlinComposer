package com.izikode.izilib.kotlincomposer.scope

import com.izikode.izilib.kotlincomposer.composer.FunctionComposer

data class FunctionScope(

        private val functionComposer: FunctionComposer

) : Scope() {

    val functionName get() = functionComposer.name ?: throw UninitializedPropertyAccessException("Function name has not been set.")

}