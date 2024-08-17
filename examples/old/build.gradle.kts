plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    js {
        browser()
    }
}

dependencies {
    "jsMainImplementation"(libs.wrappers.emotion)
    "jsMainImplementation"(libs.wrappers.js)
    "jsMainImplementation"(libs.wrappers.react)
    "jsMainImplementation"(libs.wrappers.react.use)
    "jsMainImplementation"(libs.wrappers.react.dom)
    "jsMainImplementation"(libs.wrappers.react.router.dom)
}
