package kyh.labs.lab3;

public class Patient {

         String name;
         String Doctor;
         String initaitePatients;
         String testPatients;
         String patient;
         String result;
         String disease;
         String fetchCorrectMedication;
         String treatPatient;
         String getTreatmentName;
         String testAllPatients;



    public Patient(String inName, String disease) {
          name = inName;
         testPatients  = disease;
    }

    public Patient(String inName) {

    }


    public boolean isSick() {
        if(testPatients ==null )
            return false;
        else
            return true;


    }

    public String getSickness() {
if (treatPatient == null)
    return testPatients;
else
   return treatPatient;


    }
    public String takeMedication(Medicine medicine) {
         if(medicine.getTreatmentName().equals(this.disease)){
             this.disease= null;
         }
        String result = medicine.toString();
        return result;

    }
    public String getName() {

        return name;
    }

}


