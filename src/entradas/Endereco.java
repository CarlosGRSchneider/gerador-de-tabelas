package entradas;

import geradores.GeradorEndereco;

public class Endereco {

    private static GeradorEndereco gerador = new GeradorEndereco();

    public static String geraEnderecos(int quantidadeEnderecos) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= quantidadeEnderecos; i++) {
            sb.append("insert into endereco(id_funcionario, cep, logradouro, numero, complemento, bairro, cidade, estado) \n" +
                    "    values (" + i + ", '" + gerador.geraCep() + "', '" + gerador.geraLogradouro() + "', " + gerador.geraNumero() + ", " + gerador.geraComplemento() + ", ' " + gerador.geraBairro() + " ', '" + gerador.geraCidade() + "', '" + gerador.geraUf() + "');\n");
        }

        return sb.toString();
    }
}
