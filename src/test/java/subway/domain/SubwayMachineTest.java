package subway.domain;

import org.junit.jupiter.api.Test;
import subway.domain.Repository.LineInformationRepository;
import subway.domain.Repository.LineRepository;

import java.util.List;

class SubwayMachineTest {

    @Test
    void checkLineRepositoryTest(){
        SubwayMachine subwayMachine = new SubwayMachine();
        subwayMachine.init();
        List<LineInformation> lineInformations = LineInformationRepository.getLineInformations();
        for(int i=0;i<lineInformations.size();i++){
            System.out.print(lineInformations.get(i).getLineName()+"-");
            System.out.print(lineInformations.get(i).getStartStation()+"~");
            System.out.print(lineInformations.get(i).getEndStation()+"/");
            System.out.println(lineInformations.get(i).getValue()+":"+lineInformations.get(i).getLineType());

        }
    }
    @Test
    void checkLineInformationOfLines(){
        SubwayMachine subwayMachine = new SubwayMachine();
        subwayMachine.init();
        List<Line> lines = LineRepository.lines();
        for(int i=0;i<lines.size();i++){
            System.out.println(lines.get(i).getName());
            List<LineInformation> lineInformations = lines.get(i).getLineInformations();
            for(int j=0;j<lineInformations.size();j++){
                System.out.print(lineInformations.get(j).getStartStation()+"~");
                System.out.print(lineInformations.get(j).getEndStation()+"/");
                System.out.println(lineInformations.get(j).getValue()+":"+lineInformations.get(j).getLineType());
            }
            System.out.println("-------------------");
        }
    }

}