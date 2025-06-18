import java.util.*;

public class App {
    public static final Scanner resultado = new Scanner(System.in);

    public static final Usuario admin = new Usuario("Admin", "Acesso@2025");

    public static void main(String[] args) throws Exception {
        String nome, senha;
        int tentativas = 0;

        do {
            System.out.println("=== SISTEMA ACESSO ===");
            System.out.print("Usuário: ");
            nome = resultado.nextLine();
            System.out.print("Senha: ");
            senha = resultado.nextLine();
            validaUsuario(nome, senha);
            tentativas++;
        } while (tentativas <= 3);

    }

    // VALIDA O USUÁRIO
    static void validaUsuario(String nome, String senha) throws Exception {
        if (nome.equals(admin.getNome()) && senha.equals(admin.getSenha())) {
            System.out.println("Bem vindo Admin!");
            menuPrincipal();
        } else
            System.out.println("Usuário não econtrado");
    }

    // MENU DE OPÇÕES
    static void menuPrincipal() {
        int escolhaOpcao;
        boolean validaOpcao = true;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1 - Ver perfil");
            System.out.println("2 - Alterar senha");
            System.out.println("3 - Sair");
            while (true) {
                try {
                    do {
                        if (validaOpcao == false) {
                            System.out.println("Escolha uma opção (1 a 3): ");
                            escolhaOpcao = resultado.nextInt();
                        } else {
                            System.out.println("Escolha uma opção: ");
                            escolhaOpcao = resultado.nextInt();
                        }
                        validaOpcao = false;
                    } while (escolhaOpcao < 1 || escolhaOpcao > 4);

                    break;

                } catch (InputMismatchException e) {
                    resultado.nextLine();
                    System.out.println("INSIRA UM NÚMERO");
                }
            }

            switch (escolhaOpcao) {
                case 1:
                    admin.verPerfil();
                    System.out.println("\n");
                    break;
                case 2:
                    alterarSenha();
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
            }
        } while (escolhaOpcao != 3);
    }

    static void alterarSenha() {
        resultado.nextLine();
        String novaSenha;

        System.out.print("Digite a nova senha: ");
        novaSenha = resultado.nextLine();
        admin.setSenha(novaSenha);

        System.out.print("Nova senha cadastrada com sucesso!");
        admin.verPerfil();
    }
}
