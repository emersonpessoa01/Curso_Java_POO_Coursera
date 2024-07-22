# Resumo

Nesse projeto chamado **Concurso**, onde ordenaremos candidatos. A classe `Candidato` implementará `Comparable` e terá três atributos: **nota**, **deficiente** e **idade**. No método `compareTo`, primeiro comparamos as notas; se iguais, verificamos se são deficientes; se também iguais, comparamos as idades.

Foi criados um construtor e getters para `Candidato`. Na comparação, se as notas forem diferentes, será retornado a diferença entre elas. Se forem iguais, será verificado se ambos são deficientes. Se não, retornará 1 ou -1. Se os critérios anteriores empatarem, será usado a idade para desempatar.

Na classe principal, foi criado uma lista de candidatos e adicionados alguns exemplos. Sendo Usado `Collections.sort` para ordenar a lista. Sobrescrever o método `toString` para facilitar a visualização dos candidatos ordenados. Após ordenar, foi verificado que a lista está correta segundo os critérios de ordenação.

Este exemplo prático demonstra como utilizar interfaces para implementar lógica personalizada em classes que serão usadas por métodos existentes, como a ordenação de listas no Java. Obrigado por acessar meu hands-on.

