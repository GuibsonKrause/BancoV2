package Bancov2;

import java.util.Scanner;

/**
 *
 * @author gkrause
 */
public class Interface
{

    private int opMenu;
    private int opConta;

    // gets & sets
    public int getOpMenu()
    {
        return opMenu;
    }

    public int getOpConta()
    {
        return opConta;
    }

    // Metodos
    public void criarMenu()
    {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha uma conta:");
        System.out.println("1, 2, 3 ou 4:");
        System.out.println("Ou digite 0 para sair:");

        if (ler.hasNextInt()) // Tratamento de erro do tipo na leitura
        {
            this.opConta = ler.nextInt();
        }
        else
        {
            System.out.println("Opção inválida!");
            System.exit(0);
        }

        if (this.opConta == 0)
        {
            System.exit(0);
        }

        if (this.opConta < 1 || this.opConta > 4)
        {
            System.out.println("Essa conta não existe");
            System.exit(0);
        }

        System.out.println("Digite o número correspondente da opção desejada");
        System.out.println("");
        System.out.println("(1) Dados Bancários:");
        System.out.println("(2) Depósito:");
        System.out.println("(3) Saque:");
        System.out.println("(0) Sair:");

        if (ler.hasNextInt()) // Tratamento de erro do tipo na leitura
        {
            this.opMenu = ler.nextInt();
        }
        else
        {
            System.out.println("Opção inválida!");
            System.exit(0);
        }
    }
}
