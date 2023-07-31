# desafioCompras
Aplicação simulando uma interação direta entre compras feitas pelo usuário e seu cartão de crédito. 

Projeto desenvolvido no curso 'Java: trabalhando com listas e coleções de dados' da Alura, ministrado pelos instrutores Paulo Silveira e Jacqueline Oliveira.

Neste desafio o intuito foi criar uma aplicação que, de modo visual e interativo, proporcionasse ao usuário definir um determinado limite de seu cartão de crédito e realizasse compras de itens, especificando seus nomes e valores, até que o usuário decidisse não comprar mais nada ou até o seu limite se esgotar. 

No fim da execução da aplicação há, então, uma exibição das compras que foram realizadas (caso algum item tenha sido comprado), ordenadas por valor em ordem crescente e, simultaneamente, por ordem alfabética, além da exibição do limite restante (saldo) do cartão.

O projeto foi inteiramente desenvolvido em Java e usando da Orientação a Objetos para desenvolver uma aplicação mais fluida, robusta e bem segregada, com as classes bem separadas, cada qual exercendo sua função e com os códigos bem encapsulados.

Em suma, os desafios propostos foram:
<ol>
    <li>Criar uma aplicação para lançamento de compras com cartão de crédito</li>
    <li>Menu para lançamento de compras</li>
    <li>Exibição da lista de compras realizadas e ordenadas por valor</li>
    <li>Na aplicação de compras o usuário define o limite do cartão de crédito, o nome do produto comprado e o seu valor</li>
    <li>O usuário digita um número para continuar na aplicação ou sair dela, caso o limite não tenha sido atingido</li>
    <li>Caso o item a ser comprado fosse maior que o limite atual, discriminaria saldo insuficiente e sairia da aplicação (não implementado)</li>
</ol>

Além dos desafios propostos, também foram incluídos outros tópicos para melhor e mais lógico funcionamento da aplicação:

<ol>
    <li>Exibição da lista de compras realizadas e ordenadas por valor e, segundamente, por ordem alfabética</li>
    <li>Caso o item a ser comprado seja maior que o limite atual, é exibido mensagem de saldo insuficiente e não sai da aplicação.</li>
    <li>Exibe mensagem caso nenhuma compra tenha sido realizada.</li>
    <li>Impede o usuário de comprar com limite igual ou inferior a 0.</li>
</ol>