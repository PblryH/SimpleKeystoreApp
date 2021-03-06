package com.sample.foo.simplekeystoreapp;

import timber.log.Timber;

/**
 * Created by kamalovrail on 17.12.16.
 */

public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initTimber();
    }

    private void initTimber(){
        Timber.plant(new Timber.DebugTree(){
            @Override
            protected String createStackElementTag(StackTraceElement element) {
                return super.createStackElementTag(element) + "/APP";
            }
        });
    }
}
