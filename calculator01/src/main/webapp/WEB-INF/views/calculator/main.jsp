<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <style>
    </style>
</head>
<body>
    <form method="post">
	   <div class="container">
           <div id="result">
			
           </div>
           <div class="buttons">
               <input class="part1" type="button" name="clear" value="AC">
               <input class="part1" type="submit" name="enter" value="=">
               <br>
               <input class="part2" type="button" name="number" value="7">
               <input class="part2" type="button" name="number" value="8">
               <input class="part2" type="button" name="number" value="9">
               <input class="part2" type="button" name="number" value="+">
               <br>
               <input class="part2" type="button" name="number" value="4">
               <input class="part2" type="button" name="number" value="5">
               <input class="part2" type="button" name="number" value="6">
               <input class="part2" type="button" name="number" value="-">
               <br>
               <input class="part2" type="button" name="number" value="1">
               <input class="part2" type="button" name="number" value="2">
               <input class="part2" type="button" name="number" value="3">
               <input class="part2" type="button" name="number" value="*">
               <br>
               <input class="part2 0" type="button" name="number" value="0">
               <input class="part2" type="button" name="number" value=".">
               <input class="part2" type="button" name="number" value="/">
           </div>
	   </div>
    </form>
</body>