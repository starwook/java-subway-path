package subway.domain;

import java.util.Arrays;
import java.util.List;

public class SubwayMachine {
    private static List<String> STATION_INIT = Arrays.asList("교대역","강남역",
            "역삼역","남부터미널역","양재역","양재시민의숲역","매봉역");
    private static List<String> LINE_INIT=Arrays.asList("2호선","3호선","신분당선");
    public void init(){
        initialStationRepository();
        initialLineRepository();
    }

    }
}
