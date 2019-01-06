package com.izikode.izilib.kotlincomposer.composition

import com.izikode.izilib.kotlincomposer.composer.FunctionComposer
import com.izikode.izilib.kotlincomposer.sheet.FunctionSheet

class FunctionComposition : FunctionSheet {

    override infix fun a(`fun`: FunctionComposer) = `fun`

}