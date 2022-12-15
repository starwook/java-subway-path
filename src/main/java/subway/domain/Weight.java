package subway.domain;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.WeightedMultigraph;

public class Weight {
    private WeightedMultigraph<String, DefaultWeightedEdge> machine=
            new WeightedMultigraph<>(DefaultWeightedEdge.class);


}
