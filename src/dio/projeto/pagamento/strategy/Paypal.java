package dio.projeto.pagamento.strategy;

public class Paypal implements StrategyPagamento {
    private String email;
    private String password;


    public Paypal(String email, String password) {
        this.email = email;
        this.password = password;
    
    }


    @Override
    public void pagamento(double valor) {
       System.out.println("Pagamento de  " + valor + " através da conta Paypal: " + email);
    }

    
    
}
