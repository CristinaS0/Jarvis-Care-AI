# 💊 Jarvis Care AI

**Jarvis Care AI** is an interactive single-page web application inspired by *Jarvis* from *Iron Man*. It assists patients throughout their treatment journey by offering medication tracking, appointment management, and a smart AI-powered chatbot to answer medical questions — all built around an MVP designed and delivered in two weeks.

---

## 🎯 Goal

To design and deploy a themed **Single Page Application (SPA)** inspired by a well-known AI character, with a custom **RESTful backend**. Our project focused on the character **Jarvis**, delivering an MVP (Minimum Viable Product) within a two-week sprint.

---

## 🚀 Our Approach

### Stage 1 – Roles & Responsibilities  
We began by defining team roles, focusing on two key positions: **Project Manager** and **Git Master**.

### Stage 2 – App Functionality Definition  
Using **Miro Whiteboard**, we mapped out ideas and clarified scope. A mind map and key questions helped avoid overlaps and clearly divide work among team members.

### Stage 3 – UI Navigation Scheme  
We defined essential navigation elements and categorized features as **in-scope** or **out-of-scope** to maintain focus on MVP delivery.

### Stage 4 – User Stories  
Each feature was broken down into clear, concise **user stories** that guided development and ensured alignment across the team.

### Stage 5 – Feature Management  
We used **Trello** to manage frontend and backend tasks using a Kanban board, allowing individual contributors to work autonomously.

### Stage 6 – Development Begins!  
With everything in place, we began building — and had fun doing it!

---

## 🧠 Project Context

Our focus was on addressing the **lack of reliable information in healthcare**, especially for **cancer treatment**. Patients often face low literacy or poor access to accurate data. Jarvis Care AI serves as a **virtual buddy** through the treatment journey, offering helpful guidance via AI.

---

## ⚔️ Main Challenges

- **Scoping the MVP**: We initially planned for more features than the timeline allowed and had to trim scope to meet our deadline.
- **Frontend Development Shift**: We started using `innerHTML` for dynamic rendering but later switched to `createElement()` for better maintainability and debugging.
- **Synonym Handling**: To address variations in terminology (e.g., *chemo* vs *chemotherapy*), we moved from manual synonym mapping to **OpenAI language model embeddings**, improving accuracy and scalability.
- **Optimizing AI Responses**: Balancing **creativity vs accuracy** required fine-tuning parameters like `temperature` and `topK` to ensure helpful and coherent responses.

---

## 🔑 Main Features

- 📅 **Appointment Management**  
  Create, view, and manage appointments, treatments, and exams.

- 💊 **Medication Tracking**  
  Add, update, and delete medications and their schedules.

- 🤖 **AI Chatbot with Spring AI + RAG**  
  A smart assistant that answers treatment-related questions using **Retrieval-Augmented Generation**.

- 🌐 **Single Page Application (SPA)**  
  Fast and smooth navigation without full page reloads.

- 🔒 **MVCS Architecture & RESTful API**  
  Backend built with **Model-View-Controller-Service** architecture and REST principles.

---

## 🛠️ Technologies Used

### Frontend  
- HTML5 / CSS3  
- JavaScript (DOM Manipulation)  
- SPA (Single Page Application)

### Backend  
- Java 17+  
- Spring Framework  
  - Spring MVC  
  - DTO Pattern  
- Spring AI (with RAG)  
- REST API  
- API testing with Postman

---

## 📁 Project Structure

```bash
src/
├── main/
│   ├── java
│   │   ├── com.jarviscare.you/
|   │   │   ├── controllers/
│   │   │   ├── converters/
│   │   │   ├── dtos/
│   │   │   ├── errors/
│   │   │   ├── exceptions/
│   │   │   ├── factories/
│   │   │   ├── model/
│   │   │   ├── persistence/
│   │   │   ├── services/
|   │   ├── resources/
│   │   │   ├── ai/
|   │   │   │   ├── rag/
|   │   │   │   ├── templates/
│   │   │   ├── db/
|   │   │   │   ├── config.properties/
│   │   ├── webapp
│   │   │   ├── WEB-INF
|   │   │   │   └── spring
```

---

## 👥 Team & Credits

This project was developed as the **final project** for the **Programming Full Stack Course** at [Code for All_].

**Team Members:**
- [@CristinaS0](https://github.com/CristinaS0)  
- [@PedroRocha84](https://github.com/PedroRocha84)  
- [@plomassa](https://github.com/plomassa)  
- [@VSilva4ALL](https://github.com/VSilva4ALL)
