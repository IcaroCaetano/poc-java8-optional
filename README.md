# POC Java 8 Optional

## 01 — Creating Optional

````plantuml
Optional.of(), Optional.ofNullable() e Optional.empty().
````
Como criar um Optional com valor, com possibilidade de null

## 02 — Checking Values

````plantuml
isPresent() e isPresent() com get().

````
Como verificar a presença de um valor e entender as limitações de get().

## 03 — Default Values

````plantuml
map() e flatMap()
````

Como transformar valores e encadear operações sem verificações manuais de null.

## 05 — Filtering Values

````plantuml
filter().
````

Como aceitar somente valores que atendam a uma condição.


## 06 — Practical Scenarios

Encadeamento de métodos, busca de usuários, tratamento de dados ausentes e regras de negócio.
Aplicação dos conceitos em cenários semelhantes aos encontrados no backend.

