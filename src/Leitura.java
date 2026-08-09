public class Leitura {
private String autor;
private String Titulo;
private int numPaginas;
private int paginaAtual;
private boolean lido;
private String editora;

    public void exibirDetalhes(){
        System.out.println("Dados da leitura");
        System.out.println("Título: "+this.Titulo);
        System.out.println("Autor: "+ this.autor );
    }

    public Leitura(String Titulo, String autor) {

        this.Titulo = Titulo;
        this.autor = autor;
    }

    public String getEidtora() {
        return editora;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getTitulo() {
        return this.Titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public boolean isLido() {
        return lido;
    }
}
