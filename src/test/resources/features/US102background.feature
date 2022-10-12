Feature: US102 Background ile amazon search testi

  Background: amazon sayfasina gider
    Given kullanici amazon sayfasina gider

    Scenario: TC01_Amazon iphone search testi
      And iphone icin arama yapar
      Then sonuclarin flower icerdigini test eder


      Scenario: TC02_Amazon teapot search testi
        And teapot icin arama yapar
        Then sonuclarin teapot icerdigini test eder

        Scenario: TC03_Amazon flower search testi
          And flower icin arama yapar
          Then sonuclarin flower icerdigini test eder


