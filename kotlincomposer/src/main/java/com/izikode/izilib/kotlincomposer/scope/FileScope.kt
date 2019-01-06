package com.izikode.izilib.kotlincomposer.scope

import com.izikode.izilib.kotlincomposer.composer.FileComposer
import com.izikode.izilib.kotlincomposer.composer.PackageComposer
import com.izikode.izilib.kotlincomposer.composition.PackageComposition

data class FileScope(

        private val fileComposer: FileComposer

) : Scope() {

    val fileName get() = fileComposer.name ?: throw UninitializedPropertyAccessException("File name has not been set.")

    val compose get() = PackageComposition()

    var packageComposer: PackageComposer?
        get() = fileComposer.packageComposer
        set(value) {
            fileComposer.packageComposer = value
        }

}