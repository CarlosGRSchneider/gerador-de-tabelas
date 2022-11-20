package entradas;

public class Setor {

    public static String geraSetores() {
        StringBuilder sb = new StringBuilder();
        sb.append("insert into setor(nome_setor) \n" +
                "   values ('Desenvolvimento');\n");
        sb.append("insert into setor(nome_setor) \n" +
                "   values ('Recursos Humanos');\n");
        sb.append("insert into setor(nome_setor) \n" +
                "   values ('Administrativo');\n");
        sb.append("insert into setor(nome_setor) \n" +
                "   values ('Marketing');\n");
        sb.append("insert into setor(nome_setor) \n" +
                "   values ('Contabilidade');\n\n");
        return sb.toString();
    }
}
