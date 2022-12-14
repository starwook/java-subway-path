package subway.domain;

import java.util.List;

public class LineInformation {
    private String lineName;
    private String startStation;
    private String endStation;
    private LineType lineType;
    private int value;
    public LineInformation(List<String> information){
        this.lineName = information.get(3);
        this.startStation = information.get(0);
        this.endStation = information.get(1);
        if(information.get(4)=="시간"){
            this.lineType = LineType.TIME;
        }
        if(information.get(4)=="거리"){
            this.lineType = LineType.DISTANCE;
        }
       this.value = Integer.parseInt(information.get(2));
    }
}
