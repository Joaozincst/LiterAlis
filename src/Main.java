public class Main {
    public static void main(String[] args){
        Acervo meuAcervo = new Acervo();
        Livro livro1 = new Livro("A fúria dos Reis", "George R.R. Martin",50);
        Hqs hq1 = new Hqs("Batman","Matt fractions","Jorge Jimenez",12,"All in");
        System.out.println("Dados do livro");
        livro1.exibirDetalhes();
        System.out.println("Dados da hq");
        hq1.exibirDetalhes();
        System.out.println("CADASTRAMENTO");
        meuAcervo.adicionarLeitura(livro1);
        meuAcervo.adicionarLeitura(hq1);

    }
}