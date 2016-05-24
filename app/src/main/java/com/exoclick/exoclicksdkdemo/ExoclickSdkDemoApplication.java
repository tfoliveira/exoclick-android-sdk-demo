package com.exoclick.exoclicksdkdemo;

import android.app.Application;

import com.exoclick.sdk.ExoclickSDK;

/**
 * Created by kristijan on 23/05/2016.
 */
public class ExoclickSdkDemoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ExoclickSDK.init(getApplicationContext());
    }
}
