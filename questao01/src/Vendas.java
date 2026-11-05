public class Vendas implements AreaInteressada {
    @Override
    public void atualizar(String nomeProduto, int novaQuantidade, int quantidadeAntiga) {
        if (quantidadeAntiga == 0 && novaQuantidade > 0) {
            System.out.println("[VENDAS] ALERTA: O produto \"" + nomeProduto + 
                "\" voltou a ter estoque (" + novaQuantidade + " unidades).");
        }
    }
}