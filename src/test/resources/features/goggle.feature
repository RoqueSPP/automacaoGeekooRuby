#Author: rsppnet@hotmail.com



Feature: Buscca no Goggle
  eu como usuario quero realizar pesquisa para validar as informações

  Scenario: pesquisar e2e treinamentos
    Given eu esteja no google
    When pesquisar "e2e treinamentos"
    Then valido o texto "e2e treinamentos"
    
  

  