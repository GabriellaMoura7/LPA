import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        String [] [] clientes = new String [3] [2];
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite seu nome:");
        clientes [0] [0] = leia.next();
        System.out.print("Digite seu endereço:");
        clientes [0] [1] = leia.next();
        System.out.print("Digite seu nome:");
        clientes [1] [0] = leia.next();
        System.out.print("Digite seu endereço:");
        clientes [1] [1] = leia.next();
        System.out.print("Digite seu nome:");
        clientes [2] [0] = leia.next();
        System.out.print("Digite seu endereço:");
        clientes [2] [1] = leia.next();
       
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Nome: " + clientes [i] [0]);
            System.out.println("Endereço: " + clientes [i] [1]);
            System.out.println();
        }
     }
}