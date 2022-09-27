package com.example.project_impl;

public class model {
    String Amount;
    String Description;
    String Location;
    String Receipt;

    String Debt_Amount;
    String Debt_Description;
    String Date;
    String Debt_Receipt;


    String Username;
    String User_name;
    String Email;
    String Address;

    public model(String amount, String description, String location, String receipt, String debt_Amount, String debt_Description, String date, String debt_Receipt, String username, String user_name, String email, String address, String phone_number, String amountid) {
        Amount = amount;
        Description = description;
        Location = location;
        Receipt = receipt;
        Debt_Amount = debt_Amount;
        Debt_Description = debt_Description;
        Date = date;
        Debt_Receipt = debt_Receipt;
        Username = username;
        User_name = user_name;
        Email = email;
        Address = address;
        Phone_number = phone_number;
        Amountid = amountid;
    }

    String Phone_number;


    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getReceipt() {
        return Receipt;
    }

    public void setReceipt(String receipt) {
        Receipt = receipt;
    }

    public String getDebt_Amount() {
        return Debt_Amount;
    }

    public void setDebt_Amount(String debt_Amount) {
        Debt_Amount = debt_Amount;
    }

    public String getDebt_Description() {
        return Debt_Description;
    }

    public void setDebt_Description(String debt_Description) {
        Debt_Description = debt_Description;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getDebt_Receipt() {
        return Debt_Receipt;
    }

    public void setDebt_Receipt(String debt_Receipt) {
        Debt_Receipt = debt_Receipt;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String phone_number) {
        Phone_number = phone_number;
    }

    public String getAmountid() {
        return Amountid;
    }

    public void setAmountid(String amountid) {
        Amountid = amountid;
    }
    model(){

    }

    String Amountid;
}

