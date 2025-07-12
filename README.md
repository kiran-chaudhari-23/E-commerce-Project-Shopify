🛍️ E-Commerce project using Java Spring Boot and HTML/JavaScript for frontend — with user, cart, and order features.

🛒 E-Commerce Web Application - Shopify

Hi there! I'm Kiran Chaudhari, a student passionate about full-stack development. This is my personal project — an E-Commerce Web Application built using Spring Boot for the backend and HTML, CSS, JavaScript (Vanilla) for the frontend. It demonstrates user registration, login, product listing, cart handling, and order placement functionalities — just like a real-world online store!

🚀 Project Highlights

- 📦 Backend: Java + Spring Boot + JPA + MySQL
- 🎨 Frontend: HTML, CSS (Bootstrap), JavaScript
- 🔁 REST APIs for user, product, and order operations
- 🛒 Cart system with localStorage handling
- 👕 Products sorted by category (Clothing, Electronics, etc.)
- ✅ Clean and simple UI design for users

 📂 Project Structure

 🧠 Backend - Spring Boot (`/com.ecom.Ecomm`)
- UserController – Registration, login, fetch all users
- ProductController – View all products, add/delete by ID
- OrderController – Place order, view all orders, get orders by user
- Service Layer – Handles core business logic
- Repositories – JPA-based DB access for `User`, `Product`, `Orders`
- DTOs – Data Transfer Objects for secure frontend communication

🎨 Frontend (HTML/JS/CSS)
- index.html – Home page with product listings & carousel
- cart.html – Shopping cart with quantity change and total price
- api.js – Fetches products and renders them on the page
- cart.js– Manages cart using browser's localStorage

📸 UI Screenshot
  <img width="1500" alt="Screenshot (238)" src="https://github.com/user-attachments/assets/617ca16f-8de3-44ec-ba69-3c36941d473c" />
  <img width="1500" alt="Screenshot (239)" src="https://github.com/user-attachments/assets/a2a8b810-bd40-4820-8dc9-406e26e534f2" />
  <img width="1500" alt="Screenshot (240)" src="https://github.com/user-attachments/assets/100075b6-a0c0-45cc-8780-379be70db5c7" />
  <img width="1500" alt="Screenshot (241)" src="https://github.com/user-attachments/assets/80194056-6077-4a86-987e-08c5cd6891e0" />
  
🧪 Sample API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/users/register` | Register a new user |
| `POST` | `/users/login` | Login a user |
| `GET` | `/products` | Get all products |
| `POST` | `/products` | Add a new product |
| `DELETE` | `/products/{id}` | Delete a product |
| `POST` | `/orders/place/{userId}` | Place an order |
| `GET` | `/orders/all-orders` | Get all orders |
| `GET` | `/orders/user/{userId}` | Get orders for a specific user |

📦 Technologies Used

- Backend: Java, Spring Boot, JPA, Hibernate
- Frontend: HTML5, CSS3, Bootstrap 5, JavaScript
- Database: MySQL (or H2 during development)
- Tools: IntelliJ IDEA, Postman, GitHub, VS Code

💡 What I Learned

✅ How to build RESTful APIs using Spring Boot  
✅ Managing frontend state using JavaScript and localStorage  
✅ Integration of frontend with backend APIs  
✅ Understanding of real-world eCommerce workflow  
✅ Creating responsive UI using Bootstrap  

🛠️ How to Run

1. Backend
   - Import project in IntelliJ or Eclipse
   - Run `EcommApplication.java`
   - Backend runs at `http://localhost:8080`

2. Frontend
   - Open `index.html` in browser
   - Update `BASE_URL` in `api.js` to match backend address

📚 What I Learned

- Building REST APIs using Spring Boot
- Connecting frontend to backend
- Handling cart using JavaScript
- Using JPA for database access
- Creating responsive UI using Bootstrap

👤 About Me

I'm a passionate student exploring Java and Web Development.  
This project helped me understand full-stack development with real-world features.

