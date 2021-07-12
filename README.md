# java-RPG_Character
RPG Character Exercise
### solved by d_llirium

Desenvolva uma classe denominada Personagem que irá representar um personagem dentro de um MOBA/RPG.


- Um personagem tem um nível, 
  - que no início de uma partida é sempre 1. 
  - Esse nível pode ser melhorado ao receber pontos de experiência. A cada 100 pontos de experiência que um personagem recebe, o seu nível é incrementado em 1. O nível máximo que um personagem pode alcançar é 25.
- Todo personagem tem quatro habilidades (skills/magias), 
  -  e cada habilidade tem seu próprio nível de melhoria. 
  - Todas as 4 habilidades iniciam a partida com melhoria em 0 (não podendo ser usada). 
  - A cada nível do personagem (incluindo o nível 1), ele pode escolher melhorar uma das habilidades, incrementando o nível dela em 1. 
  - As três primeiras habilidades têm um nível máximo de 4. 
  - A quarta habilidade é especial (ultimate), tendo um nível máximo de 3, e apenas podendo ser melhorada quando o personagem atingir o nível 6.
- Um personagem tem uma quantidade pré-determinada de pontos de mana, 
  - que são consumidos conforme usa suas habilidades. 
  - Cada habilidade tem um custo de mana, que é um custo base (diferente para cada habilidade) multiplicado pelo nível atual daquela habilidade.
**A classe deverá possuir os seguintes métodos públicos:**
- Um construtor 
  - que recebe 5 argumentos, 
    - representando a quantidade de mana máxima do personagem, 
    - seguido pela quantidade de mana base de cada uma das quatro habilidades. 
      - A mana do personagem inicialmente é igual a mana máxima.
- adicionarXP(int): 
  - adiciona uma quantidade de pontos de experiência ao personagem
- getNivel(): 
  - retorna o nível atual do personagem
- melhorarHabilidade(int): 
  - melhora uma das quatro habilidades do personagem (indexada por 0). 
  - Retorna um booleano indicando se foi possível melhorá-la
- usarHabilidade(int): 
  - ativa a habilidade do personagem (indexada por 0), 
  - consumindo mana no processo. 
  - Retorna um booleano indicando se foi possível usar a habilidade
- consumirPocao(): 
  - recarrega a mana do personagem em 350. A mana total não pode ultrapassar a mana máxima.
