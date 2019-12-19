plugins {
    java
    kotlin("jvm")
    application
}

dependencies {
    compile(kotlin("stdlib"))
}

application {
    mainClassName = "Test"
}
