package subway.domain;

import java.util.ArrayList;
import java.util.List;

public class LineInformationRepository {
    private static final List<LineInformation> lineInformations= new ArrayList<>();
    public static void addLineInformation(LineInformation lineInformation){
        lineInformations.add(lineInformation);
    }
}
