import java.util.Scanner;

public class ATM {
    Scanner scan = new Scanner (System.in); //Scanner
    
    private double saldo; //Saldo da conta
    
    //Construtor
    public ATM(double saldoInicial){
        saldo = saldoInicial;
    } 
    
    //Mensagem de boas vindas
    public void bemVindo(){
        System.out.println("Bem-vindo ao BANCO");
    }
    
    //Acessa a conta
    public void acessarConta(){
        System.out.printf("Digite seu código de acesso: ");
        byte PIN = scan.nextByte();
        System.out.println("Acessando conta...");
        System.out.println("");
    }
    
    //Mostra o menu principal do banco
    public void menuPrincipal(){
        do{ //Menu do banco
            int op; 
            System.out.println("MENU Principal\n"
                +"1 - Mostrar saldo\n"
                +"2 - Depositar dinheiro\n"
                +"3 - Descontar dinheiro\n"
                +"4 - Sair");
            op = scan.nextInt(); //Variável utilizado no switch
            switch(op){
                case 1:
                    mostrarSaldo(); //caso 1 mostra o saldo 
                break;
                case 2:
                    depositar(); //caso 2 deposita dinheiro ao saldo 
                break;
                case 3:
                    descontar(); //caso 3 desconta dinheiro do saldo 
                break;
                case 4:
                    System.exit(0); //fecha o programa  
                default:
                    System.out.println("Comando inválido inserido");
                break;
            }
        }while(true);
    }
    
    //Mostra o dinheiro na conta
    public void mostrarSaldo(){
        System.out.printf("Saldo: %2f", saldo);
        System.out.println("");
    }
    
    //Deposita dinheiro na conta
    public void depositar(){
        System.out.println("Valor a ser depositado: ");
        double valor = scan.nextDouble();
        saldo = saldo + valor;
        
    }
    
    //Tira dinheiro da conta
    public void descontar(){
        System.out.println("Valor a ser descontado: ");
        double valor = scan.nextDouble();
        saldo = saldo - valor;
    }
    
    
}
