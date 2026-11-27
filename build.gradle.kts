plugins {
    id("gg.ginco.hygradle.workspace")
    kotlin("jvm") version "2.3.21" apply false
    id("com.google.devtools.ksp") version "2.3.6" apply false
}

hytaleWorkspace {
    serverVersion = "0.7.7"
}

tasks.named("runAllMods") {
    val jars = property("pluginJars") as ConfigurableFileCollection
    jars.from(fileTree("libs") {
        include("*.jar")
        include("*.zip")
    })
}