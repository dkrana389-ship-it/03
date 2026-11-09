# Call History App v3 + Start.io Banner Ads

This project builds the Flutter-based Call History Android app through GitHub Actions.

## Start.io integration
- Start.io Android SDK dependency: `com.startapp:inapp-sdk:5.4.0`
- Start.io App ID configured in `app_src/android/kotlin/StartIoAds.kt`: `210504322`
- Banner placement: inside the post-call report popup, replacing the old `Ad space` placeholder
- The banner is requested when the call report popup is shown. If an ad is unavailable or SDK initialization fails, the call report popup should still be shown.

## Build
Upload the complete ZIP contents to the GitHub repository (overwrite existing files), then run the Build APK workflow.

Note: SDK integration does not guarantee an ad fill. The Start.io dashboard must have the app correctly registered and active, and the device needs internet access. Do not click your own live ads.
