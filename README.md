#### Desafio - Primeira aplicação em JAVA

**********************************************************************************

##### Dados iniciais

Nome: Jackeline Bomfim

Tipo Conta: Corrente

Saldo inicial: R$ 2.500,00

*************************************

##### Operações

1 - Consultar saldos

2- Receber valor

3 - Transferir valor

4 - Sair

*****************************

##### Funcionamento

Digite a opção desejada: 

Se apertarmos a tecla "1", iremos consultar o saldo e mostraremos o valor atual de `R$ 2500.0`, mas se apertarmos "2", exibiremos um segundo campo para escrevermos: `Informe o valor a receber:`.

Inseriremos o valor que iremos depositar, como `700` por exemplo, e, ao apertarmos "Enter", mostraremos o saldo atualizado de `R$ 3200.0`.

Mas se formos fazer uma transferência ou um saque com a tecla "3", teremos o campo `Informe o valor que deseja transferir:`. Se digitarmos `1000`, exibiremos o saldo atualizado de `R$ 2200.0`.

Por fim, para encerrarmos a aplicação, bastará apertarmos a tecla "4" em `Digite a opção desejada:`. Mas se digitarmos um número inválido como "9" por exemplo, receberemos a mensagem `Opção inválida`.

Se temos `2.200,00` (dois mil e duzentos reais) e tentarmos transferir um valor maior que este, como `5000` (cinco mil reais), teremos uma mensagem de que o saque não pode ser realizado:

```
Não há saldo suficiente para fazer essa transferência.
```