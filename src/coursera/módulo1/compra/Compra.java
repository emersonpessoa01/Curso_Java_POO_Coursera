package coursera.compra;

public class Compra {
    int valorTotal;
    int numeroParcelas;

    //a vsita
    public Compra(int valor){
        valorTotal = valor;
        numeroParcelas = 1;
    }
    //parcelado
    public Compra(int qtdParcelas, int valorParcela){
       valorTotal = qtdParcelas * valorParcela;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }
    public int getValorParcela(){
        return valorTotal/numeroParcelas;
    }
}
