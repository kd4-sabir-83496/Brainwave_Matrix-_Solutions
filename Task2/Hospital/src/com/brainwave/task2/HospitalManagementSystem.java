package com.brainwave.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.brainwave.task2.Entity.Appointment;
import com.brainwave.task2.Entity.Invoice;
import com.brainwave.task2.Entity.MedicalSupply;
import com.brainwave.task2.Entity.Patient;
import com.brainwave.task2.Entity.Staff;

public class HospitalManagementSystem {

		 static List<Patient> patients = new ArrayList<>();
		    static List<Appointment> appointments = new ArrayList<>();
		    static List<MedicalSupply> supplies = new ArrayList<>();
		    static List<Staff> staffList = new ArrayList<>();
		    static List<Invoice> invoices = new ArrayList<>();

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int choice;

		        do {
		            System.out.println("\nHospital Management System");
		            System.out.println("0. Exit");
		            System.out.println("1. Register Patient");
		            System.out.println("2. Schedule Appointment");
		            System.out.println("3. Record Invoice");
		            System.out.println("4. Manage Inventory");
		            System.out.println("5. Manage Staff");
		            System.out.println("6. Display Records");
		            System.out.print("Enter your choice: ");
		            choice = scanner.nextInt();

		            switch (choice) {
		            		case 0:
		            	 System.out.println("Exiting system.");
		                    break;
		    
		            	case 1:
		                {
		                    System.out.print("Enter Patient ID: ");
		                    int id = scanner.nextInt();
		                    scanner.nextLine();
		                    System.out.print("Enter Patient Name: ");
		                    String name = scanner.nextLine();
		                    System.out.print("Enter Contact Info: ");
		                    String contact = scanner.nextLine();
		                    System.out.print("Enter Diagnosis: ");
		                    String diagnosis = scanner.nextLine();
		                    patients.add(new Patient(id, name, contact, diagnosis));
		                    System.out.println("Patient registered successfully.");
		                }
		                    break;
		                case 2:
		                {
		    		        System.out.print("Enter Appointment ID: ");
		    		        int id = scanner.nextInt();
		    		        System.out.print("Enter Patient ID: ");
		    		        int pid = scanner.nextInt();
		    		        System.out.print("Enter Doctor ID: ");
		    		        int did = scanner.nextInt();
		    		        scanner.nextLine();
		    		        System.out.print("Enter Date (YYYY-MM-DD): ");
		    		        String date = scanner.nextLine();

		    		        appointments.add(new Appointment(id, pid, did, date));
		    		        System.out.println("Appointment scheduled.");
		    		    }
		                    break;
		                    
		                case 3:
		                {
		    		        System.out.print("Enter Invoice ID: ");
		    		        int id = scanner.nextInt();
		    		        System.out.print("Enter Patient ID: ");
		    		        int pid = scanner.nextInt();
		    		        System.out.print("Enter Amount: ");
		    		        double amount = scanner.nextDouble();

		    		        invoices.add(new Invoice(id, pid, amount));
		    		        System.out.println("Invoice recorded.");
		    		    }
		                    break;
		                    
		                case 4:
		                {
		    		        System.out.print("Enter Supply ID: ");
		    		        int id = scanner.nextInt();
		    		        scanner.nextLine();
		    		        System.out.print("Enter Supply Name: ");
		    		        String name = scanner.nextLine();
		    		        System.out.print("Enter Quantity: ");
		    		        int quantity = scanner.nextInt();

		    		        supplies.add(new MedicalSupply(id, name, quantity));
		    		        System.out.println("Supply added.");
		    		    }		                   
		                break;
		                
		                case 5:
		                {
		    		        System.out.print("Enter Staff ID: ");
		    		        int id = scanner.nextInt();
		    		        scanner.nextLine();
		    		        System.out.print("Enter Staff Name: ");
		    		        String name = scanner.nextLine();
		    		        System.out.print("Enter Role: ");
		    		        String role = scanner.nextLine();

		    		        staffList.add(new Staff(id, name, role));
		    		        System.out.println("Staff member added.");
		    		    }		                  
		                break;
		                
		                case 6:
		                {
		                    System.out.println("\n--- Patient Records ---");
		                    for (Patient p : patients) {
		                        System.out.println("ID: " +p.getId() +", Patient Name: "+p.getName() +", Contacts: "+p.getContacts() +", Diagnosis: "+p.getDiagnosis()+"" );
		                    }
		                	break;
		                }
		                default:
		                    System.out.println("Invalid choice. Try again.");
		            }
		        } while (choice != 0);

		        scanner.close();
		    }	 

}
