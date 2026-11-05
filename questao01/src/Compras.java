public class Compras implements AreaInteressada {
    @Override
    public void atualizar(String nomeProduto, int novaQuantidade, int quantidadeAntiga) {
        if (novaQuantidade < 5) {
            System.out.println("[COMPRAS] ALERTA: O produto \"" + nomeProduto + 
                "\" está com estoque baixo (" + novaQuantidade + " unidades).");
        }
    }
}