# CodeOrbit Tech — Java Programming Internship Tasks

This repository contains four beginner-friendly Java console projects based on the CodeOrbit Tech Java Programming Internship task sheet.

## Projects

1. **Simple Calculator** — arithmetic operations, input validation, and exception handling.
2. **Student Grade Management System** — stores student names and marks and calculates average, highest, and lowest marks.
3. **Bank Account Simulation** — deposit, withdrawal, balance check, and transaction history.
4. **Inheritance & Polymorphism Practice** — a `Shape` hierarchy demonstrating inheritance and method overriding.

## Requirements

- Java JDK 8 or later
- Terminal / Command Prompt, or an IDE such as VS Code with Java support

Check Java installation:

```bash
java -version
javac -version
```

## Run a project

Open a terminal inside the folder for the project you want to run.

### Task 1 — Simple Calculator

```bash
cd CodeOrbit_SimpleCalculator
javac SimpleCalculator.java
java SimpleCalculator
```

### Task 2 — Student Grade Management

```bash
cd CodeOrbit_StudentGradeManagement
javac StudentGradeManagement.java
java StudentGradeManagement
```

### Task 3 — Bank Account Simulation

```bash
cd CodeOrbit_BankAccountSimulation
javac BankAccountSimulation.java
java BankAccountSimulation
```

### Task 4 — Inheritance & Polymorphism

```bash
cd CodeOrbit_InheritancePolymorphism
javac InheritancePolymorphism.java
java InheritancePolymorphism
```

If you are already inside a project folder, do not repeat its `cd` command.

## Concepts demonstrated

- Variables, data types, input/output, conditionals, and loops
- `Scanner`, `ArrayList`, and arrays
- Exception handling and input validation
- Classes, objects, encapsulation, inheritance, and polymorphism
- Method overriding with `@Override`

## GitHub upload

1. Create a GitHub account or sign in at https://github.com.
2. Create a **new repository** named `CodeOrbit-Java-Internship-Tasks`.
3. Keep it **Public** if your internship instructions require a publicly viewable link. Do not upload passwords, personal data, or private keys.
4. On your computer, extract this project folder from the ZIP.
5. Open Command Prompt or the VS Code terminal in the extracted `CodeOrbit_Java_Internship` folder (the folder containing this README).
6. Run these commands, replacing `YOUR-USERNAME` with your GitHub username:

```bash
git init
git add .
git commit -m "Complete CodeOrbit Java internship tasks"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/CodeOrbit-Java-Internship-Tasks.git
git push -u origin main
```

If Git asks you to identify yourself, configure your name and email:

```bash
git config --global user.name "Your Name"
git config --global user.email "your-email@example.com"
```

Then repeat the commit and push commands. GitHub may ask you to authenticate through a browser or a supported credential manager; use GitHub's sign-in flow, not your account password as a Git password.

If you already created a repository and added a README on GitHub, the first push may require you to pull and reconcile the remote commit first. The easiest beginner option is to create the empty repository without adding a README, license, or .gitignore.

## Before submission

- Compile and run each program yourself.
- Test invalid calculator input and division by zero.
- Test student marks at the limits (0 and 100).
- Test a bank withdrawal larger than the balance.
- Confirm the shape areas are printed correctly.
- Add screenshots or sample output to the README if your mentor requests them.
- Follow the internship WhatsApp group's submission form and LinkedIn/video instructions. Uploading to GitHub alone may not complete the internship submission process.
