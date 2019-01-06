package com.izikode.izilib.kotlincomposer.sheet

import com.izikode.izilib.kotlincomposer.composer.FunctionComposer

interface FunctionSheet : Sheet {

    infix fun a(`fun`: FunctionComposer) = `fun`

}