package Bancov2;

import java.util.Scanner;

/**
 *
 * @author gkrause
 */
public class Banco
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here        
        // ---------------------------------------- Tarefa1 e Tarefa 2 ----------------------------------------------------  
//        Conta n[] = new Conta[4];
//
//        n[0] = new Conta("Maria");
//        n[1] = new Conta("José");
//        n[2] = new Conta("João");
//        n[3] = new Conta("Jubileu");
        /*

        n[0].depositar();
        n[0].sacar();
        n[0].dadosBancarios();

        n[1].depositar();
        n[1].sacar();
        n[1].dadosBancarios();

        n[2].depositar();
        n[2].sacar();
        n[2].dadosBancarios();

        n[3].depositar();
        n[3].sacar();
        n[3].dadosBancarios();
         */
// --------------------------------------------------------- Tarefa 3 ------------------------------------------------------------------
/*
        Scanner ler = new Scanner(System.in);
        Interface op = new Interface();
        op.criarMenu();

        while (op.getOpMenu() != 0)
        {
            switch (op.getOpMenu())
            {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    n[op.getOpConta() - 1].dadosBancarios();
                    op.criarMenu();
                    break;
                case 2:
                    n[op.getOpConta() - 1].depositar();
                    op.criarMenu();
                    break;
                case 3:
                    n[op.getOpConta() - 1].sacar();
                    op.criarMenu();
                    break;
            }
        }
*/
//        --------------------------------------- Bancov2------------------------------------------------------------
        ContaEspecial ce1 = new ContaEspecial("Guibson", 100);
        ce1.depositar();
        ce1.sacar();
    }

}
