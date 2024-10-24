public abstract class Aula {
    
    // Armazena o nome de um participante (pode ser aluno ou professor)
    private String nome;

    // Construtor que define o nome de qualquer pessoa que participe da aula
    public Aula(String nome) {
        this.nome = nome;
    }

    // Método para acessar o nome de quem foi criado (getter)
    public String getNome() {
        return nome;
    }

    // Método abstrato que será implementado nas subclasses
    public abstract String saudar();

    // Método para enviar uma mensagem por email para o participante
    public void enviarEmail(String mensagem) {
        System.out.println(saudar() + "\nConteúdo do email: " + mensagem); // Combina saudação e mensagem
    }
}
