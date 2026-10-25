package ra.edu.hw.md05.ss06.ex02.dto;

import java.time.LocalDate;

public record PatientRequestDto(
        Long id,
        String fullName,
        LocalDate dateOfBirth,
        String gender,
        String phoneNumber,
        String address,
        String medicalHistory
) {
}
