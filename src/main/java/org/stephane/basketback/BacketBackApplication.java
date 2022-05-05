package org.stephane.basketback;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.stephane.basketback.categorie.entities.Categorie;
import org.stephane.basketback.categorie.entities.CategorieBuilder;
import org.stephane.basketback.categorie.repository.CategorieRepository;
import org.stephane.basketback.personne.entities.Genre;
import org.stephane.basketback.personne.entities.Personne;
import org.stephane.basketback.personne.entities.PersonneBuilder;
import org.stephane.basketback.personne.repository.PersonneRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@SpringBootApplication
@EntityScan(basePackages = {
        "org.stephane.basketback.personne.entities", "org.stephane.basketback.categorie .entities"})
@EnableJpaAuditing
public class BacketBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(BacketBackApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(PersonneRepository personneRepository, CategorieRepository categorieRepository) {
        return (args) -> {
            //
            Categorie U7 = addCategorie(categorieRepository, "f85c06e1-5f8b-4174-9163-075a1d49c4e1", "U7", null, "Baby Basketteurs", "6 ans et moins");
            Categorie U9 = addCategorie(categorieRepository, "f85c06e1-5f8b-4174-9163-075a1d49c4e2", "U8-U9", null, "Mini-poussins", "7 et 8 ans");
            Categorie U11_M = addCategorie(categorieRepository, "f85c06e1-5f8b-4174-9163-075a1d49c4e3", "U10-U11 Masculin", Genre.HOMME, "Poussins", "9 et 10 ans");
            Categorie U11_F = addCategorie(categorieRepository, "f85c06e1-5f8b-4174-9163-075a1d49c4b3", "U10-U11 Féminin", Genre.FEMME, "Poussines", "9 et 10 ans");
            Categorie U13_M = addCategorie(categorieRepository, "f85c06e1-5f8b-4174-9163-075a1d49c4e4", "U12-U13 Féminin", Genre.FEMME, "Benjamines", "11 et 12 ans");
            Categorie U13_F = addCategorie(categorieRepository, "f85c06e1-5f8b-4174-9163-075a1d49c4b4", "U12-U13 Masculin", Genre.HOMME, "Benjamins", "11 et 12 ans");
            Categorie U15_M = addCategorie(categorieRepository, "f85c06e1-5f8b-4174-9163-075a1d49c4e5", "U14-U15 Féminin", Genre.FEMME, "Minimes", "13 et 14 ans");
            Categorie U15_F = addCategorie(categorieRepository, "f85c06e1-5f8b-4174-9163-075a1d49c4b5", "U14-U15 Masculin", Genre.HOMME, "Minimes", "13 et 14 ans");
            Categorie U17_M = addCategorie(categorieRepository, "f85c06e1-5f8b-4174-9163-075a1d49c4e6", "U16-U17 Masculin", Genre.HOMME, "Cadets", "15 et 16 ans");
            Categorie U18_F = addCategorie(categorieRepository, "f85c06e1-5f8b-4174-9163-075a1d49c4b7", "U16-U17-U18 Feminin", Genre.FEMME, "Cadettes", "15, 16 et 17 ans");
            Categorie U20_M = addCategorie(categorieRepository, "f85c06e1-5f8b-4174-9163-075a1d49c4e8", "U18-U19-U20 Masculin", Genre.HOMME, "Junior Masculin", "17, 18 et 19 ans");
            Categorie U20_F = addCategorie(categorieRepository, "f85c06e1-5f8b-4174-9163-075a1d49c4b9", "U19-U20 Féminin", Genre.FEMME, "Junior Féminine", "18 et 19 ans");
            Categorie SENIORS_F = addCategorie(categorieRepository, "f85c06e1-5f8b-4174-9163-075a1d49c4ea", "Seniors Féminin", Genre.FEMME, "Seniors Féminin", "20 ans et plus");
            Categorie SENIORS_M = addCategorie(categorieRepository, "f85c06e1-5f8b-4174-9163-075a1d49c4ba", "Seniors Masculin", Genre.HOMME, "Seniors Masculin", "20 ans et plus");
            //
            addPersonne(personneRepository, "Chetouani", "Ibrahim-yassine", Genre.HOMME, "23/04/2012", "BC140561");
            addPersonne(personneRepository, "Ginouvier", "Joshua", Genre.HOMME, "17/03/2015", "BC155299");
            addPersonne(personneRepository, "GOZARD LUCAS", "Louis", Genre.HOMME, "24/06/2014", "BC144363");
            addPersonne(personneRepository, "MARCOVECCHIO", "Raffael", Genre.HOMME, "14/02/2014", "BC144314");
            addPersonne(personneRepository, "MICHAL", "Rafael", Genre.HOMME, "26/11/2013", "BC130624");
            addPersonne(personneRepository, "PEREIRA", "Louka", Genre.HOMME, "18/09/2013", "BC135039");
            addPersonne(personneRepository, "DEMAI", "Chloe", Genre.FEMME, "20/05/2013", "BC139007");
            addPersonne(personneRepository, "IDELON", "Prune", Genre.FEMME, "18/09/2013", "BC139317");
            addPersonne(personneRepository, "AYRAULT", "Noah", Genre.HOMME, "14/08/2012", "BC124865");
            addPersonne(personneRepository, "CHOMETTE", "Malo", Genre.HOMME, "11/10/2012", "BC126658");
            addPersonne(personneRepository, "CIVET", "Hugo", Genre.HOMME, "05/04/2012", "BC125620");
            addPersonne(personneRepository, "GAUGER", "Melvyn", Genre.HOMME, "01/07/2011", "BC114688");
            addPersonne(personneRepository, "GEROMIN", "Loric", Genre.HOMME, "29/11/2012", "BC121955");
            addPersonne(personneRepository, "GOUILLER", "Calvin", Genre.HOMME, "24/05/2012", "BC128514");
            addPersonne(personneRepository, "HUGOT GRONDIN", "Romeo", Genre.HOMME, "27/08/2012", "BC129915");
            addPersonne(personneRepository, "PELLOQUIN", "Jules", Genre.HOMME, "05/10/2012", "BC126219");
            addPersonne(personneRepository, "Perez-Capel", "Nolhan", Genre.HOMME, "07/11/2012", "BC125301");
            addPersonne(personneRepository, "GARCIA", "Adam", Genre.HOMME, "30/03/2012", "BC127862");
            addPersonne(personneRepository, "PUPIN", "Liam", Genre.HOMME, "11/11/2012", "BC129348");
            addPersonne(personneRepository, "Chetouani", "Zaynab", Genre.FEMME, "15/12/2011", "BC110567");
            addPersonne(personneRepository, "GUILLOT", "Alexia", Genre.FEMME, "12/06/2012", "BC120661");
            addPersonne(personneRepository, "ROBERT", "Alizee", Genre.FEMME, "28/07/2012", "BC128263");
            addPersonne(personneRepository, "TOMETY", "Naya", Genre.FEMME, "06/09/2012", "BC120466");
            addPersonne(personneRepository, "GEROMIN", "Cleanne", Genre.FEMME, "03/01/2010", "BC107977");
            addPersonne(personneRepository, "GIROUD", "Elisa", Genre.FEMME, "18/04/2009", "BC090663");
            addPersonne(personneRepository, "MICHAL", "Ilohé", Genre.FEMME, "13/11/2010", "BC101492");
            addPersonne(personneRepository, "ROSA", "Jade", Genre.FEMME, "23/01/2010", "BC100582");
            addPersonne(personneRepository, "VALENTIN", "Noa", Genre.FEMME, "06/05/2009", "BC093548");
            addPersonne(personneRepository, "VIEILLARD", "Maelys", Genre.FEMME, "18/05/2010", "BC102502");
            addPersonne(personneRepository, "LAHMER", "Khadija", Genre.FEMME, "07/04/2009", "BC098274");
            addPersonne(personneRepository, "BELABBES", "Meriem", Genre.FEMME, "02/04/2009", "BC091880");
            addPersonne(personneRepository, "NGONO ANGONI", "Vera", Genre.FEMME, "06/02/2011", "BC117470");
            addPersonne(personneRepository, "MAZZOCCHETTI", "Louis", Genre.HOMME, "18/05/2009", "BC096657");
            addPersonne(personneRepository, "PEREZ-CAPEL", "Ethan", Genre.HOMME, "30/09/2009", "BC092207");
            addPersonne(personneRepository, "GHARBI", "Djalill", Genre.HOMME, "28/10/2009", "BC097912");
            addPersonne(personneRepository, "GODARD", "Noah", Genre.HOMME, "21/12/2009", "BC097924");
            addPersonne(personneRepository, "POINAS", "Sandro", Genre.HOMME, "15/04/2009", "BC098362");
            addPersonne(personneRepository, "LOPES", "Gaetan", Genre.HOMME, "27/01/2010", "BC105666");
            addPersonne(personneRepository, "MOULIN", "Remy", Genre.HOMME, "02/02/2010", "BC108271");
            addPersonne(personneRepository, "FILOSI", "Leandro", Genre.HOMME, "12/02/2010", "BC109104");
            addPersonne(personneRepository, "MARCHAND HAUTECOEUR", "Maxime", Genre.HOMME, "02/11/2009", "BC095871");
            addPersonne(personneRepository, "BONGARD", "Nolan", Genre.HOMME, "03/10/2007", "BC075127");
            addPersonne(personneRepository, "CARUANO", "Eliott", Genre.HOMME, "01/08/2007", "BC071030");
            addPersonne(personneRepository, "ELMI BARREH", "Dougsiyeh", Genre.HOMME, "07/05/2008", "BC085596");
            addPersonne(personneRepository, "LAFOND", "Loevan", Genre.HOMME, "30/05/2008", "BC084454");
            addPersonne(personneRepository, "ALOUI", "Zakarie", Genre.HOMME, "21/10/2008", "BC082060");
            addPersonne(personneRepository, "MARTINS", "Simon", Genre.HOMME, "17/09/2007", "BC074712");
            addPersonne(personneRepository, "NOUR", "Gebril", Genre.HOMME, "22/09/2008", "BC084458");
            addPersonne(personneRepository, "TERMOZ-BAJAT", "Enzo", Genre.HOMME, "06/06/2007", "BC075045");
            addPersonne(personneRepository, "Lahmer", "Souhaib", Genre.HOMME, "06/07/2007", "BC078271");
            addPersonne(personneRepository, "FURLANO", "Timeo", Genre.HOMME, "27/11/2008", "BC088948");
            addPersonne(personneRepository, "CHAMPLOVIER", "Axel", Genre.HOMME, "21/07/2007", "BC078146");
            addPersonne(personneRepository, "BEN SALEM", "Amine", Genre.HOMME, "13/10/2007", "BC077928");
            addPersonne(personneRepository, "MATHLOUTHI", "Wesseme", Genre.HOMME, "22/12/2007", "BC072726");
            addPersonne(personneRepository, "BETTON", "Benjamin", Genre.HOMME, "18/10/2006", "BC060727");
            addPersonne(personneRepository, "LEMAHIEU", "Jeremy", Genre.HOMME, "23/05/2006", "BC063983");
            addPersonne(personneRepository, "POUSSET", "Leo", Genre.HOMME, "30/09/2005", "BC052720");
            addPersonne(personneRepository, "ROSA", "Clement", Genre.HOMME, "13/05/2005", "BC050537");
            addPersonne(personneRepository, "SARRA", "Noah", Genre.HOMME, "31/07/2005", "BC059857");
            addPersonne(personneRepository, "VINCENT", "Axel", Genre.HOMME, "11/07/2005", "BC050418");
            addPersonne(personneRepository, "Clavel", "Clément", Genre.HOMME, "17/03/2006", "BC068403");
            addPersonne(personneRepository, "MONTES", "Gabriel", Genre.HOMME, "27/03/2006", "BC060991");
            addPersonne(personneRepository, "ALBERTIN", "Fiona", Genre.FEMME, "27/09/2004", "BC040023");
            addPersonne(personneRepository, "AROD", "Fanny", Genre.FEMME, "12/07/2005", "BC050093");
            addPersonne(personneRepository, "BOISSIEUX", "Sophie", Genre.FEMME, "05/09/2006", "BC060194");
            addPersonne(personneRepository, "FERREIRA", "Manon", Genre.FEMME, "21/03/2004", "BC046782");
            addPersonne(personneRepository, "GEMO", "Lucie", Genre.FEMME, "19/04/2005", "BC056396");
            addPersonne(personneRepository, "PACE", "Anaelle", Genre.FEMME, "27/04/2005", "BC056762");
            addPersonne(personneRepository, "PATRUNO", "Emma", Genre.FEMME, "30/08/2007", "BC070509");
            addPersonne(personneRepository, "ROUGEON", "Lina", Genre.FEMME, "14/06/2005", "BC058334");
            addPersonne(personneRepository, "DA SILVA", "Oceane", Genre.FEMME, "01/12/2003", "VT036798");
            addPersonne(personneRepository, "DE ROSSI", "Maeva", Genre.FEMME, "17/10/2001", "VT019800");
            addPersonne(personneRepository, "PATRUNO", "Anne-elodie", Genre.FEMME, "28/07/1984", "VT843415");
            addPersonne(personneRepository, "VAYSSIERE", "Anna", Genre.FEMME, "19/12/2003", "VT038944");
            addPersonne(personneRepository, "SERVEL", "Louise", Genre.FEMME, "17/04/1993", "VT930384");
            addPersonne(personneRepository, "LOCATELLI", "Jeromine", Genre.FEMME, "12/12/1991", "VT910578");
            addPersonne(personneRepository, "LOKMANE", "Hafsa-fatima", Genre.FEMME, "12/08/2003", "VT030196");
            addPersonne(personneRepository, "LOCATELLI", "Elvina", Genre.FEMME, "07/06/1990", "VT900907");
            addPersonne(personneRepository, "COSTA MOREIRA", "Chloé", Genre.FEMME, "14/12/2002", "VT026149");
            addPersonne(personneRepository, "DEMIERE", "Arnaud", Genre.HOMME, "07/04/1993", "VT935956");
            addPersonne(personneRepository, "GRILLOT", "Luca", Genre.HOMME, "28/06/2004", "BC044639");
            addPersonne(personneRepository, "MANTEGARI", "Alexandre", Genre.HOMME, "13/11/1995", "VT953563");
            addPersonne(personneRepository, "PEREZ", "Nicolas", Genre.HOMME, "02/12/2002", "VT029701");
            addPersonne(personneRepository, "PIOZ", "Cody", Genre.HOMME, "01/09/2003", "VT037366");
            addPersonne(personneRepository, "VIVIAND", "Emmanuel", Genre.HOMME, "23/04/1992", "VT922497");
            addPersonne(personneRepository, "JIMENEZ MONTES", "Tony", Genre.HOMME, "07/01/2004", "BC046135");
            addPersonne(personneRepository, "DA-CUNHA", "Anthony", Genre.HOMME, "17/08/2004", "BC047607");
            addPersonne(personneRepository, "MEYNIER", "Jean Romain", Genre.HOMME, "30/07/1987", "VT873734");
            addPersonne(personneRepository, "LE MOEL", "Paul", Genre.HOMME, "13/12/2002", "JH023551");
            addPersonne(personneRepository, "TIROLE", "Lisimba", Genre.FEMME, "26/10/2003", "VT030825");
            addPersonne(personneRepository, "BANCOD", "Laurence", Genre.FEMME, "07/03/1971", "VT710472");
            addPersonne(personneRepository, "ECORCE", "Nathalie", Genre.FEMME, "05/10/1974", "VT744644");
            addPersonne(personneRepository, "FAGNIEL", "Crystele", Genre.FEMME, "07/08/1971", "VT714141");
            addPersonne(personneRepository, "HERENSTEIN", "Saoule", Genre.FEMME, "09/01/1968", "VT681608");
            addPersonne(personneRepository, "PIOZ", "Méline", Genre.FEMME, "24/07/2001", "VT017228");
            addPersonne(personneRepository, "PIOZ", "Christelle", Genre.FEMME, "22/01/1970", "VT700490");
            addPersonne(personneRepository, "BETTON", "Stephane", Genre.HOMME, "28/01/1975", "JH754805");
            addPersonne(personneRepository, "CICCARELLO", "Marc", Genre.HOMME, "21/10/2003", "VT037458");
            addPersonne(personneRepository, "GOJOWCZYK", "Laurent", Genre.HOMME, "09/06/1970", "VT701117");
            addPersonne(personneRepository, "PEREZ", "Robert", Genre.HOMME, "14/02/1952", "VT520445");
            addPersonne(personneRepository, "TADEU", "Manuel", Genre.HOMME, "08/08/1972", "VT721423");
            addPersonne(personneRepository, "TERMOZ-BAJAT", "Frederique", Genre.HOMME, "20/01/1980", "JH808305");


        };
    }

    private Personne addPersonne(PersonneRepository repository, String nom, String prenom, Genre genre, String dnaissance, String nlicence) {
        Personne prs = PersonneBuilder.create()
                .id(UUID.randomUUID().toString())
                .nom(nom)
                .prenom(prenom)
                .genre(genre)
                .dnaissance(convertString(dnaissance))
                .nlicence(nlicence)
                .build();
        return repository.save(prs);
    }

    private Categorie addCategorie(CategorieRepository repository, String id, String nom, Genre genre, String libelle, String complementaire) {
        Categorie cat = CategorieBuilder.create()
                .id(id)
                .nom(nom)
                .genre(genre)
                .libelle(libelle)
                .complementaire(complementaire)
                .build();
        return repository.save(cat);
    }

    private LocalDate convertString(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        return LocalDate.parse(date, formatter);
    }
}
