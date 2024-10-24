Projeto utilizando Java, com as seguintes classes: Aluno, Aula, Prof e a última como Principal para executar o projeto.

🚀 Recrie a hierarquia de classes dessa aula e implemente o método enviar email. Esse método deve receber o corpo da mensagem e acrescentar a ela uma saudação de acordo com a implementação do objeto.

Por exemplo:

Olá Prof.  Alan Turing!

Mensagem ….

Ou

Olá Aluno Joseph!

Mensagem …
📋 Pré-requisitos

jdk - 17.0.11_windows Eclipse IDE for Java Developers - 2024 -12

Dar exemplos 🔧 1. Instalar o download do JDK 17 2. Instalar o Elipse IDE for Java Developers 3. Abrir o Eclipse 4. Ir até window -> Preferences -> Java -> Installed JREs 5. Adicionar JDK 17a lista de ambientes JRE

Explicação de como deve ser utilizado o projeto:
🛠 Foi definido uma classe abstrata chamada Aula, representando os participantes de aulas, como alunos e professores. Ela tem um atributo para o nome, um construtor para inicializá-lo, um método abstrato "saudar"
para personalizar saudações e um método "enviarEmail" que combina a saudação com uma mensagem. As classes Aluno e Prof herdam de Aula e implementam suas próprias saudações. No "Principal", criamos um aluno e um professor,
e enviamos e-mails para eles, simulando a comunicação na aula.

Ferramentas utilizadas e bibliotecas

IDE Eclipse 📌 Versão Eclipse IDE for Java Developers - 2024-12

Versão 1.0 caso seja atualizado manter a descrição inicial e inserir uma nova linha com descrição da atualização. Versão 1.1 - Fatoração data 09/09/24 ✒ Autores

Fernando Bloes - Etapa POLIMORFISMO - Atividade individual Lista de Exercícios - Etapa POLIMORFISMO
