package tabelas;

public class Tabelas {

    public static String criaTabelas() {

        StringBuilder sb = new StringBuilder();
        sb.append(criaTabelaFuncionario());
        sb.append("\n");
        sb.append(criaTabelaSetor());
        sb.append("\n");
        sb.append(criaTabelaSenioridade());
        sb.append("\n");
        sb.append(criaTabelaEndereco());
        sb.append("\n");

        return sb.toString();
    }

    private static String criaTabelaFuncionario() {
        return "create table funcionario( \n" +
                "   id serial primary key, \n" +
                "   nome varchar(255) not null, \n" +
                "   cpf varchar(11) not null unique, \n" +
                "   idade integer, \n" +
                "   data_admissao date not null, \n" +
                "   data_desligamento date, \n" +
                "   salario numeric not null, \n" +
                "   operadora_plano_saude varchar(40), \n" +
                "   numero_dependentes smallint, \n" +
                "   id_setor smallint not null, \n" +
                "   id_senioridade smallint not null);\n";
    }

    private static String criaTabelaSetor() {
        return "create table setor( \n" +
                "    id serial primary key, \n" +
                "    nome_setor varchar(40) not null unique);\n";
    }

    private static String criaTabelaSenioridade() {
        return "create table senioridade( \n" +
                "    id serial primary key, \n" +
                "    grau_senioridade varchar(40) not null unique, \n" +
                "    valor_bonus numeric not null);\n";
    }

    private static String criaTabelaEndereco() {
        return "create table endereco( \n" +
                "    id serial primary key, \n" +
                "    id_funcionario integer not null, \n" +
                "    cep varchar(8) not null, \n" +
                "    logradouro varchar(150) not null, \n" +
                "    numero smallint not null, \n" +
                "    complemento varchar(25), \n" +
                "    bairro varchar(150) not null, \n" +
                "    cidade varchar(150) not null, \n" +
                "    estado varchar(2) not null);\n";
    }
}
