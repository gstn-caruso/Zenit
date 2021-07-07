plugins {
    java
    kotlin("jvm") version "1.5.20"
    id("org.openjfx.javafxplugin") version "0.0.10"
}

group = "com.gaston"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

javafx {
    modules("javafx.controls", "javafx.fxml")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}