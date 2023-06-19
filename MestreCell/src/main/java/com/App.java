package src.main.java.com;

import java.util.Scanner;


public class App {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
        
        int op = 0;
        do{
        switch (op){
            case 1:
            cadastrar();
            break;

        }
    }while(op!=0);
    }

    public static void cadastrar(){
        System.out.println("Informe  o que quer cadastrar! ");
        System.out.println("1  --  tecnico");
        System.out.println("2  --  Cliente");
        System.out.println("3  --  Celular");
        int op = leitor.nextInt();
        switch(op){
            case 1:
            cadastrarTecnico();
            break;
            case 2:
            
            break;
            case 3:
            
            break;

            default:
            System.out.println("Opção inválida");
            break;
        }
    }

    public static void cadastrarTecnico(){

    }

}
