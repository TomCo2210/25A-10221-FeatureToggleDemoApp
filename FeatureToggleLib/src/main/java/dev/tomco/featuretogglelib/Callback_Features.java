package dev.tomco.featuretogglelib;

import java.util.List;

public interface Callback_Features {
    void ready(List<Feature> features);

    void failed(String message);
}
