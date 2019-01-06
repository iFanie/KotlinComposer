package com.izikode.izilib.kotlincomposer.sheet

import com.izikode.izilib.kotlincomposer.composer.FileComposer

interface FileSheet : Sheet {

    infix fun a(file: FileComposer) = file

}