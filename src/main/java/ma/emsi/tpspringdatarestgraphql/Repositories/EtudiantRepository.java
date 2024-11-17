package ma.emsi.tpspringdatarestgraphql.Repositories;

import ma.emsi.tpspringdatarestgraphql.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
