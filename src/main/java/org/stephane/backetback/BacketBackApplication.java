package org.stephane.backetback;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.stephane.backetback.jpa.entities.Genre;
import org.stephane.backetback.jpa.entities.Personne;
import org.stephane.backetback.jpa.entities.PersonneBuilder;
import org.stephane.backetback.jpa.entities.PersonneRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@SpringBootApplication
@EntityScan(basePackages = {"org.stephane.backetback.jpa.entities"})
public class BacketBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(BacketBackApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(PersonneRepository repository) {
        return (args) -> {
            addPersonne(repository, "Chetouani", "Ibrahim-yassine", Genre.HOMME, "23/04/2012");
            addPersonne(repository, "Ginouvier", "Joshua", Genre.HOMME, "17/03/2015");
            addPersonne(repository, "GOZARD LUCAS", "Louis", Genre.HOMME, "24/06/2014");
            addPersonne(repository, "MARCOVECCHIO", "Raffael", Genre.HOMME, "14/02/2014");
            addPersonne(repository, "MICHAL", "Rafael", Genre.HOMME, "26/11/2013");
            addPersonne(repository, "PEREIRA", "Louka", Genre.HOMME, "18/09/2013");
            addPersonne(repository, "DEMAI", "Chloe", Genre.FEMME, "20/05/2013");
            addPersonne(repository, "IDELON", "Prune", Genre.FEMME, "18/09/2013");
            addPersonne(repository, "AYRAULT", "Noah", Genre.HOMME, "14/08/2012");
            addPersonne(repository, "CHOMETTE", "Malo", Genre.HOMME, "11/10/2012");
            addPersonne(repository, "CIVET", "Hugo", Genre.HOMME, "05/04/2012");
            addPersonne(repository, "GAUGER", "Melvyn", Genre.HOMME, "01/07/2011");
            addPersonne(repository, "GEROMIN", "Loric", Genre.HOMME, "29/11/2012");
            addPersonne(repository, "GOUILLER", "Calvin", Genre.HOMME, "24/05/2012");
            addPersonne(repository, "HUGOT GRONDIN", "Romeo", Genre.HOMME, "27/08/2012");
            addPersonne(repository, "PELLOQUIN", "Jules", Genre.HOMME, "05/10/2012");
            addPersonne(repository, "Perez-Capel", "Nolhan", Genre.HOMME, "07/11/2012");
            addPersonne(repository, "GARCIA", "Adam", Genre.HOMME, "30/03/2012");
            addPersonne(repository, "PUPIN", "Liam", Genre.HOMME, "11/11/2012");
            addPersonne(repository, "Chetouani", "Zaynab", Genre.FEMME, "15/12/2011");
            addPersonne(repository, "GUILLOT", "Alexia", Genre.FEMME, "12/06/2012");
            addPersonne(repository, "ROBERT", "Alizee", Genre.FEMME, "28/07/2012");
            addPersonne(repository, "TOMETY", "Naya", Genre.FEMME, "06/09/2012");
            addPersonne(repository, "GEROMIN", "Cleanne", Genre.FEMME, "03/01/2010");
            addPersonne(repository, "GIROUD", "Elisa", Genre.FEMME, "18/04/2009");
            addPersonne(repository, "MICHAL", "Ilohé", Genre.FEMME, "13/11/2010");
            addPersonne(repository, "ROSA", "Jade", Genre.FEMME, "23/01/2010");
            addPersonne(repository, "VALENTIN", "Noa", Genre.FEMME, "06/05/2009");
            addPersonne(repository, "VIEILLARD", "Maelys", Genre.FEMME, "18/05/2010");
            addPersonne(repository, "LAHMER", "Khadija", Genre.FEMME, "07/04/2009");
            addPersonne(repository, "BELABBES", "Meriem", Genre.FEMME, "02/04/2009");
            addPersonne(repository, "NGONO ANGONI", "Vera", Genre.FEMME, "06/02/2011");
            addPersonne(repository, "MAZZOCCHETTI", "Louis", Genre.HOMME, "18/05/2009");
            addPersonne(repository, "PEREZ-CAPEL", "Ethan", Genre.HOMME, "30/09/2009");
            addPersonne(repository, "GHARBI", "Djalill", Genre.HOMME, "28/10/2009");
            addPersonne(repository, "GODARD", "Noah", Genre.HOMME, "21/12/2009");
            addPersonne(repository, "POINAS", "Sandro", Genre.HOMME, "15/04/2009");
            addPersonne(repository, "LOPES", "Gaetan", Genre.HOMME, "27/01/2010");
            addPersonne(repository, "MOULIN", "Remy", Genre.HOMME, "02/02/2010");
            addPersonne(repository, "FILOSI", "Leandro", Genre.HOMME, "12/02/2010");
            addPersonne(repository, "MARCHAND HAUTECOEUR", "Maxime", Genre.HOMME, "02/11/2009");
            addPersonne(repository, "BONGARD", "Nolan", Genre.HOMME, "03/10/2007");
            addPersonne(repository, "CARUANO", "Eliott", Genre.HOMME, "01/08/2007");
            addPersonne(repository, "ELMI BARREH", "Dougsiyeh", Genre.HOMME, "07/05/2008");
            addPersonne(repository, "LAFOND", "Loevan", Genre.HOMME, "30/05/2008");
            addPersonne(repository, "ALOUI", "Zakarie", Genre.HOMME, "21/10/2008");
            addPersonne(repository, "MARTINS", "Simon", Genre.HOMME, "17/09/2007");
            addPersonne(repository, "NOUR", "Gebril", Genre.HOMME, "22/09/2008");
            addPersonne(repository, "TERMOZ-BAJAT", "Enzo", Genre.HOMME, "06/06/2007");
            addPersonne(repository, "Lahmer", "Souhaib", Genre.HOMME, "06/07/2007");
            addPersonne(repository, "FURLANO", "Timeo", Genre.HOMME, "27/11/2008");
            addPersonne(repository, "CHAMPLOVIER", "Axel", Genre.HOMME, "21/07/2007");
            addPersonne(repository, "BEN SALEM", "Amine", Genre.HOMME, "13/10/2007");
            addPersonne(repository, "MATHLOUTHI", "Wesseme", Genre.HOMME, "22/12/2007");
            addPersonne(repository, "BETTON", "Benjamin", Genre.HOMME, "18/10/2006");
            addPersonne(repository, "LEMAHIEU", "Jeremy", Genre.HOMME, "23/05/2006");
            addPersonne(repository, "POUSSET", "Leo", Genre.HOMME, "30/09/2005");
            addPersonne(repository, "ROSA", "Clement", Genre.HOMME, "13/05/2005");
            addPersonne(repository, "SARRA", "Noah", Genre.HOMME, "31/07/2005");
            addPersonne(repository, "VINCENT", "Axel", Genre.HOMME, "11/07/2005");
            addPersonne(repository, "Clavel", "Clément", Genre.HOMME, "17/03/2006");
            addPersonne(repository, "MONTES", "Gabriel", Genre.HOMME, "27/03/2006");
            addPersonne(repository, "ALBERTIN", "Fiona", Genre.FEMME, "27/09/2004");
            addPersonne(repository, "AROD", "Fanny", Genre.FEMME, "12/07/2005");
            addPersonne(repository, "BOISSIEUX", "Sophie", Genre.FEMME, "05/09/2006");
            addPersonne(repository, "FERREIRA", "Manon", Genre.FEMME, "21/03/2004");
            addPersonne(repository, "GEMO", "Lucie", Genre.FEMME, "19/04/2005");
            addPersonne(repository, "PACE", "Anaelle", Genre.FEMME, "27/04/2005");
            addPersonne(repository, "PATRUNO", "Emma", Genre.FEMME, "30/08/2007");
            addPersonne(repository, "ROUGEON", "Lina", Genre.FEMME, "14/06/2005");
            addPersonne(repository, "DA SILVA", "Oceane", Genre.FEMME, "01/12/2003");
            addPersonne(repository, "DE ROSSI", "Maeva", Genre.FEMME, "17/10/2001");
            addPersonne(repository, "PATRUNO", "Anne-elodie", Genre.FEMME, "28/07/1984");
            addPersonne(repository, "VAYSSIERE", "Anna", Genre.FEMME, "19/12/2003");
            addPersonne(repository, "SERVEL", "Louise", Genre.FEMME, "17/04/1993");
            addPersonne(repository, "LOCATELLI", "Jeromine", Genre.FEMME, "12/12/1991");
            addPersonne(repository, "LOKMANE", "Hafsa-fatima", Genre.FEMME, "12/08/2003");
            addPersonne(repository, "LOCATELLI", "Elvina", Genre.FEMME, "07/06/1990");
            addPersonne(repository, "COSTA MOREIRA", "Chloé", Genre.FEMME, "14/12/2002");
            addPersonne(repository, "DEMIERE", "Arnaud", Genre.HOMME, "07/04/1993");
            addPersonne(repository, "GRILLOT", "Luca", Genre.HOMME, "28/06/2004");
            addPersonne(repository, "MANTEGARI", "Alexandre", Genre.HOMME, "13/11/1995");
            addPersonne(repository, "PEREZ", "Nicolas", Genre.HOMME, "02/12/2002");
            addPersonne(repository, "PIOZ", "Cody", Genre.HOMME, "01/09/2003");
            addPersonne(repository, "VIVIAND", "Emmanuel", Genre.HOMME, "23/04/1992");
            addPersonne(repository, "JIMENEZ MONTES", "Tony", Genre.HOMME, "07/01/2004");
            addPersonne(repository, "DA-CUNHA", "Anthony", Genre.HOMME, "17/08/2004");
            addPersonne(repository, "MEYNIER", "Jean Romain", Genre.HOMME, "30/07/1987");
            addPersonne(repository, "LE MOEL", "Paul", Genre.HOMME, "13/12/2002");
            addPersonne(repository, "TIROLE", "Lisimba", Genre.FEMME, "26/10/2003");
            addPersonne(repository, "BANCOD", "Laurence", Genre.FEMME, "07/03/1971");
            addPersonne(repository, "ECORCE", "Nathalie", Genre.FEMME, "05/10/1974");
            addPersonne(repository, "FAGNIEL", "Crystele", Genre.FEMME, "07/08/1971");
            addPersonne(repository, "HERENSTEIN", "Saoule", Genre.FEMME, "09/01/1968");
            addPersonne(repository, "PIOZ", "Méline", Genre.FEMME, "24/07/2001");
            addPersonne(repository, "PIOZ", "Christelle", Genre.FEMME, "22/01/1970");
            addPersonne(repository, "BETTON", "Stephane", Genre.HOMME, "28/01/1975");
            addPersonne(repository, "CICCARELLO", "Marc", Genre.HOMME, "21/10/2003");
            addPersonne(repository, "GOJOWCZYK", "Laurent", Genre.HOMME, "09/06/1970");
            addPersonne(repository, "PEREZ", "Robert", Genre.HOMME, "14/02/1952");
            addPersonne(repository, "TADEU", "Manuel", Genre.HOMME, "08/08/1972");
            addPersonne(repository, "TERMOZ-BAJAT", "Frederique", Genre.HOMME, "20/01/1980");

        };
    }

    private void addPersonne(PersonneRepository repository, String nom, String prenom, Genre genre, String dnaissance) {
        Personne prs = PersonneBuilder.create()
                .id(UUID.randomUUID())
                .nom(nom)
                .prenom(prenom)
                .genre(genre)
                .dnaissance(convertString(dnaissance))
                .build();
        repository.save(prs);
    }

    private LocalDate convertString(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        return LocalDate.parse(date, formatter);
    }
}
