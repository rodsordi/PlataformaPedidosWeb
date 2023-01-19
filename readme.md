# Plataforma de Pedidos Web

Projeto de estudo da galerinha

## Pré-Requisitos

* [Eclipse](https://www.eclipse.org/downloads/) 2022-06 (4.24.0)+

* [jdk](https://jdk.java.net/archive/) 17.0.1

* [maven](https://maven.apache.org/download.cgi) apache-maven-3.8.6+

* [apache-tomcat](https://tomcat.apache.org/download-10.cgi) 10.0.27

## Configurando o Eclipse

* Window -> Preferences -> Java -> Installed JREs -> Add.. -> Standard VM -> JRE home: "%JAVA_HOME%" -> Apply and Close

* Window -> Preferences -> Maven -> Installations -> Add... -> Installation home: "%MVN_HOME%" -> Finish -> Apply and Close

* Window -> Preferences -> Server -> Runtime Environment -> Add... -> Apache -> Apache Tomcat v10.0 -> Next -> Tomcat installation directory: "%TOMCAT_HOME%" -> JRE: "jdk-17.0.1" -> Finish -> Apply and Close

## Instalação

* Abra o navegador e acesse o endereço: [github](https://github.com/rodsordi/PlataformaPedidosWeb)

* Abra o terminal e execute:
```terminal
git clone https://github.com/rodsordi/PlataformaPedidosWeb.git
```

### Importando projeto no Eclipse 
* File -> Import... -> Maven -> Existing Maven Project -> Next -> Root Directory: "%PROJECT_ROOT%" -> Check: "pom.xml" -> Finish

* Project Explorer -> Selecione o projeto -> Botão direito -> Maven -> Update Project... -> OK

* Project Explorer -> Selecione o projeto -> Botão direito -> Run As -> Maven Build... -> Goals: "clean install" -> Run

* Servers -> Botão direito do mouse -> New -> Server -> Apache -> Tomcat v10.0 -> Server runtime environment: "Apache Tomcat v10.0 -> Next -> Em Available -> Selecione o projeto "PlataformaPedidoWeb" -> Add -> Finish

* Servers -> Double click em "Tomcat v10.0 Server at localhost" -> Server Locations -> Use Tomcat installation (takes control of Tomcat installation) -> Save

## Iniciando aplicação

* Servers -> Selecione "Tomcat v10.0 Server at localhost" -> Botão direito do mouse -> Debug

* Abra o navegador -> Acesse a [home](http://localhost:8080/PlataformaPedidoWeb/)