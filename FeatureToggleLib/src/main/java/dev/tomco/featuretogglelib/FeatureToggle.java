package dev.tomco.featuretogglelib;

import android.content.Context;
import android.util.Log;

import java.util.List;

public class FeatureToggle {

    public static final int ERROR = -1;
    public static final int OFF = 0;
    public static final int ON = 1;

    public interface CallBack<T> {
        void data(T value);
    }

    public static void getActiveFeatures(Context context, CallBack<List<Feature>> callBack) {
        if (callBack == null) {
            return;
        }

        FeatureController featureController = new FeatureController();
        featureController.fetchAllActiveFeatures(context.getPackageName(), new Callback_Features() {
            @Override
            public void ready(List<Feature> features) {
                if (callBack != null) {
                    callBack.data(features);
                }
                Log.d("", "Feature: " + features.size());
            }

            @Override
            public void failed(String message) {
                Log.d("", "failed: " + message);
            }
        });
    }
}
