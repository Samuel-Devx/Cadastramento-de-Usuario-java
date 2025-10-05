import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class App {
    public static void main(String[] args) {
        int op = 0;
        Scanner teclado = new Scanner (System.in);
        Menu menu = new Menu();
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastra Usuário");
            System.out.println("2 - Mostrar Usuarios");
            System.out.println("3 - Apagar conta");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            op = teclado.nextInt();
            teclado.nextLine();
        
        switch (op) {
            case 1:
                System.out.print("Digite seu nome: ");
                String nome = teclado.next();  
                System.out.print("Digite sua idade: ");
                int idade = teclado.nextInt();
                System.out.print("Digite seu sexo: ");
                String sexo = teclado.next();
                System.out.print("Digite seu email: ");
                String email = teclado.next();
                System.out.print("Digite seu numero Login: ");
                int numeroLogin = teclado.nextInt();
                System.out.print("Digite sua senha: ");
                int senha = teclado.nextInt();
                Usuario usuario = new Usuario(email, numeroLogin, senha, nome, sexo, idade);
                menu.adicionarMenu(usuario);
                break;
            case 2:
                menu.mostrarUsuarios();
                break;
            case 3:
                System.out.println("Digite nome da conta que quer apagar: ");
                String nom = teclado.nextLine();
                menu.apagarUsuario(nom); 
                break;
            case 4:
                System.out.println("Saindo...");
                break;            
            default:
                break;
        }
         } while (op != 4);
          
            
         
    }
}
