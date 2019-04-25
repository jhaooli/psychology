
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>

<body>
<h2>Hello World!</h2>
<form action="/reservation/createReservation" method="POST">
    <input type="date"  name="date"/>
    <button type="submit">submit</button>
</form>

<form action="/reservation/updateReservation" method="POST">
    <input type="date" name="date" />
    <input name="id" value="11">
    <button type="submit">submit</button>
</form>
</body>
</html>
