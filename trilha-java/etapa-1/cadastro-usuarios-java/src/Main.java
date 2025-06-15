import java.util.regex.*;
import java.util.*;

public class Main {

    // Classes importadas
    // Variáveis globais
    static Scanner resultadoScanner = new Scanner(System.in);
    static List<Usuario> usuarios = new ArrayList<>();

    // Declaração de variáveies padrão
    static String nome, email;
    static int idade;

    // Validação de email
    static String emailValido = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$"; // Uso do regex
    static Matcher matcherEmail;
    static Pattern patternEmail = Pattern.compile(emailValido);

    public static void main(String[] args) throws Exception {

        int opcao;

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
                case 4:
                    atualizaIdade();
                    Thread.sleep(3000);
                    break;
                case 5:
                    excluirUsuario();
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
                System.out.println("1. Cadastrar Usuário");
                System.out.println("2. Listar todos os usuários");
                System.out.println("3. Buscar usuário por nome");
                System.out.println("4. Atualizar idade de um usuário");
                System.out.println("5. Excluir um usuário");
                System.out.println("6. Sair");
                System.out.println("Escolha a opção:");
                opcao = resultadoScanner.nextInt();

                if (opcao > 0 && opcao <= 6) {
                    return opcao;
                } else {
                    System.err.println("Digite um número de um a 6");
                }
            } catch (InputMismatchException e) {
                System.err.println("\nEntrada Inválida! Insira um número\n");
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

        while (true) {
            try {
                System.err.println("Digite a idade do usuário:");
                idade = resultadoScanner.nextInt();
                resultadoScanner.nextLine();
                if (idade < 1 || idade > 100) {
                    System.out.println("\nIdade inválida!\n");
                } else {
                    usuarios.add(new Usuario(nomeUsuario, email, idade));
                    System.out.println("\nUsuário cadastrado com sucesso!\n");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nPor favor, insira um número\n");
                resultadoScanner.nextLine();
            }
        }

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

    // Procurar usuário pelo nome
    static void procurarUsuario() {
        if (usuarios.isEmpty()) {
            System.out.println("\nNenhum usuário existente...\n");
            return;
        }

        System.out.println("Nome do usuário (já cadastrado)");
        nome = resultadoScanner.nextLine().toUpperCase();

        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Usuário encontrado");
                usuario.apresentaUsuario();
                return;
            } else {
                System.out.println(
                        "Usuário não encontrado, verifique se o nome foi inserido corretamente ou se está registrado no sistema");
            }
        }
    }

    // Método para atualizar a idade do usuário
    static void atualizaIdade() {
        if (usuarios.isEmpty()) {
            System.out.println("\nNenhum usuário existente...\n");
            return;
        }

        System.out.println("Nome do usuário (já cadastrado)");
        nome = resultadoScanner.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Usuário encontrado");
                usuario.apresentaUsuario();

                while (true) {
                    try {
                        System.out.println("Nova idade");
                        idade = resultadoScanner.nextInt();

                        if (idade < 1 || idade > 100) {
                            System.out.println("Idade inválida");
                        } else {
                            usuario.setIdade(idade);
                            System.out.println("Idade ATUALIZADA!");
                            usuario.apresentaUsuario();
                            return;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("\nValor digitado  INVÁLIDO\n");
                        resultadoScanner.nextLine();
                    }
                }
            }
        }
    }

    // Método para excluir o usuário
    static void excluirUsuario() {
        String resposta;

        if (usuarios.isEmpty()) {
            System.out.println("\nNenhum usuário existente...\n");
            return;
        }

        while (true) {
            try {
                System.out.println("Nome do usuário que deseja excluir:");
                String nome = resultadoScanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.err.println("Insira um valor válido");
            }
        }

        Iterator<Usuario> iterator = usuarios.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            Usuario usuario = iterator.next();

            if (usuario.getNome().equalsIgnoreCase(nome)) {
                encontrado = true;

                System.out.println("Usuário encontrado:");
                usuario.apresentaUsuario();

                while (true) {
                    try {
                        System.out.println("Excluir usuário? S/N");
                        resposta = resultadoScanner.nextLine().toUpperCase();

                        if (resposta.equals("S")) {
                            iterator.remove(); // ← forma segura de remover durante a iteração
                            System.out.println("Usuário deletado com sucesso.");
                            return; // finaliza após remoção
                        } else if (resposta.equals("N")) {
                            System.out.println("Operação de exclusão cancelada.");
                            return;
                        } else {
                            System.out.println("Digite S para SIM ou N para NÃO");
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("\nValor digitado INVÁLIDO\n");
                        resultadoScanner.nextLine(); // limpa o buffer
                    }
                }
            }
        }

        if (!encontrado) {
            System.out.println("Usuário não encontrado.");
        }
    }
}
