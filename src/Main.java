public class Main {
    public static void main(String[] args){
        Livro livro1 = new Livro("A guerra dos Tronos", "George R.R. Martin",50);
        Hqs hq1 = new Hqs("Batman","Matt fractions","Jorge Jimenez",12,"All in");
        System.out.println("Dados do livro");
        livro1.exibirDetalhes();
        System.out.println("Dados da hq");
        hq1.exibirDetalhes();
    }
}