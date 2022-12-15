package subway.machine;

import subway.Repository.LineInformationRepository;
import subway.Repository.LineRepository;
import subway.Repository.StationRepository;
import subway.domain.Line;
import subway.domain.LineInformation;
import subway.domain.Station;
import subway.domain.Weight;

import java.util.Arrays;
import java.util.List;

public class SubwayMachine {
    private static List<String> STATION_INIT = Arrays.asList("교대역","강남역",
            "역삼역","남부터미널역","양재역","양재시민의숲역","매봉역");
    private static List<String> LINE_INIT=Arrays.asList("2호선","3호선","신분당선");
    List<String> twoTime1 = Arrays.asList("교대역","강남역","3","2호선","시간");
    List<String> twoTime2 =Arrays.asList("강남역","역삼역","3","2호선","시간");
    List<String> twoDistance1 = Arrays.asList("교대역","강남역","2","2호선","거리");
    List<String> twoDistance2 = Arrays.asList("강남역","역삼역","2","2호선","거리");
    List<String> threeTime1 = Arrays.asList("교대역","남부터미널역","2","3호선","시간");
    List<String> threeTime2 = Arrays.asList("남부터미널역","양재역","5","3호선","시간");
    List<String> threeTime3 =Arrays.asList("양재역","매봉역","1","3호선","시간");
    List<String> threeDistance1 = Arrays.asList("교대역","남부터미널역","3","3호선","거리");
    List<String> threeDistance2 = Arrays.asList("남부터미널역","양재역","6","3호선","거리");
    List<String> threeDistance3 = Arrays.asList("양재역","매봉역","1","3호선","거리");
    List<String> bdTime1 = Arrays.asList("강남역","양재역","8","신분당선","시간");
    List<String> bdTime2 = Arrays.asList("양재역","양재시민의숲역","3","신분당선","시간");
    List<String> bdDistance1 = Arrays.asList("강남역","양재역","2","신분당선","거리");
    List<String> bdDistance2 = Arrays.asList("양재역","양재시민의숲역","10","신분당선","거리");
    List<List<String>> allLineInformation = Arrays.asList(twoTime1,twoTime2,twoDistance1,twoDistance2,
            threeTime1,threeTime2,threeTime3,threeDistance1,threeDistance2,threeDistance3,
            bdTime1,bdTime2,bdDistance1,bdDistance2);
    public void init(){
        initialLineInformationRepository();
        initialStationRepository();
        initialLineRepository();
    }

    private void initialLineInformationRepository() {
        for(int i=0;i<allLineInformation.size();i++){
            LineInformation lineInformation = new LineInformation(allLineInformation.get(i));
            LineInformationRepository.addLineInformation(lineInformation);
        }
    }

    private void initialLineRepository() {
        List<LineInformation> lineInformations = LineInformationRepository.getLineInformations();
        for(int i=0;i<LINE_INIT.size();i++){
            Line line = new Line(LINE_INIT.get(i));
            addLineInformationToLine(lineInformations, line);
            LineRepository.addLine(line);
        }
    }

    private void addLineInformationToLine(List<LineInformation> lineInformations, Line line) {
        for(int j = 0; j< lineInformations.size(); j++){
            if(lineInformations.get(j).getLineName().equals(line.getName())){
                line.addLineInforMation(lineInformations.get(j));
            }
        }
    }

    private void initialStationRepository() {
        for(int i=0;i<STATION_INIT.size();i++){
            Station station = new Station(STATION_INIT.get(i));
            StationRepository.addStation(station);
        }
    }

}
