@stories
Feature: Demo Automation
  AS USWE
  Scenario: Registration in demo automation
    Given  andres wants to register in demo automation
    When he fills out the form
    | strName | strLastName |
    | andres  | Rojas       |
    Then he finds