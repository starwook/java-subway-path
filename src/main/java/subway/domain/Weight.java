package subway.domain;

import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.WeightedMultigraph;

import java.util.List;

public class Weight {
    private WeightedMultigraph<String, DefaultWeightedEdge> machine=
            new WeightedMultigraph<>(DefaultWeightedEdge.class);
    private DijkstraShortestPath dijkstraShortestPath;
    public void addEdgeValue(String start, String end, int value){
        machine.addVertex(start);
        machine.addVertex(end);
        machine.setEdgeWeight(machine.addEdge(start,end),value);
    }
    public Weight(List<LineInformation> lineInformations){

        dijkstraShortestPath = new DijkstraShortestPath(machine);
    }

    public List<String> getShortestPath(String start,String end){
        return dijkstraShortestPath.getPath(start,end).getVertexList();
    }



}
