# Projeto de Classificação de Jogos e Filmes


## Descrição
Este projeto, desenvolvido em Java, é uma aplicação para gerenciar informações e avaliações de jogos e filmes. Ele permite:
- **Cadastro de jogos e filmes**: Inclui informações como nome, descrição, ano de lançamento e o tempo necessário para completar ou assistir.
- **Gerenciamento de avaliações**: Armazena e calcula a média das avaliações atribuídas aos jogos.
- **Cálculo de tempo total**: Soma o tempo necessário para completar todos os jogos e assistir todos os filmes cadastrados.
- **Aplicação de filtros**: Permite aplicar filtros de classificação para facilitar a organização dos itens.

---

## Estrutura do Projeto

### Pacotes
O projeto está organizado nos seguintes pacotes:
- `br.com.serda.southmap.calculos`: Contém classes para manipulação de cálculos e filtros.
  - **Classes**: `calculation`, `ClassificationFilter`
- `br.com.serda.southmap.models`: Contém as classes de modelos para jogos e filmes.
  - **Classes**: `GameInfo`, `MovieInfo`

### Classes Principais
- **Main**: Classe principal responsável por criar objetos e usar funcionalidades de cálculo e filtros, integrando as classes de jogos e filmes.

---

## Funcionalidades

### Gerenciamento de Informações
- Criação de objetos para jogos e filmes, com nome, descrição, ano de lançamento e tempo de conclusão.

### Avaliações
- Adição de avaliações aos jogos.
- Cálculo da média das avaliações e do total de avaliações.

### Cálculos de Tempo
- Cálculo do tempo total necessário para completar todos os jogos e assistir a todos os filmes.

### Filtros de Classificação
- Aplicação de filtros de classificação para organizar os itens de acordo com critérios estabelecidos.

---

## Exemplos de Uso

```java
public class Main {
    public static void main(String[] args) {
        GameInfo newGame = new GameInfo();
        GameInfo anotherGame = new GameInfo();
        MovieInfo newMovie = new MovieInfo();

        // Configuração de jogos
        newGame.setName("The Legend of Zelda: Ocarina of Time");
        newGame.setDescription("É um jogo 3D de Nintendo 64");
        newGame.setYearOfLaunch(1998);
        newGame.setHoursToBeat(27.2);

        anotherGame.setName("Super Mario 64");
        anotherGame.setDescription("É um jogo 3D de Nintendo 64");
        anotherGame.setYearOfLaunch(1999);
        anotherGame.setHoursToBeat(20.3);

        // Configuração de filme
        newMovie.setName("O Planeta do Tesouro");
        newMovie.setDescription("Filme de fantasia e aventura");
        newMovie.setYearOfLaunch(2005);
        newMovie.setHoursToBeat(1.5);

        // Exibindo informações e avaliações
        newGame.showInformation();
        newGame.rating(8);
        newGame.rating(10);
        newGame.rating(6);

        System.out.println("A quantidade de avaliações é: " + newGame.getTotalRating());
        System.out.println("A média das avaliações é: " + newGame.getAverage());

        // Cálculo do tempo total
        calculation newCalculation = new calculation();
        newCalculation.includes(newGame);
        newCalculation.includes(anotherGame);
        newCalculation.includes(newMovie);

        System.out.println("Tempo total para completar/assistir tudo: " + newCalculation.getTotalTime());

        // Aplicação de filtro
        ClassificationFilter filter = new ClassificationFilter();
        filter.filter(newGame);
    }
}
```

---

## Requisitos do Sistema

- **Java SDK**: versão 23
- **IDE**: IntelliJ IDEA 2024.2.4, Community Edition

## Executando o Projeto

1. Certifique-se de ter o Java SDK versão 23 instalado.
2. Abra o projeto no IntelliJ IDEA 2024.2.4, Community Edition.
3. Compile e execute a classe `Main` para testar o funcionamento das funcionalidades.

---

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir Issues e Pull Requests para melhorias. 

