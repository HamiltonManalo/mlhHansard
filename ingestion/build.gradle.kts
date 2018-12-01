plugins {
    java
    "com.google.protobuf"
}

group = "uk.ac.brunel"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit", "junit", "4.12")
    compile("com.google.protobuf:protobuf-gradle-plugin:0.8.5")
    compile("org.apache.httpcomponents:httpclient:4.5.6")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath ("com.google.protobuf:protobuf-gradle-plugin:0.8.7")
        classpath("org.apache.httpcomponents:httpclient:4.5.6")
    }
}
