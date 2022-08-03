Feature:As a user I need to validate the generation of a pdf file
  “PJ-Unified self-certification- Fatca and CRS.pdf” on Banitmo's page

  Scenario: Validate the generation of a pdf file
    Given the user is on the home page
    When the user generate the file
    Then the user can see 'TitlePdf'
