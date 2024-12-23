package dev.tomco.featuretogglelib;

import android.content.Context;
import android.util.Log;

import java.util.List;

public class FeatureToggle {

    private static final FeatureController featureController = new FeatureController();

    public interface CallBack<T> {
        void data(T value);
    }

    public static void getActiveFeatures(Context context, FeatureToggle.CallBack<List<Feature>> callBack) {
        if (callBack == null) {
            return;
        }

        featureController.fetchAllActiveFeatures(context.getPackageName(), new Callback_Features() {
            @Override
            public void ready(List<Feature> features) {
                if (callBack != null) {
                    callBack.data(features);
                }
            }

            @Override
            public void failed(String message) {
                Log.d("Error", "failed: " + message);
            }
        });
    }
}
