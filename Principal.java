public class Principal {
    public static void main(String[] args) {
        // Criação de instâncias de Professor e Aluno
        Prof professor = new Prof("Alan Turing");
        Aluno aluno = new Aluno("Joseph");

        // Simulação do envio de uma mensagem para professor e aluno
        professor.enviarEmail("Você tem uma nova tarefa para revisar.");
        aluno.enviarEmail("Sua inscrição foi confirmada.");
    }
}
