package br.com.superrevendedores.android.raphael.desafio;

import android.app.Application;
import android.content.Intent;


public class App extends Application {

    private static AppComponent appComponent;

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = initDagger();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        appComponent = null;
    }

    private AppComponent initDagger() {
        return DaggerAppComponent.builder()
                .application(this)
                .build();
    }
}
