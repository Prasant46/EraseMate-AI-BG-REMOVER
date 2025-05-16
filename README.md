# EraseMate-AI BG Remover

**Live Demo:** [https://erasemate.netlify.app](https://erasemate.netlify.app)

## Overview
AI BG Remover is a full-stack web application that allows users to remove backgrounds from images using advanced AI technology. The platform offers a seamless experience for both free and premium users, with a credit-based system for processing images and integrated payment via Razorpay.

## Features
- **AI-Powered Background Removal:** Instantly remove backgrounds from images with high accuracy.
- **User Authentication:** Secure login and registration using Clerk authentication.
- **Credit System:** Users can purchase credits to process images. Each background removal consumes one credit.
- **Razorpay Integration:** Secure online payments for buying credits.
- **Responsive UI:** Modern, mobile-friendly interface built with React and Tailwind CSS.
- **Image Preview & Download:** Preview original and processed images, and download results.
- **Webhooks:** Real-time user sync and updates via Clerk webhooks.

## Tech Stack
- **Frontend:** React, Vite, Tailwind CSS, Clerk (for authentication)
- **Backend:** Spring Boot, Java, MySQL, Razorpay SDK
- **AI Service:** Clipdrop API for background removal


## How It Works
1. **Sign Up / Login:** Users authenticate via Clerk.
2. **Upload Image:** Users select an image to remove its background.
3. **Remove Background:** The image is sent to the backend, which uses the Clipdrop API to process it.
4. **Download Result:** The processed image is displayed and can be downloaded.
5. **Buy Credits:** Users can purchase more credits using Razorpay.



## Environment Variables
### Frontend (`client/.env`)
```
VITE_CLERK_PUBLISHABLE_KEY=your_clerk_publishable_key
VITE_BACKEND_URL=http://localhost:8080/api
VITE_RAZORPAY_KEY_ID=your_razorpay_key_id
```

### Backend (`removebg/src/main/resources/application.properties`)
- MySQL database credentials
- Clerk API configuration
- Clipdrop API key
- Razorpay API keys
- CORS configuration for both localhost and Netlify

## Getting Started
### Prerequisites
- Node.js & npm
- Java 17+
- MySQL

### Backend Setup
1. Configure your MySQL database and update `application.properties`.
2. Run the backend:
   ```sh
   cd removebg
   ./mvnw spring-boot:run
   ```

### Frontend Setup
1. Update `.env` with your keys and backend URL.
2. Run the frontend:
   ```sh
   cd client
   npm install
   npm run dev
   ```

## API Endpoints
- `POST /api/images/remove-background` — Remove background from an image
- `GET /api/users/credits` — Get user credits
- `POST /api/orders` — Create a new order for credits
- `POST /api/orders/verify` — Verify payment
- `POST /api/webhooks/clerk` — Clerk webhook for user sync

## License
This project is for educational and demonstration purposes only.
