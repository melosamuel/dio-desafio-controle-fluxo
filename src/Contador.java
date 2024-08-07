import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        int parametroUm = 0;
        int parametroDois = 0;

        try{
            System.out.print("Digite o primeiro parâmetro: ");
            parametroUm = terminal.nextInt();
            
            System.out.print("Digite o segundo parâmetro: ");
            parametroDois = terminal.nextInt();
        }catch(InputMismatchException exception){
            System.out.println("O parâmetro deve ser um número inteiro!");
            System.exit(1);
        }

        terminal.close();

        try{
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
            System.exit(1);
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser menor que o segundo!");
        }

        int contagem = parametroDois - parametroUm;

        for(int i = 0; i < contagem; i++){
            System.out.println("Imprimindo número " + (i+1));
        }
    }
}
