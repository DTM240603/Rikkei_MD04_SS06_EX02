package ra.edu.hw.md05.ss06.ex02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.edu.hw.md05.ss06.ex02.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
