plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "tariffka-api"
include("application")
include("domain")
include("data")
include("presentation")