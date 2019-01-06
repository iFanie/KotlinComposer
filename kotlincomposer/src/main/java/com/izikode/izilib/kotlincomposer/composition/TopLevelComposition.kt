package com.izikode.izilib.kotlincomposer.composition

import com.izikode.izilib.kotlincomposer.sheet.ClassSheet
import com.izikode.izilib.kotlincomposer.sheet.FunctionSheet

class TopLevelComposition(

    classComposition: ClassComposition,

    functionComposition: FunctionComposition

) : ClassSheet by classComposition, FunctionSheet by functionComposition