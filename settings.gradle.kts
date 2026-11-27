pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

plugins {
    id("gg.ginco.hygradle.settings") version "0.3.1"
}

rootProject.name = "hytale-thankmas-2026-plugins"
include(
    ":plugins:hytale-x-tiltify",
    ":plugins:thankmas-vault",
    "plugins:thankmas-delivery",
    "plugins:PlushieHunt",
    ":plugins:thankmas-quests"
)
