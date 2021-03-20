@stories
Feature: Demo Automation
  AS USWE
  Scenario Outline: Registration in demo automation
    Given  andres wants to register in demo automation
    When he fills out the form
    | strName   | strLastName   | strAddress    | strEmail   | strPhone   | strGander   | strHobbie   | strLanguages   | strSkill   | strCountry   | strSelectCountry   |
    | <strName> | <strLastName> | <strAddress>  | <strEmail> | <strPhone> | <strGander> | <strHobbie> | <strLanguages> | <strSkill> | <strCountry> | <strSelectCountry> |
    Then he finds

    Examples:
    | strName | strLastName | strAddress      | strEmail         |  strPhone   | strGander | strHobbie | strLanguages | strSkill | strCountry | strSelectCountry |
    | andres  | Rojas       | Cra 52 # 14 30  | andres@gmail.com |  3131235121 | Male      |  Cricket  | English      | Android  | Colombia   | Austria          |
