package subway.domain;

import java.util.Arrays;
import java.util.List;

public class SubwayMachine {
    private static List<String> STATION_INIT = Arrays.asList("교대역","강남역",
            "역삼역","남부터미널역","양재역","양재시민의숲역","매봉역");
    private static List<String> LINE_INIT=Arrays.asList("2호선","3호선","신분당선");
    List<String> twoTime1 = Arrays.asList("교대역","강남역","3");
    List<String> twoTime2 =Arrays.asList("강남역","역삼역","3");
    List<String> twoDistance1 = Arrays.asList("교대역","강남역","2");
    List<String> twoDistance2 = Arrays.asList("강남역","역삼역","2");
    List<String> threeTime1 = Arrays.asList("교대역","남부터미널역","2");
    List<String> threeTime2 = Arrays.asList("남부터미널역","양재역","5");
    List<String> threeTime3 =Arrays.asList("양재역","매봉역","1");
    List<String> threeDistance1 = Arrays.asList("교대역","남부터미널역","3");
    List<String> threeDistance2 = Arrays.asList("남부터미널역","양재역","6");
    List<String> threeDistance3 = Arrays.asList("양재역","매봉역","1");
    List<String> bdTime1 = Arrays.asList("강남역","양재역","8");
    List<String> bdTime2 = Arrays.asList("양재역","양재시민의숲역","3");
    List<String> bdDistance1 = Arrays.asList("강남역","양재역","2");
    List<String> bdDistance2 = Arrays.asList("양재역","양재시민의숲역","10");
    public void init(){
        initialStationRepository();
        initialLineRepository();
    }
    private void initialLineRepository() {
        for(int i=0;i<LINE_INIT.size();i++) {
            Line line = new Line(LINE_INIT.get(i));
            LineRepository.addLine(line);
        }
    }
    private void initialStationRepository() {
        for(int i=0;i<STATION_INIT.size();i++){
            Station station = new Station(STATION_INIT.get(i));
            StationRepository.addStation(station);
        }
    }

}
