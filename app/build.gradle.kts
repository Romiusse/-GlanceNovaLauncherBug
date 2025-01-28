plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.glancenovalauncherbug"
    compileSdk = 35

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.14"
    }

    defaultConfig {
        minSdk = 26
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    // glance library
    implementation(libs.androidx.glance.appwidget)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
}