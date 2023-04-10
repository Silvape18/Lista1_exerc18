import java.util.Scanner;

public class App {
   public static void main(String[]args) throws Exception{

    Scanner entrada = new Scanner(System.in);

        double tamarquivo;
        double velconex;
        double tdownload;
        
        System.out.print("Digite o tamanho do arquivo: ");
        tamarquivo = entrada.nextDouble();
        System.out.print("Informe a velocidade da conexão em Mbps: ");
        velconex = entrada.nextDouble();

        tdownload = tamarquivo * 8  /velconex * 60;

        System.out.print("o tempo do dowload em minutos é : " + tdownload);

        //PROFESSOR, EU TENTEI, MAS NÃO CONSEGUIR FAZER AS QUESTÕES 13/14/15 E 17. 

   }




}
    
        
    
