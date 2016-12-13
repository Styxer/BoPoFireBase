package com.example.ofir.bopo;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by ofir on 12/13/2016.
 */
public class BoPo extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
