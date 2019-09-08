package Aquarium

import kotlin.reflect.full.declaredFunctions
import kotlin.reflect.full.findAnnotation

@ImAPlant class Plant {
    fun trim() {}
    fun fertilize() {}

    @get:OnGet
    val isGrowing: Boolean = false

    @set:OnSet
    var needsFood: Boolean = false
}

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet

@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet

annotation class ImAPlant
fun reflections() {
    val classObj = Plant::class

    for (method in classObj.declaredFunctions) {
        println(method.name)
    }

    for (annotation in classObj.annotations) {
        println(annotation.annotationClass.simpleName)
    }

    val annotated = classObj.findAnnotation<ImAPlant>()

    annotated?.apply {
        println("Found a plant annotation")
    }
}

fun main(args: Array<String>) {
    reflections()
}