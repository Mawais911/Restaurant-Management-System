# 🍔 Restaurant Management System (Java OOP Project)

This is a simple **Restaurant Management System** built using **Object-Oriented Programming (OOP)** concepts in Java. It allows users to order food and drinks, calculates total price with discounts, and displays a detailed bill.

---

## 🧠 Concepts Used

- Interfaces (`Orderable`)
- Abstract Classes (`MenuItem`)
- Inheritance & Polymorphism
- Encapsulation
- Exception Handling
- Scanner class for user input

---

## 📂 Project Structure

- `MenuItem` – Abstract class for menu items (food and drinks)
- `FoodItem` – Subclass with 10% discount
- `DrinkItem` – Subclass with 15% discount
- `OrderItem` – Implements `Orderable` to calculate total cost
- `RestaurantManagementSystem` – Main class to take input and print the bill

---

## 💡 Features

- Accepts input for food and drink name, price, and quantity
- Automatically applies relevant discounts
- Calculates and displays the total bill
- Error handling for invalid inputs

---

## Sample Output

- Welcome to the Restaurant!
- Enter food name: Burger
- Enter food price: 300
- Enter quantity: 2
  
- Enter drink name: Coke
- Enter drink price: 150
- Enter quantity: 2

--- Your Order ---
- Burger x 2 = Rs.540.0
- Coke x 2 = Rs.255.0
- Total Bill: Rs.795.0

---

## 📊 Flowchart Design (Save as flowchart.png)

## 🧠 How It Works (Flowchart)

```plaintext
               +-----------------------------+
               |     Start Application      |
               +-----------------------------+
                             |
                             v
        +------------------------------------------+
        | User enters food name, price, quantity   |
        +------------------------------------------+
                             |
                             v
        +------------------------------------------+
        | User enters drink name, price, quantity  |
        +------------------------------------------+
                             |
                             v
        +------------------------------------------+
        | Calculate discounted price for each item |
        +------------------------------------------+
                             |
                             v
        +------------------------------------------+
        |     Display all items & total bill       |
        +------------------------------------------+
                             |
                             v
                       Program Ends
```

---

## 👨‍🎓 Author
Muhammad Awais
BSCS | The Islamia University of Bahawalpur
Aspiring AI Engineer 👨‍💻 | GitHub: Mawais911

