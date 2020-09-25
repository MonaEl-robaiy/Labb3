package kyh.labs.lab3;

public class Patient {

         String name;
         String Sickness;

    public Patient(String inName, String disease) {
          name = inName;
         Sickness  = disease;
    }

    public Patient(String inName) {
            name = inName;
    }

    public boolean isSick() {
        if(Sickness ==null ) {
            return false;
        }else
            return true;
    }

    public String getSickness() {

        return Sickness;
    }
    public String takeMedication(Medicine medicine) {

        if(medicine.getTreatmentName().equals(this.Sickness)) {
             this.Sickness = null;
         }

        String result = medicine.toString();
        return result;
    }

    public String getName() {
        return name;
    }

}


