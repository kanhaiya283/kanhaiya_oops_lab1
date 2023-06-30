package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.model.Employee;

public class DriverClass {
	public static void main(String[] args) {
		Employee employee = new Employee("kanhaiya","kumar");
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[]generatedPassword;
		
		System.out.println("Please enter the department from the following");;
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		
		Scanner sc= new Scanner(System.in);
		int option =sc.nextInt();
		
		if (option == 1) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					       employee.getLastName().toLowerCase(),"tech");
				genertaedPassword = cs.generatePassword();
				cs.showCredential(employee,generatedEmail, generatedPassword);
				}
		else if (option == 2) {
			generatedEmail = cs.genearateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"adm");
			        generatedPassword = cs.geneartePassword();
			        cs.showCredentials(employee, generatedEmail,generatedPassword);
		}
		else if (option == 3) {
			generatedEmail = cs.generateEmailadress(employee.getFirstName().toLowerCase(), 
					employee.getLastName().toLowerCase(),"hr");
			generatedPassword = cs.generatepassword();
			cs.showCredentials(employee, generatedEmail,generatedPassword);
		}
		else if (option == 4) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"lg");
			gneratedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail,generatedPassword);
		}
		else System.out.println("Enter a valid option");
		sc.close();
	}

	
					
					
			
			
			
			
			
			
					
					
					
					
					
					
					
					
					
					)
		}
		
		
		
		
	}

}
