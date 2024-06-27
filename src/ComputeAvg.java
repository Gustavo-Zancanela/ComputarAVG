import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
        int[] testes = new int[5]; 
        double soma = 0, media = 0;
        int nota;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira as pontuações dos 5 testes");
        
        
        for(int i = 0; i < testes.length; i++)// le as notas de 5 testes
        {
            
            nota = sc.nextInt();
            
            testes[i] = nota;
            if(nota > 100 || nota < 0)
        {
            System.out.println("Número inválido");
            break;
        }
        
        }
        
        for(int i = 0; i < testes.length; i++)// faz a media das notas dos testes
        {
            
            soma += testes[i];
            media = soma / testes.length;
        }
        System.out.println("Média dos testes: " + media);
    }

}
