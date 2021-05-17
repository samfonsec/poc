plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
    google()
    jcenter()
//    gradlePluginPortal()
}

dependencies {
//    implementation "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
    compileOnly(gradleApi())

    implementation("com.android.tools.build:gradle:3.6.0-beta04")
    implementation(kotlin("gradle-plugin", "1.3.50"))
    implementation(kotlin("android-extensions"))
}