plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.hc.jnidemo11036"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.hc.jnidemo11036"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    externalNativeBuild {
        cmake {
            path = file("src/main/cpp/CMakeLists.txt")
            version = "3.22.1"
        }
    }



//    sourceSets.main {
//        jni.srcDirs = [] // 禁用默认的 jni 源目录
//        jniLibs.srcDirs = ['libs'] // 指定你的 .so 文件目录，记得.so文件要放到这里
//    }

    buildFeatures {
        viewBinding = true
    }
}


dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}