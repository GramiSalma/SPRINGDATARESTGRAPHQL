package ma.emsi.tpspringdatarestgraphql;

import ma.emsi.tpspringdatarestgraphql.Entities.Centre;
import ma.emsi.tpspringdatarestgraphql.Entities.Etudiant;
import ma.emsi.tpspringdatarestgraphql.Entities.Genre;
import ma.emsi.tpspringdatarestgraphql.Repositories.CentreRepository;
import ma.emsi.tpspringdatarestgraphql.Repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpSpringdatarestgraphqlApplication implements CommandLineRunner {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Autowired
    private CentreRepository centreRepository;

    public static void main(String[] args) {
        SpringApplication.run(TpSpringdatarestgraphqlApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Centre centre1 = Centre.builder()
                .nom("Maarif")
                .adresse("Biranzarane")
                .build();
        centreRepository.save(centre1);

        Centre centre2 = Centre.builder()
                .nom("Oranges")
                .adresse("Oulfa")
                .build();
        centreRepository.save(centre2);

        Etudiant et1 = Etudiant.builder()
                .nom("Adnani")
                .prenom("Brahim")
                .genre(Genre.HOMME)
                .centre(centre1)
                .build();
        etudiantRepository.save(et1);
    }
}

