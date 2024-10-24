public class Aluno extends Aula {

    // Atributo do aluno é inicializado com base na superclasse Aula
    public Aluno(String nome) {
        super(nome);
    }

    // Método de saudação personalizado para Aluno
    @Override
    public String saudar() {
        return "Olá aluno " + getNome() + "!"; // Exibindo o nome do aluno
    }
}
