package dev.tomco.a25a_10221_featuretoggledemoapp;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

import dev.tomco.featuretogglelib.Callback_Features;
import dev.tomco.featuretogglelib.Feature;
import dev.tomco.featuretogglelib.FeatureController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FeatureController featureController =  new FeatureController();
        featureController
                .fetchAllActiveFeatures(
                getPackageName(),
                new Callback_Features() {
                    @Override
                    public void ready(List<Feature> featureList) {
                        Log.d("Features:", "ready: " + featureList);
                    }

                    @Override
                    public void failed(String message) {
                        Log.d("ERROR", "failed: " + message);
                    }
                }
        );
    }
}