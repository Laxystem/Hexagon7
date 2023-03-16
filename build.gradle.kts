plugins {
    id("java")
}

group = "io.github.laylameower"
version = "0.0.1"

val kiloEngineVersion = "0.1-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.quiltmc.org/repository/release")
    maven("https://maven.jemnetworks.com/releases")
    maven("https://jitpack.io")
    maven("https://maven.jemnetworks.com/snapshots")
}

dependencies {
    implementation("io.github.gaming32:kilo-engine:${kiloEngineVersion}")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}