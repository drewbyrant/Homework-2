<%-- 
    Document   : calculate
    Created on : Oct 19, 2015, 2:21:32 PM
    Author     : drewbryant
    Copyright 2015 Andrew Bryant & Patrick Lathan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>CSC 330 Homework 2</title>
  </head>
  <body>
    <label>Investment Amount</label>
    <span>${calc.amount}</span>
    <br>
    <label>Yearly Interest Rate</label>
    <span>${calc.rate}</span>
    <br>
    <label>Number of Years</label>
    <span>${calc.years}</span>
    <br>
    <label>Future Value</label>
    <span>${calc.futureAmount}</span>
  </body>
</html>
