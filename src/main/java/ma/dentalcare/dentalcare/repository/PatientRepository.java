package ma.dentalcare.dentalcare.repository;

import ma.dentalcare.dentalcare.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.List;


@RepositoryRestResource
public interface  PatientRepository extends JpaRepository<Patient,Long> {

 @Query("select p from Patient p where p.nom like:kw")
 List<Patient> searchPatient(@Param(value="kw")String keyword);


}
