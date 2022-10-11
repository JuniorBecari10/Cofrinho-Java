package trabalho;

public class Estoque {
    public static final double DOLAR = 5.20;
    public static final double EURO = 5.05;
    
    // acho que seja melhor usar o double do que um ArrayList de Moedas
    private double reais = 0;
    
    public double getReais() {
        return reais;
    }
    
    public void adicionar(double valor, int moeda) {
        /*
        1 - Real
        2 - Euro
        3 - Dolar
        */
        
        switch (moeda) {
            case 1:
                this.reais += valor;
                break;
            case 2:
                valor = converterEuro(valor);
                this.reais += valor;
                break;
            case 3:
                valor = converterDolar(valor);
                this.reais += valor;
                break;
        }
    }
    
    public void remover(double valor, int moeda) {
        /*
        1 - Real
        2 - Euro
        3 - Dolar
        */
        
        switch (moeda) {
            case 1:
                this.reais -= valor;
                break;
            case 2:
                valor = converterEuro(valor);
                this.reais -= valor;
                break;
            case 3:
                valor = converterDolar(valor);
                this.reais -= valor;
                break;
        }
    }
    
    // Vamos converter de dolar para real, pois o Estoque é em reais
    public double converterDolar(double dolar) {
        return dolar * DOLAR;
    }
    
    // O mesmo
    public double converterEuro(double euro) {
        return euro * EURO;
    }
}
