package com.bl.chemistshop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.bl.chemistshop.Medicine.Type;

public class UserInterface {
	Scanner scanner = new Scanner(System.in);
	public void printHomeopathy(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).type == Medicine.Type.HOMEOPATHY) {
				System.out.println(list.get(i));
			}
		}
	}
	
	public void print(List list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}	
	}
	
	public void printAllopathy(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).type == Medicine.Type.ALLOPATHY) {
				System.out.println(list.get(i));
			}
		}	
	}
	
	public void printYunami(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).type == Medicine.Type.YUNAMI) {
				System.out.println(list.get(i));
			}
		}	
	}
	
	public void printAiurvedic(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).type == Medicine.Type.AIURVEDIC) {
				System.out.println(list.get(i));
			}
		}	
	}
	
	public void updateMedicine(Medicine medicine) {
		Scanner scannerstr = new Scanner(System.in);
		System.out.println("[1] changename \n[2] change company name \n[3] change mfg date \n"+ 
				"[4] change Expiry date \n[5] change compositons \n[6] change type ");
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			System.out.println("enter tne name of medicine");
			medicine.name = scanner.nextLine();
			break;
		case 2:
			System.out.println("enter the company name");
			medicine.companyName = scanner.nextLine();
			break;
		case 3:
		
			System.out.println("enter the mfg date in mm/dd/yyyy formate");
			String tempMfgDate = scanner.next();
			medicine.mfgDate =  new Date(tempMfgDate);	
			break;
		case 4:
			System.out.println("enter the expiry date in mm/dd/yyyy formate");
			String tempExpDate = scanner.next();
			medicine.expiryDate = new Date(tempExpDate); 
			break;
		case 5:
			System.out.println("enter the composition");
			medicine.composition = scannerstr.nextLine().split(" ");
			break;
		case 6:
			System.out.println("enter the type of medicine");
			String tempType = scanner.nextLine();
			
			
		}
	}
	
	
	int showMainMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("[1] Add medicine \n[2] Remove medicine \n[3] update \n[4] Print All Medicine \n" +
				"[5] print only homeopathy \n[6] print only allopathy \n[7] print only aiurvedic \n"
				+ "[8] prit only yunani \n[9] exit ");
		int option = scanner.nextInt();
		return option;
	}
}
