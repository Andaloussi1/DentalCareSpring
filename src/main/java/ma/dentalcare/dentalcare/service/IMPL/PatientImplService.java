package ma.dentalcare.dentalcare.service.IMPL;

import ma.dentalcare.dentalcare.model.Patient;
import ma.dentalcare.dentalcare.repository.PatientRepository;
import ma.dentalcare.dentalcare.service.PatientService;
import org.hibernate.id.UUIDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PatientImplService implements PatientService {

    private PatientRepository repo;
    public PatientImplService(PatientRepository repo) {
        this.repo = repo;
    }

    @Override
    public Patient AddPatient(Patient patient) {
        return repo.save(patient);
    }

    @Override
    public List<Patient>  getAllPatients() {
        return repo.findAll();
    }

    @Override
    public Patient savePatient(Patient patient) {
        return repo.save(patient);
    }

    @Override
    public Patient getPatientById(Long id) {
        return repo.findById(id).orElseThrow(()-> new UsernameNotFoundException("User By ID "+id+"was Not Found"));
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return repo.save(patient);
    }
    @Override
    public void deletePatient(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<Patient> searchPatient(String keyword) {
        List<Patient> Patients = repo.searchPatient(keyword);

        return Patients;
    }
}
