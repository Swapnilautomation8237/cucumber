Feature: Registration Feature

  Scenario Outline: Registration scenario with different set of data
    Given user navigates to Registration page
    When user fills the register from given sheetname "<SheetName>" and rownumber <RowNumber>
    And user clicks on Register button
    Then Verify the username retrieve the same

    Examples: 
      | SheetName    | RowNumber |
      | Registration |         0 |
      #| Registration |         1 |
