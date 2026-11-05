public class Main {
    public static void main(String[] args) {
        Bebida pedido1 = new Espresso();
        pedido1 = new Leite(pedido1);
        pedido1 = new Calda(pedido1);

        System.out.println("Pedido 1:");
        System.out.println("Descrição: " + pedido1.getDescricao());
        System.out.println("Preço Total: R$ " + pedido1.getPreco());

        System.out.println("\n-----------------------------------\n");

        Bebida pedido2 = new Cha();
        pedido2 = new Chantilly(pedido2);

        System.out.println("Pedido 2:");
        System.out.println("Descrição: " + pedido2.getDescricao());
        System.out.println("Preço Total: R$ " + pedido2.getPreco());

        System.out.println("\n-----------------------------------\n");

        Bebida pedido3 = new Espresso();
        pedido3 = new Leite(pedido3);
        pedido3 = new Leite(pedido3);
        pedido3 = new Chantilly(pedido3);

        System.out.println("Pedido 3 (com complemento repetido):");
        System.out.println("Descrição: " + pedido3.getDescricao());
        System.out.println("Preço Total: R$ " + pedido3.getPreco());
    }
}