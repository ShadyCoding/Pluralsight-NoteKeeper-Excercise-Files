To setup an emulator with accessibility support you need to create an emulator image that includes d-pad support and install TalkBack onto it.

To create an emulator with d-pad support
- Open the Android Virtual Device Manager
- Click "Create Virtual Device..."
- Highlight the name of the device you'd like to use (something like "Pixel")
- Click "Clone Device..."
- In the "input" section of the configuration dialog, select "D-pad" as the "Navigation Style"
- Click Finish
- This will create a new hardware profile that includes D-pad support, you can then create a new emulator image as your normally do from this hardware profie.

TalkBack
- Download the latest (non-beta) TalkBack image from http://www.apkmirror.com/apk/google-inc/talkback
- Once downloaded, do the following
-- Be sure that your emulator image is up and running
-- Verify that you have the android "platform-tools" folder in your path
-- Run the command: adb install <path to the downloaded apk file>

A step-by-step video of the D-pad setup and TalkBack install process is available here:
  Course: Android Fundementals: Accessibility
  Module #3: Making Your App Accessible
  Clip #3: Emulator Setup with D-pad and TalkBack Support
  Clip URL: https://app.pluralsight.com/player?course=android-fundamentals-accessibility&author=jim-wilson&name=android-fundamentals-accessibility-m2&clip=2