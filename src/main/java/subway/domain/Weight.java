package subway.domain;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.WeightedMultigraph;

public class Weight {
    private WeightedMultigraph<String, DefaultWeightedEdge> machine=
            new WeightedMultigraph<>(DefaultWeightedEdge.class);

    public void addEdgeValue(String start, String end, int value){
        machine.addVertex(start);
        machine.addVertex(end);
        machine.setEdgeWeight(machine.addEdge(start,end),value);
    }


}
