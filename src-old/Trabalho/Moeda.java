package Trabalho;

public class Moeda {
    
    double real;
    double euro;
    double dolar;
    
    @Override
    public String toString() {
        return "Moeda [real=" + real + ", euro=" + euro + ", dolar=" + dolar + "]";
    }
    
    public double getReal() {
        return real;
    }
    
    public void setReal(double real) {
        this.real = real;
    }
}
