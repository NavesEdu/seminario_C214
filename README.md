# Seminário C214 Testes Unitarios com Kotlin

## ❓ Sobre o projeto
Repositorio destinado para apresentação do Seminario de C214(Engenharia de Software). A aplicação foi implementada
na lingugem Kotlin utilizando as dependencias do Spring Boot com Junit5. O projeto é uma API que Cadastra itens de 
cardápio para algum estabelecimento, tambem podendo listar todos os itens e fazer uma busca por nome ou id. 

## 💻 Tecnologias Necessarias
### Java 17 (Linux)

Para instalar qualquer versão Java OpenJDK você pode utilizar o apt para isso o tutorial abaixo mostra como instalar a
versão 17 pois o projeto utiliza desta versão.

Para instalar o OpenJDK-17:

```shell
sudo apt-get install -y openjdk-17-jdk
```

Depois execute o comando abaixo para verificar se a versão do java foi instalado com sucesso:

```shell
java --version
```
Ao executar o comando você verá uma mensagem similar a essa, vai depender da versão que você instalou.

```shell
openjdk version "17.0.2" 2022-01-18
OpenJDK Runtime Environment Temurin-17.0.2+8 (build 17.0.2+8)
OpenJDK 64-Bit Server VM Temurin-17.0.2+8 (build 17.0.2+8, mixed mode, sharing)
```

Tudo certo, agora você tem a versão Java openJDK instalado na sua máquina.

#### Dica:
Caso você queira mais de uma versão na sua máquina, basta segui os mesmos passos citados acima e 
para definir qual será a versão padrão basta executar o comando abaixo e escolher uma opção:

```shell
sudo update-alternatives --config java
```

### Java 17 (Windows)

A instalação do JDK no windows é bem simples, este tutorial lhe mostrará os passos
nescessário.

Primeiramente acesse o link a seguir para baixar o instalador do JDK 17.

[JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

Aceite a licença e escolha o arquivo com extensão .exe.

Após a conclussão do download execute o instalador - basicamente clicar em next- e anote 
o diretório de instalação, precisaremos para configurar a variável de ambiente JAVA_HOME.


#### Variável de ambiente JAVA_HOME


1. Acesse o **Painel de Controle** -> **Sistema e Segurança** - >  **Sistema**

2. No meu lateral a esquerda, clique em **Configurações avançadas do sistema**.

3. Clique na parte inferior em **Variáveis de Ambiente** na parte de baixo **Variáveis do sistema** clique em **Novo..**.

4. Em **Nome da variável** digite **JAVA_HOME**, em **Valor da variável** digite o diretório da instalação do JDK. Parecido com esse **C:\Program Files\Java\jdk-11.0.9** para finalizar clique em **ok** em todas janelas abertas.


#### Verificando a instalação
Abra o CMD e digite: 
>java -version

se tudo ocorrer bem, deve-se retornar uma mensagem semelhante ao exemplo abaixo.
```shell
java version "17.0.2" 2022-01-18
Java(TM) SE Runtime Environment (build 17.0.2)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.2, mixed mode, sharing)
```

### Kotlin (Linux)

É necessário instalar o Java primeiro.

Verifique a instalação do `snap`. Para quem estiver usando o Ubuntu 18.04 ou superior, o snap vem instalado por padrão.

```shell
snap version
```

Em caso negativo, faça a instalação do snap:
```shell
sudo apt-get install -y snapd
```
___

Para quem já possui o snap apenas execute:
```shell
sudo snap install kotlin --clasic
```

Validando:
```shell
kotlin -version
```

Exemplo de resultado:
```
Kotlin version 1.2.51-release-125 (JRE 1.8.0_191-8u191-b12-2ubuntu0.18.04.1-b12)
```
## 🛠️ Executando Localmente
### Como executar com Intellij
- Clone o projeto e importe para seu Intellj
- Verifique se está utilizando o JDK 17 ou superior
- Dentro de ``src/main/kotlin/br/inatel/seminario/c214/seminario_C214`` clique com botão direito sobre 
``SeminarioC214Application`` e selecione a opção ``Run 'SeminarioC214Application'``.
- Executando o TimeApplication abra o seu navegador e acesse [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html) para acessar a interface do swagger e ver os endpoints da aplicação.
- Caso de algum problema de conflito de porta, abra o ``application.yml`` localizado no diretorio ``src/main/resources``, 
e troque a porta para outra de sua escolha
```
server:
  port: 8080
```
- Tambem pode executar pelo teminal na raiz do projeto rodando o comando ``./gradlew bootRun``.
- Para fazer o Build basta rodar ``./gradlew build``

### Executando no terminal (Linux e Ubuntu)
- Link Tutorial Linux: [gradle](https://techexpert.tips/pt-br/gradle-pt-br/gradle-instalacao-no-ubuntu-linux/)
- Link Tutorial Windows: [gradle](https://giordanolins.com/instalando-e-configurando-o-gradle-no-windows/)
- Execute ``gradle build`` para buildar a aplicação.
- Execute ``gradle bootRun`` para subir o servidor spring.

## Executando os testes

- Executando todos os testes
> ./gradlew clean test

- Executando uma classe ou suite de teste específica
> ./gradlew test --tests "*.ItemServiceTest"

obs: No gradle.build está configurado para gerar um relatório de cobertura com o jacoco
assim que rodar os testes, o gradle tambem gera um relatório geral de testes. 
Os relatórios são gerados nos seguintes diretório:
<br />
- Relatório Gradle: ``build/reports/tests/index.html``
- Relatório Jacoco: ``build/reports/jacoco/index.html``
