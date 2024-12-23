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
import dev.tomco.featuretogglelib.FeatureToggle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FeatureToggle.getActiveFeatures(
                this,
                new FeatureToggle.Callback_Data<List<Feature>>() {

                    @Override
                    public void data(List<Feature> value) {
                        for (Feature f : value)
                            Log.d("Feature:", "" + f);
                    }
                }
        );
    }
}