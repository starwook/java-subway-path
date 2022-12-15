package subway.Repository;

import subway.domain.Weight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeightRepository {
    private static final List<Weight> weights = new ArrayList<>();
    public static void addWeight(Weight weight){
        weights.add(weight);
    }
    public static List<Weight> getWeights(){
        return Collections.unmodifiableList(weights);
    }
}
