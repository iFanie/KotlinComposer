package com.izikode.izilib.kotlincomposer.composition

import com.izikode.izilib.kotlincomposer.composer.PackageComposer
import com.izikode.izilib.kotlincomposer.sheet.PackageSheet

class PackageComposition : PackageSheet {

    override infix fun a(`package`: PackageComposer) = `package`

}