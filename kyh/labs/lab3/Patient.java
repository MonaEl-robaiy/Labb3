package kyh.labs.lab3;

import java.io.Serializable;

public class Patient {

         String name;
         String sickness;

    public Patient(String inName, String disease) {
          name = inName;
         sickness  = disease;
    }

    protected Patient(String inName) {
            name = inName;
    }

    protected boolean isSick() {

        if(sickness == null) {
            return false;
        }else
         return true;
    }

    protected String getSickness() {

        return sickness;
    }
    protected String takeMedication(Medicine medicine) {

        if(medicine.getTreatmentName().equals(this.sickness)) {
             this.sickness = null;
         }

        String result = medicine.toString();
        return null;
    }

    protected String getName() {
        return name;
    }

}


