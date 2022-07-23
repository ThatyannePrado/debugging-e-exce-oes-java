# Debugging

### Main
Evidencia a pilha de execução através de uma sucessão de chamadas de métodos dentro de outros métodos.<br>

### CalculadoraDeMedias
A partir de entradas de notas dos alunos, calcula a média das notas.<br><br>


<br><br>
# Exceptions

### UncheckedException

O usuário informa um denominador e numerador inteiros e o programa retorna o resultado da divisão dos números apresentados.<br><br>
São tratadas as exceções de entradas nulas, de formato e de divisão por zero utilizando try-catch-finally. 


### CheckedException

É passado um arquivo para ser lido e escrito no console. A função 'inprimirArquivoNoConsole' é responsável por fazer essa impressão.<br>
<br>
A exceções 'FileNotFoundException' e 'IOException' são tratadas usando try-catch-finally.<br><br>

### Exception Customizada

O programa é responsável pela leitura e print no console do texto contido em arquivo passado pelo usuário. O caminho para este arquivo é apresentado em caixa de diálogo.<br><br>
É criada exceção personaizada para o caso de arquivo não encontrado (ImpossivelAberturaDeArquivoException), que herda métodos da classe 'Exception'. Além disso, também são tratadas as exceções de tipo 'IOException'.<br><br>
É usada a estrutura try-catch.

### Exception Customizada 2

O programa é responsável por fazer a divisão dos elementos de uma lista de numeradores por uma lista de denominadores pares.<br><br>
São tratadas as seguintes exceptions: <br><br>
1) Divisão não exata: quando o numerador é ímpar, a divisão não retorna um número inteiro.
2) Divisão por zero: quando o denominador é zero, a divisão é indeterminada.
3) Array index out of bounds: lista de numeradores é menor que denominadores.
<br> Utiliza-se estrutura try-catch e exceções personalizadas.


<b>Programa desenvolvido no Santander Code Girls 2022. DIO