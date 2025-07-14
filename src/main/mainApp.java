
package main;

import service.MedicineService;

public class mainApp {
    public static void main(String[] args) {
        MedicineService service = new MedicineService();
        service.menu();
    }
}
