# ExoClick Android SDK

Supports in-app banner advertising features with just a few lines of code.

[![Latest version](https://img.shields.io/badge/Latest%20version-v0.0.1-blue.svg)](https://bintray.com/exads/maven/exoclick-sdk-legacy/)


### Features
 * Banners

### Planned Features (Coming Soon)
 * Interstitials
 * Video
 * Icon Ad
 * Push Notifications

### Requirements

* API >= 11
* Gradle

### Install

Add the ``jcenter()`` or ``mavenCentral()`` to your root level ``build.gradle`` repositories.

Add the following line to the root build.gradle (below jcenter() or mavenCentral() initialization)
```
maven {
    url "https://dl.bintray.com/exads/maven/"
}
```
Should look like the following
```
allprojects {
    repositories {
        jcenter()
        maven {
            url "https://dl.bintray.com/exads/maven/"
        }
    }
}
```
Download the latest library via Maven

```
<dependency>
  <groupId>com.exads.sdk-legacy</groupId>
  <artifactId>exoclick-sdk-legacy</artifactId>
  <version>0.0.1</version>
</dependency>
```

or Gradle

```
compile 'com.exads.sdk-legacy:exoclick-sdk-legacy:0.0.1'
```

### Initializing ExoclickSDK
Initialize ExoclickSDK inside your Application class
```
public class <your-app-name>Application extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ExoclickSDK.init(getApplicationContext());
    }
}
```
#### Set up AndroidManifest.xml
```
<uses-permission android:name="android.permission.INTERNET" />
```
Add ``android:name=".<your-app-name>Application"`` inside &lt;application&gt; ... &lt;/application&gt; tags

#### Enable Banners
Add ``ExoclickBannerWebView`` to your layout and configure the size and position of the ExoclickBannerWebView

```
<com.exoclick.sdk.view.ExoclickBannerWebView
  android:id="@+id/exoclickBannerWebView"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  android:layout_alignParentBottom="true" />
```

Class member variables inside your activity or fragment that contains the ExoclickBannerWebView:
```
private ExoclickBannerWebView mExoclickBannerWebview;
```
onCreate
```
mExoclickBannerWebview = (ExoclickBannerWebView) findViewById(R.id.exoclickBannerWebView);
```
onResume
```
 //mExoclickBannerWebview.init(this, "adIdzone", "adWidth", "adHeight").isClosable(true);
 mExoclickBannerWebview.init(this, "399968", "300", "250").isClosable(true);
```
