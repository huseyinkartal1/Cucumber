
@parametre @runner

Feature: Parametreli stepdefinition olusturma


  Scenario: TC04_parametre kullanimi
    Given kullanici amazon sayfasina gider
    And "samsung" icin arama yapar
    Then sonuclarin "samsung" icerdigini test eder
    And sayfayi kapatir