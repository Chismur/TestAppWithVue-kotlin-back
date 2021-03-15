plugins {
    id("org.siouan.frontend") version "1.2.1"
    id("java")
}

group = "com.kotlin-spring-vue"
version = "0.0.1-SNAPSHOT"

java {
    targetCompatibility = JavaVersion.VERSION_11
}

repositories {
    mavenCentral()
}

frontend {
    nodeVersion.set("12.18.4")
    cleanScript.set("run clean")
    installScript.set("install")
    assembleScript.set("run build")
}

tasks.named("jar", Jar::class) {
    dependsOn("assembleFrontend")
    from("$buildDir/dist")
    into("static")
}