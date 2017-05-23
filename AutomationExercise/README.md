cucumber-acceptance-tests
=========================

# Introduction
The team is using Behavior Driven Development (BDD) framework to automate the Acceptance tests or Business facing tests. 
QA and BA have sat down together to write the tests in simple English so that anyone from business can understand what tests are getting covered from the Business perspective in the project.

### Advantage of BDD implementation
* BDD describes best as automating tests based on the desired behavior of the service.
* First Gherkin Scenarios are written as a feature file and then automated.
* BDD provides capability to automate Specs/Acceptance Criteria.

This project contains the following tools & language:
    Java
    Cucumber
    Selenium-webDriver
    Junit
  

###  Test Automation environment setup

    1. Ensure that you have installed Idea IntelliJ
    2. Clone this repo.
    3. Import the project in IntelliJ
    4. Set the environment, this framework support OSX environment Test execution on firefox and chrome and for windows environment only chrome.
    
###  Execute Test scenarios
    
    Set the environment variable on IntelliJ IDE under run configuration
    1. Go to Run -> Edit Configuration 
    2. Select the Environment variable and add environment=macFirefox/macChrome/windowsChrome
    
    Using Command Console or Terminal
    - Windows
    1. set environment=%windowsChrome% clean package
    2. Execute command as `mvn clean install`
    
    - Mac/Linux
    1. set environment=${macFirfox} clean package
    2. export environment
    3. Execute command as `mvn clean install`
    

###  Reports

1. Cucumber reports are found under `target\CucumberReports`
2. To view, Open index.html in any browser

    
    
    
    
 
