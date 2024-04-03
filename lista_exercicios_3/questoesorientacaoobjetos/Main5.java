package questoesorientacaoobjetos;

import java.util.ArrayList;

public class Main5 {

    abstract class Pessoa {
        protected String nome;

        public Pessoa(String nome) {
            this.nome = nome;
        }

        // metodo abstrato reportar
        public abstract void reportar();
    }

    class Trabalhador extends Pessoa {
        private double salario;

        public Trabalhador(String nome, double salario) {
            super(nome);
            this.salario = salario;
        }

        // método reportar para Trabalhador
        @Override
        public void reportar() {
            System.out.printf("Nome: %s\t Salário: %.2f\n", nome, salario);
        }
    }

    class Estudante extends Pessoa {
        private int idade;

        public Estudante(String nome, int idade) {
            super(nome);
            this.idade = idade;
        }

        // método reportar para Estudante
        @Override
        public void reportar() {
            System.out.printf("Nome: %s\t Idade: %d\n", nome, idade);
        }
    }

    public class Main {
        /**
         * @param params
         */
        public static void main(String[] params) {
            ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
            final Trabalhador t1 = new Trabalhador("jorge", 2000.0);
            Trabalhador t2 = new Trabalhador("jose", 5600.0);
            Estudante e1 = new Estudante("luiz", 23);
            Estudante e2 = new Estudante("tatiane", 21);

            lista.add(t1);
            lista.add(t2);
            lista.add(e1);
            lista.add(e2);

            for (Pessoa p : lista) {
                p.reportar();
            }
        }
    }

}
