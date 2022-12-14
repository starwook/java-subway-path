package subway.domain;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.WeightedMultigraph;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private String name;

    public Line(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현
    private WeightedMultigraph<String, DefaultWeightedEdge> timeGraph =
            new WeightedMultigraph<>(DefaultWeightedEdge.class);
    private WeightedMultigraph<String, DefaultWeightedEdge> distanceGraph =
            new WeightedMultigraph<>(DefaultWeightedEdge.class);

    public void addStationToGraph(String station){
        timeGraph.addVertex(station);
        distanceGraph.addVertex(station);
    }
    public void addEdgeDistance(String start,String end,int distance){
        distanceGraph.setEdgeWeight(distanceGraph.addEdge(start,end),distance);
    }
    public void addEdgeTime(String start,String end,int time){
        timeGraph.setEdgeWeight(timeGraph.addEdge(start,end),time);
    }

}
