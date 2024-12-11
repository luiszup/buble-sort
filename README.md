# Bubble Sort em Java

O **Bubble Sort** é um dos algoritmos de ordenação mais simples. Ele funciona comparando pares de elementos adjacentes em uma lista e trocando-os de lugar se estiverem na ordem errada. Esse processo é repetido até que a lista esteja completamente ordenada.

## Como funciona o Bubble Sort?

1. Percorre a lista do início ao fim.
2. Compara cada par de elementos adjacentes.
3. Troca os elementos de lugar se o primeiro for maior que o segundo (para ordenação crescente).
4. Repete o processo para os elementos restantes, ignorando os últimos já ordenados.
5. O algoritmo termina quando nenhuma troca é feita durante uma passagem.

Embora seja fácil de implementar, o Bubble Sort não é eficiente para grandes conjuntos de dados devido à sua complexidade de tempo **O(n²)** no pior e no caso médio.

## Instruções para executar o código

### Pré-requisitos
- **Java Development Kit (JDK)** instalado na máquina.
- Um editor de texto ou IDE (como IntelliJ IDEA, Eclipse ou VS Code) para compilar e executar o código.
- **Git** instalado para clonar o repositório (opcional).

### Passos para execução

1. **Clone o repositório para sua máquina**:
    - Abra o terminal e execute o comando:
      ```bash
      git clone https://github.com/luiszup/quickSort.git
      ```
    - Navegue até o diretório do projeto:
      ```bash
      cd quickSort
      ```

2. **Compile o programa**:
    - No terminal, compile o arquivo `Main.java` (ou o arquivo principal do programa):
      ```bash
      javac Main.java
      ```

3. **Execute o programa**:
    - Após a compilação, execute o programa com o comando:
      ```bash
      java Main
      ```

4. **Exemplo de entrada e saída**:
    -Após a execução do algoritmo Bubble Sort, o array será ordenado em ordem crescente:
    ```bash
    Lista ordenada: [9, 10, 11, 12, 19, 29, 50, 66, 78, 95]
    O algoritmo percorre a lista, compara os elementos adjacentes e os troca de lugar se necessário, até que a lista esteja completamente ordenada.
    ```

---

## Contribuições

Sinta-se à vontade para contribuir com melhorias no código ou na documentação. Para isso:
- Abra uma **issue** para relatar problemas ou sugerir melhorias.
- Envie um **pull request** com suas alterações.