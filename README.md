# Simple CLI Calculator (Java)

## Overview

This is a simple command-line calculator built in Java.
The primary goal of this project is to demonstrate **Separation of Concerns (SoC)** using a layered architecture.

The application supports basic arithmetic operations and handles invalid input and runtime errors (e.g., division by zero).

---

## Features

* Addition, subtraction, multiplication, division
* Exception handling for invalid operations
* Continuous input loop (until user exits)
* Clean separation of logic into layers

---

## Architecture

The project follows a structured layered design:

```
src/
 ├── service/      → Business logic
 ├── controller/   → Operation handling
 ├── view/         → CLI interaction
 └── Main.java     → Entry point
```

### Layer Responsibilities

* **Service Layer**

  * Contains core calculation logic
  * No input/output handling

* **Controller Layer**

  * Routes user requests(inputs) to appropriate service methods
  * Handles operation selection logic

* **View Layer**

  * Manages user interaction (input/output)
  * Handles exceptions and displays messages

* **Main Class**

  * Entry point of the application
  * Starts the CLI flow

---

## How to Run

### Run using IDE 

- Open the project in VS Code or IntelliJ
- Run `Main.java`

### Run using Terminal

- javac -d out src/Main.java src/service/*.java src/controller/*.java src/view/*.java
- java -cp out src.Main

---

## Example Usage

```
---- SIMPLE CLI CALCULATOR ----
Enter operation (+, -, *, /) or exit: +
Enter two numbers:
5
3
Answer: 8
```

---

## Error Handling

* Division by zero throws an exception
* Invalid operations are handled gracefully
* Non-numeric input is caught and managed in the view layer

---

## Design Decisions

* Avoided `static` methods to maintain object-oriented design
* Used exception handling instead of printing errors in service layer
* Introduced controller layer to reduce coupling between UI and logic
* Structured code to allow easy extension (e.g., new operations)

---

## Limitations

* Supports only basic arithmetic
* CLI-based (no GUI)
* No persistence or advanced features

---

## Future Improvements

* Refactor into a Spring Boot REST API (replace CLI with HTTP endpoints)
* Convert to Maven project structure 
* Replace switch-case with enum-based design
* Add unit testing (JUnit)
-and many more...
---

## Author

Personal learning project focused on improving Java fundamentals, clean architecture, and Git workflow.
