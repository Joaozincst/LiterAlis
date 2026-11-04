# 📚 LiterAlis - Gerenciador de Acervo Literário

O **LiterAlis** é uma aplicação em Java desenvolvida para organizar, gerenciar e pesquisar acervos de leituras (como livros e histórias em quadrinhos) por meio de um menu interativo no terminal.

O projeto foi construído aplicando os **pilares da Programação Orientada a Objetos (POO)**, permitindo cadastrar diferentes tipos de publicações e realizar consultas polimórficas dinâmicas.

---

### 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java
- **Estruturas de Dados:** `ArrayList`, `List`
- **Controle de Versão:** Git / GitHub

---

### ⚙️ Arquitetura e Conceitos de POO

O sistema foi modelado com foco em boas práticas de orientação a objetos:

- 🔹 **Abstração:** Classe base `Leitura`, contendo os atributos e comportamentos comuns a qualquer publicação (Título, Autor, Editora, etc.).
- 🔹 **Herança:** Classes `Livro` e `Hqs` que estendem `Leitura`, adicionando atributos específicos (ex: número de capítulos em livros, desenhista, issues e época em HQs).
- 🔹 **Polimorfismo:** Sobrescrita (`@Override`) do método `exibirDetalhes()` para formatar a exibição de dados de acordo com o tipo específico de leitura.
- 🔹 **Filtragem & Busca Dinâmica:** Método de busca por título no `Acervo` utilizando verificação de tipo (`instanceof`) para exibir detalhes customizados.

---

### 📂 Estrutura do Projeto

```text
src/
├── Acervo.java      # Gerencia a lista de leituras e realiza pesquisas no acervo
├── Leitura.java     # Classe base abstrata/geral de publicações
├── Livro.java       # Subclasse especializada para livros
├── Hqs.java         # Subclasse especializada para HQs/Quadrinhos
└── Main.java        # Execução principal do sistema e menu interativo no terminal
