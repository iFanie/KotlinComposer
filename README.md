# KotlinComposer [ WIP ]
#### Expressive and functional wrapper around KotlinPoet 

## Let's make some musiK

Consider this simple class:
```kotlin
package com.izikode.izilib.kotlincomposer.app

class SimpleClass {

    fun helloWorld() {
        print("Hello world!")
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
                        print("Hello world!")
                    """
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
