@stories
Feature: Demo Automation
  AS USWE
  Scenario Outline: Registration in demo automation
    Given  andres wants to register in demo automation
    When he fills out the form
    | strName   | strLastName   | strAddress    | strEmail   | strPhone   | strGander   | strHobbie   | strLanguages   | strSkill   | strCountry   | strSelectCountry   | strYear   | strMonth   | strDay   | strPassword  |
    | <strName> | <strLastName> | <strAddress>  | <strEmail> | <strPhone> | <strGander> | <strHobbie> | <strLanguages> | <strSkill> | <strCountry> | <strSelectCountry> | <strYear> | <strMonth> | <strDay> | <strPassword> |
    Then he checks the component
    | strComponent   |
    | <strComponent> |
    Examples:
    | strName | strLastName | strAddress      | strEmail         |  strPhone   | strGander | strHobbie | strLanguages | strSkill | strCountry | strSelectCountry   | strYear | strMonth | strDay | strPassword  | strComponent                                       |
    | Andres  | Rojas       | Cra 52 # 14 30  | andres@gmail.com |  3131235121 | Male      |  Cricket  | English      | Android  | Colombia   | Australia          | 2000    | April    | 20     | i^zK76BlHdd* | - Double Click on Edit Icon to EDIT the Table Row. |   
