package Feature;

import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
  Calls all known features and adds them as dense features in a feature vector.
 */
public class ImageFeatureExtractor implements Serializable {
    private static final ThreadLocal<ImageFeatureExtractor> EXTRACTOR =
            new ThreadLocal<ImageFeatureExtractor>() {
                @Override
                protected ImageFeatureExtractor initialValue() {
                    return new ImageFeatureExtractor();
                }
            };
    final List<ImageFeature> features;

    private ImageFeatureExtractor() {
        features = new ArrayList<ImageFeature>();
        features.add(new RGBFeature());
        features.add(new HOGFeature());
        features.add(new LBPFeature());
        features.add(new HSVFeature());
    }

    public static ImageFeatureExtractor getInstance() {
        return EXTRACTOR.get();
    }

    public FeatureVector getFeatureVector(BufferedImage image) {
        FeatureVector featureVector = new FeatureVector();
        Map<String, List<Double>> denseFeatures = new HashMap<>();
        featureVector.setDenseFeatures(denseFeatures);
        for (ImageFeature feature : features) {
            List<Float> values = feature.extractFeatureSPMK(image);
            List<Double> dblValues = new ArrayList<>();
            for (Float f : values) {
                dblValues.add(f.doubleValue());
            }
            denseFeatures.put(feature.featureName(), dblValues);
        }
        return featureVector;
    }
}
