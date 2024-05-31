# Online Food Ordering System

## Project Overview

This project aims to develop a comprehensive and user-friendly food ordering system using Java, employing robust frameworks and design patterns to ensure scalability and reliability. The system provides essential features for users such as browsing products, adding items to the cart, and processing orders with various payment methods. Additionally, it enables administrators to manage products efficiently.

## Table of Contents

1. [Project Title](#project-title)
2. [Brief Project Description](#brief-project-description)
3. [Use Cases (Functionality)](#use-cases-functionality)
   - [Authentication](#authentication)
   - [User](#user)
   - [Admin](#admin)
4. [Source Code](#source-code)
5. [User Interface (How to use it)](#user-interface-how-to-use-it)
6. [Class Diagrams](#class-diagrams)
7. [Justifications for all the design patterns used](#justifications-for-all-the-design-patterns-used)
8. [Framework](#framework)
9. [Demonstration](#demonstration)
10. [Challenges](#challenges)
11. [Conclusion](#conclusion)

## Project Title

**Online Food Ordering System**

## Brief Project Description

The project aims to develop a comprehensive food ordering system using Java. The system provides registered users with features such as browsing products, adding items to the cart, and processing orders. It also enables administrators to manage products by adding, updating, and deleting food items efficiently. The project employs various design patterns to enhance the functionality and maintainability of the application.

## Use Cases (Functionality)

### Authentication

- **Signup**: Allows new users to create an account. Admin is already registered from the backend.
- **Login**: Authenticates the user and provides access to the food ordering system.

### User

- **View**: Users can view the food items added by the admin.
- **Add to cart**: Allows users to add products to their shopping cart.
- **Remove from cart**: Enables users to remove specific products from their shopping cart.
- **Order Placement**: Finalizes the purchase by processing the cart contents, selecting a payment method, and confirming the order.

### Admin

- **Add food item**: Allows the admin to add new food items to the menu.
- **Update Food Item**: Enables the admin to modify existing food items' details.
- **Delete Food Item**: Allows the admin to remove food items from the menu.

## Source Code

GitHub Repository: [Online Food Ordering System](https://github.com/tashi1417/FoodOrderingApplication)

## User Interface (How to use it)

The user interface is console-based and provides the following functionalities:

- **Signup/Login**: New users can sign up, and registered users can log in.
- **Landing Page**: Displays optioins realted to food items after logging in.
- **Add to cart**: Users can add food items to their cart.
- **Remove item from cart**: Users can remove items from their cart.
- **Payment System**: Users can select a payment method and process their order.
- **Admin dashboard**: Admin can add, update, and delete food items.

## Class Diagrams

Class diagrams illustrating the design patterns used in the project can be found in the UML diagrams directory:
[UML Diagrams](https://github.com/tashi1417/FoodOrderingApplication/tree/main/FoodOrdering/uml_diagram)
[UML Diagrams](https://github.com/tashi1417/FoodOrderingApplication/tree/main/FoodOrdering)


## Justifications for all the design patterns used

- **Singleton Pattern**: Ensures a single instance of the admin class.
- **Composite Pattern**: Groups multiple payment strategies.
- **Chain of Responsibility**: Handles payment processing tasks.
- **Observer Pattern**: Monitors changes in product objects.
- **Proxy Pattern**: Lazy loads the product service.
- **Strategy Pattern**: Encapsulates and interchanges different payment strategies.
- **Mediator Pattern**: Centralizes communication between components.
- **Command Pattern**: Handles product addition by the admin.

## Framework

The framework provides a fixed and unchangeable foundation, ensuring consistency and reliability. The implementation can be adjusted to meet specific needs, maintaining a stable core while allowing customization.

## Functionalities

- **Admin Functions**: Add, update, delete products, and logout.
- **User Functions**: View products, add to cart, view cart, and checkout.

## Challenges

Implementing multiple design patterns, ensuring scalability and performance, creating an intuitive user interface, protecting sensitive data, ensuring reliability and fault tolerance, and seamless integration with existing systems were some of the challenges faced during the development.

## Conclusion

The Online Food Ordering System, developed using Java and various design patterns, demonstrates the power of design patterns in software development. The system is scalable, maintainable, and provides a user-friendly interface. The project's comprehensive documentation serves as a valuable resource for understanding the system's architecture and functionality.

## How to Run the Application

1. **Clone the repository**:
   ```bash
   git clone https://github.com/tashi1417/FoodOrderingApplication.git
