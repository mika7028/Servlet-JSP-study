<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import= "model.*" %>
    <% Employee emp = new Employee("0001", "mika");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>従業員管理</title>
</head>
<body>
<% for(int i=0;i<10;i++){ %>
<% if(i % 3 == 0) {%>
<p style="color:red">
<% } else{ %>
<p>
<% } %>
IDは<%= emp.getID() %>、名前は<%= emp.getName() %>です</p>
<% }%>
</body>
</html>