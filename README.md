# 🏦 Bank Account Program in Java

This project demonstrates a simple **Bank Account system** in Java using Object-Oriented Programming (OOP) concepts such as **classes, constructors, methods, and encapsulation**.

---

## 📌 Features
- Create a bank account with:
  - Account number
  - Balance
  - Customer name
  - Customer email
  - Customer phone number
- Deposit funds into the account.
- Withdraw funds with balance checks.
- Get account details using getter methods.
- Supports both **default constructor** and **parameterized constructor**.

---

## 📂 Project Structure
- **BankClass.java** → Defines the bank account with its attributes and methods.  
- **Main.java** → Contains the `main` method to test the `BankClass`.

---

## 🖥️ Example Usage

```java
BankClass snapsAccount = new BankClass(12345, 500.00, "snaps Account",
        "r8572894696@gmail.com", "+91 47294746376"); // note:- the number is fake just typed randomly. 

System.out.println(snapsAccount.getNumber());
System.out.println(snapsAccount.getBalance());

snapsAccount.withdrawFunds(200.0);
snapsAccount.depositFund(100.56);
snapsAccount.withdrawFunds(23.45);
