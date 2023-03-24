package dio.projeto.pagamento.strategy;

public class Bitcoin implements StrategyPagamento {
    private String bitcoinAddress;

    public Bitcoin(String bitcoinAddress) {
       this.bitcoinAddress = bitcoinAddress;
    }

    @Override
    public void pagamento(double valor) {
       System.out.println("Pagamento de " + valor + " através da carteira Bitcoin: " + bitcoinAddress);

    }

    
}
