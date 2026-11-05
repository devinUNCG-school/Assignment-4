# Character Manager API (Assignment 4)

## Project Overview
A Spring Boot web application utilizing the **Track A (FreeMarker MVC)** architecture. It features a server-rendered front-end interface paired with a persistent PostgreSQL database hosted on Neon.

---

## Architecture & Layers
* **Database & Entity Layer:** Uses Spring Data JPA (`Character.java`) connected to a PostgreSQL database.
* **Service Layer:** (`CharacterService.java`) Manages core business logic and database operations.
* **Controller Layer:** (`CharacterController.java`) Handles HTTP request mapping for MVC views and REST actions.
* **View Layer:** FreeMarker templates (`.ftlh`) utilizing a shared navigation layout (`layout.ftlh`).

---

## Web Routes / Pages
| Route | Description |
| :--- | :--- |
| `GET /characters` | Displays the character gallery with search filtering and card previews. |
| `GET /characters/{id}` | Displays full details for an individual character. |
| `GET /characters/new` | Renders the form to add a new character. |
| `GET /characters/edit/{id}` | Renders the pre-filled form to update an existing character. |
| `GET /about` | Displays project information and architecture description. |

---

## Live Deployment
* **Live Render URL:** [Insert your Render deployment link here]
