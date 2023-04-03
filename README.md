# Inventory Management System

This is an Inventory Management System built in the form of a GUI desktop application developed in ***Java*** using ***MySQL*** as its database.
The GUI was designed using **Swing** and the database connectivity was managed using **JDBC API**.


This application can be used by any small to mid-sized stores to easily maintain and manage an inventory of all their-
- Products 
- Customers 
- Suppliers
- Users 
- Transactions


## Features of the Application

- Users can manage inventory and stock of all the products available in their store.
- Users can manage all sales and purchase transactions made by the store.
- Supports two user types:
  1. Administrator
  2. Employee
  
  [Admins have the ability to manage all other personnel.]
- Any transaction made automatically handles the stock availability in the inventory.
- Each section includes a search feature to make it easier for users to view the data they want to see.
- Users only need to enter the product code while making a sale and all the relevant details will be retrieved from the database automatically.
- Maintains a time log of all the users using the application.

## How to download and run the software

#### Minimum Requirements: JDK or JRE version 16.

1. Download and unzip the ZIP folder
2. Download the [SQL dump file](SQL/InventoryDB.sql), can also be found in the "SQL" folder in our root directory
3. Import the SQL dump file using MySQL Workbench to locally create the sample schema and tables associated with this software.
4. After the inventory schema has been locally created, you can go ahead and run the JAR file (InventoryManagement.jar) included in the zip folder.
5. Default credentials for the connection to MySQL database is:
    - Username: root
    - Password: root
6. Once these credentials match, the JAR file should execute without any issues provided that you have the minimum JRE.
7. You can log into the application using Username: `root` and Password: `root`.

### Note:

All the project dependencies are available in the [`lib`](lib/) directory.

***


## Application Preview

### Login Page

The login page takes in the credentials entered by the user and verifies with the database.

![loginpage](screenshots/login.png)

### Dashboard/Welcome Page

The landing page of the application after a successful login.

![welcome](screenshots/welcome.png)

## Technologies Used

The following are the technologies that have been used in the development of this project. All of them are free to use.
  - JetBrains IntelliJ IDE
  - Apache NetBeans IDE (for the GUI designer)
  - MySQL Server and Workbench
  - JDK 16
