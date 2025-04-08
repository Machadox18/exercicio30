import academia.academia;

public class Main {
    public static void main(String[] args) {
        academia aluno1 = new academia("João Silva", 25, "12345", "Platinum");
        academia aluno2 = new academia("Maria Oliveira", 30);


// Usando os métodos getters para acessar os atributos
        System.out.println("Aluno 1: " + aluno1.toString());
        System.out.println("Aluno 2: " + aluno2.toString());


// Modificando atributos usando setters
        aluno2.setMatricula("67890");
        aluno2.setPlano("Gold");


// Mostrando as mudanças
        System.out.println("Aluno 2 após atualização: " + aluno2.toString());

        }
    }