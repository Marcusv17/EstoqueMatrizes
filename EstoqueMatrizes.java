
package com.mycompany.estoquematrizes;

import java.util.Scanner; 

public class EstoqueMatrizes { 
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[][] estoque = new String[1][4];
        
        System.out.println("Sistema De Estoque");
        System.out.print("Digite o produto na linha abaixo:\n");
            
            System.out.print("Nome do produto: ");
            estoque[0][0] = scanner.nextLine();
            
            System.out.print("Quantidade de produtos: ");
            estoque[0][1] = scanner.nextLine();
            
            System.out.print("Preço p/ unidade (sem descontos): ");
            estoque[0][2] = scanner.nextLine();
        
            try {
                int qnt = Integer.parseInt(estoque[0][1]);
                double valor = Double.parseDouble(estoque[0][2]);
                double valorTotal = qnt * valor;
                
                
                estoque[0][3] = String.format("%.2f", valorTotal);
                
            
            } catch (NumberFormatException e) {
                System.out.println("Aceitamos apenas valores númericos para colocar o preço.");
                estoque[0][3] = "0.00";
            }
           
            System.out.println();
        
        System.out.println("\n Estoque");

        System.out.printf("%-15s %-12s %-7s %-10s\n", "- Produto -", "- Quantidade - ", " - Preço - ", " - Valor Total -");

        for (int i = 0; i < 1; i++) {
            System.out.printf("%-15s %-12s %-7s R$ %-10s\n", estoque[i][0], estoque[i][1], "R$ " + estoque[i][2], estoque[i][3]);
        }
        
        scanner.close();
        
    }
} 