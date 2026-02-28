#!/usr/bin/env sh

# Gradle wrapper script that executes Gradle using the configuration in gradle/wrapper/gradle-wrapper.properties

# Use the current directory to run the gradle command.
GRADLE_WRAPPER_DIR="${0%/*}"

# Check if we are in the right directory
if [ -z "$GRADLE_WRAPPER_DIR" ]; then
    echo "No gradle wrapper directory specified"
    exit 1
fi

# Execute the gradle command
java -jar "$GRADLE_WRAPPER_DIR/gradle/wrapper/gradle-wrapper.jar" "",