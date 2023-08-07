plugins {
    id 'java'
}

group 'com.example'
version '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    implementation group: 'org.apache.commons', name: 'commons-lang3', version: '3.12.0'
}

task compileAndRun(type: JavaExec, dependsOn: 'build') {
    main = 'com.example.Main'
    classpath sourceSets.main.runtimeClasspath
}
