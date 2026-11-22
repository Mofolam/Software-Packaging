# Software Packaging Project Notes

## Project: Software Packaging in Popular Frameworks

### Objective
To demonstrate dependency management, semantic versioning, software packaging, artifact generation, application testing, environment configuration, and security auditing using Node.js, Python (Django), and Java (Spring Boot).

### Node.js
- Created an Express application.
- Defined dependencies in `package.json`.
- Installed dependencies using `npm ci`.
- Generated the package using `npm pack`.
- Installed the package in an independent test project.
- Tested the packaged application and health endpoint.
- Ran `npm audit`: zero vulnerabilities reported.

Artifact: `artifacts/nodejs/nodejs-1.0.0.tgz`

### Python (Django)
- Created a Django application.
- Defined dependencies in `requirements.txt` and `pyproject.toml`.
- Configured package metadata and version 1.0.0.
- Generated wheel and source distribution packages using `python -m build`.
- Installed the wheel in an independent virtual environment.
- Verified the installed package import and Django system checks.
- Ran `pip-audit`: no known vulnerabilities reported.

Artifacts:
- `artifacts/python/python_packaging_app-1.0.0-py3-none-any.whl`
- `artifacts/python/python_packaging_app-1.0.0.tar.gz`

### Java (Spring Boot)
- Created a Spring Boot application.
- Defined dependencies and package metadata in `pom.xml`.
- Configured version 1.0.0.
- Generated an executable JAR using Maven.
- Tested the homepage and health endpoint.
- Verified external port configuration using the `PORT` environment variable.
- Added automated tests for the homepage and health endpoint.
- Successfully executed `mvn clean verify`.
- Inspected dependencies using `mvn dependency:tree`.

Artifact: `artifacts/java/java-packaging-app-1.0.0.jar`

Security audit status: OWASP Dependency-Check attempted but pending a valid NVD API key.

### Common Project Outcomes
- Used semantic versioning: MAJOR.MINOR.PATCH.
- Created distributable packages in three ecosystems.
- Verified packages and application functionality.
- Demonstrated environment-specific configuration.
- Performed dependency security audits.

### Outstanding Task
Complete the Java OWASP Dependency-Check scan after obtaining and configuring a valid NVD API key.

