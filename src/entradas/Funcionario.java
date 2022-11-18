package entradas;

import geradores.GeradorFuncionario;

import java.util.Random;

public class Funcionario {
    private static Random random = new Random();
    private static GeradorFuncionario gerador = new GeradorFuncionario();

    public static String geraFuncionarios(int quantidadeGerada) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < quantidadeGerada; i++) {

            int senioridade = random.nextInt(5) + 1;
            sb.append("insert into funcionario(nome, cpf, idade, data_admissao, data_desligamento, salario, id_setor, id_senioridade)\n" +
                    "   values('" + gerador.geraNomeFuncionario() + "', '" + gerador.geraCpfFuncionario() + "', " + gerador.geraIdade() + ", '" + gerador.geraDataAdmissao() + "', " + gerador.geraDataDesligamento() + ", " + gerador.geraSalario(senioridade) + ", " + gerador.geraSetor() + ", " + senioridade + ");\n");
        }
        sb.append("\n");
        return sb.toString();
    }
}