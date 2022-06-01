package ma.dentalcare.dentalcare.service;

import ma.dentalcare.dentalcare.model.Patient;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface PatientService {
    public Patient AddPatient(Patient patient);
    List<Patient> getAllPatients();
    Patient savePatient (Patient patient);
    Patient getPatientById (Long id);
    Patient updatePatient (Patient patient);
    void deletePatient(Long id);

    List<Patient> searchPatient(String keyword);
}
