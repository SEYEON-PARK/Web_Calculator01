<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <style>
        div.container{
            width: 250px;
            margin:0 auto;
        }
        fieldset{
            width:250px;
        }
        legend{
            margin:0 auto;
        }
        select{
            width:80px;
        }
        p#result{
        	width:180px;
        	margin-left:15%;
        }
        p#result input{
        	width:110px;
        }
        input[type="submit"]{
        	margin-left:40%;
        	color:#902;
        	background-color:#baa;
        	padding:0 10px;
        }
        span#errorMessage{
        	color:red;
        }
        
    </style>
</head>
<body>
    <form method="post">
	   <div class="container">
           <fieldset>
               <legend>계산기</legend>
               <p>숫자 1 : <input type="text" name="number1" value="${ number1 }"></p>
               <p>
               연산자 : 
               <select name="operator">
                   <option ${ operator =="+" ? "selected" : ""}>+</option>
                   <option ${ operator =="-" ? "selected" : ""}>-</option>
                   <option ${ operator =="*" ? "selected" : ""}>*</option>
                   <option ${ operator =="/" ? "selected" : ""}>/</option>
               </select>
               </p>
               <p>숫자 2 : <input type="text" name="number2" value="${ number2 }"></p>
               <p id="result">결과 : <input type="text" value="${ result }"></p>
               <input type="submit" value="계산">
           </fieldset>
           <span id="errorMessage">${ errorMessage }</span>
	   </div>
    </form>
</body>