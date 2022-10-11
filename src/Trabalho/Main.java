package Trabalho;

import java.util.Scanner;
import java.io.File;

public class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Estoque est = new Estoque();
        
        while (true) {
            clear();
            
            System.out.println("Cofrinho");
            System.out.println("Voce tem R$ " + est.getReais() + "\n");
            
            System.out.println("1 - Adicionar Moedas");
            System.out.println("2 - Remover Moedas");
            System.out.println("3 - Converter Moedas");
            
            System.out.println("\n0 - Sair\n");
            
            int opcao = inputInt("> ");
            
            switch (opcao) {
                case 0:
                    System.exit(0);
                    break;
                
                case 1:
                    clear();
                    
                    System.out.println("Cofrinho");
                    System.out.println("Voce tem R$ " + est.getReais() + "\n");
                    
                    System.out.println("Selecione uma moeda para adicionar:\n");
                    
                    System.out.println("1 - Real");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Dolar\n");
                    
                    int moeda = inputInt("> ", 1, 3);
                    
                    clear();
                    
                    System.out.println("Cofrinho");
                    System.out.println("Voce tem R$ " + est.getReais() + "\n");
                    
                    System.out.println("Qual o valor?\n");
                    
                    double valor = inputDouble("> ");
                    
                    est.adicionar(valor, moeda);
                    break;
               
               case 2:
                    clear();
                    
                    System.out.println("Cofrinho");
                    System.out.println("Voce tem R$ " + est.getReais() + "\n");
                    
                    System.out.println("Selecione uma moeda para remover:\n");
                    
                    System.out.println("1 - Real");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Dolar\n");
                    
                    moeda = inputInt("> ", 1, 3);
                    
                    clear();
                    
                    System.out.println("Cofrinho");
                    System.out.println("Voce tem R$ " + est.getReais() + "\n");
                    
                    System.out.println("Qual o valor?\n");
                    
                    valor = inputDouble("> ");
                    
                    est.remover(valor, moeda);
                    
                    break;
                
                case 3:
                    clear();
                    
                    System.out.println("Cofrinho");
                    System.out.println("Voce tem R$ " + est.getReais() + "\n");
                    
                    System.out.println("O que deseja converter?\n");
                    
                    System.out.println("1 - Seu saldo (R$ " + est.getReais() + ")");
                    System.out.println("2 - Valor definido\n");
                    
                    int op = inputInt("> ", 1, 2);
                    
                    clear();
                    
                    System.out.println("Cofrinho");
                    System.out.println("Voce tem R$ " + est.getReais() + "\n");
                    
                    switch (op) {
                        case 1:
                            System.out.println("Em Dolar: " + est.realParaDolar(est.getReais()));
                            System.out.println("Em Euro: " + est.realParaEuro(est.getReais()));
                            break;
                        case 2:
                            System.out.println("Qual o valor (Em Reais)?\n");
                            
                            valor = inputDouble("> ");
                            
                            System.out.println("Em Dolar: " + est.realParaDolar(valor));
                            System.out.println("Em Euro: " + est.realParaEuro(valor));
                            break;
                    }
                    
                    System.out.println("\nPressione Enter para continuar.");
                    
                    try {
                        System.in.read();
                    } catch (Exception e) {}
                    
                    break;
            }
        }
    }
    
    public static int inputInt(String prompt) {
        int ret = 0;
        
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(prompt);
                ret = sc.nextInt();
                
                break;
            } catch (Exception e) {
                continue;
            }
        }
        
        return ret;
    }
    
    public static int inputInt(String prompt, int start, int end) {
        int ret = 0;
        
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(prompt);
                ret = sc.nextInt();
                
                if (ret < start || ret > end)
                    continue;
                
                break;
            } catch (Exception e) {
                continue;
            }
        }
        
        return ret;
    }
    
    public static double inputDouble(String prompt) {
        double ret = 0;
        
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(prompt);
                ret = sc.nextDouble();
                
                break;
            } catch (Exception e) {
                continue;
            }
        }
        
        return ret;
    }
    
    public static void clear() {
        // Sim, isso realmente limpa a tela
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
