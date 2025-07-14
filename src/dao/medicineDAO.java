package dao;

import java.util.List;
import model.Medicine;

public interface MedicineDAO {
    void insertMedicine(Medicine med);
    List<Medicine> getAllMedicines();
    Medicine getMedicineById(int id);
    void updateMedicine(Medicine med);
    void deleteMedicine(int id);
}
