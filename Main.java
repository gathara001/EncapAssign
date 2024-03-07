
public class Main {
    public static void main(String[] args) {

 Doctor doctor = new Doctor("Dr.Ngethe", 59, "Urologist");
 Patient patient = new Patient("Abdirahman Gurre", 45, "Prostate Cancer");

 Hospital hospital = new Hospital();
 hospital.setDoctor(doctor);
 hospital.setPatient(patient);

 hospital.displayDoctorDetails();
 hospital.displayPatientDetails();
    }
}