# KotlinComposer [ WIP ]
#### Expressive and functional wrapper around KotlinPoet 

Consider this simple class:
```kotlin
package com.izikode.izilib.kotlincomposer.app

class SimpleClass {
    fun helloWorld() {
        print("Hello world!")
    }
    
    private fun privateHelloWorld() {
        print("Hello world, in private.")
    }
}

fun topHelloWorld() {
    print("Hello world from top level!")
}
```

- Generating it **without** KotlinComposer:
```kotlin
FileSpec.builder("com.izikode.izilib.kotlincomposer.app", "SimpleClass")
    .addType(
        TypeSpec.classBuilder("SimpleClass")
            .addFunction(
                FunSpec.builder("helloWorld")
                    .addCode(
                        """
                            |print("Hello world!")
                        """.trimMargin()
                    ).build()
            ).addFunction(
                FunSpec.builder("privateHelloWorld")
                    .addModifiers(KModifier.PRIVATE)
                    .addCode(
                        """
                            |print("Hello world, in private.")
                        """.trimMargin()
                    ).build()
            ).build()
    ).addFunction(
        FunSpec.builder("topHelloWorld")
            .addCode(
                """
                    print("Hello world from top level!")
                """
            ).build()
    ).build()
```

- And **with**:
```kotlin
compose a file("SimpleClass") {
    compose a `package`("com.izikode.izilib.kotlincomposer.app") {
        compose a `class`("SimpleClass") {
            compose a `fun`("helloWorld") {
                """
                    print("Hello world!")
                """
            }

            compose a `fun`("privateHelloWorld") {
                """
                    print("Hello world, in private.")
                """
            } `as` private
        }

        compose a `fun`("topHelloWorld") {
            """
                print("Hello world from top level!")
            """
        }
    }
}
```

## Which do you prefer?
