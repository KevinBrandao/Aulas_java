public class Aluno {
    private String nome;
    private double p1;
    private double p2;

    // Construtor
    public Aluno(String nome, double p1, double p2) {
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe Aluno e atribuindo valores arbitrários
        Aluno a1 = new Aluno("João", 7.5, 8.0);

        // Mostrando os valores
        System.out.println("Valores de a1: ");
        System.out.println("Nome: " + a1.getNome());
        System.out.println("P1: " + a1.getP1());
        System.out.println("P2: " + a1.getP2());

        // Criando uma nova variável a2 que recebe a1
        Aluno a2 = a1;

        // Alterando os valores de p1 e p2 na variável a2
        a2.setP1(6.0);
        a2.setP2(7.0);

        // Mostrando os valores dos atributos de a1 e a2
        System.out.println("\nValores de a1 após alteração em a2: ");
        System.out.println("Nome: " + a1.getNome());
        System.out.println("P1: " + a1.getP1());
        System.out.println("P2: " + a1.getP2());

        System.out.println("\nValores de a2: ");
        System.out.println("Nome: " + a2.getNome());
        System.out.println("P1: " + a2.getP1());
        System.out.println("P2: " + a2.getP2());
    }
}

/*explicação:
Quando atribuímos a1 para a2, estamos na verdade fazendo com que a2 aponte para o mesmo objeto na memória que a1.
Portanto, quando alteramos os valores de p1 e p2 em a2, essas alterações são refletidas no objeto original ao
qual a1 também está apontando. Portanto, ao mostrar os valores de a1 após as alterações em a2.
*/

