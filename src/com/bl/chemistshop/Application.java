package com.bl.chemistshop;

import java.util.List;
import java.util.Scanner;
import java.util.Date;
public class Application {
	
	Scanner scanner = new Scanner(System.in);
	MedicineStore medicineStore = new MedicineStore();
	UserInterface userInterface = new UserInterface();
	
	public static void main(String[] args) {
		Application application = new Application();
		int option = 0;
		while (option != 9) {
			option = application.userInterface.showMainMenu();
			application.handleUserSelection(option);
		}
		
		
		/*
		Aciloc aciloc = new Aciloc();
		aciloc.mfgDate = new Date ("11/2/2020");
		aciloc.expiryDate = new Date("13/5/2021");
		Crocin crocin = new Crocin();
		crocin.mfgDate = new Date("28/06/2020");
		crocin.expiryDate = new Date("08/04/2021");
		
		Disprin disprin = new Disprin();
		disprin.mfgDate = new Date("21/02/2020");
		disprin.expiryDate = (Date) new Date("2/02/2021");
		
		GluconD gluconD = new GluconD();
		gluconD.mfgDate = new Date("23/05/2020");
		gluconD.expiryDate = new Date("28/06/2021");
		
		PantopD pantopD = new PantopD();
		pantopD.mfgDate = new Date("13/06/2020");
		pantopD.expiryDate = new Date("23/06/2021");
		
		Natrumur natrumur = new Natrumur();
		natrumur.mfgDate = new Date("11/2/2020");
		natrumur.expiryDate = new Date("12/3/2023");
		
		MedicineStore medicineStore = new MedicineStore();
		medicineStore.add(aciloc);
		medicineStore.add(crocin);
		medicineStore.add(disprin);
		medicineStore.add(gluconD);
		medicineStore.add(pantopD);
		medicineStore.add(natrumur);
		
		UserInterface userInterface = new UserInterface();
		List medicineList = medicineStore.getMedicineList();
		userInterface.print(medicineList);
		
		medicineStore.remove(aciloc);
		medicineStore.remove(crocin);
		System.out.println("after removing");
		userInterface.print(medicineList);
		System.out.println("only homeopathy");
		userInterface.printHomeopathy(medicineList);
		System.out.println("only allopathy");
		userInterface.printAllopathy(medicineList);
		System.out.println("only aiurvedic");
		userInterface.printAiurvedic(medicineList);
		*/
	}

	private  void handleUserSelection(int option) {
		switch (option) {
		case 1:
			addMedicine();
			break;
		case 2:
			removeMedicine();
			break;
		case 3:
			System.out.println("enter the medicine name want to update");
			String medicineName = scanner.nextLine();
			Medicine medicine = medicineStore.getMedicine(medicineName);
			userInterface.updateMedicine(medicine);
			break;
		case 4:
			//List medicineList = medicineStore.getMedicineList();
			userInterface.print( medicineStore.getMedicineList());
			break;
		case 5:
			List allopathyMedicineList = medicineStore.getMedicineList();
			userInterface.printAllopathy(allopathyMedicineList);
			break;
		case 6:
			List homeopathyMedicineList = medicineStore.getMedicineList();
			userInterface.printHomeopathy(homeopathyMedicineList);
			break;
		case 7:
			List aiurvedicMedicineList = medicineStore.getMedicineList();
			userInterface.printAiurvedic(aiurvedicMedicineList);
		case 8:
			List yunamiMedicineList = medicineStore.getMedicineList();
			userInterface.printYunami(yunamiMedicineList);
			break;
		default:
			break;
				
		}
		
	}

	void removeMedicine() {
		System.out.println("enter the medicine name want to delete");
		String medicineName = scanner.nextLine();
		Medicine medicine = medicineStore.getMedicine(medicineName);
		medicineStore.remove(medicine);
		
	}

	void addMedicine() {

		Aciloc aciloc = new Aciloc();
		aciloc.mfgDate = new Date ("11/2/2020");
		aciloc.expiryDate = new Date("13/5/2021");
		Crocin crocin = new Crocin();
		crocin.mfgDate = new Date("28/06/2020");
		crocin.expiryDate = new Date("08/04/2021");
		
		Disprin disprin = new Disprin();
		disprin.mfgDate = new Date("21/02/2020");
		disprin.expiryDate = (Date) new Date("2/02/2021");
		
		GluconD gluconD = new GluconD();
		gluconD.mfgDate = new Date("23/05/2020");
		gluconD.expiryDate = new Date("28/06/2021");
		
		PantopD pantopD = new PantopD();
		pantopD.mfgDate = new Date("13/06/2020");
		pantopD.expiryDate = new Date("23/06/2021");
		
		Natrumur natrumur = new Natrumur();
		natrumur.mfgDate = new Date("11/2/2020");
		natrumur.expiryDate = new Date("12/3/2023");
		
		medicineStore.add(aciloc);
		medicineStore.add(crocin);
		medicineStore.add(disprin);
		medicineStore.add(gluconD);
		medicineStore.add(pantopD);
		medicineStore.add(natrumur);
	}
}
