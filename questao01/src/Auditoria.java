public class Auditoria implements AreaInteressada {
    @Override
    public void atualizar(String nomeProduto, int novaQuantidade, int quantidadeAntiga) {
        System.out.println("[AUDITORIA] Log: O produto \"" + nomeProduto + 
            "\" mudou de estoque de " + quantidadeAntiga + " para " + novaQuantidade + ".");
    }
}