/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmcysystem;

import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class PharmcySystem {

    static Scanner input;
    SinglyLinkedList<patient> patients = new SinglyLinkedList<patient>();

    public PharmcySystem() throws Exception {

        input = new Scanner(Paths.get("Patient.txt"));
        while (input.hasNextLine()) {

            patients.addLast(new patient(input.nextInt(), input.nextInt(), input.next()));
        }

    }

    public patient Search_Patient(int id) {
        patients.moveToStart();
        for (int i = 0; i < patients.size(); i++) {
            if (((patient) patients.getValue()).getId() == id) {
                return patients.getValue();
            } else {
                patients.next();
            }
        }

        return null;
    }

     public   void PrintPatients() {
        patients.moveToStart();
        for (int i = 0; i < patients.size(); i++) {
            System.out.println(( patients.getValue()));
            patients.next();
        }
    }

     
    public static void main(String[] args) throws Exception {

        PharmcySystem myPharmcy = new PharmcySystem();

        LinkedQueue waiting = new LinkedQueue();
        int choice, amount;
        input = new Scanner(System.in);
        String name, dose, directions;

        do {

            System.out.println("***Welcome to hospital Information Syatem ***");
            System.out.println("1-New patient");
            System.out.println("2-displey patients");
            System.out.println("3-pharmacy System");
            System.out.println("4-Exit");
            System.out.println("Enter your choice :");
            choice = input.nextInt();
            switch (choice) {

                case 1://Doctor
                    System.out.println("Please enter the patient Id ");
                    int id = input.nextInt();
                    patient p = myPharmcy.Search_Patient(id);
                    if (p == null) {
                        System.out.print("invalid Id");
                        break;
                    } else {
                        System.out.println("Please enter a medicine name ");
                        name = input.next();
                        System.out.println("Please enter a medicine dose");
                        dose = input.next();
                        System.out.println("Please enter a medicine amount ");
                        amount = input.nextInt();
                        System.out.println("Please enter a medicine directions");
                        directions = input.next();
                        Medication mdc = new Medication(name,dose , amount, directions);
                       
                        prescriptions presc = new prescriptions(id, mdc);

                        waiting.enqueue(presc);

                        System.out.println("prescriptions has been added successfully to the queue");

                    }

                    break;

                case 2:
myPharmcy.PrintPatients();
break;
                case 3:
                    System.out.printf("Hello,  there are %d unprepared prescriptions %n", waiting.size());
                    if (waiting.size() != 0) {
                        System.out.println("The first prescriptions is \n");
                        prescriptions pr = (prescriptions) waiting.first();

                        pr.print();

                        System.out.println("Once it is done please enter \"Done\" \n");
                        if (input.next().equalsIgnoreCase("Done")) {
                            waiting.dequeue();
                        }
                    }

                    break;
            }
        } while (choice != 4);

    }

}
