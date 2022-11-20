import entradas.Endereco;
import entradas.Funcionario;
import entradas.Senioridade;
import entradas.Setor;
import tabelas.Tabelas;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        long instante = System.currentTimeMillis();
        String nomeArquivo = "script_sql_" + instante +".txt";
        int quantidadeDados = 3000;

        try(FileWriter fw = new FileWriter(nomeArquivo)) {

            fw.write(Tabelas.criaTabelas());
            fw.write(Setor.geraSetores());
            fw.write(Senioridade.geraSenioridades());
            fw.write(Funcionario.geraFuncionarios(quantidadeDados));
            fw.write(Endereco.geraEnderecos(quantidadeDados));

            long instanteFinal = System.currentTimeMillis();

            System.out.println("Script gerado em " + (instanteFinal - instante)/1000.0 + " segundos");
        }
    }
}
