package dev.tomco.featuretogglelib;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FeatureController {
    private static final String BASE_URL = "https://25-a-10221-feature-toggle-flask-api.vercel.app/";

    private FeatureAPI getAPI() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(
                        GsonConverterFactory.create(
                            new GsonBuilder()
                                .setLenient()
                                .create()
                        )
                )
                .build();

        return retrofit.create(FeatureAPI.class);
    }

    public void fetchAllActiveFeatures(String package_name, Callback_Features callbackFeatures) {
        Call<List<Feature>> call = getAPI().loadActiveFeatures(package_name);
        call.enqueue(new Callback<>() {
            @Override
            public void onResponse(Call<List<Feature>> call, Response<List<Feature>> response) {
                callbackFeatures.ready(response.body());
            }

            @Override
            public void onFailure(Call<List<Feature>> call, Throwable throwable) {
                callbackFeatures.failed(throwable.getMessage());
            }
        });
    }
}
