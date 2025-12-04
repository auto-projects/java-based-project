🚀 Playwright + TestNG Automation Framework (UI + API)

This project is a Java-based automation framework built using:

Playwright (UI + API testing)

TestNG (test runner, parallel execution, retry)

Maven (build + dependency management)

Allure (reporting)

- testng.xml - responsible for the parallel execution; parallel="methods" → TestNG runs tests in parallel and thread-count="5" → Up to 5 tests run at the same time
- test -> utils -> RetryAnalyzer - retry mechanism; retries failed tests up to two times
- depended on tests - handled in test -api-LoginApiTest - @Test(dependsOnMethods = "loginApiSimulation")
// trigger
