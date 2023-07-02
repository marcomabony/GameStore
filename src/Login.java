import java.util.Scanner;

public class Login {
    private static Scanner scanner = new Scanner(System.in);
    private static String tipoPessoa;
    private static boolean isFuncionario;

    public static String getTipoPessoa() {
        return tipoPessoa;
    }

    public static boolean isFuncionario() {
        return isFuncionario;
    }

    public static void fazerLogin() {
        System.out.println("Acessar Sistema da GameStoreUI\n");
        System.out.println("1 - Funcionário");
        System.out.println("2 - Cliente");

        int opcao = lerOpcao();

        switch (opcao) {
            case 1:
                tipoPessoa = "Funcionário";
                isFuncionario = true;
                break;
            case 2:
                tipoPessoa = "Cliente";
                isFuncionario = false;
                break;
            default:
                System.out.println("Opção inválida. Por favor, tente novamente.");
                fazerLogin();
        }
    }

    private static int lerOpcao() {
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }
}
