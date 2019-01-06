package com.izikode.izilib.kotlincomposer.sheet

import com.izikode.izilib.kotlincomposer.composer.ClassComposer

interface ClassSheet : Sheet {

    infix fun a(`class`: ClassComposer) = `class`

}