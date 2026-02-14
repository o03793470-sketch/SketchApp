# SketchApp APK Build

This directory contains the compiled APK files for SketchApp.

## Contents
- `SketchApp-debug.apk` - Debug version for testing
- `SketchApp-release.apk` - Release version for distribution

## Installation

To install the APK on your Android device:

1. Enable "Unknown Sources" in Settings > Security
2. Transfer the APK file to your device
3. Open the file and tap "Install"
4. Once installed, you can open SketchApp from your app drawer

## Building from Source

To build the APK yourself:

```bash
./gradlew build
```

The compiled APK will be available in `app/build/outputs/apk/`