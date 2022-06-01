package ma.dentalcare.dentalcare.controller;

import ma.dentalcare.dentalcare.model.Patient;
import ma.dentalcare.dentalcare.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Patient")
public class PatientController {
    //Injection des dependencies !!!
    private  final PatientService patientService;

    public PatientController(PatientService patientService ) {

        this.patientService = patientService;

    }

    // MAPPING De mon App
    @GetMapping("/all")
    public ResponseEntity<List<Patient>> GetAllPatients(){
        List<Patient> ListOfPatients = patientService.getAllPatients();
        return new ResponseEntity<>(ListOfPatients,HttpStatus.OK);
    }
    @GetMapping("/search")
    public List<Patient> searchPatient(@RequestParam(name="keyword", defaultValue ="" )String keyword){
        return patientService.searchPatient("%"+keyword+"%");
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable("id") Long id){
        Patient patient = patientService.getPatientById(id);
        return new ResponseEntity<>(patient,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient)
    {
      Patient patientI = patientService.AddPatient(patient);
      return new ResponseEntity<>(patientI,HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient)
    {
        Patient patientI = patientService.updatePatient(patient);
        return new ResponseEntity<>(patientI,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePatient(@PathVariable("id") Long id)
    {
        patientService.deletePatient(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
