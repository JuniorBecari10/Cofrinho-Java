package trabalho;

import java.util.Scanner;
import java.io.File;

public class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Estoque est = new Estoque();
        
        while (true) {
            System.out.println("Cofrinho");
            System.out.println("Voce tem R$ " + est.getReais() + "\n");
            
            System.out.println("1 - Adicionar Moedas");
            System.out.println("2 - Remover Moedas");
            
            System.out.println("\n0 - Sair\n");
            
            System.out.print("> ");
            int opcao = s.nextInt();
            
            switch (opcao) {
                case 0:
                    System.exit(0);
                
                case 1:
                    System.out.println("Selecione uma moeda para adicionar:\n");
                    
                    System.out.println("1 - Real");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Dolar\n");
                    
                    System.out.print("> ");
                    int moeda = s.nextInt();
                    
                    System.out.println("Qual o valor?");
                    System.out.print("> ");
                    double valor = s.nextDouble();
                    
                    est.adicionar(valor, moeda);
                    System.out.println("-----------");
                    
                    break;
               case 2:
                    System.out.println("Selecione uma moeda para remover:\n");
                    
                    System.out.println("1 - Real");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Dolar\n");
                    
                    System.out.print("> ");
                    moeda = s.nextInt();
                    
                    System.out.println("Qual o valor?");
                    System.out.print("> ");
                    valor = s.nextDouble();
                    
                    est.remover(valor, moeda);
                    System.out.println("-----------");
                    
                    break;
            }
            
        }
    }
}
