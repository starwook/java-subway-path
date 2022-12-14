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
    private List<LineInformation> lineInformations = new ArrayList<>();

    public void addLineInforMation(LineInformation lineInformation){
        this.lineInformations.add(lineInformation);
    }
    public void addEdgeDistance(String start,String end,int distance){
        distanceGraph.addVertex(start);
        distanceGraph.addVertex(end);
        distanceGraph.setEdgeWeight(distanceGraph.addEdge(start,end),distance);
    }
    public void addEdgeTime(String start,String end,int time){
        timeGraph.addVertex(start);
        timeGraph.addVertex(end);
        timeGraph.setEdgeWeight(timeGraph.addEdge(start,end),time);
    }
    public void validateGraph(
                              List<List<String>> timeBetweenStations,
                              List<List<String>> distanceBetweenStations,
                              int lineLength){
        initialEdgeWeight(timeBetweenStations, distanceBetweenStations, lineLength);
    }
    private void initialEdgeWeight(List<List<String>> timeBetweenStations, List<List<String>> distanceBetweenStations, int lineLength) {
        for(int i = 0; i< lineLength; i++){
            addEdgeDistance(distanceBetweenStations.get(i).get(0),
                    distanceBetweenStations.get(i).get(1),
                    Integer.parseInt(distanceBetweenStations.get(i).get(2)));
            addEdgeTime(timeBetweenStations.get(i).get(0),
                    timeBetweenStations.get(i).get(1),
                    Integer.parseInt(timeBetweenStations.get(i).get(2)));
        }
    }

}
