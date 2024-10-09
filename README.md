# TestingPractices_TestNG_UI

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF9E2C?style=for-the-badge&logo=testng&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Log4j2](https://img.shields.io/badge/Log4j2-ff1100?style=for-the-badge&logo=apache&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

## 💡 Introduction
Welcome to the **TestingPractices_TestNG_UI** repository! This project is designed for SDET students to reinforce their knowledge through practical lessons. It demonstrates how to perform test automation using **TestNG** with TestNG-specific features like annotations, parallel execution, and data providers.

## Table of Contents
- [💡 Introduction](#💡-introduction)
- [📥 Installation](#📥-installation)
- [⚙️ Usage](#⚙️-usage)
- [✨ Features](#✨-features)
- [📦 Dependencies](#📦-dependencies)
- [🔧 Configuration](#🔧-configuration)
- [📚 Documentation](#📚-documentation)
- [💡 Examples](#💡-examples)
- [🛠️ Troubleshooting](#🛠️-troubleshooting)
- [👥 Contributors](#👥-contributors)
- [🤝 Contributing](#🤝-contributing)
- [📜 License](#📜-license)

## 📥 Installation
### Cloning the Repository
To install TestNGCurrent, clone the repository to your local machine:
```bash
git clone https://github.com/ChatGTHB/TestingPractices_TestNG_UI
```

### Importing into IntelliJ IDEA from VCS
1. Open IntelliJ IDEA.
2. Go to `File` > `New` > `Project from Version Control`.
3. In the dialog, select `Git` and enter the repository URL: `https://github.com/ChatGTHB/TestingPractices_TestNG_UI`.
4. Click `Clone`.

### Adding Dependencies from Maven
1. Open IntelliJ IDEA.
2. Navigate to `File` > `Project Structure` > `Libraries`.
3. Click on the `+` icon and select `From Maven`.
4. In the dialog, search for the necessary libraries using the Maven coordinates:
    - `org.apache.logging.log4j:log4j-api:2.20.0`
    - `org.apache.logging.log4j:log4j-core:2.20.0`
    - `commons-io:commons-io:2.11.0`
    - `org.seleniumhq.selenium:selenium-java:4.25.0`
    - `org.slf4j:slf4j-nop:1.7.30`
    - `org.testng:testng:7.9.0`
5. Click `OK` to add the selected libraries.

For each library, you can also use a higher version if available.

## ⚙️ Usage
Ensure that you have the necessary dependencies installed and navigate to the `src` directory to set up and execute the test cases.

### 1. Running from XML File
Run your tests from the `testng.xml` file by following these steps:

```bash
# From IntelliJ IDEA or Eclipse
Right-click and select 'Run testng.xml'.

# To run from command line with Maven
mvn test -DsuiteXmlFile=testng.xml
```

### 2. Running Test Classes Directly
You can directly run test classes annotated with TestNG:

```bash
# Right-click on the class in IntelliJ IDEA and select 'Run ClassName'.

# To run all test classes with Maven
mvn test
```

## ✨ Features
- **Sorting**: Organize tests in a specific order.
- **Annotations**: Use TestNG's rich set of annotations to define test methods.
- **Enable/Disable**: Enable or disable tests dynamically.
- **Assertions**: Utilize TestNG assertions to validate test outcomes.
- **Dependency Management**: Manage test method dependencies.
- **Groups**: Group tests for selective execution.
- **Cross Browser Testing**: Execute tests across multiple browsers.
- **Parallel Testing**: Run tests in parallel to save time.
- **XML Configuration**: Configure test suites using `testng.xml`.
- **Data Providers**: Supply data to test methods.
- **Parameterized Tests**: Run the same test with different parameters.
- **Page Object Model (POM)**: Implement POM for cleaner code.
- **HTML Reporting**: Generate HTML reports for test results.
- **Logging**: Integrated logging using Log4j2 for tracking and debugging test execution.

## 📦 Dependencies
| Dependency          | Version | Link                                                                                                                                                                                     |
|---------------------|---------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Java                | 11+     | [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)                                                                                                             |
| TestNG              | 7.9.0   | [TestNG](https://mvnrepository.com/artifact/org.testng/testng/7.9.0)                                                                                                                     |
| Selenium WebDriver  | 4.25.0  | [Selenium](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.25.0)                                                                                              |
| Log4j2              | 2.20.0  | [Log4j2 API](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api/2.20.0), [Log4j2 Core](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core/2.20.0) |
| Commons IO          | 2.11.0  | [Commons IO](https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0)                                                                                                            |
| SLF4J NOP           | 1.7.30  | [SLF4J NOP](https://mvnrepository.com/artifact/org.slf4j/slf4j-nop/1.7.30)                                                                                                                |                                                                                                       |

## 🔧 Configuration
Configuration details can be found in the `testng.xml` file and other relevant configuration files within the project. Log4j2 configuration is set up in the `log4j2.xml` file to provide detailed logging.

### Log4j2 Integration
The project uses Log4j2 for logging purposes. Ensure the necessary dependencies are included in your project and the `log4j2.xml` file is correctly configured for detailed logging. Logging is crucial for tracking and debugging test execution; `BaseDriver` utilizes Log4j2 to log test methods' start, end, and results.

## 📚 Documentation
Detailed documentation is available in the repository's `README.md` file and inline comments within the codebase. Here are some tools and programs used:
- [Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Selenium WebDriver](https://www.selenium.dev/downloads/)
- [TestNG](https://testng.org/doc/download.html)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- [Maven](https://maven.apache.org/)
- [Git](https://git-scm.com/)

## 💡 Examples
This project includes several examples designed to demonstrate TestNG's capabilities, including:

### Annotations
- **@Test**: Define individual test methods.
- **@BeforeClass/@AfterClass**: Setup and teardown methods for test classes.
- **@BeforeMethod/@AfterMethod**: Run methods before and after each test method.

### Parallel Execution
- **Parallel Execution in XML**: Configure parallel execution in the `testng.xml` file for faster test execution.

### Data Providers
- **Data Providers**: Pass data to test methods dynamically using the `@DataProvider` annotation.

### Cross Browser Testing
- **Browser Setup**: Set up tests to run on multiple browsers using WebDriver.

## 🛠️ Troubleshooting
If you encounter any issues:

- Ensure that TestNG and Selenium WebDriver are properly installed and operational.
- Verify that your Java environment is correctly set up for TestNG and other dependencies.
- Check that your IntelliJ IDEA and other development tools are configured according to the project's requirements.
- If problems persist, check your Maven configurations to ensure all necessary dependencies are correctly included.

For additional help, please open an issue in the GitHub repository.

## 👥 Contributors
- [ChatGTHB](https://github.com/ChatGTHB)

## 🤝 Contributing
Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a Pull Request.

## 📜 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

For more information on how to get started, visit the [TestingPractices_TestNG_UI GitHub repository](https://github.com/ChatGTHB/TestingPractices_TestNG_UI).
