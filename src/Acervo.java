import java.util.ArrayList;
import java.util.List;
public class Acervo  {
    private List <Leitura> listaDeLeitura;
    public Acervo(){
        this.listaDeLeitura = new ArrayList<>();
    }
    public void adicionarLeitura(Leitura leitura){
        this.listaDeLeitura.add(leitura);
        System.out.println("Aicionado com sucesso "+leitura.getTitulo());
    }
    public void listaAcervo(){
        System.out.println("========= MEU ACERVO DE LITERATURA =========");
        for (Leitura leitura : this.listaDeLeitura) {
            leitura.exibirDetalhes();
            System.out.println("--------------------------------------------");
        }
    }
    public Leitura pesquisaPorTitulo(String titulo){
        for(Leitura item: this.listaDeLeitura){
            if(item.getTitulo().equalsIgnoreCase(titulo)){
                return item;
            }
        }
        return null;
    }

}
