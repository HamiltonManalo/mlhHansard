import com.google.protobuf.gradle.protobuf
import com.google.protobuf.gradle.protoc

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
    compile("org.apache.commons:commons-io:1.3.2")
    compile("com.google.api.grpc:proto-google-common-protos:1.0.0")
    compile("org.json:json:20180813")
    compile("com.google.protobuf:protobuf-java:3.6.1")
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
        classpath("org.apache.commons:commons-io:1.3.2")
        classpath("com.google.api.grpc:proto-google-common-protos:1.0.0")
        classpath("org.json:json:20180813")
        classpath("com.google.protobuf:protobuf-java:3.6.1")
    }
}
