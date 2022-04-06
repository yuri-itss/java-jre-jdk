public class TestaCondicional2 {
    public static void main(String[] args) {

        int idade = 15;
        int quantidadePessoasQueLiberaAcesso = 3;
        int quantidadePessoasAcompanhado = 4;
        boolean acompanhado = quantidadePessoasAcompanhado >= 2;

        if (idade >= 18 || acompanhado) {
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Acesso negado, liberado apenas para maiores de 18 anos, " +
                    "ou acompanhado com mais de " + quantidadePessoasQueLiberaAcesso +
                    " pessoas, você está acompanhado de apenas "
                    + quantidadePessoasAcompanhado + " pessoa!");
        }
    }
}