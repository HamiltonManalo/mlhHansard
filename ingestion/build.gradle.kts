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
//
//protobuf {
//    protoc {
//        artifact "com.google.protobuf:protoc:3.5.1-1"
//    }
//    plugins {
//        grpc {
//            artifact = "io.grpc:protoc-gen-grpc-java:1.16.1"
//        }
//    }
//    generateProtoTasks {
//        all()*.plugins {
//            grpc {}
//        }
//    }
//}