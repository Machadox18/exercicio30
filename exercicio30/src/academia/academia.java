package academia;

public class academia {
    private String nome;
    private int idade;
    private String matricula;
    private String plano;


    // Construtores
    public academia(String nome, int idade, String matricula, String plano) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.plano = plano;
    }


    public academia(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = "Não atribuído";
        this.plano = "Não especificado";
    }


    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getPlano() {
        return plano;
    }


    public void setPlano(String plano) {
        this.plano = plano;
    }


    // Método toString para exibir informações do aluno
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula='" + matricula + '\'' +
                ", plano='" + plano + '\'' +
                '}';

    }
}