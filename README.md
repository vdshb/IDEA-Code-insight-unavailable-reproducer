Reproduce:

- put path to android SDK into `local.properties`
- open project with IntelliJ IDEA (2023.3.1 IC in my case)
- open `build.gradle.kts`
- See IDEA error: `Code insight unavailable (Script Configuratons not loaded).` and all-red script.

If no errors:
- run `Reload All Gradle Projects` command 
- put cursor into `build.gradle.kts` file edit window (change focus)

Errors are gone if:

- remove `gradle/verification-metadata.xml`
- OR remove android KMP-target in `build.gradle.kts`

and run `Reload All Gradle Projects` command 
