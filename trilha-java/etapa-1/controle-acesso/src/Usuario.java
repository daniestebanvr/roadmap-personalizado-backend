public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha)
    {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getSenha()
    {
        return senha;
    }
    public void setSenha(String senha)
    {
        this.senha = senha;
    }

    public void verPerfil()
    {
        System.out.println("\nUsuário: " + nome);
        System.out.println("Senha: " + senha);
    }
}
