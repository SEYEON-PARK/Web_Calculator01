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
        
    </style>
</head>
<body>
    <form method="post">
	   <div class="container">
           <fieldset>
               <legend>계산기</legend>
               <p>숫자 1 : <input type="text" name="number1"></p>
               <p>
               연산자 : 
               <select name="operator">
                   <option>+</option>
                   <option>-</option>
                   <option>*</option>
                   <option>/</option>
               </select>
               </p>
               <p>숫자 2 : <input type="text" name="number2"></p>
           </fieldset>
	   </div>
    </form>
</body>