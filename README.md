# ExoClick Android SDK

Supports in-app banner advertising features with just a few lines of code.

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
 mExoclickBannerWebview.init(this, "399968", "300", "250").isClosable(true);
```

### Android Admin Panel app
Now you can access your ExoClick account from the palm of your hand with the Admin Panel App for Android. The free App allows ExoClick advertisers and publishers to access their accounts and view a selection of data from their smartphones and tablets. Just log in with your username and password and select either the Advertiser or Publisher options.

Get the Admin Panel app from the [Google Play Store](https://play.google.com/store/apps/details?id=com.exoclick.admin&hl=en).
