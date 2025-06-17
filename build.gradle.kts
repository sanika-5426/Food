buildscript {
 
        repositories {
            google()
            mavenCentral()
        }

    dependencies {
        classpath ("com.google.gms:google-services:4.3.10") // Check for latest version
    }
}


plugins {
    id("com.google.gms.google-services") version "4.4.2" apply false
    id("com.android.application") version "8.9.3" apply false
}
