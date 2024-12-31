package dev.tomco.a25a_10221_featuretoggledemoapp;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

import dev.tomco.featuretogglelib.Callback_Features;
import dev.tomco.featuretogglelib.Feature;
import dev.tomco.featuretogglelib.FeatureController;
import dev.tomco.featuretogglelib.FeatureToggle;
import dev.tomco.a25a_10221_featuretoggledemoapp.ImageLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatImageView main_IMG_background = findViewById(R.id.main_IMG_background);
        FeatureToggle.getActiveFeatures(
                this,
                new FeatureToggle.Callback_Data<List<Feature>>() {

                    @Override
                    public void data(List<Feature> value) {
                        for (Feature f : value) {
                            Log.d("Feature:", "" + f);
                            switch (f.get_id()) {
                                case "cf7a3d8b-9b80-464e-a572-99dd65b37658":
                                    ImageLoader
                                            .getInstance()
                                            .load("https://img.pikbest.com/templates/20240624/happy-new-year-2025-on-sparkling-red-background-template_10634171.jpg!bwr800"
                                                    , main_IMG_background);
                                    break;
                                case "ade65e03-564d-4009-9fb1-ad4b8e1dc569":
                                    ImageLoader
                                            .getInstance()
                                            .load("https://media.istockphoto.com/id/2164135217/photo/traditional-food-and-menorah-for-hanukkah.jpg?s=2048x2048&w=is&k=20&c=urcuaVwFtlGnKdRSOsKcjneT4Nw6BT3IllEAUoLoPKk="
                                                    , main_IMG_background);
                                    break;
                                default:
                                    ImageLoader
                                            .getInstance()
                                            .load("http://t1.gstatic.com/licensed-image?q=tbn:ANd9GcS_DTN0_38JsNELiI-97SZ0bjNdx5Ulllg-yVQRpmTvHNlvp5i-PP47xZdFT7zQgkKrPlm8KKD73UNFuEMnl0I"
                                                    , main_IMG_background);
                            }
                        }
                    }
                }
        );
    }
}