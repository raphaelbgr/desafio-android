# Criar um aplicativo de consulta a API do [GitHub](https://github.com)#

Criar um aplicativo para consultar a [API do GitHub](https://developer.github.com/v3/) e trazer os repositórios mais populares de Java. Basear-se no mockup fornecido:

![Lista de repositorios](https://bitbucket.org/adminsuper/desafio-android-super-revendedores/raw/95459e655c07e52ca3906624ca831e12913b664c/image/list.png)
![Lista de PR](https://bitbucket.org/adminsuper/desafio-android-super-revendedores/raw/95459e655c07e52ca3906624ca831e12913b664c/image/repo.png =250x250)

### **Deve conter** ###

- __Lista de repositórios__. Exemplo de chamada na API: `https://api.github.com/search/repositories?q=language:Java&sort=stars&page=1`
  * Paginação na tela de lista, com endless scroll / scroll infinito (incrementando o parâmetro `page`).
  * Cada repositório deve exibir Nome do repositório, Descrição do Repositório, Nome / Foto do autor, Número de Stars, Número de Forks
  * Ao tocar em um item, deve levar a lista de Pull Requests do repositório
- __Pull Requests de um repositório__. Exemplo de chamada na API: `https://api.github.com/repos/<criador>/<repositório>/pulls`
  * Cada item da lista deve exibir Nome / Foto do autor do PR, Título do PR, Data do PR e Body do PR
  * Ao tocar em um item, deve abrir no browser a página do Pull Request em questão


### **OBS** ###

A foto do mockup é meramente ilustrativa.  

### Adicionais ###

* Gestão de dependencias no projeto. Ex: [Gradle]
* Mapeamento json -> Objeto 
* Framework para Comunicação com API 
* Testes unitários no projeto 
* Testes funcionais
* App Universal
* Cache de Imagens
* Cache dos dados
 

### **Sugestões** ###

Pode-se utilizar das libs que preferir. Há muitos lugares de referência como [Android Arsenal](https://android-arsenal.com/)

Caso tenha alguma dúvida, o [CodePath](https://guides.codepath.com/android) é um bom lugar para dar uma olhada. Não impedimos 
que outros lugares sejam consultados.

Use **JAVA** para o desafio

Bons usos do material design são apreciados pelo nosso designer! :D

Coloque o link do github das libs que usar no Read.me ou na Doc do PR que fizer, para que possamos analisar.

### **Processo de submissão** ###
O candidato deverá implementar a solução e enviar um PR (pull request) para este repositório com a solução.

Boa Sorte!
