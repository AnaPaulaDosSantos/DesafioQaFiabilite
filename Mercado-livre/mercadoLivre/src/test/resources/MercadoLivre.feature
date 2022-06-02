
@tag
Feature: Barra de Pesquisa

  @tag1
  Scenario: Iphone 11 por max
  Given que o usuario acesse a url "https://www.magazineluiza.com.br/"
  And digite na barra de pesquisa "Iphone 11 pro max"
  And click na Lupa de Pesquisa
  Then valide o iten pesquisado "iphone 11 pro max"
  And selecione o produto 
  And selecione adicionar à sacola
  Then valide o iten adicionado na sacola"Usado: iPhone 11 Pro Max 512GB Cinza Espacial Excelente - Trocafone - Apple"
  

