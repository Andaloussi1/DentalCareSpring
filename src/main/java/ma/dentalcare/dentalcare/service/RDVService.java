package ma.dentalcare.dentalcare.service;

import ma.dentalcare.dentalcare.model.Patient;
import ma.dentalcare.dentalcare.model.RDV;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RDVService {
    List<RDV> getAllRDVs();

    RDV saveRDV (RDV RDV);

    RDV getRDVById (Long id);

    RDV updateRDV (RDV RDV);

    void deleteRDV(Long id);
}
