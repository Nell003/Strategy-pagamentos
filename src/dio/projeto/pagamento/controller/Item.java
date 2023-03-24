package dio.projeto.pagamento.controller;

public class Item {
    private String nome;
    private double preço;


    public Item(String nome, double preço){
        this.nome = nome;
        this.preço = preço;

    }


    public String getNome() {
        return nome;
    }


    public double getPreço() {
        return preço;
    }


    
    }    
    

