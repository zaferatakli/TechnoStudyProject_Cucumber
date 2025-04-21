

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

This project automates UI test cases for the [Techno Study](https://techno.study/) website using **Cucumber**, **TestNG**, **Selenium WebDriver**, and the **Page Object Model (POM)** design pattern.

📌 Key Features:

- BDD structure with Cucumber (`.feature` files + step definitions)
- Test execution management via TestNG
- Parallel and cross-browser testing support
- Modular and reusable test design via POM
- Custom reporting with ExtentReports (configured via `extent.properties`)

---

## 🏗️ Project Structure

```plaintext
TechnoStudyProject_Cucumber/
├── src/
│   └── test/
│       └── java/
│           ├── featureFiles/         # Cucumber .feature files
│           ├── pages/                # Page Object classes
│           ├── runners/              # TestNG runner classes
│           ├── stepDefinitions/      # Step Definitions for Cucumber
│           └── utilities/            # Utility classes (e.g., GWD)
├── resources/                        # Configuration and reporting files
├── pom.xml                           # Maven configuration and dependencies
└── README.md                         # Project documentation
```

---

## 🧰 Technologies Used

| Technology / Tool                  | Description                                              |
|-----------------------------------|----------------------------------------------------------|
| **Java 22**                       | Programming language                                     |
| **Selenium WebDriver 4.31.0**     | Browser automation framework                             |
| **Cucumber 7.22.0**               | BDD testing framework                                    |
| **TestNG 7.11.0**                 | Test configuration and execution                         |
| **ExtentReports Adapter**         | Visual test reporting tool                               |
| **Apache Commons Lang 3.12.0**    | Utility functions                                        |
| **SLF4J NOP 2.0.17**              | Logging configuration                                    |
| **Maven**                         | Dependency and project management                        |

---


## 🧪 User Stories & Test Scenarios

| User Story | Description                                                    | Status     |
|------------|----------------------------------------------------------------|------------|
| US_501     | Access courses via dropdown menu                               | ✅ Passed  |
| US_502     | "Sign In" redirects to Campus login                            | ✅ Passed  |
| US_503     | Submit application form                                        | ✅ Passed  |
| US_504     | Access the Blog page                                           | ✅ Passed  |
| US_505     | Access social media via footer links                           | ✅ Passed  |
| US_506     | Click on logo redirects to homepage                            | ✅ Passed  |
| US_507     | "Learn More" opens correct course detail                       | ✅ Passed  |
| US_508     | "Terms of Use" page loads and displays correctly               | ✅ Passed  |

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

| Name          | Role                      | User Stories   |
|---------------|---------------------------|----------------|
| Zafer Atakli  | QA Lead                   | US_506         |
| Tugba Kilic   | QA Automation Engineer    | US_502, US_508 |
| Nuri Ozturk   | QA Automation Engineer    | US_503         |
| Rıfat Batır   | QA Automation Engineer    | US_505         |
| Azim Korkmaz  | QA Automation Engineer    | US_504         |
| Yiğit Çam     | QA Automation Engineer    | US_501         |
| Sibel Oztemel | QA Automation Engineer    | US_507         |

---

## 🔗 GitHub Links

📁 [Main Repository](https://github.com/TugbaKilic33/TechnoStudyProject)

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
