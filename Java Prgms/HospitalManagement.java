class Patient {
    String name, disease;

    public Patient(String name, String disease) {
        this.name = name;
        this.disease = disease;
    }

    public void display() {
        System.out.println("Patient Name: " + name + ", Disease: " + disease);
    }
}

class Doctor {
    String name, specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void display() {
        System.out.println("Doctor Name: " + name + ", Specialization: " + specialization);
    }
}

class Appointment {
    Patient patient;
    Doctor doctor;

    public Appointment(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    public void display() {
        System.out.println("Appointment: Patient - " + patient.name + ", Doctor - " + doctor.name);
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Patient patient = new Patient("Alice", "Flu");
        Doctor doctor = new Doctor("Dr. Bob", "General Physician");
        Appointment appointment = new Appointment(patient, doctor);

        patient.display();
        doctor.display();
        appointment.display();
    }
}
