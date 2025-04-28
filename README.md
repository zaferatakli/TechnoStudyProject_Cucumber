# 🧪 Techno Study Project – Cucumber + TestNG

## 📌 Table of Contents

- [Project Description](#project-description)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Dependencies](#dependencies)
- [User Stories & Test Scenarios](#user-stories--test-scenarios)
- [Test Coverage Table](#test-coverage-table)
- [Project Team](#project-team)
- [GitHub Links](#github-links)
- [License](#license)

---

## 📄 Project Description

This project automates UI test cases for the [Techno Study](https://techno.study/) website using **Cucumber**, **TestNG
**, **Selenium WebDriver**, and the **Page Object Model (POM)** design pattern. The project was developed
collaboratively within an Agile environment, following a one-week sprint cycle.

🌀 Throughout the sprint, we adhered to Scrum practices including:

- **Daily Stand-up Meetings**
- **Sprint Planning and Review Sessions**
- **Backlog Grooming**
- **Retrospective Meetings**

These ceremonies helped us ensure regular communication, iterative development, and continuous feedback, which led to
timely delivery of all defined test scenarios and user stories.

📌 Key Features:

- ✅ **BDD structure with Cucumber** – Human-readable `.feature` files connected to step definitions for clear test flow.
- ✅ **Test execution with TestNG** – Allows structured grouping, prioritization, and parallel test execution.
- ✅ **Parallel and cross-browser support** – Ensures test robustness across Chrome, Firefox, and Edge.
- ✅ **Modular architecture via POM** – Promotes reusability and clean separation of concerns for maintainable test code.
- ✅ **Automated reports using ExtentReports** – Integrated through `extent.properties` for enhanced test visibility and
  stakeholder reporting.

By combining automation best practices with Agile principles, the team delivered a scalable and maintainable test
framework that can evolve with future project requirements.

---

## 🏗️ Project Structure

```plaintext
TechnoStudyProject_Cucumber/
├── src/
│   ├── main/
│   │   ├── java/                                 # Main Java classes (currently empty, might be used later)
│   │   └── resources/                            # PDF report configuration
│   └── test/         
│       ├── java/         
│       │   ├── featureFiles/                     # Cucumber .feature files
│       │   ├── pages/                            # Page Object classes
│       │   ├── runners/                          # TestNG runner classes
│       │   ├── stepDefinitions/                  # Step Definitions for Cucumber
│       │   └── utilities/                        # Utility classes (e.g., GWD, ConfigReader)
│       └── resources/         
│           ├── fonts/                            # Font files for reporting
│           ├── XML/                              # XML files for parallel/single browser testing
│           ├── extent.properties                 # Extent report configuration
│           └── pdf-cucumber-report-config.yaml   # PDF report configuration
├── pom.xml                                       # Maven configuration and dependencies
└── README.md                                     # Project documentation

```

---

## 🧰 Technologies Used

| Technology / Tool                          | Description                                                 |
|--------------------------------------------|-------------------------------------------------------------|
| **Java JDK 22**                            | Programming language                                        |
| **Selenium WebDriver 4.31.0**              | Browser automation framework                                |
| **Cucumber 7.22.0**                        | BDD testing framework                                       |
| **TestNG 7.11.0**                          | Test configuration and execution                            |
| **ExtentReports Cucumber7 Adapter 1.10.1** | Visual HTML report integration for Cucumber                 |
| **Apache Commons Lang 3.12.0**             | Utility functions for easier string/number operations       |
| **SLF4J NOP 2.0.17**                       | Logging configuration without actual logging output         |
| **Apache PDFBox 2.0.24**                   | PDF file generation (used for PDF reporting)                |
| **Cucumber PDF Report 2.11.1**             | Generates PDF reports for Cucumber test results             |
| **Log4j API & Core 2.20.0**                | Logging framework used for debugging and runtime monitoring |
| **Maven**                                  | Dependency and project management tool                      |
| **ExtentReports 5.0.9**                    | Core reporting library for custom reports                   |

---

## 🧪 User Stories & Test Scenarios

| User Story | Description                                      | Status   |
|------------|--------------------------------------------------|----------|
| US_501     | Access courses via dropdown menu                 | ✅ Passed |
| US_502     | "Sign In" redirects to Campus login              | ✅ Passed |
| US_503     | Submit application form                          | ✅ Passed |
| US_504     | Access the Blog page                             | ✅ Passed |
| US_505     | Access social media via footer links             | ✅ Passed |
| US_506     | Click on logo redirects to homepage              | ✅ Passed |
| US_507     | "Learn More" opens correct course detail         | ✅ Passed |
| US_508     | "Terms of Use" page loads and displays correctly | ❌ Failed |

### ❌ **US_508 - "Terms of Use" page failed due to a missing element. The test case is currently under review and will
be updated in the next sprint.**

---

## 📊 Test Coverage Table

| Test Scenario              | Priority |
|----------------------------|----------|
| US_501 - Dropdown Menu     | Medium   |
| US_502 - Cross Campus      | High     |
| US_503 - Booking           | High     |
| US_504 - Blog Page         | Low      |
| US_505 - Social Media      | Medium   |
| US_506 - Logo to Home Page | Medium   |
| US_507 - Course Details    | High     |
| US_508 - Terms of Use      | Medium   |

---

## 👥 Project Team

| Name          | Role                   | User Stories   |
|---------------|------------------------|----------------|
| Zafer Atakli  | QA Lead                | US_506         |
| Tugba Kilic   | QA Automation Engineer | US_502, US_508 |
| Nuri Ozturk   | QA Automation Engineer | US_503         |
| Rıfat Batır   | QA Automation Engineer | US_505         |
| Azim Korkmaz  | QA Automation Engineer | US_504         |
| Yiğit Çam     | QA Automation Engineer | US_501         |
| Sibel Oztemel | QA Automation Engineer | US_507         |

---

## 🔗 GitHub Links

📁 [Main Repository](https://github.com/zaferatakli/TechnoStudyProject_Cucumber)

👤 Contributors:

- [Zafer Ataklı](https://github.com/zaferatakli)
- [Tugba Kılıç](https://github.com/TugbaKilic33)
- [Yiğit Çam](https://github.com/Yigit-Cam)
- [Rıfat Batır](https://github.com/rftbtr)
- [Azim Korkmaz](https://github.com/AzimKorkmaz)
- [Nuri Öztürk](https://github.com/NuriOzturk)
- [Sibel Oztemel](https://github.com/Sibel52)

---

## 📜 License

This project is intended for **educational and non-commercial purposes only**.

---
