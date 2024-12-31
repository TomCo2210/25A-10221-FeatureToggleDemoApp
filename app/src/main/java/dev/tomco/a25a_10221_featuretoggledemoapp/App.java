package dev.tomco.a25a_10221_featuretoggledemoapp;

import android.app.Application;
import dev.tomco.a25a_10221_featuretoggledemoapp.ImageLoader;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoader.init(this);
    }
}
