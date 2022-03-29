package javaclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PatientElements {
    public static class Patients {
        public static void main(String args[]) {
            Patient[] mainPatient = new Patient[6];

            mainPatient[0] = new Patient(10253664, "Eva", "Martirosyan", "Garniki", "Goris",
                    "+37499662255", 784, "Covid");
            mainPatient[1] = new Patient(21253654, "Anna", "Saroyan", "Garniki", "Goris",
                    "+37499251545", 714, "Covid");
            mainPatient[2] = new Patient(10253664, "Ashot", "Khazaryan", "Garniki", "Goris",
                    "+37499157896", 804, "Grip");
            mainPatient[3] = new Patient(10258896, "Mark", "Amaryan", "Garniki", "Goris",
                    "+37499889966", 775, "Covid");
            mainPatient[4] = new Patient(55228899, "Ani", "Sahakyan", "Garniki", "Goris",
                    "+37498412563", 754, "Omikron");
            mainPatient[5] = new Patient(15523696, "Ara", "Martirosyan", "Garniki", "Goris",
                    "+3749922132", 694, "Covid");
            String diagnostic = "Covid";
            int min = 750;
            int max = 800;
            // a list of patients with this diagnosis
            System.out.println("\nList of patients with Covid diagnos.");
            printPatients(patientOfSomeDicnosis(mainPatient, diagnostic));
            //list of patients whose medical record number is in the given interval.
            System.out.println("\nList of patients whose medical record number is in the 750 to 800 interval.");
            printPatients(patientsCardNumber(mainPatient, min, max ));

        }
    }
    private static List<Patient>  patientOfSomeDicnosis(Patient[] patients, String diagnostic){
        List<Patient> filteredPatients = new ArrayList<>();
        for (int i = 0; i < patients.length; i++) {
            if (Objects.equals(patients[i].getDiacnosis(), diagnostic)) {
               filteredPatients.add(patients[i]);
            }
        }
        return filteredPatients;
    }
    private static List<Patient> patientsCardNumber(Patient[] patients, int min, int max){
        List<Patient> filteredPatients = new ArrayList<>();
        for(int i = 0; i < patients.length; i++){
            if (patients[i].getNumber() > min && patients[i].getNumber() <max){
                filteredPatients.add(patients[i]);
            }
        }
        return filteredPatients;
    }
    private static void printPatients(List<Patient> patients) {
        for (int i = 0; i < patients.size(); i++)
            System.out.println("Full name: " + patients.get(i).getName() + " " + patients.get(i).getSurname() +
                    ", diacnos: " + patients.get(i).getDiacnosis() + ", card number: " + patients.get(i).getNumber());
    }
}