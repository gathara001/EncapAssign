public class Hospital {
    private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    private Patient patient;

    public void displayDoctorDetails(){
        if(doctor != null) {
            System.out.println("Doctor Details: ");
            doctor.displayDetails();
        }else{
            System.out.println("No Doctor assigned to the hospital. ");
        }
    }
    public void displayPatientDetails(){
        if(patient != null) {
            System.out.println("Patient Details: ");
            doctor.displayDetails();
        }else{
            System.out.println("No Patient assigned to the hospital. ");
        }
    }

}
