# Character Manager API (Assignment 4)

## Project Overview
A Spring Boot web application built using the **Track A (FreeMarker MVC)** architecture. The application features a server-rendered user interface powered by FreeMarker templates (`.ftlh`) and connects to a persistent PostgreSQL database hosted on Neon.

---

## Architecture & Structural Tiers
* **Database & Entity Layer:** Spring Data JPA entity (`Character.java`) managing persistent character records in PostgreSQL (Neon).
* **Service Layer:** (`CharacterService.java`) Encapsulates business logic, search processing, and data access.
* **Controller Layer:** (`CharacterController.java`) Routes HTTP requests, processes form submissions, and populates MVC model attributes.
* **View Layer:** FreeMarker templates (`.ftlh`) with a shared navigation layout (`layout.ftlh`).

---

## Web Routes & Page Map
| Route | Method | Description |
| :--- | :--- | :--- |
| `/characters` | `GET` | Character gallery displaying cards with search/filtering capabilities. |
| `/characters/{id}` | `GET` | Individual character details page showing full attributes. |
| `/characters/new` | `GET`, `POST` | Form page and handler for adding a new character. |
| `/characters/edit/{id}` | `GET`, `POST` | Pre-filled form page and handler for updating an existing character. |
| `/characters/delete/{id}`| `GET` | Action route for removing a character. |
| `/about` | `GET` | Project overview detailing system architecture and tier design. |

---

## Live Deployment
* **Live Render URL:** [https://assignment-4-4di1.onrender.com](https://assignment-4-4di1.onrender.com)
