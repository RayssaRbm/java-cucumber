# Projeto Automação com: Eclipse, Selenium, Java e Cucumber

# Ferramentas:
- [Maven](https://maven.apache.org/ "Maven")
- [Java](https://www.java.com/pt_BR/ "Java")
- [JUnit](https://junit.org/junit4/ "JUnit")
- [Selenium](https://www.seleniumhq.org/ "Selenium")
- [ChromeDriver](https://chromedriver.chromium.org/downloads "ChromeDriver")
- [Cucumber](https://cucumber.io/ "Cucumber")

## Requisitos:

- [Eclipse IDE] (https://www.eclipse.org/downloads/)
- [JDK (Java Development Kit)] (https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Selenium WebDriver] (https://www.selenium.dev/documentation/en/webdriver/)
- [Dependências do Selenium]

## Acesso ao Projeto:

1- Clone este repositório em sua máquina local:

git clone https://github.com/RayssaRbm/selenium-java-cucumber

2- Abra o Eclipse IDE

3- Importe o projeto:

No menu superior, clique em File > Import.

4- Acesse: AutomacaoTeste/src/test/resources/feature/HistoriaDoUsuario.feature

5- Com o botão direito > Run As > Cucumber Feature


## Arquitetura:

```
├── README.md
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   └── resources
    └── test
        ├── java
        │   ├── pages
        │   │   ├── LoginPage.java
        │   │   ├── NovoUsuarioPage.java
        │   │   └── RealizarCompraPage.java
        │   ├── steps
        │   │   ├── CadastroSteps.java
        │   │   └── RealizarComprasSteps.java
        └── resources
            ├── drivers
            │   
            └── features
                └── HistoriaDoUsuario.feature
```


## Arquitetura - Bibliotecas utilizadas

Foram utilizadas:
- [selenium-java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java "selenium-java")
- [junit](https://mvnrepository.com/artifact/junit/junit "junit")
- [cucumber-java](https://mvnrepository.com/artifact/info.cukes/cucumber-java "cucumber-java")
- [cucumber-junit](https://mvnrepository.com/artifact/info.cukes/cucumber-junit "cucumber-junit")

------------

