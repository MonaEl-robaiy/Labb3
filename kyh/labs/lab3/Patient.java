package kyh.labs.lab3;

public class Patient {

         String name;
         String sickness;

    public Patient(String inName, String disease) {
          name = inName;
         sickness  = disease;
    }

    public Patient(String inName) {
            name = inName;
    }

    public boolean isSick() {

        if(sickness == null) {
            return false;
        }else
         return true;

    }

    public String getSickness() {

        return sickness;
    }
    public String takeMedication(Medicine medicine) {

        if(medicine.getTreatmentName().equals(this.sickness)) {
             this.sickness = null;
         }

        String result = medicine.toString();
        return null;
    }

    public String getName() {
        return name;
    }

}


