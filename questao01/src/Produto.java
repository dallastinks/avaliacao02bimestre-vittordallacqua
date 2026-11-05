import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private int quantidade;
    private List<AreaInteressada> areasInteressadas;

    public Produto(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidade = quantidadeInicial;
        this.areasInteressadas = new ArrayList<>();
    }

    public void adicionarArea(AreaInteressada area) {
        if (!areasInteressadas.contains(area)) {
            areasInteressadas.add(area);
        }
    }

    public void removerArea(AreaInteressada area) {
        areasInteressadas.remove(area);
    }

    public void setQuantidade(int novaQuantidade) {
        if (this.quantidade == novaQuantidade) {
            return;
        }

        int quantidadeAntiga = this.quantidade;
        this.quantidade = novaQuantidade;

        notificarAreas(quantidadeAntiga);
    }

    private void notificarAreas(int quantidadeAntiga) {
        for (AreaInteressada area : areasInteressadas) {
            area.atualizar(this.nome, this.quantidade, quantidadeAntiga);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}