val kiloEngineVersion = "0.1-SNAPSHOT"

plugins {
    id("java")
}

group = "io.github.laylameower"
version = "0.0.1"

repositories {
    mavenCentral()
    maven {
        url = uri("https://maven.jemnetworks.com/snapshots")
    }
}

dependencies {
    implementation("io.github.gaming32:kilo-engine:${kiloEngineVersion}")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}