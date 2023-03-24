
import dio.projeto.pagamento.controller.CarrinhoCompras;
import dio.projeto.pagamento.controller.Item;
import dio.projeto.pagamento.strategy.Paypal;
import dio.projeto.pagamento.strategy.StrategyPagamento;

public class Test {
    public static void main(String[] args) throws Exception {
    CarrinhoCompras carrinho = new CarrinhoCompras();

    Item item1 = new Item("Iphone 14 pro", 2.59);
    Item item2 = new Item("Galaxy Pocket", 2600.99);


    carrinho.additem(item1);
    carrinho.additem(item2);


    StrategyPagamento CartaoCredito = new dio.projeto.pagamento.strategy.CartaoCredito("Paola Silva", "123456788"
    , "985", "24/12");
    StrategyPagamento Paypal = new Paypal("Paolinhapaolinha@gmail.com", "eugostodecoxinha");

    carrinho.setStrategyPagamento(CartaoCredito);
    carrinho.checkout();


    carrinho.setStrategyPagamento(Paypal);
    carrinho.checkout();

    
    
    

   

}

    
    
}
