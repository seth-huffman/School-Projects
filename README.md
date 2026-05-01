# School Projects Repository

A comprehensive collection of coursework and learning projects spanning multiple programming languages and technologies. This repository contains assignments, labs, and practice projects from various computer science courses.

---

## 📑 Table of Contents

- [Project Overview](#project-overview)
- [Directory Structure](#directory-structure)
- [Setup Instructions](#setup-instructions)
- [Project Details](#project-details)

---

## Project Overview

This repository is organized by programming language and technology, containing:
- **Computer Science Fundamentals** - Java, C++, Python assignments and labs
- **Web Development** - HTML, CSS, JavaScript interactive projects
- **Database Management** - SQL course materials and scripts
- **Systems Administration** - LDAP administration scripts and utilities
- **Web Backend** - PHP projects and assignments

---

## Directory Structure

```
School-Projects/
├── Admin/              # LDAP administration utilities
├── CPlusPlus/          # C++ projects and games
├── HTML/               # Web projects (HTML, CSS, JavaScript)
├── Java/               # Java assignments and labs
├── PHP/                # PHP projects
├── Python/             # Python assignments
└── SQL/                # Database course materials
```

---

## Setup Instructions

### General Requirements
- **Java**: JDK 8 or higher
- **C++**: C++ compiler
- **Python**: Python 3.6+
- **PHP**: PHP 7.0+
- **HTML/CSS/JS**: Any modern web browser
- **SQL**: SQLite or Oracle SQL Developer (included in SQL folder)
- **LDAP**: Linux/Unix environment (Admin scripts are bash-based)

### Running Java Projects

```bash
# Navigate to Java directory
cd Java

# Compile a specific assignment
javac Assignment01.java
java Assignment01

# Or compile a specific lab
javac Lab1.java
java Lab1

# Using Maven (for projects with pom.xml)
mvn clean compile
mvn exec:java -Dexec.mainClass="com.example.YourMainClass"
```

### Running C++ Projects

```bash
# Navigate to specific C++ project
cd CPlusPlus/Castle

# Compile
g++ -std=c++11 *.cpp -o castle

# Run
./castle
```

### Running Python Projects

```bash
# Navigate to Python directory
cd Python/[assignment-number]

# Run the script
python3 solution.py
```

### Running HTML/CSS/JavaScript Projects

```bash
# Navigate to HTML project
cd HTML/Calculator

# Open in browser (or use a local server)
open index.html
# OR start a local server
python3 -m http.server 8000
# Then visit http://localhost:8000
```

### Running PHP Projects

```bash
# Navigate to PHP project directory
cd PHP/Assignment1

# Start PHP server (PHP 5.4+)
php -S localhost:8000

# Visit http://localhost:8000 in your browser
```

### Running SQL Scripts

```bash
# Using sqlplus (Oracle)
sqlplus username/password@database
SQL> @JLDB_Build.sql

# Using sqlite3
sqlite3 database.db < query.sql
```

### Running LDAP Admin Scripts

```bash
# Navigate to Admin directory
cd Admin

# Add a user
bash add.sh

# Delete a user
bash deleteuser.sh

# Delete a tree
bash deletetree.sh

# Verify LDAP
bash verify.sh

# Search LDAP
bash ldapsearch.sh
```

---

## Project Details

### 📂 Admin/
**Purpose**: LDAP (Lightweight Directory Access Protocol) administration scripts for managing directory services.

**Key Files**:
- `add.sh` - Add users to LDAP directory
- `deleteuser.sh` - Delete users from directory
- `deletetree.sh` - Delete entire directory trees
- `ldapsearch.sh` - Search LDAP database
- `verify.sh` - Verify LDAP configuration
- `modify.sh` - Modify user records
- `*.ldif` files - LDAP Data Interchange Format schemas

**Requirements**: Linux/Unix environment with LDAP tools installed

**How to Run**:
```bash
cd Admin
bash add.sh
```

---

### 🎮 CPlusPlus/
**Purpose**: C++ projects covering game development, file handling, data structures, and object-oriented programming.

#### **Castle/** - Interactive Text Adventure Game
A text-based castle exploration game with multiple rooms and character classes.
- `TheCastleMain.cpp` - Game entry point
- `characterClass.h` - Player character definitions
- `room*.h` - Room definitions and logic

**How to Run**:
```bash
cd CPlusPlus/Castle
g++ -std=c++11 *.cpp -o castle
./castle
```

#### **FishWars/** - Card Game
A deck-based card game using randomization and game logic.
- `fishwars.cpp` - Main game logic

**How to Run**:
```bash
cd CPlusPlus/FishWars
g++ -std=c++11 fishwars.cpp -o fishwars
./fishwars
```

#### **Memory/** - Memory Game
A classic memory/matching game implementation.

#### **Struct/** - Struct Demonstrations
Examples of C++ struct usage and data structure handling.

#### **MultipleFiles/** - Multi-File Project Example
Demonstrates project organization across multiple source files.

#### **HTML/** - HTML Generation
C++ program that generates HTML tags and documents.

#### **Class/** - OOP Concepts
Object-oriented programming examples using C++ classes.

---

### 🌐 HTML/
**Purpose**: Interactive web applications built with HTML, CSS, and JavaScript.

#### **Calculator/** - Interactive Web Calculator
A fully functional calculator with arithmetic operations.
- `index.html` - HTML structure
- `index.js` - Calculator logic
- `style.css` - Styling

**How to Run**:
```bash
cd HTML/Calculator
# Open index.html in browser or start server
python3 -m http.server 8000
# Visit http://localhost:8000
```

#### **ButtonAnimation/** - CSS Animation Examples
Demonstrates CSS animations and transitions with interactive buttons.
- `index.html` - Button structure
- `style.css` - Animation effects
- `index.js` - Interactivity

**How to Run**:
```bash
cd HTML/ButtonAnimation
open index.html
```

#### **Bootstrap/** - Bootstrap Framework Project
A responsive web design project using Bootstrap framework.
- `pages/` - Multiple HTML pages
- `assets/` - Images and resources
- `styles/` - Custom CSS

**How to Run**:
```bash
cd HTML/Bootstrap
python3 -m http.server 8000
```

#### **Website-SelfExploration/** - Personal Web Exploration
A web project for self-exploration and learning web technologies.

---

### ☕ Java/
**Purpose**: Java programming assignments and labs covering fundamentals to advanced OOP concepts.

#### **Root Level Files** - Basic Assignments and Labs
- `Assignment01.java` through `Assignment06.java` - Course assignments
- `Lab1.java` through `Lab6.java` - Course labs

**How to Run**:
```bash
cd Java
javac Lab1.java
java Lab1
```

#### **Numbered Folders (01-53)** - Assignment Collections
Each folder contains specific assignments organized by topic:

- **Folder 15**: `CompareNumbersSethHuffman.java` - Number comparison logic
- **Folder 25**: `Lab7.java` - Advanced lab work
- **Folder 38**: `RockPaperScissors_SethHuffman.java` - Game implementation
- **Folder 41**: `SimpleArray_Huffman.java` - Array operations
- **Folder 42**: `SortBabyName_Huffman.java` - Sorting algorithms
- **Folder 46**: `TimedResponse_Huffman.java` - Time-based programming
- **Folder 50**: Multiple projects including:
  - `BookOrderSethHuffman.java` - Book ordering system
  - `MadlibsSethHuffman.java` - MadLibs game

**How to Run Individual Projects**:
```bash
cd Java/50/BookOrderSethHuffman/src
javac BookOrderSethHuffman.java
java BookOrderSethHuffman
```

#### **pom.xml** - Maven Configuration
The repository includes Maven support for dependency management and building.

**How to Run with Maven**:
```bash
cd Java
mvn clean compile
mvn test
```

---

### 🐍 Python/
**Purpose**: Python programming assignments and exercises (00-15).

Each folder (00 through 15) contains Python assignment files for different topics.

**How to Run**:
```bash
cd Python/01
python3 solution.py
```

---

### 🗄️ SQL/
**Purpose**: Database management and SQL course materials from CIS332.

#### **01_course_materials/**
- `database_builds/` - JLDB database schema (Build files 1-12)
  - `JLDB_Build.sql` - Initial database setup
  - `JLDB_Drop.sql` - Database cleanup script
- `student_assignments/` - Your completed assignments (chapters 2-8)

#### **02_test_files/**
Test scripts for SQL practice and development.

#### **03_xml_resources/**
XML schemas and stylesheets:
- `TryMe.xml` - Sample XML document
- `TryMe.dtd` - Document Type Definition
- `TryMe.xsl` - XSL Transformation

#### **04_output/**
Directory for query results and output files.

#### **05_reference_files/**
Reference documentation and help files.

**How to Run SQL Scripts**:

*Using SQLite:*
```bash
cd SQL/01_course_materials/database_builds
sqlite3 jldb.db < JLDB_Build.sql
sqlite3 jldb.db < sethhuffman_ch4.sql
```

*Using Oracle (with SQL Developer):*
```bash
sqlplus username/password@database
SQL> @JLDB_Build.sql
SQL> @sethhuffman_ch4.sql
```

---

### 📄 PHP/
**Purpose**: PHP web development assignments (Assignment1 through Assignment5).

Each folder contains a PHP assignment project.

**How to Run**:
```bash
cd PHP/Assignment1
php -S localhost:8000
# Visit http://localhost:8000 in browser
```

---

## 🚀 Quick Start Guide

### To Run Any Java Project:
```bash
cd Java
javac YourFileName.java
java YourFileName
```

### To Run Any C++ Project:
```bash
cd CPlusPlus/ProjectName
g++ -std=c++11 *.cpp -o output
./output
```

### To Run Any HTML/CSS/JS Project:
```bash
cd HTML/ProjectName
# Option 1: Open directly
open index.html

# Option 2: Use Python server (recommended)
python3 -m http.server 8000
# Then visit http://localhost:8000
```

### To Run Any Python Project:
```bash
cd Python/AssignmentNumber
python3 filename.py
```

---

## 📝 Notes

- Most Java assignments use standard input/output via Scanner or console
- C++ projects may require specific compiler flags (e.g., `-std=c++11`)
- HTML/CSS/JS projects work best when served via HTTP (use `python3 -m http.server`)
- SQL scripts are designed for JLDB database (included in course materials)
- Admin scripts require LDAP tools and proper system permissions

---

## 📚 Course Information

These projects are from various computer science courses including:
- CSE 110 - Introduction to Programming (Java)
- CIS 332 - Database Management (SQL)
- Various programming languages courses (C++, Python, PHP)
- Web Development courses (HTML, CSS, JavaScript)
- Systems Administration courses (LDAP)

---

## 💡 Tips for Running Projects

1. **Always navigate to the project directory first**
2. **Check for any configuration files** (pom.xml for Java, package.json for Node.js, etc.)
3. **For web projects, use a local server** instead of opening files directly
4. **Review the source code** to understand expected input/output
5. **Check the file headers** for assignment specifications and author notes

---

**Last Updated**: April 2026

For questions or issues with specific projects, refer to the comments within the source code files.
