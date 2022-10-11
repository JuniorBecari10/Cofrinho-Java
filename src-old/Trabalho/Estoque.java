package Trabalho;

import java.util.ArrayList;

public class Estoque {
    
    private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
    
    public void adicionar(Moeda c) {
        listaMoedas.add(c);
    }
    
    public void remover(Moeda c) {
        listaMoedas.remove(c);
    }
    
    public void listar() {
        for (Moeda c : listaMoedas) {
            System.out.println(c);
        }
    }
}
