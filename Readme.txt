# Desafio CI&T

## Preparação do ambiente

1. Para que os testes possam ser executados no Chrome é preciso fazer o download do webdriver de acordo com o build do seu sistema operacional e deve ser colocado no diretório de sua preferência

        Link para download do Chrome <https://chromedriver.chromium.org/downloads>

        Para saber o build do sistema operacional acesse: Configurações -> Sobre o computador -> Compilação do SO

2. Verifique se todas as dependências estão instaladas.

3. Verifique se a versão do webdriver do chrome é a mesma versão do browser instalado.

4. Os testes foram desenvolvidos utilizando-se o Selenium Web Driver com linguagem Java, no Eclipse IDE.

5. Para que os testes possam ser executados, é necessário que a biblioteca do Maven, JUnit, Java.
	5.1 Test_CIandT_API: Maven e Java
	5.2 Test_CIandT_Web: Maven, Java e JUnit

## Execução

1. Arquivo com os cenários de testes: testScenario.txt

2. Para iniciar os testes do eclipse:

        Para testes da API: Test_CIandT_API
        Para testes da Web: Test_CIandT_Web

Obs: É possível realizar os testes em qualquer SO.

## Relatório

1. Durante a execução, é exibido no terminal o status dos testes. Se o teste passou é exibido em verde, se falhou, em vermelho.

2. Arquivos evidência de testes:
	2.1 Test_Api.jpg
	2.2 Test_Web.jpg