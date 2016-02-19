package com.example.grishma.fragmenttest;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by grishma on 2/19/16.
 */
public class FragmentTest extends Application {

    @Override public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
