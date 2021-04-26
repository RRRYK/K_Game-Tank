 import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

 val kotlin_version: String by extra
 buildscript {
     var kotlin_version: String by extra
     kotlin_version="1.4.10"
     repositories {
         mavenCentral()

         maven{setUrl ("https://jitpack.io") }
     }
     dependencies{
         classpath(kotlin("gradle-plugin",kotlin_version))
     }
 }




plugins {
    kotlin("jvm") version "1.1.4-3"
    application
}
 application{
     mainClassName="org.itheima.game.AppKt"

 }
//group = "org.itheima.game"
//version = "1.0-SNAPSHOT"
dependencies {
    implementation(kotlin("stdlib-jre8","1.2.71"))
    implementation("com.github.shaunxiao:kotlinGameEngine:v0.0.2")
}
 repositories {
     mavenCentral()
     maven{setUrl ("https://jitpack.io") }
 }
//tasks.test {
//    useJUnit()
//}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}