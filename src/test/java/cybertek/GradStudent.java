package cybertek;

import java.time.LocalDate;

public class GradStudent extends Student {

    private boolean isGrad;

    public GradStudent(String name, char gender, int age, LocalDate dOb, String schoolName, int id, boolean isGrad) {
        super(name, gender, age, dOb, schoolName, id);
        this.isGrad = isGrad;
    }

    public void setGrad(boolean grad) {
        isGrad = grad;
    }

}
