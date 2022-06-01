package ma.dentalcare.dentalcare.web;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.dentalcare.dentalcare.model.Patient;
import ma.dentalcare.dentalcare.repository.PatientRepository;
import ma.dentalcare.dentalcare.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class PatientRestController {
    private PatientService patientService;

    @GetMapping("/patients")
    public List<Patient> patients(){
        return patientService.getAllPatients();
    }


}
