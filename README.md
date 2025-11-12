# Spring Boot CRUD Application

This project is a **Spring Boot web application** that provides basic **CRUD operations** and uses **PostgreSQL** as its database.  
The app is built and managed using **Gradle** and runs in a **Docker** environment.

---

## 🧱 Project Overview
- **Framework:** Spring Boot  
- **Build Tool:** Gradle  
- **Database:** PostgreSQL (running in Docker)  
- **Features:**
  - Create, Read, Update, Delete (CRUD) operations
  - RESTful API endpoints
  - Connected to PostgreSQL via Docker container

---

## ⚙️ Prerequisites

Before running the app, make sure you have the following installed:

- [Docker Desktop](https://www.docker.com/products/docker-desktop)
- [Java 17+](https://adoptium.net/) (or compatible version)
- [Gradle](https://gradle.org/install/) (if not using wrapper)

---

## 🐳 Run Database in Docker
1. Ensure Docker Desktop is running.
2. Locate the **PostgreSQL container** (usually named `postgres-spring-boot`).
3. To access the running PostgreSQL container, run:

```bash
docker exec -it postgres-spring-boot bash
Inside the container, open the PostgreSQL shell:
psql -U amigoscode


Connect to the database:
\c amigos

🚀 Running the Application
Clone the repository:
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
Build the app using Gradle:

./gradlew build
Run the Spring Boot application:


./gradlew bootRun
The app will start at:
http://localhost:8080


📡 API Endpoints
Example endpoints:
Method	Endpoint	Description
GET	/api/v1/software-engineers	Get all records
POST	/api/v1/software-engineers	Create a new record
PUT	/api/v1/software-engineers/{id}	Update a record
DELETE	/api/v1/software-engineers/{id}	Delete a record

🧰 Useful Commands
Command	Description
docker ps	List running containers
docker exec -it postgres-spring-boot bash	Access PostgreSQL container
psql -U amigoscode	Access PostgreSQL shell
\c amigos	Connect to amigos database
./gradlew clean build	Clean and rebuild the project

📝 Notes
Make sure the PostgreSQL container is running before starting the Spring Boot app.

Default database credentials are configured in application.properties.

You can modify Gradle dependencies or Docker configurations as needed.
