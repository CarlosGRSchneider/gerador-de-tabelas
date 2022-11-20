package geradores;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GeradorFuncionario {

    private Random random = new Random();
    private final List<String> LISTA_NOME_MASCULINO_1 = List.of("Adão", "Aldo", "Ademir", "Adrian", "Afonso", "Adriano", "Alex", "Alexandre", "Alan", "Allan", "Ângelo", "Anisio", "Apolo", "Ari", "Artur", "Arthur", "Benito", "Benedito", "Benjamin", "Bartolomeu", "Brandon", "Bob", "Bruno", "Brian", "Bryan", "Byron", "Caio", "Caíque", "Caetano", "Carlos", "Charles", "Calvin", "Cássio",
            "Cauã", "Cauê", "Celso", "Celsio", "Christian", "Cristiano", "Ciro", "Claiton", "Clayton", "Dácio", "Dagoberto", "Dalton", "Daniel", "Danilo", "Dário", "David", "Davi", "Dino", "Denis", "Douglas", "Ed", "Eder", "Edmir", "Eduardo", "Edvaldo", "Eli", "Elias", "Eliseu", "Eliéser", "Élton", "Eric", "Erick", "Fábio", "Fabiano", "Fabricio", "Fausto", "Faustino", "Felipe", "Filipe", "Flavio", "Francis", "Fred", "Frederico",
            "Gael", "Gabriel", "Gaspar", "Gastão", "Galileu", "Giovani", "Giovanni", "Germano", "Geraldo", "Gerson", "Gil", "Gilson", "Haroldo", "Heitor", "Hélder", "Helio", "Henrique", "Henry", "Iago", "Ianis", "Ícaro", "Inácio", "Irineu", "Isaac", "Isaque", "Isaias", "Ismael", "Jack", "Jackson", "Jadir", "Jader", "Jair", "Jairo", "Jandir", "Jason", "Jefferson", "Jeferson", "Jonathan", "Jonas", "Jerônimo", "José", "João",
            "Kaique", "Kauã", "Kauan", "Kennedy", "Laerte", "Laertes", "Lauro", "Lázaro", "Leão", "Leandro", "Leôncio", "Leonel", "Leopoldo", "Levi", "Márcio", "Magnus", "Manoel", "Manuel", "Manassés", "Marco", "Marcos", "Marcus", "Marlom", "Martim", "Martinho", "Natanael", "Nataniel", "Nélson", "Nestor", "Nei", "Ney", "Nilmar", "Nicola", "Nicolas", "Nicolai", "Norivam",
            "Otavio", "Octávio", "Osvaldo", "Oswaldo", "Olavo", "Oliver", "Omar", "Onofre", "Omer", "Orestes", "Pedro", "Pablo", "Paulo", "Paolo", "Paco", "Patrício", "Paulino", "Querubim", "Rafael", "Rafaelo", "Rai", "Raimundo", "Ramiro", "Ramon", "Raphael", "Reginaldo", "Régis", "Renan", "Salomão", "Salvador", "Samuel", "Sandro", "Sebastião", "Simão", "Santiago", "Saúl", "Saulo", "Selton",
            "Taciano", "Tadeu", "Tales", "Tarcisio", "Tiago", "Thiago", "Telmo", "Thales", "Teodoro", "Ticiano", "Ubirajara", "Ubiratã", "Valten", "Valter", "Valdemar", "Vitor", "Vítor", "Vanderlei", "Victor", "Vitório", "Vladmir", "Vladimir", "Wagner", "Waldir", "Waldo", "Wesley", "Walter", "Washington", "Zacarias", "Zack", "Zaqueu", "Zaine");

    private final List<String> LISTA_NOME_MASCULINO_2 = List.of("Abel", "Adailton", "Adamastor", "Ademar", "Adolfo", "Aécio", "Agenor", "Ageu", "Aguinaldo", "Aureliano", "Belmiro", "Belchior", "Bento", "Beto", "Bonifácio", "Boris", "Bruce", "Basílio", "Bernardo", "Bosco", "Cadú", "Casimiro", "Castiel", "Cícero", "Cirilo", "Constantino", "Cristovão", "Cid", "Celestino", "Camilo",
            "Dalmo", "Dante", "Delfim", "Delfino", "Denzel", "Derik", "Domingos", "Dominique", "Dilan", "Dylan", "Edson", "Edison", "Emerson", "Evaristo", "Eurico", "Evandro", "Ezequiel", "Ezekiel", "Erasmo", "Enzo", "Ferdinando", "Ferdinand", "Floriano", "Fortunato", "Firmino", "Florêncio", "Floriano", "Florentino", "Fernão", "Félix", "Galeno", "Giancarlo", "Gianluca", "Gilmar", "Glauco", "Graciano", "Gregório", "Genésio", "Golias", "Guilherme",
            "Herbert", "Hermano", "Hernani", "Hugo", "Horacio", "Humberto", "Isidoro", "Ivo", "Israel", "Ike", "Ítalo", "Ivan", "Ikki", "Jadiel", "Jamal", "Januário", "Javier", "Jean", "Jessé", "Jessie", "Joabe", "Joel", "Jorge", "Kevin", "Kelvin", "Klaus", "Kleber",
            "Lino", "Linus", "Logan", "Lorenzo", "Lourenço", "Luan", "Lucas", "Luciano", "Lúcio", "Luís", "Luiz", "Mateus", "Matheus", "Matias", "Mauro", "Max", "Maximiliano", "Michel", "Miguel", "Milton", "Moisés", "Murilo", "Nildemar", "Nivaldo", "Noah", "Noé", "Noel", "Nonato", "Norberto", "Norildo", "Nuno", "Norimar", "Orlando", "Óscar", "Osias", "Osmam", "Osório", "Otacilio", "Otto", "Olin",
            "Patrick", "Pepe", "Pascoal", "Percival", "Péricles", "Pierre", "Porfírio", "Quintino", "Reinaldo", "Ricardo", "Roberto", "Robson", "Rodolfo", "Rodinei", "Rômeu", "Romulo", "Rodinei", "Rui", "Ruy", "Sidnei", "Sidney", "Silas", "Sertório", "Sílvio", "Stefan", "Stefano", "Stenio", "Steve", "Severino",
            "Tierri", "Tierry", "Theo", "Thomas", "Tomas", "Thomaz", "Tobias", "Tom", "Tomé", "Tulio", "Ulisses", "Urbano", "Uriel", "Valentim", "Valentino", "Vinicio", "Vinicíus", "Vicente", "Vincent", "Wellington", "Wendel", "Wesley", "Will", "William", "Wilson", "Xico", "Xavier", "Yago", "Yuri");

    private final List<String> LISTA_NOME_FEMININO_1 = List.of("Ada", "Ana", "Anna", "Adéle", "Adélia", "Adelaide", "Adriana", "Adrianne", "Adrielle", "Adriely", "Ágata", "Agatha", "Agnes", "Anabela", "Anabelle", "Anitta", "Antonela", "Antonella", "Ashley", "Bárbara", "Beatrice", "Beatriz", "Bela", "Bella", "Belmira", "Bernardete", "Benedita", "Benedicta", "Benícia", "Bibiana", "Cássia", "Caetana", "Caitiane",
            "Camélia", "Camila", "Camilly", "Candelária", "Candice", "Cândida", "Cáren", "Celina", "Celine", "Cibele", "Cibelly", "Cinara", "Cynara", "Cris", "Conceiçâo", "Cintia", "Daci", "Darci", "Darcy", "Dádiva", "Daiana", "Daiane", "Daisy", "Deise", "Dália", "Dalma", "Dalila", "Dolores", "Dominique", "Eden", "Edmeia", "Edy", "Edith", "Edite", "Eduarda", "Elba", "Evania", "Elaine", "Elanor", "Electra", "Elsa", "Elza", "Esther", "Ester", "Eva", "Evelyn",
            "Fábia", "Fabíola", "Fabiana", "Fabricia", "Fátma", "Fatima", "Felicia", "Felipa", "Filipa", "Fernanda", "Fernandina", "Gabriela", "Gabriele", "Gabrieli", "Gaia", "Galdina", "Gardênia", "Genúsia", "Geórgia", "Georgiana", "Gina", "Gertrudes", "Hadassa", "Heidi", "Hannah", "Hayla", "Hebe", "Hedviges", "Hilda",
            "Iara", "Iasmin", "Iasmine", "Ida", "Idália", "Inacia", "Inês", "Ingrid", "Iolanda", "Ione", "Iracema", "Irene", "Jaciane", "Jacira", "Jéssica", "Jade", "Jamila", "Jandira", "Jane", "Jani", "Janete", "Janaina", "Joséfina", "Judith", "Judite", "Kamila", "Kamile", "Kamilly", "Karen", "Karina", "Karine", "Karla", "Karol", "Karolina", "Katarina", "Katharina", "Laila", "Laís", "Laisa", "Lana", "Lara", "Larissa", "Larisse", "Laura", "Lavínia", "Layla", "Layane", "Lia", "Liana", "Liane", "Lis", "Lisa", "Lizandra", "Luana", "Luara", "Luciana", "Luciane", "Luna", "Luz",
            "Mabel", "Mabelly", "Magali", "Magda", "Mafalda", "Maira", "Maíra", "Maisa", "Maia", "Maiara", "Maria", "Mariah", "Marieta", "Marina", "Marisa", "Marise", "Marta", "Martha", "Mel", "Milena", "Mirela", "Monise", "Morgana", "Nádia", "Nadine", "Nadja", "Nair", "Nancy", "Naomi", "Nara", "Narcisa", "Natália", "Nathalia", "Natacha", "Natasha", "Nathaly", "Odete", "Ofélia", "Olalia", "Olga", "Olímpia", "Palmira", "Paloma", "Pamela", "Pâmela", "Pandora", "Patricia", "Pátricia", "Pérsia", "Perla", "Pérola", "Quin", "Quinn",
            "Rachel", "Raquel", "Raquela", "Rafaela", "Raimunda", "Raissa", "Ramona", "Raphaela", "Rebeca", "Rebekah", "Ravena", "Rubia", "Rute", "Ruth", "Sabina", "Sabrina", "Sacha", "Sally", "Safira", "Salete", "Samanta", "Samantha", "Samara", "Sami", "Sandy", "Serafina", "Seraphina", "Silvia", "Simone", "Sofia", "Sophia", "Sophie", "Suri", "Suzana", "Tais", "Taís", "Thais", "Tabita", "Taciana", "Tainá", "Tainara", "Taíssa", "Talita", "Tamara", "Tamára", "Telma", "Teodora", "Theodora", "Uriela", "Valdete", "Valência", "Valentina", "Vânia", "Valéria", "Valquiria",
            "Vanusa", "Vanuza", "Velma", "Venusa", "Venuza", "Wanda", "Wanessa", "Wendy", "Whitney", "Xandra", "Yara", "Yasmin", "Yngird", "Yohanna", "Zahra", "Zaira", "Zamy", "Zeferina", "Zélia");


    private final List<String> LISTA_NOME_FEMININO_2 = List.of("Alana", "Aisha", "Alba", "Alberta", "Albertina", "Alcione", "Alessandra", "Alexandra", "Alexa", "Alice", "Alicia", "Alvina", "Amanda", "Ambrósia", "Anastácia", "Andréa", "Andréia", "Andressa", "Ângela", "Angelina", "Amanda", "Aparecida", "Betina", "Blanche", "Bia", "Bianca", "Brena", "Brenda", "Brianna", "Bruna", "Brunilda", "Brigite", "Carina", "Carine", "Clarissa", "Carla", "Carolina", "Caroline", "Cármen", "Carmina", "Carol", "Catalina", "Catarina", "Catharina", "Catarine", "Chiara", "Claudia",
            "Claudiana", "Claudiane", "Constança", "Dana", "Dânia", "Dandara", "Danielle", "Daniela", "Danielly", "Darlene", "Débora", "Deborah", "Denise", "Diva", "Dulce", "Élia", "Eliana", "Eliane", "Elis", "Elisa", "Elisabete", "Elisabeth", "Eloá", "Eloah", "Eloisa", "Emília", "Emanuela", "Emanuelle", "Érica", "Eunice", "Flávia", "Flor", "Flora", "Florênça", "Florencia", "Florentina", "Franciele", "Francielly", "Francisca", "Francine",
            "Geovana", "Giovana", "Gisela", "Giselle", "Gislaine", "Gladys", "Giuliana", "Glória", "Graziela", "Grazielle", "Grazielly", "Helen", "Helena", "Heloísa", "Heloise", "Henriqueta", "Hera", "Hilary", "Iris", "Isis", "Isabel", "Isabela", "Isabelle", "Isadora", "Ivana", "Ivone", "Ivete", "Ivy", "Izabel", "Ivana", "Jaqueline", "Jasmin", "Jeane", "Jeni", "Jennifer", "Joana", "Joelma", "Joice", "Jorgina", "Joyce", "Júlia", "Juliete", "Juliana", "Julieta", "Jussara",
            "Katia", "Kátia", "Kauane", "Kayla", "Keli", "Kelly", "Keila", "Kim", "Kimberly", "Kiara", "Léa", "Leah", "Leila", "Leilani", "Leonor", "Leonora", "Léslie", "Letícia", "Lídia", "Ligia", "Lilian", "Liliane", "Linda", "Lohana", "Louise", "Luiza", "Luisa", "Lucy", "Lumena", "Ludimila", "Lurdes", "Maitê", "Manoela", "Mara", "Marcela", "Márcia", "Margarida", "Mariana", "Matilda", "Matilde", "Marilia", "Marilene", "Marilise", "Marisol", "Maristela", "Marli", "Marly", "Madalena", "Magdalena", "Mônica", "Monique",
            "Naiara", "Nayara", "Nazaré", "Neci", "Neli", "Nélia", "Neusa", "Nicole", "Nídia", "Norma", "Norberta", "Oriana", "Orianna", "Orlandina", "Osmarina", "Oliva", "Olivia", "Paula", "Paola", "Paulina", "Pauline", "Pietra", "Philippa", "Pilar", "Poliana", "Primavera", "Priscila", "Quintina", "Regina", "Rejane", "Regiane", "Renata", "Rita", "René", "Roberta", "Robin", "Rosana", "Rosane", "Rosalina", "Rose", "Rosêane", "Roxane",
            "Sansa", "Sara", "Sarah", "Sarai", "Selena", "Selene", "Selina", "Sharon", "Sheila", "Shirley", "Siena", "Sienna", "Sierra", "Silene", "Soraia", "Stefani", "Stephanie", "Sueli", "Suelen", "Tereza", "Theresa", "Teresa", "Terezinha", "Thalita", "Thuane", "Tuane", "Thuanny", "Tulane", "Ticiane", "Tifanny", "Úrsula", "Vera", "Verena", "Veridiana", "Verônica", "Vicenza", "Vicky", "Victória", "Vitoria", "Violet", "Vivian", "Viviana", "Vivianne",
            "Willa", "Willou", "Wilma", "Winnie", "Ximena", "Yolana", "Ysabel", "Yvette", "Yvone", "Zelma", "Zila", "Zilá", "Zola", "Zora", "Zuleima");

    private final List<String> LISTA_SOBRENOME_1 = List.of("Abreu", "Adorno", "Aguiar", "de Aguiar", "Albuquerque", "Alcântara", "Amaral", "Alves", "Álvares", "Almeida", "de Almeida", " Alencar", "Assis", "de Assis", "Araújo", "Bueno", "Bragança", "Braga", "Borges", "Bocaiuva", "Bispo", "Batista", "Bastos", "Barreto", "Bandeira", "Costa", "Cordeiro", "Coimbra", "Chaves", "Castilho", "Carneiro", "Cardoso", "Camargo", "Camacho", "Cabral", "Cruz", "Cunha",
            "Delfino", "Dourado", "Dutra", "Encarnação", "Evangelista", "Dantas", "Frota", "França", "Fontes", "Figueiredo", "Figo", "Figueira", "Fernandes", "Ferraz", "Farias", "Faria", "Fagundes", "Furtado", "Fontoura", "da Fontoura", "Guerreiro", "Guimarães", "Guarato", "Gonçalves", "Gonçales", "Generoso", "Garcia", "Galvão", "Henriques", "Hidelfonso", "Holanda", "de Holanda", "Idelfonso", "Ildefonso",
            "Jardim", "de Jesus", "Klein", "Kappel", "Keler", "Keller", "Klos", "Koch", "Kochman", "Kolling", "Kross", "Luz", "Lopes", "Locatelli", "Lira", "Lins", "Libânio", "Levy", "Leite", "Laubert", "Lacerda", "Leão", "Müller", "Moreira", "Morbeck", "Monteiro", "Milhomem", "Menezes", "Melo", "de Melo", "Mello", "Medeiros", "de Medeiros", "Matos", "de Mattos", "Mascarenhas", "Martins", "Marinho", "Maduro", "Madureira", "Macedo", "Nielsen", "de Noronha", "Noronha", "Nogueira", "Negrete", "Negreiros", "Neis", "Navarro", "Nascimento", "Namorado",
            "Olioti", "Outeiro", "Ortiz", "Portugal", "Porto", "Pontes", "Pires", "Pinto", "Pinheiro", "Perez", "Peres", "Pereira", "Penteado", "Pellegrini", "Peixoto", "de Peixoto", "Peçanha", "Pascoal", "de Pascoal", "Pascal", "Papanicolau", "Pais", "Paes", "Pacheco", "Quadros", "de Quadros", "Quaresma", "Ramalhete", " Ramalho", "Ramires", "Ramos", " Rangel", " Rebouças", "Rehder", " Reis", "dos Reis", "Resende", "Rolov", " Roloff",
            "Soeiro", "Soares", "Siqueira", "Silveira", "da Silveira", "Silva", "da Silva", "Seixas", "Saraiva", "Santos", "dos Santos", "Santarrosa", "Santander", "Sander", "Sandes", "Sampaio", "Sá", "de Sá", "Schulz", "Schultz", "Schutz",
            "Toni", "Torquato", "Toledo", "Tales", "Tavares", "Uchoa", "Wagner", "Valadares", "Valverde", "Varela", "Vasques", "Vaz", "Velasques", "Viana", "Vilela", "Xavier", "Zimmerman");

    private final List<String> LISTA_SOBRENOME_2 = List.of("Amorim", "Anchieta", "Aragão", "Apolinário", "Antunes", "Antônio", "Anjos", "dos Anjos", "Andrioli", "Andrade", "Andrada", "Azeredo", "Arruda", "Azevedo", "de Bruni", "Brito", "Brasil", "Brandão", "Borba", "Bernardes", "Bernades", "Barroso", "Barros", "de Barros", "Barbosa", "Couto", "Coutinho", "Conceição", "da Conceição", "Coelho", "Castro", "Carvalho", "Carmo", "Cândido", "Camões", "Caldas",
            "Dias", "Dorneles", "Eça", "Esteves", "Exaltação", "Escandiel", "Duarte", "Freitas", "Freire", "Fortaleza", "Fonseca", "Fioravante", "Ferreira", "Ferro", "Ferrão", "Faro", "Faleiros", "Flores", "de Flores", "de Gusmão", "Gusmão", "Garcez", "Gouveia", "Gonzaga", "Gomes", "Garrastazu", "Gama", "da Gama",
            "Hernandes", "Hoffmann", "Horas", "Igrejas", "Iglesias", "de Inácio", "Jordão", "Junqueira", "Kremer", "Kerber", "Kern", "Killing", "Kopp", "Knas", "Kramer", "Kraemer", "Kuhn", "Lochner", "Lutz", "Louzada", "Lisboa", "de Lima", "Lima", "Lemes", "Leme", "Leitão", "Lange", "Muniz", "Moro", "Morato", "Moraes", "de Moraes", "Morais", "Miranda", "Mesquita", "Messias", "Mendonça", "Mendes", "Meireles", "Médici", "Massa", "Marques", "Mariz", "Malafaia", "Magalhães", "Machado", "Malta", "de Malta",
            "Netto", "Nunez", "Nunes", "da Nóbrega", "Nóbrega", "das Neves", "Neves", "Naves", "Navalhes", "Nantes", "Oliva", "Oliveira", "de Oliveira", "Prudente", "Prado", "de Prado", "Policarpo", "Poeta", "Pimentel", "Pimenta", "Pessoa", "Pelizzaro", "Peña", "de la Peña", "Penna", "Pedroso", "Pedrosa", "Patriota", "Principe", "Parreira", "Paixão", "Paiva", "Padrão", "Queirós", "Queiroz",
            "Ribeiro", "Rios", "Rocha", "da Rocha", "Rodriguez", "Rodrigues", "Roma", "Romão", "Roçadas", "Rollemberg", "Rolembergue",
            "Stein", "Souza", "Sousa", "de Souza", "Simões", "Serrano", "Serra", "Saramago", "Saragoça", "Santiago", "Santana", "da Santana", "Santacruz", "Sanches", "Sacramento", "Schneider", "Schmidt", "Schmitt",
            "da Trindade", "Trindade", "Teles", "Teixeira", "de Teixeira", "Uribe",
            "Wasconcelos", "Valença", "Valente", "Vasconcelos", "Veiga", "Veloso", "Vieira", "Vilhena", "Vicente", "Young", "Zema");

    private final List<String> LISTA_OPERADORAS_PLANO_SAUDE = List.of("Unimed", "Sul América", "Doctor Clin");

    public GeradorFuncionario() {
    }

    public String geraNomeFuncionario() {
        double nomeFuncionario = random.nextDouble();
        String nome = nomeFuncionario > 0.5 ? geraNomeMasculino() : geraNomeFeminino();
        String sobrenome = geraSobrenome();
        return nome + " " + sobrenome;
    }

    private String geraNomeMasculino() {
        double tipoNome = random.nextDouble();
        return tipoNome > 0.5 ? geraNomeMasculinoSimples() : geraNomeMasculinoComposto();

    }

    private String geraNomeMasculinoSimples() {
        double nome = random.nextDouble();
        return nome > 0.5 ? geraPrimeiroNomeMasculino() : geraSegundoNomeMasculino();
    }

    private String geraNomeMasculinoComposto() {
        double ordemNome = random.nextDouble();
        return ordemNome > 0.5 ? geraPrimeiroNomeMasculino() + " " + geraSegundoNomeMasculino()
                : geraSegundoNomeMasculino() + " " + geraPrimeiroNomeMasculino();
    }

    private String geraPrimeiroNomeMasculino() {
        return LISTA_NOME_MASCULINO_1.get(random.nextInt(LISTA_NOME_MASCULINO_1.size()));
    }

    private String geraSegundoNomeMasculino() {
        return LISTA_NOME_MASCULINO_2.get(random.nextInt(LISTA_NOME_MASCULINO_2.size()));
    }

    private String geraNomeFeminino() {
        double tipoNome = random.nextDouble();
        return tipoNome > 0.5 ? geraNomeFemininoSimples() : geraNomeFemininoComposto();
    }


    private String geraNomeFemininoSimples() {
        double nome = random.nextDouble();
        return nome > 0.5 ? geraPrimeiroNomeFeminino() : geraSegundoNomeFeminino();
    }

    private String geraNomeFemininoComposto() {
        double ordemNome = random.nextDouble();
        return ordemNome > 0.5 ? geraPrimeiroNomeFeminino() + " " + geraSegundoNomeFeminino()
                : geraSegundoNomeFeminino() + " " + geraPrimeiroNomeFeminino();
    }

    private String geraPrimeiroNomeFeminino() {
        return LISTA_NOME_FEMININO_1.get(random.nextInt(LISTA_NOME_FEMININO_1.size()));
    }

    private String geraSegundoNomeFeminino() {
        return LISTA_NOME_FEMININO_2.get(random.nextInt(LISTA_NOME_FEMININO_2.size()));
    }

    private String geraSobrenome() {
        double tipoSobrenome = random.nextDouble();
        return tipoSobrenome > 0.5 ? geraSobrenomeSimples() : geraSobrenomeComposto();

    }

    private String geraSobrenomeSimples() {
        double sobrenome = random.nextDouble();
        return sobrenome > 0.5 ? geraPrimeiroSobrenome() : geraSegundoSobrenome();
    }

    private String geraSobrenomeComposto() {
        double ordemSobrenome = random.nextDouble();
        return ordemSobrenome > 0.5 ? geraPrimeiroSobrenome() + " " + geraSegundoSobrenome()
                : geraSegundoSobrenome() + " " + geraPrimeiroSobrenome();
    }

    private String geraPrimeiroSobrenome() {
        return LISTA_SOBRENOME_1.get(random.nextInt(LISTA_SOBRENOME_1.size()));
    }

    private String geraSegundoSobrenome() {
        return LISTA_SOBRENOME_2.get(random.nextInt(LISTA_SOBRENOME_2.size()));
    }

    public String geraCpfFuncionario() {
        StringBuilder sb = new StringBuilder();
        while (sb.length() != 11) {
            sb.append(random.nextInt(10));
        }

        return sb.toString();
    }

    public Integer geraIdade() {
        return random.nextInt(30) + 20;
    }

    public LocalDate geraDataAdmissao() {
        long dataInicio = LocalDate.of(2010, 01, 01).toEpochDay();
        long dataFim = LocalDate.of(2020, 12, 31).toEpochDay();
        return LocalDate.ofEpochDay(ThreadLocalRandom
                .current()
                .nextLong(dataInicio, dataFim));
    }

    public String geraDataDesligamento() {
        Double possivelDesligamento = random.nextDouble();
        if (possivelDesligamento > 0.8) {
            long dataInicio = LocalDate.of(2021, 01, 01).toEpochDay();
            long dataFim = LocalDate.now().toEpochDay();
            LocalDate dataDesligamento = LocalDate.ofEpochDay(ThreadLocalRandom
                    .current()
                    .nextLong(dataInicio, dataFim));

            return "'" + dataDesligamento + "'";
        }
        return "null";
    }

    public Double geraSalario(int senioridade) {
        switch (senioridade) {
            case 1:
                return 1500.00;
            case 2:
                return random.nextInt(1500) + 1500.0;
            case 3:
                return random.nextInt(4000) + 2500.0;
            case 4:
                return random.nextInt(6000) + 6000.0;
            case 5:
                return random.nextInt(10000) + 12000.0;
            default:
                return 0.0;
        }
    }

    public String geraOperadoraPlanoSaude() {
        double possivelPlano = random.nextDouble();
        if (possivelPlano < 0.4) {
            return LISTA_OPERADORAS_PLANO_SAUDE.get(0);
        } else if (possivelPlano >= 0.4 && possivelPlano < 0.65) {
            return LISTA_OPERADORAS_PLANO_SAUDE.get(1);
        } else if (possivelPlano >= 0.65 && possivelPlano < 0.85) {
            return LISTA_OPERADORAS_PLANO_SAUDE.get(2);
        }
        return "null";
    }

    public String geraDependentes() {
        double possivelDependente = random.nextDouble();
        if (possivelDependente > 0.15) {
            Integer numeroDependentes = random.nextInt(5);
            return numeroDependentes.toString();
        }
        return "null";
    }

    public Integer geraSetor() {
        return random.nextInt(5) + 1;
    }
}
