package dev.tomco.featuretogglelib;

import java.util.List;

public interface Callback_Features {
    void ready(List<Feature> featureList);
    void failed(String message);
}
