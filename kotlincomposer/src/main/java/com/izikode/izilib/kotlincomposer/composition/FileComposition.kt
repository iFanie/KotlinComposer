package com.izikode.izilib.kotlincomposer.composition

import com.izikode.izilib.kotlincomposer.composer.FileComposer
import com.izikode.izilib.kotlincomposer.sheet.FileSheet

class FileComposition : FileSheet {

    override infix fun a(file: FileComposer) = file

}