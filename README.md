# Software Packaging in Popular Frameworks

## Project Overview

This project demonstrates software packaging across three popular development ecosystems: Node.js, Python (Django), and Java (Spring Boot).

The objective is to create portable and reproducible application packages, manage dependencies, apply semantic versioning, separate configuration from application code, generate distributable artifacts, test packaged applications, and perform dependency security audits.

## Technologies Used

| Technology | Version / Tool |
|---|---|
| Node.js | 22.22.1 |
| npm | 9.2.0 |
| Python | 3.14.4 |
| Django | 6.1.3 |
| Java | 25.0.5.1 |
| Spring Boot | 3.5.16 |
| Maven | 3.9.12 |
| Git | 2.53.0 |

## Project Structure

```text
software-packaging/
├── README.md
├── artifacts/
│   ├── nodejs/
│   ├── python/
│   └── java/
├── docs/
│   └── project-notes.md
├── java/
│   └── src/
├── nodejs/
│   ├── package.json
│   ├── package-lock.json
│   └── src/
├── python/
│   └── app/
└── screenshots/
```

## 1. Node.js Packaging

The Node.js application uses Express to provide a homepage and a health-check endpoint.

**Dependency management:** `package.json` and `package-lock.json`

**Package version:** 1.0.0

**Packaging tool:** npm

**Build artifact:**
- `artifacts/nodejs/nodejs-1.0.0.tgz`

**Verification performed:**
- Installed dependencies using `npm ci`.
- Generated a distributable package using `npm pack`.
- Installed the generated package in a separate test project.
- Ran the packaged application.
- Verified the health-check endpoint.

**Security audit:** `npm audit` reported zero vulnerabilities.

## 2. Python (Django) Packaging

The Python application uses Django and Python packaging standards.

**Dependency management:**
- `requirements.txt`
- `pyproject.toml`

**Package version:** 1.0.0

**Packaging tool:** Python Build (`python -m build`)

**Build artifacts:**
- `artifacts/python/python_packaging_app-1.0.0-py3-none-any.whl`
- `artifacts/python/python_packaging_app-1.0.0.tar.gz`

**Verification performed:**
- Installed build dependencies.
- Generated wheel and source distribution packages.
- Created a separate Python virtual environment.
- Installed the generated wheel in the test environment.
- Confirmed the package imports from the installed environment.
- Ran Django system checks successfully.

**Security audit:** `pip-audit` reported no known vulnerabilities in the declared requirements.

## 3. Java (Spring Boot) Packaging

The Java application uses Spring Boot and Maven.

**Dependency management:** `pom.xml`

**Package version:** 1.0.0

**Packaging tool:** Maven

**Build artifact:**
- `artifacts/java/java-packaging-app-1.0.0.jar`

**Verification performed:**
- Built the executable JAR using Maven.
- Ran the application using `java -jar`.
- Tested the homepage and health-check endpoint.
- Verified external port configuration using the `PORT` environment variable.
- Added automated application tests for the homepage and health endpoint.
- Ran `mvn clean verify` successfully.
- Inspected dependencies using `mvn dependency:tree`.

**Security audit:** OWASP Dependency-Check was configured and attempted. The scan is pending because a valid NVD API key has not yet been configured.

## Semantic Versioning

All three applications use version `1.0.0`.

Semantic versioning follows:

`MAJOR.MINOR.PATCH`

- MAJOR: Incompatible changes.
- MINOR: Backward-compatible functionality.
- PATCH: Backward-compatible bug fixes.

## Environment Configuration

The Java application reads its port from the `PORT` environment variable, with port 8080 as the default.

Example:

```bash
PORT=8085 java -jar java-packaging-app-1.0.0.jar
```

This allows configuration to change without modifying the application source code.

## Security Audit Summary

| Ecosystem | Audit Tool | Current Result |
|---|---|---|
| Node.js | npm audit | Zero vulnerabilities reported |
| Python | pip-audit | No known vulnerabilities reported |
| Java | OWASP Dependency-Check | Pending valid NVD API key |

## Project Outcomes

The project demonstrates:

- Dependency management across three ecosystems.
- Semantic versioning.
- Creation of distributable software packages.
- Independent installation and verification of packages.
- Application health-check endpoints.
- External environment configuration.
- Automated testing.
- Dependency security auditing.

## Conclusion

The project successfully demonstrates packaging in Node.js, Python (Django), and Java (Spring Boot). Distributable artifacts were generated, and application verification was performed across the three ecosystems.

The Java dependency security scan remains outstanding and is identified as a pending task in this submission.
