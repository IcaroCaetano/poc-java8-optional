# POC Java 8 Optional

Optional não elimina todos os NullPointerException automaticamente. Seu benefício é tornar a ausência de um valor 
explícita e oferecer uma API para lidar com ela.

## Conteúdo

### 01 — Creating Optional

````plantuml
Optional.of(), Optional.ofNullable() e Optional.empty().
````
Como criar um Optional com valor, com possibilidade de null

### 02 — Checking Values

````plantuml
isPresent() e isPresent() com get().

````
Como verificar a presença de um valor e entender as limitações de get().

### 03 — Default Values

````plantuml
orElse(), orElseGet() e orElseThrow().
````

Como definir valores padrão ou lançar exceções quando necessário.

### 04 — Transforming Values

````plantuml
map() e flatMap().
````

Como transformar valores e encadear operações sem verificações manuais de null.

### 05 — Filtering Values

````plantuml
filter().
````

Como aceitar somente valores que atendam a uma condição.


### 06 — Practical Scenarios

Encadeamento de métodos, busca de usuários, tratamento de dados ausentes e regras de negócio.
Aplicação dos conceitos em cenários semelhantes aos encontrados no backend.

### Estutura

````plantuml
poc-java8-optional/
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   └── java/
    │       └── com/example/optional/
    │           ├── Example01CreatingOptional.java
    │           ├── Example02CheckingValues.java
    │           ├── Example03DefaultValues.java
    │           ├── Example04Map.java
    │           ├── Example05FlatMap.java
    │           ├── Example06Filter.java
    │           └── Example07RealWorld.java
    └── test/
        └── java/
            └── com/example/optional/
````

### Conceitos & Anotações

#### 1. Optional.of(value)
Quando se houver certeza que o valor não será nulo, use o of.
Para deixar explicito que o valor não pode ser nulo.

#### 2. Optional.ofNullable(value)
Quando for trabalhar com um valor que pode ser nulo. Use o ofNullable.

#### 3. Optional.get()
Retorna o valor contido no Optional. No entanto, se não for verificado se o valor nulo pode lançar uma NoSuchElementException.

#### 4. .orElse()
Retorna um valor ou se vazio retorna um valor padrão.

#### 5. .orElseGet()
Retorna um valor ou se vazio chama um Supplier para buscar um valor.

Esse modelo pode ser usado para encapsular uma chamada a um serviço externo ou banco de dados e retornar o valor.

#### 6. .orElseThrow
Retorna um valor ou se vazio lança uma exceção. 