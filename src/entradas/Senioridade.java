package entradas;

public class Senioridade {

    public static String geraSenioridade() {
        StringBuilder sb = new StringBuilder();
        sb.append("insert into senioridade(grau_senioridade, valor_bonus) \n" +
                "   values('Assistente', 0.4);\n");
        sb.append("insert into senioridade(grau_senioridade, valor_bonus) \n" +
                "   values('Junior', 1.0);\n");
        sb.append("insert into senioridade(grau_senioridade, valor_bonus) \n" +
                "   values('Pleno', 1.5);\n");
        sb.append("insert into senioridade(grau_senioridade, valor_bonus) \n" +
                "   values('Senior', 2.0);\n");
        sb.append("insert into senioridade(grau_senioridade, valor_bonus) \n" +
                "   values('Especialista', 2.5);\n");
        sb.append("insert into senioridade(grau_senioridade, valor_bonus) \n" +
                "   values('Diretor', 3.5);\n\n");
        return sb.toString();
    }
}
