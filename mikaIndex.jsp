<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.SiteEV" %>
    <%
    SiteEV siteEV = (SiteEV) application.getAttribute("siteEV");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>mikaのページ</title>
</head>
<body>
<h1>mikaのページへようこそ</h1>
<p>
<a href="/sample/MikaIndex?action=like">イイネ</a>:
<%= siteEV.getLike() %>人
<a href="/sample/MikaIndex?action=dislike">良くないね</a>:
<%= siteEV.getDislike() %>人
</p>
<h2>mikaとは！？</h2>
<p>・・・</p>
</body>
</html>