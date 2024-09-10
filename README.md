# Automation-Testing-Project
This project aims to automate the testing of a web application's login functionality using Selenium WebDriver and Java within a Maven project structure. It validates various scenarios like successful and unsuccessful login attempts, as well as edge cases such as handling empty input fields and special characters. Automated testing is crucial for ensuring the reliability, security, and user experience of the login system, catching potential bugs early in the development process. The tests are designed to simulate real user interactions with the login page, providing a comprehensive validation of the system's behavior under different conditions.

***Features***  --> 
Automated Testing of Login Functionality: Automates user login attempts and verifies system responses.
Multiple Test Scenarios: Includes tests for-Valid and invalid login attempts, Empty username and password fields, Special characters in input fields.
Maven-Based Project: Ensures easy dependency management and build processes.
WebDriverManager: Simplifies browser driver management by automatically downloading and configuring the appropriate browser drivers.

****Technologies Used***
Java: Programming language for implementing the test scripts.
Selenium WebDriver: A tool used to automate browser interactions.
Maven: Build automation and dependency management tool.
WebDriverManager: Library for managing browser drivers like ChromeDriver.

****Prerequisites***
To run this project, ensure the following are installed on your machine:
Java Development Kit (JDK) 8 or above. Download from here.
Maven: Download and install from here.
Chrome Browser: A stable version of Google Chrome for running the tests.
Eclipse IDE (or any preferred IDE): Ensure that Eclipse is set up to use Maven and Java.

****Project Structure***
LoginTest.java: The main class where all the test cases are written.
pom.xml: Maven's Project Object Model (POM) file for managing dependencies.

****Installation and Setup***
1. Clone the Repository
Clone this repository to your local machine using Git:
3. Import into Eclipse
Open Eclipse and select File > Import.
Choose Existing Maven Projects.
Browse to the folder where you cloned the project.
Select the project and click Finish.
3. Maven Dependency Installation
Once the project is imported, Maven will automatically download the required dependencies (Selenium WebDriver, WebDriverManager, etc.) based on the configuration in the pom.xml. You can also manually force Maven to download dependencies.
4. WebDriver Setup
The project uses WebDriverManager, which automatically handles the setup of the browser driver (ChromeDriver) based on your installed Chrome version
There’s no need to manually download the driver; WebDriverManager will handle it for you.

****Running the Tests***
Running Individual Tests in Eclipse
Open LoginTest.java in Eclipse.
Right-click inside the file and select Run As > Java Application.
The test results will be displayed in the Console view.

****Test Cases Implemented***
1. Successful Login
Scenario: The user enters valid credentials and should be redirected to the dashboard/home page.
Expected Result: The login is successful, and the URL is verified to be the dashboard page.

2. Unsuccessful Login
Scenario: The user enters incorrect credentials and should see an error message.
Expected Result: The system should display "Invalid credentials" and remain on the login page.

3. Empty Fields
Scenario: The user leaves both username and password fields empty.
Expected Result: An error message indicating that both fields are required should appear.

4. Special Characters
Scenario: The user enters special characters in the username and password fields.
Expected Result: The system should either reject the input or display an error message for invalid input.

****Cleaning Up***
After each test, the browser session is closed to avoid resource leaks
public void tearDown() {
    driver.quit();
}
