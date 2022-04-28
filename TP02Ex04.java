//Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.

//Benildes Menezes (CB3004392) e Marcelo Modesto (CB3015823)

import static java.lang.System.out;
import java.util.Scanner;

public class TP02Ex04 {
    
    public static void main(String[] args)){
        Scanner scan = new Scanner(System.in);
        
        int[][] v = new int[2][3];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                out.printf("Informe [" + i + "][" + j + "]: ");
                v[i][j] = scan.nextInt();
            }
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                out.print("[" + v[i][j] + "] ");                
            }
            out.println();
        }           
    }
}