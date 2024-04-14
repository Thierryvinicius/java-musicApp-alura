## Título do Projeto: MusicApp

## Descrição:
Este projeto foi criado com o objetivo de reforçar os conceitos fundamentais de Programação Orientada a Objetos (POO), Herança, Polimorfismo e Interface em Java, utilizando o contexto de músicas.

## Funcionalidades:
### Cadastro de títulos musicais:
O usuário pode cadastrar diferentes tipos de títulos, como musicas e podcasts.

### Classificação:
É possível avaliar um título e depois retornar uma mensagem especial a depender da avaliação do mesmo

## Estrutura do Projeto:
### Audio (superclasse):
Define os atributos e métodos comuns a todos os tipos de títulos.

### Music e Podcast (subclasses):
Herdam da classe Título e adicionam atributos específicos de cada tipo de título.

### myFavs:
Contém a classe responsável por receber um objeto do tipo audio e retornar sua avaliação a depender do número de curtidas ou visualizações.
