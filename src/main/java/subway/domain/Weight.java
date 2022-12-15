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
        initiateEdges(lineInformations);
        dijkstraShortestPath = new DijkstraShortestPath(machine);
    }

    private void initiateEdges(List<LineInformation> lineInformations) {
        for(int i = 0; i< lineInformations.size(); i++){
            addEdgeValue(lineInformations.get(i).getStartStation(),
                    lineInformations.get(i).getEndStation(),
                    lineInformations.get(i).getValue());
        }
    }

    public List<String> getShortestPath(String start,String end){
        return dijkstraShortestPath.getPath(start,end).getVertexList();
    }



}
