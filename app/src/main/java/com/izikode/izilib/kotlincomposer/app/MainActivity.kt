package com.izikode.izilib.kotlincomposer.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.izikode.izilib.kotlincomposer.dsl.*
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.TypeSpec

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val withoutComposer = (FileSpec.builder("com.izikode.izilib.kotlincomposer.app", "SimpleClass")
        .addType(
            TypeSpec.classBuilder("SimpleClass")
                .addFunction(
                    FunSpec.builder("helloWorld")
                        .addCode(
                            """
                                print("Hello world!")
                            """.trimIndent()
                        ).build()
                ).build()
        ).addFunction(
            FunSpec.builder("topHelloWorld")
                .addCode(
                    """
                        print("Hello world from top level!")
                    """.trimIndent()
                ).build()
        ).build()).toString()

    val withComposer = (compose a file("SimpleClass") {
        compose a `package`("com.izikode.izilib.kotlincomposer.app") {

            compose a `class`("SimpleClass") {

                compose a `fun`("helloWorld") {
                    """
                        print("Hello world!")
                    """
                }

            }

            compose a `fun`("topHelloWorld") {
                """
                    print("Hello world from top level!")
                """
            }

        }
    }).toString()

}
