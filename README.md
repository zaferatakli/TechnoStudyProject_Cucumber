# 🧪 Techno Study Project – Cucumber + TestNG

## 📌 Table of Contents

- [Project Description](#project-description)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Dependencies](#dependencies)
- [User Stories & Test Scenarios](#user-stories--test-scenarios)
- [Test Coverage Table](#test-coverage-table)
- [Bug Reports](#bug-reports)
- [Test Reports](#test-reports)
- [Project Team](#project-team)
- [GitHub Links](#github-links)
- [License](#license)
- [Contact](#contact)

---

## 📄 Project Description

This project automates UI test cases for the real educational course website [Techno Study](https://techno.study/) using
**Java**, **Selenium WebDriver**, **Cucumber**, **TestNG**, and the **Page Object Model (POM)** design pattern.  
It was developed within an Agile/Scrum framework with one-week sprint cycles, aiming to deliver high-quality,
maintainable automation tests.

🌀 Key Scrum Ceremonies:

- Daily Stand-ups
- Sprint Planning, Review, and Retrospective Meetings
- Backlog Grooming Sessions

✅ Key Features:

- **BDD structure with Cucumber** – Human-readable `.feature` files
- **TestNG execution** – Organized, prioritized, and parallelized tests
- **Parallel and Cross-Browser Testing** – Chrome, Firefox, Edge
- **Modular POM Architecture** – Reusability and maintainability
- **Automated Reporting** – HTML and PDF reports via ExtentReports

---

## 🏗️ Project Structure

```plaintext
TechnoStudyProject_Cucumber/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   │       └── pdf-cucumber-report-config.yaml
│   └── test/
│       ├── java/
│       │   ├── featureFiles/                    # Cucumber .feature files
│       │   ├── pages/                           # Page Object Model classes
│       │   ├── runners/                         # TestNG runner classes
│       │   ├── stepDefinitions/                 # Step Definitions
│       │   └── utilities/                       # Utility classes (Driver, ConfigReader, etc.)
│       └── resources/
│           ├── fonts/                           # Fonts for reports
│           ├── extent.properties 
│           └── XML/                             # XML configurations for testing
├── bugReports/
│   └── TC_508BugReport.pdf           # Bug report for Terms of Use page
│
│   
├── .gitignore
├── configuration.properties
├── pom.xml
└── README.md
```

---

## 🧰 Technologies Used

| Technology / Tool                    | Description                       |
|:-------------------------------------|:----------------------------------|
| Java JDK 22                          | Programming Language              |
| Selenium WebDriver 4.31.0            | Browser Automation                |
| Cucumber 7.22.0                      | BDD Framework                     |
| TestNG 7.11.0                        | Testing Framework                 |
| ExtentReports 5.0.9 + Adapter 1.10.1 | Advanced Test Reporting           |
| Apache Commons Lang 3.12.0           | Helper Utilities                  |
| Apache PDFBox 2.0.24                 | PDF File Generation               |
| Cucumber PDF Report 2.11.1           | PDF Reporting for Cucumber        |
| Log4j API & Core 2.20.0              | Logging Framework                 |
| SLF4J NOP 2.0.17                     | Logging Binding                   |
| Maven                                | Project and Dependency Management |

---

## 🚀 Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/zaferatakli/TechnoStudyProject_Cucumber.git
   ```
2. Open the project with **IntelliJ IDEA**.
3. Ensure Maven is properly configured.
4. Install dependencies:
   ```bash
   mvn clean install
   ```

---

## 🛠️ Usage

- To run **all tests** via Maven:
  ```bash
  mvn test
  ```
- To run specific tests:
    - Open the `runners` package.
    - Choose and run the desired TestNG XML file (e.g., `ParallelRunner.xml`).

---

## 📦 Dependencies

All project dependencies are managed through the `pom.xml` file.  
Maven will automatically download the necessary libraries.

---

## 🧪 User Stories & Test Scenarios

| User Story | Description                              | Status                          |
|:-----------|:-----------------------------------------|:--------------------------------|
| US_501     | Access courses via dropdown menu         | ✅ Passed                        |
| US_502     | "Sign In" redirects to Campus login      | ✅ Passed                        |
| US_503     | Submit application form                  | ✅ Passed                        |
| US_504     | Access the Blog page                     | ✅ Passed                        |
| US_505     | Access social media via footer links     | ✅ Passed                        |
| US_506     | Click on logo redirects to homepage      | ✅ Passed                        |
| US_507     | "Learn More" opens correct course detail | ✅ Passed                        |
| US_508     | "Terms of Use" page loads correctly      | ❌ Failed (Bug Report Available) |

---

## 📊 Test Coverage Table

| Test Scenario               | Priority |
|:----------------------------|:---------|
| Dropdown Menu Access        | Medium   |
| Cross Campus Sign In        | High     |
| Application Form Submission | High     |
| Blog Page Access            | Low      |
| Social Media Links          | Medium   |
| Logo to Homepage Redirect   | Medium   |
| Course Details Access       | High     |
| Terms of Use Page           | Medium   |

---

## 🐞 Bug Reports

- **US_508 – Terms of Use Page Bug**  
  ❗ The "Terms of Use" page test failed due to a missing expected element.  
  📷 [Bug Report PDF](bugReports/TC_508BugReport.pdf)

---

## 📑 Test Reports

| Report Type             | Description                             |
|:------------------------|:----------------------------------------|
| Single Browser Report   | Full test execution on a single browser |
| Parallel Browser Report | Test execution across multiple browsers |

📂 Reports located at `/Test Reports/`

---

## 👥 Project Team

| Name         | Role                   | Stories                |
|:-------------|:-----------------------|:-----------------------|
| Zafer Ataklı | QA Lead                | US_501, US_506, US_507 |
| Tugba Kılıç  | QA Automation Engineer | US_502, US_508         |
| Nuri Öztürk  | QA Automation Engineer | US_503                 |
| Rıfat Batır  | QA Automation Engineer | US_505                 |
| Azim Korkmaz | QA Automation Engineer | US_504                 |

---

## 🔗 GitHub Links

📁 [Main Repository](https://github.com/zaferatakli/TechnoStudyProject_Cucumber)

👥 Contributors:

- [Zafer Ataklı](https://github.com/zaferatakli)
- [Tugba Kılıç](https://github.com/TugbaKilic33)
- [Rıfat Batır](https://github.com/rftbtr)
- [Azim Korkmaz](https://github.com/AzimKorkmaz)
- [Nuri Öztürk](https://github.com/NuriOzturk)

---

## 📜 License

This project is intended for **educational and non-commercial purposes only**.  
No commercial usage is allowed without permission.

---

## 📧 Contact

For any inquiries or issues, please contact:  
📧 **From th GitHub**

---
