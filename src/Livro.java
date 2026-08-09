public class Livro extends Leitura{
    private int capitulos;

    public int getCapitulos() {
        return this.capitulos;
    }

    public Livro(String Titulo, String autor,int capitulos){
        super(Titulo, autor);
        this.capitulos = capitulos;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capitúlos: "+this.capitulos);
    }
}
