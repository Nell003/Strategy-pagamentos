package dio.projeto.pagamento.controller;

import java.util.ArrayList;
import java.util.List;

import dio.projeto.pagamento.strategy.StrategyPagamento;

public class CarrinhoCompras {
    private List<Item> items = new ArrayList<>();
    private StrategyPagamento strategyPagamento;


    public void additem(Item item) {
        items.add(item);
    }

    public void setStrategyPagamento(StrategyPagamento strategyPagamento){
        this.strategyPagamento = strategyPagamento;
    }

    public void checkout(){
        double total = calcularTotal();
        strategyPagamento.pagamento(total);
    }

    private double calcularTotal(){
        double total = 0.0;
        for (Item item : items){
            total +=item.getPreço();
        }
        return total;
    }

    
}
