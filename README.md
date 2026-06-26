# Sam-s-Video-Game-Store

## Overview
This project is a Spring Boot REST application that allows users to browse products, manage a shopping cart, and place orders. The application follows a layered architecture consisting of controllers, services, repositories, and models. This project also uses Spring Data JPA for database access.

## Backend Features
* Built controller and service logic to create, update, and delete categories
* Fixed bugs in the Products Controller to properly filter through products and properly update product quantities
* Implemented the controller and service logic to create shopping carts for each user, and update each shopping cart by either adding items, increasing its quantity, or emptying the cart
* Built a controller and implemented the methods in the service for the user profile to acquire the profile and edit it
* Built models, service, repository, and service from scratch to create the checkout function, creating orders and order line items, and saving them to the database

## Backend File Structure
<img width="563" height="891" alt="image" src="https://github.com/user-attachments/assets/23b7a4a3-c719-431f-b113-511d76ce2e1b" />
<img width="563" height="868" alt="image" src="https://github.com/user-attachments/assets/47f1ea55-8997-4d41-b1f3-5fc38ea0705d" />

## Frontend Repository
https://github.com/yu26s9-Sveloz03/Sam-s-Video-Game-Store-Frontend

## Frontend Features
* Allows you to view all products, matched with respective prices and photos
* Filter through products by price range
* Search products by subcategory
* Able to log into an account with its own specific cart
* Edit profile information in the profile page
* View cart in the cart page

## Frontend Webpage
<img width="1902" height="866" alt="image" src="https://github.com/user-attachments/assets/499db09e-d23b-4ab2-9ecb-f7a1c3623b15" />

## Future Improvements
* Create a proper checkout page with cart totals and an itemized receipt
* Be able to create a new user in the webpage
* Edit the webpage to make it look more aesthetically pleasing

## Authors
Samuel Veloz Baez and Pluralsight Instructor
