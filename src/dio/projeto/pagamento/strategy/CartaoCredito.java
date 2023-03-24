package dio.projeto.pagamento.strategy;

public class CartaoCredito implements StrategyPagamento {
    private String nome;
    private String numeroCartao;
    private String cvv;
    private String dataValidade;


    public CartaoCredito(String nome, String numeroCartao, String cvv, String dataValidade) {
        this.nome = nome;
        this.numeroCartao = numeroCartao;
        this.cvv = cvv;
        this.dataValidade = dataValidade;
    }

    @Override
    public void pagamento(double valor) {
        System.out.println("Pagamento de " + valor + " atráves do cartão de credito: " + numeroCartao);
       
    }
    
}
