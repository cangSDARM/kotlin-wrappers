import com.moowork.gradle.node.npm.NpmTask

plugins {
    id("com.github.node-gradle.node")
    id("publishing-conventions")
}

tasks {
    val processPkg = register<Copy>("processPkg") {
        from(".")
        into("build/npm")
        include("package.json")
        expand(versionMap())
    }

    val prepublish = register<Copy>("prepublish") {
        from(".")
        into("build/npm")
        exclude("package.json")
        exclude("build/npm")

        dependsOn(named("build"))
    }

    named<NpmTask>("npm_publish") {
        setArgs(listOf("--access", "public"))
        setWorkingDir(file("build/npm"))

        dependsOn(prepublish)
        dependsOn(processPkg)
    }
}

fun versionMap(): Map<String, String> =
    sequenceOf(
        "css",
        "kotlin",
        "kotlinext",
        "mocha",
        "react",
        "react_dom",
        "react_redux",
        "react_router_dom",
        "redux",
        "styled"
    ).associate(::versionPair)
