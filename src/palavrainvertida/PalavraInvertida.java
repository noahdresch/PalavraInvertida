/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palavrainvertida;

/**
 *
 * @author Noa
 */
public class PalavraInvertida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ler uma palavra e escrever ela invertida
        
        String palavra = Entrada.leiaString();
        
        for (int i = palavra.length() -1; i >= 0; i--) {
            System.out.print(palavra.charAt(i));
        }     
        
      
        
        
        System.exit(0);
    }
    
}
