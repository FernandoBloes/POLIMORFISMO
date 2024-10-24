public class Prof extends Aula {

    // O nome do professor é inicializado na superclasse Aula
    public Prof(String nome) {
        super(nome);
    }

    // Método de saudação personalizado para Professor
    @Override
    public String saudar() {
        return "Olá Professor " + getNome() + "!"; // Exibindo o nome do professor
    }
}
