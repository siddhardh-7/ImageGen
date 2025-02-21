# Development Environment Setup

This document provides the required versions of tools, libraries, and dependencies used in the development of this Android application. Please ensure that your development environment is set up accordingly to ensure compatibility and smooth development.

## 1. Android Studio and Gradle Setup

- **Android Studio Version**: Android Studio Meerkat | 2024.3.1 RC 2
- **Gradle Version**: 8.11.1
- **Gradle Plugin Version** (`AGP`):  
  - **Version**: `8.9.0-rc02`  
  - The Android Gradle Plugin (AGP) version should match this in the `build.gradle` file to ensure compatibility with the latest features and optimizations.

## 2. Kotlin Version

- **Kotlin Version**: `2.1.0`  
  Ensure you’re using Kotlin version `2.1.0` for optimal compatibility with the other dependencies listed here. This version can be specified in your project’s `build.gradle` file.

## 3. Library Versions

Here are the versions for the libraries used in this project:

- **Coil (for Image Loading in Jetpack Compose)**:  
  - **Version**: `3.1.0`  
- **Gson Converter (Retrofit)**:  
  - **Version**: `2.5.0`  
- **Hilt for Dependency Injection**:  
  - **Version**: `2.51.1`  
- **Hilt Navigation for Jetpack Compose**:  
  - **Version**: `1.2.0`  
- **Core KTX (Extensions for Android)**:  
  - **Version**: `1.10.1`  
- **JUnit (Unit Testing)**:  
  - **Version**: `4.13.2`  
- **JUnit (Android Testing)**:  
  - **Version**: `1.1.5`  
- **Espresso (UI Testing)**:  
  - **Version**: `3.5.1`  
- **Lifecycle Runtime for KTX**:  
  - **Version**: `2.6.1`  
- **Activity Compose**:  
  - **Version**: `1.8.0`  
- **Compose BOM (Bill of Materials)**:  
  - **Version**: `2024.09.00`  
  - This ensures that all Jetpack Compose dependencies are compatible with each other.
- **Lifecycle ViewModel Compose**:  
  - **Version**: `2.8.7`  
- **Navigation Compose**:  
  - **Version**: `2.8.7`  
- **Retrofit (for Networking)**:  
  - **Version**: `2.11.0`  
- **Room Database**:  
  - **Room Compiler Version**: `2.6.1`  
  - **Room KTX Version**: `2.6.1`  
  - **Room Runtime Version**: `2.6.1`  
  - These versions should be used for working with the Room database and its KTX extensions.

## 4. Java Version

- **Java Version**: Ensure you're using **OpenJDK 11** for this project. If you’re using a different Java version, some dependencies might not work as expected.

## 5. SDK Versions

- **Min SDK Version**: 26
- **Target SDK Version**: 35
- **Compile SDK Version**: 35

Make sure the `compileSdkVersion`, `minSdkVersion`, and `targetSdkVersion` match these values in the `build.gradle` file to avoid compatibility issues.

## 6. Build Tools and Android Tools Version

- **Android Build Tools Version**: `30.0.3`  
  This version is required to build the app successfully.
  
## 9. Version Control Configuration (Optional)

If your project uses Git submodules or Git-based dependencies, please make sure the following [Git](https://git-scm.com/) submodule versions are specified:

# Installation Instructions for Tools

If necessary, here are the tools required for setting up the development environment:

- **Install Android Studio**: Follow the [official instructions](https://developer.android.com/studio).
- **Install Java (OpenJDK 11)**: You can install OpenJDK 11 using package managers like Homebrew (macOS) or Chocolatey (Windows), or manually from [AdoptOpenJDK](https://adoptopenjdk.net/).


## App Screenshots

- Home Screen\
  <img src="https://github.com/user-attachments/assets/356245ed-a514-4008-b6ee-661fbcda5a2a" width="320">
- Generate Screen\
  <img src="https://github.com/user-attachments/assets/41cd5368-1604-4117-94a2-a3aac375fb92" width="320">
- History Screen\
  <img src="https://github.com/user-attachments/assets/8ca8ea43-5de2-46bb-99ed-317fa7ccb6ec" width="320">
