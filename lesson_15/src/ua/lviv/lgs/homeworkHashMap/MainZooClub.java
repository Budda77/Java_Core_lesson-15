/*
 * LOGOS It Academy home work 14
 * 
 * */

package ua.lviv.lgs.homeworkHashMap;

import java.util.Scanner;

/**
 * This program demonstrates the use of HashMap with a key of type class People and value AppayList<Pet>.
 * @author Oleksandr
 * @param input parameters is String and int
 * 
 */

public class MainZooClub {

	public static void main(String[] args) {
		
			ZooClub zc = new ZooClub();

			Scanner scanner = new Scanner(System.in);
			
			while(true) {
				System.out.println("Display menu, press 1");
				
				switch(scanner.nextInt()) {

				case 1:{
					menu();					
					break;
				}
				case 2:{
					zc.fillClub();
					System.out.println("A new member is registered in the club:");
					zc.showClub();					
					break;
				}
				case 3:{
					zc.addMember();
					zc.showClub2();
					break;
				}
				case 4:{
					zc.addPet();
					break;
				}
				case 5:{
					zc.removeMemberPet();
					break;				
				}
				case 6:{
					zc.removeMember();
					break;				
				}
				case 7:{
					zc.removePet();;
					break;				
				}		
				case 8:{
					zc.showClub();					
					break;
				}
				case 9:{
					System.exit(0);	
					break;
				}
				default:{
					System.out.println("Enter the number from 1 to 9.");
				}
							
				}
			}				
	}
	

	static void menu() {

		System.out.println("Enter 2 to set up a pet club");
		System.out.println("Enter 3 to add the member to the club");
		System.out.println("Enter 4 to add a pets to a member of the club");
		System.out.println("Enter 5 to remove a pet from a member of the club");
		System.out.println("Enter 6 to remove a member from the club");
		System.out.println("Enter 7 to remove a specific pet from all members");
		System.out.println("Enter 8 to display the pet club on the screen");
		System.out.println("Enter 9 to log out the program");	
	}
	

}
