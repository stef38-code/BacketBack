package org.stephane.backetback;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.stephane.backetback.jpa.entities.personne.Genre;
import org.stephane.backetback.jpa.entities.personne.Personne;
import org.stephane.backetback.jpa.entities.personne.PersonneBuilder;
import org.stephane.backetback.jpa.repository.PersonneRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@SpringBootApplication
@EntityScan(basePackages = {"org.stephane.backetback.jpa.entities"})
@EnableJpaAuditing
public class BacketBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(BacketBackApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(PersonneRepository repository) {
        return (args) -> {
            addPersonne(repository, "Chetouani", "Ibrahim-yassine", Genre.HOMME, "23/04/2012", "BC140561");
            addPersonne(repository, "Ginouvier", "Joshua", Genre.HOMME, "17/03/2015", "BC155299");
            addPersonne(repository, "GOZARD LUCAS", "Louis", Genre.HOMME, "24/06/2014", "BC144363");
            addPersonne(repository, "MARCOVECCHIO", "Raffael", Genre.HOMME, "14/02/2014", "BC144314");
            addPersonne(repository, "MICHAL", "Rafael", Genre.HOMME, "26/11/2013", "BC130624");
            addPersonne(repository, "PEREIRA", "Louka", Genre.HOMME, "18/09/2013", "BC135039");
            addPersonne(repository, "DEMAI", "Chloe", Genre.FEMME, "20/05/2013", "BC139007");
            addPersonne(repository, "IDELON", "Prune", Genre.FEMME, "18/09/2013", "BC139317");
            addPersonne(repository, "AYRAULT", "Noah", Genre.HOMME, "14/08/2012", "BC124865");
            addPersonne(repository, "CHOMETTE", "Malo", Genre.HOMME, "11/10/2012", "BC126658");
            addPersonne(repository, "CIVET", "Hugo", Genre.HOMME, "05/04/2012", "BC125620");
            addPersonne(repository, "GAUGER", "Melvyn", Genre.HOMME, "01/07/2011", "BC114688");
            addPersonne(repository, "GEROMIN", "Loric", Genre.HOMME, "29/11/2012", "BC121955");
            addPersonne(repository, "GOUILLER", "Calvin", Genre.HOMME, "24/05/2012", "BC128514");
            addPersonne(repository, "HUGOT GRONDIN", "Romeo", Genre.HOMME, "27/08/2012", "BC129915");
            addPersonne(repository, "PELLOQUIN", "Jules", Genre.HOMME, "05/10/2012", "BC126219");
            addPersonne(repository, "Perez-Capel", "Nolhan", Genre.HOMME, "07/11/2012", "BC125301");
            addPersonne(repository, "GARCIA", "Adam", Genre.HOMME, "30/03/2012", "BC127862");
            addPersonne(repository, "PUPIN", "Liam", Genre.HOMME, "11/11/2012", "BC129348");
            addPersonne(repository, "Chetouani", "Zaynab", Genre.FEMME, "15/12/2011", "BC110567");
            addPersonne(repository, "GUILLOT", "Alexia", Genre.FEMME, "12/06/2012", "BC120661");
            addPersonne(repository, "ROBERT", "Alizee", Genre.FEMME, "28/07/2012", "BC128263");
            addPersonne(repository, "TOMETY", "Naya", Genre.FEMME, "06/09/2012", "BC120466");
            addPersonne(repository, "GEROMIN", "Cleanne", Genre.FEMME, "03/01/2010", "BC107977");
            addPersonne(repository, "GIROUD", "Elisa", Genre.FEMME, "18/04/2009", "BC090663");
            addPersonne(repository, "MICHAL", "Ilohé", Genre.FEMME, "13/11/2010", "BC101492");
            addPersonne(repository, "ROSA", "Jade", Genre.FEMME, "23/01/2010", "BC100582");
            addPersonne(repository, "VALENTIN", "Noa", Genre.FEMME, "06/05/2009", "BC093548");
            addPersonne(repository, "VIEILLARD", "Maelys", Genre.FEMME, "18/05/2010", "BC102502");
            addPersonne(repository, "LAHMER", "Khadija", Genre.FEMME, "07/04/2009", "BC098274");
            addPersonne(repository, "BELABBES", "Meriem", Genre.FEMME, "02/04/2009", "BC091880");
            addPersonne(repository, "NGONO ANGONI", "Vera", Genre.FEMME, "06/02/2011", "BC117470");
            addPersonne(repository, "MAZZOCCHETTI", "Louis", Genre.HOMME, "18/05/2009", "BC096657");
            addPersonne(repository, "PEREZ-CAPEL", "Ethan", Genre.HOMME, "30/09/2009", "BC092207");
            addPersonne(repository, "GHARBI", "Djalill", Genre.HOMME, "28/10/2009", "BC097912");
            addPersonne(repository, "GODARD", "Noah", Genre.HOMME, "21/12/2009", "BC097924");
            addPersonne(repository, "POINAS", "Sandro", Genre.HOMME, "15/04/2009", "BC098362");
            addPersonne(repository, "LOPES", "Gaetan", Genre.HOMME, "27/01/2010", "BC105666");
            addPersonne(repository, "MOULIN", "Remy", Genre.HOMME, "02/02/2010", "BC108271");
            addPersonne(repository, "FILOSI", "Leandro", Genre.HOMME, "12/02/2010", "BC109104");
            addPersonne(repository, "MARCHAND HAUTECOEUR", "Maxime", Genre.HOMME, "02/11/2009", "BC095871");
            addPersonne(repository, "BONGARD", "Nolan", Genre.HOMME, "03/10/2007", "BC075127");
            addPersonne(repository, "CARUANO", "Eliott", Genre.HOMME, "01/08/2007", "BC071030");
            addPersonne(repository, "ELMI BARREH", "Dougsiyeh", Genre.HOMME, "07/05/2008", "BC085596");
            addPersonne(repository, "LAFOND", "Loevan", Genre.HOMME, "30/05/2008", "BC084454");
            addPersonne(repository, "ALOUI", "Zakarie", Genre.HOMME, "21/10/2008", "BC082060");
            addPersonne(repository, "MARTINS", "Simon", Genre.HOMME, "17/09/2007", "BC074712");
            addPersonne(repository, "NOUR", "Gebril", Genre.HOMME, "22/09/2008", "BC084458");
            addPersonne(repository, "TERMOZ-BAJAT", "Enzo", Genre.HOMME, "06/06/2007", "BC075045");
            addPersonne(repository, "Lahmer", "Souhaib", Genre.HOMME, "06/07/2007", "BC078271");
            addPersonne(repository, "FURLANO", "Timeo", Genre.HOMME, "27/11/2008", "BC088948");
            addPersonne(repository, "CHAMPLOVIER", "Axel", Genre.HOMME, "21/07/2007", "BC078146");
            addPersonne(repository, "BEN SALEM", "Amine", Genre.HOMME, "13/10/2007", "BC077928");
            addPersonne(repository, "MATHLOUTHI", "Wesseme", Genre.HOMME, "22/12/2007", "BC072726");
            addPersonne(repository, "BETTON", "Benjamin", Genre.HOMME, "18/10/2006", "BC060727");
            addPersonne(repository, "LEMAHIEU", "Jeremy", Genre.HOMME, "23/05/2006", "BC063983");
            addPersonne(repository, "POUSSET", "Leo", Genre.HOMME, "30/09/2005", "BC052720");
            addPersonne(repository, "ROSA", "Clement", Genre.HOMME, "13/05/2005", "BC050537");
            addPersonne(repository, "SARRA", "Noah", Genre.HOMME, "31/07/2005", "BC059857");
            addPersonne(repository, "VINCENT", "Axel", Genre.HOMME, "11/07/2005", "BC050418");
            addPersonne(repository, "Clavel", "Clément", Genre.HOMME, "17/03/2006", "BC068403");
            addPersonne(repository, "MONTES", "Gabriel", Genre.HOMME, "27/03/2006", "BC060991");
            addPersonne(repository, "ALBERTIN", "Fiona", Genre.FEMME, "27/09/2004", "BC040023");
            addPersonne(repository, "AROD", "Fanny", Genre.FEMME, "12/07/2005", "BC050093");
            addPersonne(repository, "BOISSIEUX", "Sophie", Genre.FEMME, "05/09/2006", "BC060194");
            addPersonne(repository, "FERREIRA", "Manon", Genre.FEMME, "21/03/2004", "BC046782");
            addPersonne(repository, "GEMO", "Lucie", Genre.FEMME, "19/04/2005", "BC056396");
            addPersonne(repository, "PACE", "Anaelle", Genre.FEMME, "27/04/2005", "BC056762");
            addPersonne(repository, "PATRUNO", "Emma", Genre.FEMME, "30/08/2007", "BC070509");
            addPersonne(repository, "ROUGEON", "Lina", Genre.FEMME, "14/06/2005", "BC058334");
            addPersonne(repository, "DA SILVA", "Oceane", Genre.FEMME, "01/12/2003", "VT036798");
            addPersonne(repository, "DE ROSSI", "Maeva", Genre.FEMME, "17/10/2001", "VT019800");
            addPersonne(repository, "PATRUNO", "Anne-elodie", Genre.FEMME, "28/07/1984", "VT843415");
            addPersonne(repository, "VAYSSIERE", "Anna", Genre.FEMME, "19/12/2003", "VT038944");
            addPersonne(repository, "SERVEL", "Louise", Genre.FEMME, "17/04/1993", "VT930384");
            addPersonne(repository, "LOCATELLI", "Jeromine", Genre.FEMME, "12/12/1991", "VT910578");
            addPersonne(repository, "LOKMANE", "Hafsa-fatima", Genre.FEMME, "12/08/2003", "VT030196");
            addPersonne(repository, "LOCATELLI", "Elvina", Genre.FEMME, "07/06/1990", "VT900907");
            addPersonne(repository, "COSTA MOREIRA", "Chloé", Genre.FEMME, "14/12/2002", "VT026149");
            addPersonne(repository, "DEMIERE", "Arnaud", Genre.HOMME, "07/04/1993", "VT935956");
            addPersonne(repository, "GRILLOT", "Luca", Genre.HOMME, "28/06/2004", "BC044639");
            addPersonne(repository, "MANTEGARI", "Alexandre", Genre.HOMME, "13/11/1995", "VT953563");
            addPersonne(repository, "PEREZ", "Nicolas", Genre.HOMME, "02/12/2002", "VT029701");
            addPersonne(repository, "PIOZ", "Cody", Genre.HOMME, "01/09/2003", "VT037366");
            addPersonne(repository, "VIVIAND", "Emmanuel", Genre.HOMME, "23/04/1992", "VT922497");
            addPersonne(repository, "JIMENEZ MONTES", "Tony", Genre.HOMME, "07/01/2004", "BC046135");
            addPersonne(repository, "DA-CUNHA", "Anthony", Genre.HOMME, "17/08/2004", "BC047607");
            addPersonne(repository, "MEYNIER", "Jean Romain", Genre.HOMME, "30/07/1987", "VT873734");
            addPersonne(repository, "LE MOEL", "Paul", Genre.HOMME, "13/12/2002", "JH023551");
            addPersonne(repository, "TIROLE", "Lisimba", Genre.FEMME, "26/10/2003", "VT030825");
            addPersonne(repository, "BANCOD", "Laurence", Genre.FEMME, "07/03/1971", "VT710472");
            addPersonne(repository, "ECORCE", "Nathalie", Genre.FEMME, "05/10/1974", "VT744644");
            addPersonne(repository, "FAGNIEL", "Crystele", Genre.FEMME, "07/08/1971", "VT714141");
            addPersonne(repository, "HERENSTEIN", "Saoule", Genre.FEMME, "09/01/1968", "VT681608");
            addPersonne(repository, "PIOZ", "Méline", Genre.FEMME, "24/07/2001", "VT017228");
            addPersonne(repository, "PIOZ", "Christelle", Genre.FEMME, "22/01/1970", "VT700490");
            addPersonne(repository, "BETTON", "Stephane", Genre.HOMME, "28/01/1975", "JH754805");
            addPersonne(repository, "CICCARELLO", "Marc", Genre.HOMME, "21/10/2003", "VT037458");
            addPersonne(repository, "GOJOWCZYK", "Laurent", Genre.HOMME, "09/06/1970", "VT701117");
            addPersonne(repository, "PEREZ", "Robert", Genre.HOMME, "14/02/1952", "VT520445");
            addPersonne(repository, "TADEU", "Manuel", Genre.HOMME, "08/08/1972", "VT721423");
            addPersonne(repository, "TERMOZ-BAJAT", "Frederique", Genre.HOMME, "20/01/1980", "JH808305");


        };
    }

    private void addPersonne(PersonneRepository repository, String nom, String prenom, Genre genre, String dnaissance, String nlicence) {
        Personne prs = PersonneBuilder.create()
                .id(UUID.randomUUID().toString())
                .nom(nom)
                .prenom(prenom)
                .genre(genre)
                .dnaissance(convertString(dnaissance))
                .nlicence(nlicence)
                .build();
        repository.save(prs);
    }

    private LocalDate convertString(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        return LocalDate.parse(date, formatter);
    }
}
