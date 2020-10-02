package kyh.labs.lab3;

import java.io.Serializable;

public class Patient {

         String name;
         String sickness;

     Patient(String inName, String disease) {
          name = inName;
         sickness  = disease;
    }

    protected Patient(String inName) {
            name = inName;
    }
    protected boolean isSick() {
        return sickness != null;
    }
    protected String getSickness() {
        return sickness;
    }
     void takeMedication(Medicine medicine) {

        if(medicine.getTreatmentName().equals(this.sickness)) {
             sickness = null;
         }
    }
    protected String getName() {
        return name;
    }
}


