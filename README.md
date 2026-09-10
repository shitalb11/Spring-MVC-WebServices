# Hibernate ORM

A collection of practical Hibernate ORM examples demonstrating different types of entity relationships using **Java, Hibernate, JPA, Maven, and MySQL**.

## 📌 About

This repository contains hands-on implementations of Hibernate entity relationships. It focuses on understanding how Java objects are mapped to relational database tables using **Hibernate ORM**.

The repository includes three separate Maven projects:

* One-to-One Relationship
* One-to-Many Relationship
* Many-to-Many Relationship

Each project demonstrates entity mapping, relationships, database interaction, and CRUD operations.

## 📚 Topics Covered

### 🔹 One-to-One Relationship

Demonstrates a relationship where one entity is associated with exactly one instance of another entity.

**Concepts:**

* `@OneToOne`
* Entity Mapping
* Primary Key Mapping
* Hibernate Configuration
* CRUD Operations
* Object-Relational Mapping

### 🔹 One-to-Many Relationship

Demonstrates a relationship where one entity is associated with multiple instances of another entity.

**Concepts:**

* `@OneToMany`
* `@ManyToOne`
* Entity Relationships
* Foreign Key Mapping
* Hibernate Configuration
* CRUD Operations
* Object-Relational Mapping

### 🔹 Many-to-Many Relationship

Demonstrates a relationship where multiple instances of one entity can be associated with multiple instances of another entity.

**Concepts:**

* `@ManyToMany`
* Join Tables
* Foreign Key Relationships
* Entity Mapping
* Hibernate Configuration
* CRUD Operations
* Object-Relational Mapping

## 🛠️ Technologies Used

* **Java**
* **Hibernate ORM**
* **JPA (Java Persistence API)**
* **Maven**
* **MySQL**
* **JDBC**
* **IntelliJ IDEA**

## 📂 Project Structure

```text
Hibernate/
│
├── Hibernate-One-to-One/
│   ├── src/
│   │   └── main/
│   │       └── java/
│   ├── pom.xml
│   └── ...
│
├── Hibernate-One-to-Many/
│   ├── src/
│   │   └── main/
│   │       └── java/
│   ├── pom.xml
│   └── ...
│
├── Hibernate-Many-to-Many/
│   ├── src/
│   │   └── main/
│   │       └── java/
│   ├── pom.xml
│   └── ...
│
└── README.md
```

## ⚙️ Setup and Installation

### 1. Clone the Repository

```bash
git clone https://github.com/shitalb11/Hibernate.git
```

### 2. Open the Project

Open the repository in **IntelliJ IDEA** or another Java IDE.

### 3. Configure MySQL

Create the required MySQL database and update the Hibernate configuration with your database details.

```properties
hibernate.connection.url=jdbc:mysql://localhost:3306/your_database
hibernate.connection.username=your_username
hibernate.connection.password=your_password
```

### 4. Build the Project

Each relationship is a separate Maven project. Navigate into the required project and run:

```bash
mvn clean install
```

### 5. Run the Application

Run the respective Java main class from the selected project.

## 🎯 Learning Objectives

This repository was created to practice and understand:

* Hibernate ORM fundamentals
* Entity and table mapping
* JPA annotations
* Entity relationships
* Primary and foreign keys
* Join tables
* CRUD operations
* Hibernate configuration
* Database connectivity
* Object-relational mapping

## 👩‍💻 Author

**Shital Bhosale**

GitHub: [shitalb11](https://github.com/shitalb11)

---

⭐ If you find this repository useful, feel free to explore the projects and learn more about Hibernate ORM.
