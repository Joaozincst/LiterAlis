import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Acervo meuAcervo = new Acervo();

        Livro livro1 = new Livro("A fúria dos Reis", "George R.R. Martin", 50);
        Hqs hq1 = new Hqs("Batman", "Matt fractions", "Jorge Jimenez", 12, "All in");

        System.out.println("CADASTRAMENTO");
        meuAcervo.adicionarLeitura(livro1);
        meuAcervo.adicionarLeitura(hq1);

        System.out.println("Qual título você deseja");
        // O .trim() aqui elimina espaços vazios acidentais que entram pelo teclado
        String tituloBuscado = teclado.nextLine().trim();

        // Corrigido para 'pesquisaPorTitulo' (com apenas um 'e')
        Leitura itemEncontrado = meuAcervo.pesquisaPorTitulo(tituloBuscado);

        if (itemEncontrado != null) {
            System.out.println("Deseja ver qual aspecto do seu titulo");

            if (itemEncontrado instanceof Livro) {
                System.out.println("Você selecionou um livro deseja ver qual dado dele: 1 para autor, " +
                        "2 para numero de paginas, " +
                        "3 para título, " +
                        "4 para editora, " +
                        "5 para numero de capitulos");
                int opcao = teclado.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Autor: " + itemEncontrado.getAutor());
                        break;
                    case 2:
                        System.out.println("Número de paginas " + itemEncontrado.getNumPaginas());
                        break;
                    case 3:
                        System.out.println("Título: " + itemEncontrado.getTitulo());
                        break;
                    case 4:
                        System.out.println("Editora: " + itemEncontrado.getEidtora());
                        break;
                    case 5:
                        Livro livroReal = (Livro) itemEncontrado;
                        System.out.println("Capítulos " + livroReal.getCapitulos());
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }

            else if (itemEncontrado instanceof Hqs) {
                System.out.println("Você selecionou uma HQ! Deseja ver qual dado dela: 1 para autor, " +
                        "2 para desenhista, " +
                        "3 para Autor, " +
                        "4 para editora, " +
                        "5 para época");
                int opcaoHq = teclado.nextInt();
                switch (opcaoHq) {
                    case 1:
                        System.out.println("Autor: " + itemEncontrado.getAutor());
                        break;
                    case 2:
                        Hqs hqReal = (Hqs) itemEncontrado;
                        System.out.println("Desenhista: " + hqReal.getDesenhista());
                        break;
                    case 3:
                        System.out.println("Lido: " + itemEncontrado.getNumPaginas());
                        break;
                    case 4:
                        System.out.println("Editora: " + itemEncontrado.getEidtora());
                        break;
                    case 5:
                        hqReal = (Hqs) itemEncontrado;
                        System.out.println("Época: " + hqReal.getEpoca());
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }
        } else {
            System.out.println("Esse título não está cadastrado");
        }
    }
}



