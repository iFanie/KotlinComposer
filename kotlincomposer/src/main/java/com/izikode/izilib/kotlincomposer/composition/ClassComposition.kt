package com.izikode.izilib.kotlincomposer.composition

import com.izikode.izilib.kotlincomposer.composer.ClassComposer
import com.izikode.izilib.kotlincomposer.sheet.ClassSheet

class ClassComposition : ClassSheet {

    override infix fun a(`class`: ClassComposer) = `class`

}