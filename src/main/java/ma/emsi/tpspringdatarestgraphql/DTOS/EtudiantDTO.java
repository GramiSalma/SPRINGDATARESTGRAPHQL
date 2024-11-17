package ma.emsi.tpspringdatarestgraphql.DTOS;

import ma.emsi.tpspringdatarestgraphql.Entities.Genre;

public record EtudiantDTO (
        String nom,
        String prenom,
        Genre genre,
        Long centreId
){ }