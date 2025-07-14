package service;

import java.util.*;
import model.Medicine;
import dao.MedicineDAO;
import dao.MedicineDAOImpl;

public class MedicineService {
    Scanner sc = new Scanner(System.in);
    MedicineDAO dao = new MedicineDAOImpl();

    public void menu() {
        int choice;
        do {
            System.out.println("\n--- Medicine Management ---");
            System.out.println("1. Insert Medicine");
            System.out.println("2. View All Medicines");
            System.out.println("3. View Medicine by ID");
            System.out.println("4. Update Medicine");
            System.out.println("5. Delete Medicine");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: insert(); break;
                case 2: showAll(); break;
                case 3: showById(); break;
                case 4: update(); break;
                case 5: delete(); break;
                case 6: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }

    void insert() {
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Brand: ");
        String brand = sc.next();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        Medicine med = new Medicine(0, name, brand, price, qty);
        dao.insertMedicine(med);
        System.out.println("Medicine inserted.");
    }

    void showAll() {
        List<Medicine> list = dao.getAllMedicines();
        for (Medicine med : list) {
            System.out.println(med);
        }
    }

    void showById() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        Medicine med = dao.getMedicineById(id);
        if (med != null) {
            System.out.println(med);
        } else {
            System.out.println("Medicine not found.");
        }
    }

    void update() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        System.out.print("New Name: ");
        String name = sc.next();
        System.out.print("New Brand: ");
        String brand = sc.next();
        System.out.print("New Price: ");
        double price = sc.nextDouble();
        System.out.print("New Quantity: ");
        int qty = sc.nextInt();

        Medicine med = new Medicine(id, name, brand, price, qty);
        dao.updateMedicine(med);
        System.out.println("Medicine updated.");
    }

    void delete() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        dao.deleteMedicine(id);
        System.out.println("Medicine deleted.");
    }
}
