public class Main {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook Gamer", 0);

        AreaInteressada compras = new Compras();
        AreaInteressada vendas = new Vendas();
        AreaInteressada auditoria = new Auditoria();

        notebook.adicionarArea(compras);
        notebook.adicionarArea(vendas);
        notebook.adicionarArea(auditoria);

        System.out.println("--- 1ª Alteração: Estoque vai de 0 para 3 ---");
        notebook.setQuantidade(3);

        System.out.println("\n--- 2ª Alteração: Estoque vai de 3 para 3 ---");
        notebook.setQuantidade(3);

        System.out.println("\n--- 3ª Alteração: Estoque vai de 3 para 10 ---");
        notebook.setQuantidade(10);

        System.out.println("\n--- Removendo a área de Compras ---");
        notebook.removerArea(compras);

        System.out.println("\n--- 4ª Alteração: Estoque cai de 10 para 2 ---");
        notebook.setQuantidade(2);
    }
}