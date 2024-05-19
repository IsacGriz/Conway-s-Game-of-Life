## Conway's Game of Life

# Descrição

O Conway's Game of Life é um autômato celular desenvolvido pelo matemático britânico John Conway em 1970. É um jogo de zero jogadores, o que significa que sua evolução é determinada pelo seu estado inicial, sem necessitar de nenhuma entrada adicional. O jogo é jogado em uma grade de células quadradas que podem estar em um de dois estados possíveis: viva ou morta. Cada célula interage com suas oito vizinhas, que são as células adjacentes horizontal, vertical e diagonalmente. A evolução do jogo ocorre em passos discretos, onde as regras de transição determinam o próximo estado de cada célula.

# Regras

Subpopulação: Uma célula viva com menos de dois vizinhos vivos morre (subpopulação).
Superpopulação: Uma célula viva com mais de três vizinhos vivos morre (superpopulação).
Continuidade: Uma célula viva com dois ou três vizinhos vivos continua viva para a próxima geração.
Reprodução: Uma célula morta com exatamente três vizinhos vivos se torna uma célula viva (reprodução).

# Como usar

Para jogar basta executar o arquivo Main.java com os seguintes argumentos:

Width: quantidade de quadrados no sentido de largura.
Height: quantidade de quadrados no sentido de altura.
Population: população inicial.
Generation: quantidade de gerações.
Speed: velocidade que as gerações devem alternar.

_Considerações:_

O valor de Width deve ser 10, 20 ou 40.
O valor de Height deve ser 10, 20, 40 ou 80.
O valor de Generation pode ser qualquer valor, o valor especial 0 resultará em gerações infitas, isto é, até o usuário interromper.
O valor de Speed deve ser entre 250 e 1000, sendo esses valores lidos em ms pelo software.
O valor de population deve ser uma String no formato "101#010#010", onde 1 representa uma célula viva, 0 representa uma célula morta e "#" representa a quebra de linha. O valor também pode ser "RND", significando que as células iniciais serão randomizadas.
Exemplo do input "101#010#010":

1 - 0 - 1
0 - 1 - 0
0 - 1 - 0

Todos os valores são obrigatório, com excessão de população que será randomizado caso não tenha valor.

A forma de inout deve ser: w=Integer, h=Integer, p=String, g=Integer, s=Integer.

A ordem não importa, apenas os tipos do valor.
