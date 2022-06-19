# Testes_Mockito-MockBean
Este é um projeto para colocar em pratica os fundamentos de testes automatizados utilizando os frameworks, Mockito e MockBean.

## Tipos de testes utilizados
A fins de explicação, abaixo deixo exemplificado os testes que realizei:

- Unitário: Responsável por validar o comportamento de unidades funcionais do codigo coletando uma porção do mesmo e a partir de determinado estimulo seja capaz de gerar um comportamento esperado.
- Integração: Este teste está focado em verificar se a comunicação entre os componentes / módulos da aplicação, estão interagindo entre si corretamente.

## Boas praticas 
- Nomencratira utilizada nos testes
  - <.AÇÃO> SHOULD <.EFEITO> [WHEN <.CENARIO>], conforme a imagem abaixo:
  ![image](https://user-images.githubusercontent.com/100853329/174478881-73d93e6f-77ad-4b57-8d0c-74387b1a6031.png)

- Padrão AAA:
  - Arrange: instancie os objetos necessários
  - Act: execute as ações necessárias
  - Assert: declare o que deveria acontecer (resultado esperado)
  ![image](https://user-images.githubusercontent.com/100853329/174478979-5176534d-04e4-4ad7-a03b-ff1f206e798b.png)
  
## Annotations utilizadas nas classes de teste
![image](https://user-images.githubusercontent.com/100853329/174479027-c3aeef22-f032-448b-97fd-0328216f7e87.png)

## Fixtures utilizadas
- A unica fixture utilizada nos testes foi a @BeforeEach, para preparar as variaveis antes de cada teste.
- Foi utilizado o @Transactional para os testes de integração utilizando o banco H2, com intuito de fazer um rollback quando finalizasse cada um dos testes.
![image](https://user-images.githubusercontent.com/100853329/174479182-13f62eeb-cc1a-4ac3-9fbb-7c19e268e113.png)
