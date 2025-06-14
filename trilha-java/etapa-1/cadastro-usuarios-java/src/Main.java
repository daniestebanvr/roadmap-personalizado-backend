import java.util.Scanner;
import java.util.regex.*;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.*;

public class Main {

    // Classes importadas
    // Variáveis globais
    static Scanner resultadoScanner = new Scanner(System.in);
    static List<Usuario> usuarios = new ArrayList<>();

    // Declaração de variáveies padrão
    static String nome, email;

    // Validação de email
    static String emailValido = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$"; // Uso do regex
    static Matcher matcherEmail;
    static Pattern patternEmail = Pattern.compile(emailValido);

    public static void main(String[] args) throws Exception {

        int idade, opcao;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            opcao = escolhaUmaOpcao();
            resultadoScanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    Thread.sleep(3000);
                    break;
                case 2:
                    listarUsuarios();
                    Thread.sleep(3000);
                    break;
                case 3:
                    procurarUsuario();
                    Thread.sleep(3000);
                    break;
            }
        } while (opcao != 6);

    }

    // Método para mostrar e escolher as opções
    static int escolhaUmaOpcao() {
        int opcao;
        while (true) {
            try {
                System.err.println("1. Cadastrar Usuário");
                System.err.println("2. Listar todos os usuários");
                System.err.println("3. Buscar usuário por nome");
                System.err.println("4. Atualizar idade de um usuário");
                System.err.println("5. Excluir um usuário");
                System.err.println("6. Sair");
                System.err.println("Escolha a opção:");
                opcao = resultadoScanner.nextInt();

                if (opcao > 0 && opcao <= 6) {
                    return opcao;
                } else {
                    System.err.println("Digite um número de um a 6");
                }
            } catch (InputMismatchException e) {
                System.err.println("Entrada Inválida! Insira um número");
                resultadoScanner.nextLine();
            }
        }
    }

    // Método para cadastrar usuário
    static void cadastrarUsuario() {
        String nomeUsuario, email;
        int idade, i = 0;

        System.err.println("Digite o nome do usuário:");
        nomeUsuario = resultadoScanner.nextLine().toUpperCase();

        do {
            if (i > 0) {
                System.out.println("\nE-mail inválido!");
                System.out.println("Exemplo: nome-do-email@email.dominio\n");
            }
            System.out.println("Digite o seu email:");
            email = resultadoScanner.nextLine();
            matcherEmail = patternEmail.matcher(email);

            i++;
        } while (!matcherEmail.matches());

        System.err.println("Digite a idade do usuário:");
        idade = resultadoScanner.nextInt();
        usuarios.add(new Usuario(nomeUsuario, email, idade));
        System.out.println("Usuário cadastrado com sucesso!");
    }

    // Listando usuários
    static void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("\nNenhum usuário existente...\n");
            return;
        }
        for (Usuario usuario : usuarios) {
            usuario.apresentaUsuario();
        }
    }

    static void procurarUsuario() {
        System.out.println("Nome do usuário (já cadastrado)");
        nome = resultadoScanner.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.getNome() == nome) {
                System.out.println("Usuário encontrado");
                usuario.apresentaUsuario();
                return;
            }

            System.out.println("Procurando...");
        }
    }
}
