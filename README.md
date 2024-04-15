# How to use this repo

## 1. First select the question you want
###  -> For example: cd 43_multiply_string
## 2. Compile Java source code files
###  -> javac -cp .:path/to/your/junit.jar Solution.java SolutionTest.java

Solution.java contains the main application code, while SolutionTest.java contains the test code written in JUnit

## 3. Running tests on JUnit 5 platform
###  -> java -cp .:path/to/your/junit.jar org.junit.platform.console.ConsoleLauncher --scan-classpath

