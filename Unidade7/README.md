# Orientação a Objetos em Java

---

## 1. Introdução à Orientação a Objetos

A **Programação Orientada a Objetos (POO)** é um paradigma de programação baseado no conceito de "objetos", que podem conter dados na forma de campos (atributos) e código na forma de procedimentos (métodos).

### 1.1 Conceitos Fundamentais

Os quatro pilares da Orientação a Objetos são:
- **Encapsulamento:** ocultamento de detalhes de implementação
- **Herança:** reaproveitamento e extensão de código
- **Polimorfismo:** múltiplas formas de implementação
- **Abstração:** representação simplificada da realidade

### 1.2 Vantagens da POO

- Modularidade
- Reusabilidade
- Facilidade de manutenção
- Organização lógica do código
- Representação mais natural de entidades do mundo real

### 1.3 Java como linguagem orientada a objetos

O Java é uma linguagem fortemente orientada a objetos, onde quase tudo é um objeto, exceto os tipos primitivos. Todo programa Java necessita de pelo menos uma classe para executar.

## 2. Classes e Objetos

### 2.1 O que é uma Classe?

Uma **classe** é um modelo ou protótipo que define os atributos e comportamentos comuns a todos os objetos de um determinado tipo.

```java
public class Carro {
    // Atributos
    String modelo;
    String cor;
    int ano;
    double velocidade;
    
    // Métodos
    void acelerar() {
        velocidade += 10;
        System.out.println("Acelerando... Velocidade atual: " + velocidade);
    }
    
    void frear() {
        velocidade -= 10;
        System.out.println("Freando... Velocidade atual: " + velocidade);
    }
}
```

### 2.2 O que é um Objeto?

Um **objeto** é uma instância de uma classe, representando uma entidade específica com suas próprias características.

```java
public class ExemploCarro {
    public static void main(String[] args) {
        // Criando objetos da classe Carro
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        
        // Definindo atributos do carro1
        carro1.modelo = "Fusca";
        carro1.cor = "Azul";
        carro1.ano = 1980;
        
        // Definindo atributos do carro2
        carro2.modelo = "Gol";
        carro2.cor = "Preto";
        carro2.ano = 2022;
        
        // Usando os métodos
        carro1.acelerar(); // Saída: Acelerando... Velocidade atual: 10.0
        carro2.acelerar(); // Saída: Acelerando... Velocidade atual: 10.0
        carro2.acelerar(); // Saída: Acelerando... Velocidade atual: 20.0
    }
}
```

### 2.3 Construtores

**Construtores** são métodos especiais chamados quando um objeto é instanciado. Eles inicializam o objeto, atribuindo valores iniciais aos seus atributos.

```java
public class Carro {
    // Atributos
    String modelo;
    String cor;
    int ano;
    double velocidade;
    
    // Construtor padrão (sem parâmetros)
    public Carro() {
        velocidade = 0;
    }
    
    // Construtor com parâmetros
    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = 0;
    }
    
    // Métodos
    void acelerar() {
        velocidade += 10;
        System.out.println("Acelerando... Velocidade atual: " + velocidade);
    }
    
    void frear() {
        velocidade -= 10;
        System.out.println("Freando... Velocidade atual: " + velocidade);
    }
}
```

Usando os construtores:

```java
public class ExemploCarro {
    public static void main(String[] args) {
        // Usando o construtor padrão
        Carro carro1 = new Carro();
        carro1.modelo = "Fusca";
        
        // Usando o construtor com parâmetros
        Carro carro2 = new Carro("Gol", "Preto", 2022);
        
        System.out.println("Carro 1: " + carro1.modelo);
        System.out.println("Carro 2: " + carro2.modelo + ", " + carro2.cor + ", " + carro2.ano);
    }
}
```

## 3. Atributos e Métodos

### 3.1 Atributos

**Atributos** são variáveis declaradas dentro de uma classe que representam as características dos objetos.

#### Tipos de Atributos:

- **Atributos de instância:** pertencem a cada objeto criado
- **Atributos de classe (static):** compartilhados entre todos os objetos da classe

```java
public class Conta {
    // Atributos de instância
    String titular;
    double saldo;
    
    // Atributo de classe (static)
    static double taxaManutencao = 10.0;
}
```

### 3.2 Métodos

**Métodos** são funções declaradas dentro de uma classe que representam os comportamentos dos objetos.

#### Tipos de Métodos:

- **Métodos de instância:** operam sobre os objetos individuais
- **Métodos de classe (static):** chamados diretamente pela classe, sem necessidade de instanciar um objeto

```java
public class Calculadora {
    // Método de instância
    double somar(double a, double b) {
        return a + b;
    }
    
    // Método de classe (static)
    static double multiplicar(double a, double b) {
        return a * b;
    }
}
```

Chamando os métodos:

```java
public class ExemploCalculadora {
    public static void main(String[] args) {
        // Para chamar um método de instância, precisamos criar um objeto
        Calculadora calc = new Calculadora();
        double soma = calc.somar(5, 3);  // resultado: 8.0
        
        // Para chamar um método static, usamos diretamente a classe
        double produto = Calculadora.multiplicar(5, 3);  // resultado: 15.0
    }
}
```