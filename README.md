<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  
</head>
<body>

<h1>🔗 URL Shortener</h1>
<h3>Full Stack Web Application</h3>

<p>
A production-ready URL Shortener that transforms long, complex URLs into short,
shareable links and redirects users efficiently to the original destination.
</p>

<p><strong>Made by Aditya Singh</strong></p>

<hr>

<h2>✨ Key Highlights</h2>
<ul>
  <li>End-to-end full stack application</li>
  <li>Production-ready backend with clean architecture</li>
  <li>Cloud hosted with real-world deployment setup</li>
  <li>Optimized for performance, reliability, and scalability</li>
</ul>

<hr>

<h2>🚀 Features</h2>
<ul>
  <li>Shorten long URLs into compact, unique links</li>
  <li>Fast redirection using HTTP 302 status code</li>
  <li>Persistent storage using cloud database</li>
  <li>Validation to prevent invalid or empty URLs</li>
  <li>Responsive and user-friendly frontend interface</li>
  <li>Accessible globally from any system or network</li>
</ul>

<hr>

<h2>🛠 Technology Stack</h2>

<h3>Backend</h3>
<ul>
  <li>Java</li>
  <li>Spring Boot</li>
  <li>Spring Data JPA</li>
  <li>PostgreSQL</li>
  <li>Maven</li>
</ul>

<h3>Frontend</h3>
<ul>
  <li>HTML</li>
  <li>CSS</li>
  <li>JavaScript</li>
</ul>

<h3>Deployment & Infrastructure</h3>
<ul>
  <li>Render (Application Hosting)</li>
  <li>Cloud PostgreSQL Database</li>
  <li>Environment Variable Based Configuration</li>
</ul>

<hr>

<h2>⚙️ Application Workflow</h2>
<ol>
  <li>User enters a long URL in the frontend</li>
  <li>Backend validates the URL format</li>
  <li>A unique short code is generated</li>
  <li>The mapping is stored in the database</li>
  <li>A short URL is returned to the user</li>
  <li>Visiting the short URL triggers a redirect to the original URL</li>
</ol>

<hr>

<h2>📁 Project Structure</h2>

<pre>
urlshortner
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.urlshortner
│   │   │       ├── controller
│   │   │       ├── service
│   │   │       ├── repository
│   │   │       └── model
│   │   └── resources
│   │       ├── static
│   │       │   ├── index.html
│   │       │   └── style.css
│   │       └── application.properties
├── pom.xml
└── README.html
</pre>

<hr>

<h2>🔌 API Documentation</h2>

<h3>1️⃣ Shorten URL</h3>
<pre>
POST /shorten
</pre>

<p><strong>Request Parameter</strong></p>
<pre>
url=&lt;original_url&gt;
</pre>

<p><strong>Success Response</strong></p>
<pre>
https://your-domain.com/r/abc123
</pre>

<h3>2️⃣ Redirect to Original URL</h3>
<pre>
GET /r/{shortCode}
</pre>

<p>
Automatically redirects the user to the original URL using HTTP 302 response.
</p>

<hr>

<h2>🌐 Live Application</h2>
<pre>
https://url-shortener-fi38.onrender.com/
</pre>

<hr>

<h2>🧪 Run Locally</h2>

<h3>Prerequisites</h3>
<ul>
  <li>Java 17 or higher</li>
  <li>Maven</li>
  <li>PostgreSQL</li>
</ul>

<h3>Steps</h3>
<pre>
git clone https://github.com/your-username/url-shortener.git
cd url-shortener
mvn clean package
mvn spring-boot:run
</pre>

<p>Open in browser:</p>
<pre>
http://localhost:8080
</pre>

<hr>

<h2>🔐 Environment Variables</h2>
<pre>
BASE_URL=https://your-render-app-url.onrender.com
SPRING_DATASOURCE_URL=jdbc:postgresql://...
SPRING_DATASOURCE_USERNAME=your_db_username
SPRING_DATASOURCE_PASSWORD=your_db_password
</pre>

<hr>

<h2>📈 Future Enhancements</h2>
<ul>
  <li>Click count and analytics dashboard</li>
  <li>Custom short URLs</li>
  <li>URL expiration support</li>
  <li>User authentication and history tracking</li>
  <li>QR code generation for shortened links</li>
</ul>

<hr>

<h2>👨‍💻 Author</h2>
<p>
<strong>Aditya Singh</strong><br>
Engineering Student | Backend Developer<br>
Java &amp; Spring Boot Enthusiast
</p>

<p>
This project reflects real-world backend development practices including REST API
design, database integration, cloud deployment, and production debugging.
</p>

<p>
⭐ If you found this project useful, feel free to star the repository.
</p>
<p>
 <img width="1919" height="1079" alt="Screenshot 2025-12-21 175807" src="https://github.com/user-attachments/assets/a839e8eb-807c-45cc-89c0-44505d0e6c73" />

</p>

<p>
Live URL- https://url-shortener-fi38.onrender.com/</p>
<p>Documentation- https://drive.google.com/file/d/1cc3W_XLhyWrmU8Z4RTIo9vIft6susWPZ/view?usp=sharing
</p>

</body>
</html>
