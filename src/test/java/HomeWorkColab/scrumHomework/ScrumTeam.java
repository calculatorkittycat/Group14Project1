package HomeWorkColab.scrumHomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ScrumTeam {

    public String PO,BA,SM;
    ArrayList<Tester> testersList = new ArrayList<>();
    ArrayList<Tester> devopsList = new ArrayList<>();
    public int daysOfSprint;

    public void setInfo(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTesters(Tester tester) {
        testersList.add(tester);

    }






}

