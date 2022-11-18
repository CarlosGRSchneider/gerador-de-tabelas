package geradores;

import java.util.List;
import java.util.Random;

public class GeradorEndereco {

    private Random random = new Random();

    private final List<String> LISTA_LOGRADOUROS = List.of("Alameda ", "Avenida ", "Estrada ", "Rua ");

    private final List<String> LISTA_NOME_LOGRADOUROS = List.of("A", "Acioli Monteiro", "Adelino Jorge Montenegro", "Alagoas", "Almirante Barroso", "Almirante Noronha", "Amazonas", "Anita Garibaldi", "Antônio Mariani", "Antônio Pereira Martins", "Argentina", "Ariano Suassuna", "Açores", "B", "Bahia", "Barão de Cotegipe", "Barão de Santa Tecla", "Bela Vista", "Belo Horizonte", "Bento Gonçalves", "Bento XVI", "Boa Vista", "Brasil", "C",
            "California", "Carmem de Sá", "Castro Alves", "Ceará", "Cinco", "Clarice Lispector", "Comendador Assad Abdalla", "Conde de Porto Alegre", "Cravo do Campo", "Cruz Alta", "Darcy Xavier", "David Canabarro", "Diamantina", "Dias Reis", "Divina Providência", "Dois", "Dom Pedro II", "Domingos de Almeida", "Domingos Ramos", "Doutor Americano", "Duque De Caxias", "Espirito Santo", "Estônia", "Fernando Pessoa", "Fernando de Noronha",
            "Frei Caneca", "Galatea", "General Neto", "General Osório", "Germano dos Santos", "Goias", "Governador Macedo Soares", "Guanabara", "Havana", "Henrique Jorge Guedes", "Iguatemi", "Itu", "Jânio Quadros", "John Redford", "José Bonifácio", "José Lins", "João Barreto de Menezes", "Julia Lopes de Almeida", "Lima e Silva", "Los Angeles", "Machado de Assis", "Madre Maria Josefina", "Maranhão", "Marco Antônio", "Mario Quintana",
            "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Monteiro Lobato", "Nazaré", "Nelson Ferreira", "Nico Fagundes", "Nova Olinda", "Nove de Agosto", "Olaria", "Onze de Maio", "Oscar Maia", "Osvaldo Cruz", "Ouro Verde", "Paraná", "Paraíba", "Pará", "Pernambuco", "Piauí", "Porto Luís", "Portugal", "Primeiro de Maio", "Principal", "Quatro", "Quinze de novembro", "Rio De Janeiro", "Rio da Prata", "Rios Claros", "Oscarina Maria de Jesus",
            "Rubens Mascarenhas", "Rui Barbosa", "Rynaldo Borgianni", "Santa Catarina", "Santa Luisa", "Santa Luzia", "Santa Maria", "Santa Rita", "Santo Antônio", "Santos Dumont", "Sergipe", "Sete de Setembro", "Soldado José Reymão", "São Francisco", "São Jorge", "São José", "São João", "São Luiz", "São Paulo", "São Pedro", "São Sebastião", "Tiradentes", "Três", "Três Passos ", "Três de Março", "Um", "Uruguai", "Vasco da Gama",
            "Venceslau José Bernardes", "Vinte e Um de Abril", "Vitorino", "Vitória", "Wando Henrique Cardim", "Ype", "Zumbi dos Palmares", "da Conceição", "da Legalidade", "da Paz", "das Flores", "das Florestas", "das Hortências", "do Comercio", "do Mar", "do Ouvidor", "do Riachuelo", "dos Estados", "dos Eucaliptos", "da Pedreira", "das Industrias", "da Aliança", "dos Ferreiros", "da Prata", "das Videiras");

    private final List<String> LISTA_COMPLEMENTOS = List.of("Apto " + random.nextInt(1000), "Apartamento " + random.nextInt(1000), "Apt " + random.nextInt(1000), "Bloco A", "Bloco B", "Bloco C", "Casa 1", "Casa 2", "Casa 3", "Casa 4", "Casa 5");

    private final List<String> LISTA_BAIRROS = List.of("Altos do Tucano", "Alvorada", "Anchieta", "Aparecida", "Areal", "Asa Branca", "Bela Floresta", "Bela Suiça", "Bela Vista", "Benfica", "Boa Vista", "Bom Fim", "Brasilia", "Cachoeiras", "Cambará", "Campo Grande", "Canaã", "Cascavel Velho", "Centro", "Cidade Alta", "Cidade Baixa", "Cidade Nova", "Concórdia", "Conventos", "Cruzeiro", "Dom Bosco", "Engenho Novo", "Fazendinha",
            "Feitoria", "Felicidade", "Floresta Imperial", "Floresta Negra", "Fonte Nova", "Fragata", "Galeão", "Ilha do Governador", "Industrial", "Jardim Anchieta", "Jardim Bandeirante", "Jardim Elvira", "Jardim Morro Azul", "Joá", "Juscelino Kubitschek", "Lagoa Vermelha", "Las Palmas", "Liberdade", "Luther King", "Madureira", "Mangueiras", "Mar e Céu", "Marco Zero", "Maresias", "Mauá", "Moinhos de Ventos", "Montes Claros",
            "Morro dos Espelhos", "Mundo Real", "Nova Esperança", "Nova Rezende", "Nova Roma", "Olaria", "Olimpia", "Ouro Branco", "Parque Continental", "Parque das Estrelas", "Passo da Areia", "Pedras Altas", "Petropolis", "Picada Café", "Pilares", "Pindorama", "Planalto", "Porto", "Porto Velho", "Povo Novo", "Poço Fundo", "Primavera", "Princesa Isabel", "Provedor", "Quinta da Barra", "Quinze de Setembro", "Raposo Tavares",
            "Remédios", "Rio Largo", "Sabará", "Santa Clara", "Santa Felicidade", "Santa Fé", "Santa Inês", "Santa Tereza", "Santa Terezinha", "Santo Antônio", "Santâna", "Serrano", "São Cristóvão", "São Francisco", "São José", "São Lázaro", "Tamandaré", "Tombos", "Triunfo", "Três Vendas", "Ulisses", "Universidade", "União", "Vale dos Bois", "Valparaiso", "Vila Mariana", "Vila Militar", "Vila Nova", "Vila Velha", "Vila Pavão", "Vila Yolanda", "Vista Alegre", "Vitória");

    private final List<String> LISTA_CIDADES = List.of("Abaetetuba", "Alagoinhas", "Alvorada", "Americana", "Ananindeua", "Angra dos Reis", "Anápolis", "Aparecida de Goiânia", "Aracaju", "Araguaína", "Arapiraca", "Araraquara", "Araras", "Araçatuba", "Barra Mansa", "Barreiras", "Barueri", "Bauru", "Belford Roxo", "Belo Horizonte", "Belém", "Betim", "Blumenau", "Boa Vista", "Brusque", "Cabo Frio", "Cabo de Santo Agostinho", "Cachoeiro de Itapemirim", "Camaragibe",
            "Camaçari", "Campina Grande", "Campinas", "Campo Grande", "Campo Largo", "Campos dos Goytacazes", "Canoas", "Carapicuíba", "Cariacica", "Caruaru", "Cascavel", "Castanhal", "Caucaia", "Caxias", "Caxias do Sul", "Chapecó", "Colombo", "Contagem", "Cotia", "Criciúma", "Cuiabá", "Diadema", "Divinópolis", "Dourados", "Duque de Caxias", "Embu das Artes", "Feira de Santana", "Ferraz de Vasconcelos", "Florianópolis", "Fortaleza", "Foz do Iguaçu", "Franca",
            "Francisco Morato", "Franco da Rocha", "Goiânia", "Governador Valadares", "Gravataí", "Guarapuava", "Guarujá", "Guarulhos", "Hortolândia", "Ibirité", "Ilhéus", "Imperatriz", "Indaiatuba", "Ipatinga", "Itaboraí", "Itabuna", "Itajaí", "Itapecerica da Serra", "Itapetininga", "Itapevi", "Itaquaquecetuba", "Itu", "Jaboatão dos Guararapes", "Jacareí", "Jandira", "Jaraguá do Sul", "Jequié", "Joinville", "João Pessoa", "Juiz de Fora", "Jundiaí", "Lages",
            "Lauro de Freitas", "Limeira", "Linhares", "Londrina", "Luziânia", "Macapá", "Macaé", "Maceió", "Magé", "Marabá", "Maracanaú", "Maricá", "Maringá", "Marília", "Mauá", "Mesquita", "Mogi Guaçu", "Mogi das Cruzes", "Montes Claros", "Mossoró", "Natal", "Nilópolis", "Niterói", "Nossa Senhora do Socorro", "Nova Friburgo", "Nova Iguaçu", "Novo Hamburgo", "Olinda", "Osasco", "Palhoça", "Palmas", "Paranaguá", "Parauapebas", "Parnamirim", "Parnaíba", "Passo Fundo",
            "Patos", "Paulista", "Pelotas", "Petrolina", "Petrópolis", "Pindamonhangaba", "Piracicaba", "Ponta Grossa", "Porto Alegre", "Porto Seguro", "Porto Velho", "Pouso Alegre", "Poços de Caldas", "Praia Grande", "Presidente Prudente", "Queimados", "Recife", "Ribeirão Preto", "Ribeirão das Neves", "Rio Branco", "Rio Claro", "Rio Grande", "Rio Verde", "Rio das Ostras", "Rio de Janeiro", "Rondonópolis", "Salvador", "Santa Bárbara", "Santa Cruz do Sul", "Santa Luzia",
            "Santa Maria", "Santarém", "Santo André", "Santos", "Serra", "Sete Lagoas", "Sobral", "Sorocaba", "Sumaré", "Suzano", "São Bernardo do Campo", "São Caetano do Sul", "São Carlos", "São Gonçalo", "São José", "São José de Ribamar", "São José do Rio Preto", "São José dos Campos", "São José dos Pinhais", "São João de Meriti", "São Leopoldo", "São Luís", "São Paulo", "São Vicente", "Taboão da Serra", "Taubaté", "Teixeira de Freitas", "Teresina", "Teresópolis",
            "Timon", "Trindade", "Uberaba", "Uberlândia", "Valparaíso", "Viamão", "Vila Velha", "Vitória", "Vitória da Conquista", "Volta Redonda", "Várzea Grande", "Águas Lindas");

    private final List<String> LISTA_UFS = List.of("AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO");

    public GeradorEndereco() {
    }

    public String geraCep() {
        StringBuilder sb = new StringBuilder();

        while (sb.length() != 8) {
            sb.append(random.nextInt(10));
        }

        return sb.toString();
    }

    public String geraLogradouro() {
        return geraTipoLogradouro() + geraNomeLogradouro();
    }

    private String geraTipoLogradouro() {
        return LISTA_LOGRADOUROS.get(random.nextInt(LISTA_LOGRADOUROS.size()));
    }

    private String geraNomeLogradouro() {
        return LISTA_NOME_LOGRADOUROS.get(random.nextInt(LISTA_NOME_LOGRADOUROS.size()));
    }

    public Integer geraNumero() {
        return random.nextInt(3000);
    }

    public String geraComplemento() {
        double complemento = random.nextDouble();

        return complemento > 0.3 ? "'" + LISTA_COMPLEMENTOS.get(random.nextInt(LISTA_COMPLEMENTOS.size())) + "'" : "null";
    }

    public String geraBairro() {
        return LISTA_BAIRROS.get(random.nextInt(LISTA_BAIRROS.size()));
    }

    public String geraCidade() {
        return LISTA_CIDADES.get(random.nextInt(LISTA_CIDADES.size()));
    }

    public String geraUf() {
        return LISTA_UFS.get(random.nextInt(LISTA_UFS.size()));
    }
}
