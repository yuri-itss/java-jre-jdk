public class TestaCondicional {
    public static void main(String[] args) {

        int idade = 15;
        int quantidadePessoasQueLiberaAcesso = 3;
        int quantidadePessoasAcompanhado = 1;

        if (idade >= 18){
            System.out.println("Acesso liberado, você é maior de idade!");
        }else {
            if (quantidadePessoasAcompanhado >= 2) {
                System.out.println("Acesso liberado, você não tem " + idade + " anos, mas está acompanhado!");
            }else {
                System.out.println("Acesso negado, liberado apenas para maiores de 18 anos, " +
                        "ou acompanhado com mais de " + quantidadePessoasQueLiberaAcesso +
                        " pessoas, você está acompanhado de apenas "
                        + quantidadePessoasAcompanhado + " pessoa!");
            }
        }
    }
}