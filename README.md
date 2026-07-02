<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,100:2c5364&height=200&section=header&text=Selenium%20Java%20Hybrid%20Framework&fontSize=40&fontColor=ffffff"/>
</p>

# 🚀 Selenium Java Hybrid Framework - Automation Exercise

A scalable and enterprise-grade **Selenium Test Automation Framework** built using **Java, Selenium WebDriver, TestNG, Maven, Page Object Model (POM), Page Factory, Apache POI, Extent Reports, and Log4j2**.

The framework demonstrates real-world automation architecture, reusable components, data-driven testing, reporting, logging, and enterprise QA best practices.

---

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-red?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-blue?style=for-the-badge)
![License](https://img.shields.io/github/license/Dishi-Gogia/selenium-java-hybrid-framework-automation-exercise?style=for-the-badge)
![GitHub stars](https://img.shields.io/github/stars/Dishi-Gogia/selenium-java-hybrid-framework-automation-exercise?style=for-the-badge)
![GitHub last commit](https://img.shields.io/github/last-commit/Dishi-Gogia/selenium-java-hybrid-framework-automation-exercise?style=for-the-badge)

---

# 📑 Table of Contents

- Overview
- Technology Stack
- Framework Features
- Automation Scenarios
- Project Structure
- Framework Architecture
- Execution
- Reporting
- Screenshots
- Future Enhancements
- Related Repositories
- Author
- License

---

# 🎯 Overview

This project demonstrates an enterprise-style Selenium Automation Framework following industry best practices.

### Key Objectives

- ✔️ Scalable Architecture
- ✔️ Reusable Components
- ✔️ Modular Design
- ✔️ Data-Driven Testing
- ✔️ Cross-Browser Ready
- ✔️ Reporting & Logging
- ✔️ Parallel Execution Support
- ✔️ CI/CD Ready Framework
- ✔️ Enterprise QA Best Practices

---

# 🌐 Application Under Test

**Website**

https://automationexercise.com

### Automated Modules

- User Registration
- User Login
- Home Page Validation
- Navigation Validation
- Data-Driven Registration
- Form Validation

---

# 🛠 Technology Stack

| Category | Technology |
|-----------|------------|
| Language | Java |
| Automation | Selenium WebDriver 4 |
| Test Framework | TestNG |
| Build Tool | Maven |
| Design Pattern | Page Object Model (POM) |
| Page Factory | Selenium PageFactory |
| Data Driven | Apache POI |
| Reporting | Extent Reports |
| Logging | Log4j2 |
| Version Control | Git & GitHub |

---

# ⚡ Framework Features

## Selenium Framework

- Selenium WebDriver 4
- Page Object Model (POM)
- Page Factory
- Reusable Page Classes

## Driver Management

- DriverFactory
- ThreadLocal WebDriver
- Browser Management
- Parallel Execution Support

## Data-Driven Testing

- Excel Test Data
- Apache POI
- Generic Data Provider
- Dynamic Test Data

## Reporting & Logging

- Extent Reports
- Screenshot Capture
- Log4j2 Logging
- Execution Tracking

## Framework Utilities

- WebActions
- WaitUtils
- ConfigReader
- TestDataUtils
- ScreenshotUtils
- Environment Utilities

## TestNG

- Listeners
- Retry Analyzer
- Parallel Execution
- Suite Management

---

# 📚 Automation Coverage

Current automated scenarios include:

- Home Page Validation
- Login Navigation
- User Registration
- Data-Driven Registration
- Account Creation
- Validation Messages
- Form Submission
- Browser Launch Validation

---

# 📂 Project Structure

```text
selenium-java-hybrid-framework-automation-exercise

├── reports
├── screenshots
├── testdata
├── src
│   ├── test
│   │   ├── java
│   │   │   ├── base
│   │   │   ├── factory
│   │   │   ├── listeners
│   │   │   ├── pages
│   │   │   ├── reports
│   │   │   ├── tests
│   │   │   └── utilities
│   │   └── resources
│   │       ├── config.properties
│   │       └── log4j2.xml
│
├── pom.xml
├── testng.xml
├── LICENSE
└── README.md
```

---

# 🧠 Framework Architecture

```text
                TestNG Suite
                      │
                      ▼
                  BaseTest
                      │
                      ▼
                DriverFactory
                      │
                      ▼
          ThreadLocal WebDriver
                      │
                      ▼
               Page Object Model
                      │
                      ▼
                 WebActions
                      │
                      ▼
                 WaitUtils
                      │
                      ▼
                  Assertions
                      │
                      ▼
              Extent Reports
                      │
                      ▼
        Screenshots + Log4j Logs
```

---

# ▶️ Execute Framework

## Run Complete Suite

```bash
mvn clean test
```

## Run Edge Browser

```bash
mvn clean test -Dbrowser=edge
```

## Run QA Environment

```bash
mvn clean test -Denvironment=qa
```

## Run UAT Environment

```bash
mvn clean test -Denvironment=uat
```

---

# 📊 Reporting & Execution Artifacts

The framework automatically generates:

- ✅ Extent HTML Reports
- ✅ TestNG Reports
- ✅ Execution Logs
- ✅ Screenshots during execution
- ✅ Screenshots on failure

> **Note:** Sample reports and screenshots are intentionally included in this repository to demonstrate the framework's reporting and execution capabilities.

---

# 📸 Sample Screenshots

Example execution screenshots are available in:

```text
screenshots/
```

Sample reports are available in:

```text
reports/
```

---

# 🚀 Future Enhancements

- Jenkins CI/CD Integration
- Selenium Grid
- Docker Support
- Cross-Browser Execution
- GitHub Actions
- Allure Reports
- BrowserStack Integration
- LambdaTest Integration
- API + UI Automation

---

# 🔗 Related Repositories

### Selenium Java Hybrid Framework

https://github.com/Dishi-Gogia/selenium-java-hybrid-framework-automation-exercise

### Cucumber BDD Framework

(Add Repository)

### REST Assured Framework

(Add Repository)

### Playwright Framework

(Add Repository)

### Java for QA Engineers

https://github.com/Dishi-Gogia/Java-for-QA-Engineers

---

# 👩‍💻 Author

## Dishi Gogia

**Senior QA Manager | Quality Engineering | Test Automation | Selenium | Java | Salesforce CRM | Oracle CPQ | API Testing**

- GitHub: https://github.com/Dishi-Gogia
- LinkedIn: https://www.linkedin.com/in/dishi-gogia

---

# 📄 License

This project is licensed under the **MIT License**.

---

# 📈 Repository Status

⭐ If you found this repository useful, please consider giving it a **Star**.

Suggestions, improvements, and feedback are always welcome.

---

# 📌 Disclaimer

This project was developed for learning, demonstration, and portfolio purposes to showcase enterprise automation framework design and software testing best practices using Selenium WebDriver and Java.
