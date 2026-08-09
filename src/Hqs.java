public class Hqs extends Leitura {
    private String desenhista;
    private int issues;
    private String epoca;

    public Hqs(String Titulo, String autor,String desenhista,int issues,String epoca){
        super(Titulo, autor);
        this.desenhista = desenhista;
        this.issues = issues;
        this.epoca = epoca;

    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Desenhista: "+ this.desenhista);
        System.out.println("Issues: "+ this.issues );
        System.out.println("Epóca: "+ this.epoca);
    }

    public String getDesenhista() {
        return this.desenhista;
    }

    public int getIssues() {
        return this.issues;
    }

    public String getEpoca() {
        return this.epoca;
    }
}
