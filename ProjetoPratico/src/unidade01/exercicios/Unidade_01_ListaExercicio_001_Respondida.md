## 1. Calculadora Simples  
Implemente um algoritmo em pseudocódigo que solicite dois números ao usuário e disponibilize funções para realizar as quatro operações básicas (adição, subtração, multiplicação e divisão). Certifique-se de tratar o caso de divisão por zero.

```js
inicio Calculadora
ler (num1, num2)
    funcao Somar()
        escrever ("Soma: ", num1 + num2)
    fim funcao
    funcao Subtrair()
        escrever ("Subtração: ", num1 - num2)
    fim funcao
    funcao Multiplicar()
        escrever ("Multiplicação: ", num1 * num2)
    fim funcao
    funcao Dividir()
        se num2 != 0 então
            escrever ("Divisão: ", num1 / num2)
        senão
            escrever ("Erro: Divisão por zero!")
        fim se
    fim funcao
fim Calculadora
```

## 2. Cálculo do raio de um círculo:  
Escreva um algoritmo em pseudocódigo que peça ao usuário o valor do raio de um círculo e implemente uma função para calcular e exibir a área desse círculo. Utilize 3,14 como valor de Pi.  
```js
ler (raio)
area = 3.14 * (raio * raio)
escrever ("Área do círculo: ", area)
```

## 3. Gerenciamento de Retângulos:  
Desenvolva um algoritmo em pseudocódigo que peça ao usuário as medidas de comprimento e largura de um retângulo. Implemente funções para calcular e exibir a área e o perímetro do retângulo.
```js
ler (comprimento, largura)
area = comprimento * largura
escrever ("Área: ", area)
perimetro = 2 * (comprimento + largura)
escrever ("Perímetro: ", perimetro)
```
## 4. Conta Bancária:  
Implemente um algoritmo em pseudocódigo que represente uma Conta Bancária e que possua os atributos número da conta e saldo. Crie funções para depositar e sacar dinheiro da conta, garantindo que não seja possível sacar um valor maior que o saldo disponível.  
```js
inicio ContaBancaria
    variáveis: numeroConta, saldo
    ler (numeroConta, saldo)
    funcao Depositar()
        ler (valor)
        saldo = saldo + valor
    fim funcao
    funcao Sacar()
        ler (valor)
        se saldo >= valor então
            saldo = saldo - valor
        senão
            escrever ("Saldo insuficiente!")
        fim se
    fim funcao
fim ContaBancaria
```  
## 5. Gerenciar uma Loja:  
Crie um algoritmo em pseudocódigo para representar um item de uma loja (Produto). O Produto deve possuir os atributos nome, preço e quantidade em estoque. Implemente funções para adicionar e remover produtos do estoque e uma função para calcular o valor total do estoque.  
```js
inicio Produto
    variáveis: nome, preco, quantidadeEstoque
    ler (nome, preco, quantidadeEstoque)
    funcao AdicionarEstoque()
        ler (qtd)
        quantidadeEstoque = quantidadeEstoque + qtd
    fim funcao
    funcao RemoverEstoque()
        ler (qtd)
        se quantidadeEstoque >= qtd então
            quantidadeEstoque = quantidadeEstoque - qtd
        senão
            escrever ("Quantidade insuficiente!")
        fim se
    fim funcao
    funcao CalcularValorTotal()
        escrever ("Valor total do estoque: ", preco * quantidadeEstoque)
    fim funcao
fim Produto
```  
## 6. Consumo de combustível de um veículo:  
Desenvolva um algoritmo em pseudocódigo que represente um Veículo e possua os atributos modelo, capacidade do tanque e quilometragem rodada na última viagem. Implemente um método que calcule e exiba a média de consumo do veículo, considerando que o motorista encheu o tanque antes da viagem.  
```js
inicio Veiculo
    variáveis: modelo, capacidadeTanque, kmRodada
    ler (modelo, capacidadeTanque)
    funcao CalcularConsumo()
        ler (kmRodada)
        consumo = kmRodada / capacidadeTanque
        escrever ("Consumo médio: ", consumo, " km/L")
    fim funcao
fim Veiculo
```