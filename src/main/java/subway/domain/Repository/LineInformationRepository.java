package subway.domain.Repository;

import subway.domain.LineInformation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LineInformationRepository {
    private static final List<LineInformation> lineInformations= new ArrayList<>();
    public static void addLineInformation(LineInformation lineInformation){
        lineInformations.add(lineInformation);
    }
    public static List<LineInformation> getLineInformations(){
        return Collections.unmodifiableList(lineInformations);
    }
}
